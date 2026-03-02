package com.arknight.tutorial.item.custom;

import com.arknight.tutorial.item.ModArmorMaterials;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Multimap;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ModArmorItem extends ArmorItem {
    private static final Map<ArmorMaterial, List<StatusEffectInstance>> MAP =
            (new ImmutableMap.Builder<ArmorMaterial, List<StatusEffectInstance>>())
                    .put(ModArmorMaterials.ABYSSAL_HUNTERS,
                            Arrays.asList(
                                    new StatusEffectInstance(StatusEffects.STRENGTH, 1000, 3, false, false, true),
                                    new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1000, 3, false, false, true),
                                    new StatusEffectInstance(StatusEffects.RESISTANCE, 1000, 4, false, false, true),
                                    new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 1000, 3, false, false,true),
                                    new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1000, 2, false, false, true),
                                    new StatusEffectInstance(StatusEffects.ABSORPTION, 1000, 9, false, false, true),
                                    new StatusEffectInstance(StatusEffects.REGENERATION, 1000, 5, false, false, true)
                            ))
                    .put(ModArmorMaterials.SHADOW_GUARD,
                            Arrays.asList(
                                    new StatusEffectInstance(StatusEffects.STRENGTH, 1000, 5, false, false, true),
                                    new StatusEffectInstance(StatusEffects.REGENERATION, 1000, 2, false,false,true),
                                    new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1000, 1, false, false, true),
                                    new StatusEffectInstance(StatusEffects.SPEED, 1000, 3,false,false,true),
                                    new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1000, 3, false, false, true),
                                    new StatusEffectInstance(StatusEffects.INVISIBILITY, 1000, 1,false,false,true),
                                    new StatusEffectInstance(StatusEffects.SLOW_FALLING, 1000, 1, false,false,true),
                                    new StatusEffectInstance(StatusEffects.REGENERATION, 1000, 1, false, false, true)
                            ))
                    .build();

    public ModArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient()) {
            // 1. 自动补附魔逻辑
            if (this.getMaterial() == ModArmorMaterials.ABYSSAL_HUNTERS && this.type == Type.BOOTS) {
                // 如果靴子上没有深海探索者，就自动加上
                if (EnchantmentHelper.getLevel(Enchantments.DEPTH_STRIDER, stack) <= 0) {
                    stack.addEnchantment(Enchantments.DEPTH_STRIDER, 3);
                }
            }

            // 2. 原有的套装效果逻辑
            if (entity instanceof PlayerEntity player && hasFullSuitableArmor(player)) {
                evaluateArmorEffect(player);
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

//    private void evaluateArmorEffect(PlayerEntity player) {
//        for (Map.Entry<ArmorMaterial, List<StatusEffectInstance>> entry : MAP.entrySet()) {
//            ArmorMaterial material = entry.getKey();
//            List<StatusEffectInstance> effects = entry.getValue();
//
//            if (hasCorrectMaterialArmorOn(material, player)) {
//                for (StatusEffectInstance effect : effects) {
//                    StatusEffect effects1 = effect.getEffectType();
//                    if (!player.hasStatusEffect(effects1)) {
//                        player.addStatusEffect(effect);
//                    }
//                }
//            }
//        }
//    }

    private void evaluateArmorEffect(PlayerEntity player) {
        for (Map.Entry<ArmorMaterial, List<StatusEffectInstance>> entry : MAP.entrySet()) {
            ArmorMaterial material = entry.getKey();
            List<StatusEffectInstance> effects = entry.getValue();

            if (hasCorrectMaterialArmorOn(material, player)) {
                for (StatusEffectInstance effect : effects) {

                    StatusEffectInstance currentEffect =
                            player.getStatusEffect(effect.getEffectType());

                    // 如果没有效果 或 剩余时间太短，就重新添加
                    if (currentEffect == null || currentEffect.getDuration() <= 10) {

                        player.addStatusEffect(new StatusEffectInstance(
                                effect.getEffectType(),
                                200, // 每次刷新 10 秒（200 tick）
                                effect.getAmplifier(),
                                false,
                                false,
                                true
                        ));
                    }
                }
            }
        }
    }

    private boolean hasCorrectMaterialArmorOn(ArmorMaterial material, PlayerEntity player) {
        for (ItemStack stack : player.getInventory().armor) {
            if (!(stack.getItem() instanceof ArmorItem)) {
                return false;
            }
        }

        ArmorItem helmet = (ArmorItem) player.getInventory().getArmorStack(3).getItem();
        ArmorItem chestplate = (ArmorItem) player.getInventory().getArmorStack(2).getItem();
        ArmorItem leggings = (ArmorItem) player.getInventory().getArmorStack(1).getItem();
        ArmorItem boots = (ArmorItem) player.getInventory().getArmorStack(0).getItem();

        return helmet.getMaterial() == material
                && chestplate.getMaterial() == material
                && leggings.getMaterial() == material
                && boots.getMaterial() == material;
    }

    private boolean hasFullSuitableArmor(PlayerEntity player) {
        ItemStack helmet = player.getInventory().getArmorStack(3);
        ItemStack chestplate = player.getInventory().getArmorStack(2);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack boots = player.getInventory().getArmorStack(0);

        return !helmet.isEmpty() && !chestplate.isEmpty() && !leggings.isEmpty() && !boots.isEmpty();
    }

    @Override
    public void onCraft(ItemStack stack, World world, PlayerEntity player) {
        if (!world.isClient) {
            // 增加调试信息：如果你在控制台看到这行字，说明方法触发了
            //System.out.println("检测到合成：" + stack.getItem().toString());

            if (this.getMaterial() == ModArmorMaterials.ABYSSAL_HUNTERS && this.type == Type.BOOTS) {
                stack.addEnchantment(Enchantments.DEPTH_STRIDER, 3);
            }
        }
        super.onCraft(stack, world, player);

        // 检查是否是深海猎人材质，并且是靴子（因为深海探索者是靴子附魔）
        if (this.getMaterial() == ModArmorMaterials.ABYSSAL_HUNTERS && this.type == Type.BOOTS) {
            stack.addEnchantment(Enchantments.DEPTH_STRIDER, 3);
        }
        if (this.getMaterial() == ModArmorMaterials.ABYSSAL_HUNTERS && this.type == Type.HELMET) {
            stack.addEnchantment(Enchantments.DEPTH_STRIDER, 1);
        }
        if (this.getMaterial() == ModArmorMaterials.ABYSSAL_HUNTERS && this.type == Type.CHESTPLATE) {
            stack.addEnchantment(Enchantments.DEPTH_STRIDER, 1);
        }
        if (this.getMaterial() == ModArmorMaterials.ABYSSAL_HUNTERS && this.type == Type.LEGGINGS) {
            stack.addEnchantment(Enchantments.DEPTH_STRIDER, 1);
        }


        // 如果你想让其他部位也有别的附魔，也可以在这里写
    }

    // 为每个部位定义唯一的 UUID
    private static final Map<Type, UUID> HEALTH_MODIFIER_UUIDS = Map.of(
            Type.HELMET, UUID.fromString("01234567-89ab-cdef-0123-456789abcdef"),
            Type.CHESTPLATE, UUID.fromString("12345678-9abc-def0-1234-56789abcdef0"),
            Type.LEGGINGS, UUID.fromString("23456789-abcd-ef01-2345-6789abcdef01"),
            Type.BOOTS, UUID.fromString("3456789a-bcde-f012-3456-789abcdef012")
    );

    // 1. 定义护甲加成的 UUID Map (必须与生命上限的 UUID 不同)
    private static final Map<Type, UUID> ARMOR_MODIFIER_UUIDS = Map.of(
            Type.HELMET, UUID.fromString("AD11B642-E20B-4716-9964-D72D8A99B0B1"),
            Type.CHESTPLATE, UUID.fromString("95583624-9463-499D-8761-0F90B1E64761"),
            Type.LEGGINGS, UUID.fromString("D8499B04-0E66-4726-AB29-1CC9436329B7"),
            Type.BOOTS, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD1A4196F3")
    );

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(ItemStack stack, EquipmentSlot slot) {
        if (slot != this.type.getEquipmentSlot()) {
            return super.getAttributeModifiers(stack, slot);
        }

        Multimap<EntityAttribute, EntityAttributeModifier> modifiers =
                HashMultimap.create(super.getAttributeModifiers(stack, slot));

        // ===== 只对【深海猎人】生效 =====
        if (this.getMaterial() == ModArmorMaterials.ABYSSAL_HUNTERS) {

            // 生命值加成
            modifiers.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier(
                    HEALTH_MODIFIER_UUIDS.get(this.type),
                    "Abyssal Hunters Health Bonus",
                    40.0,
                    EntityAttributeModifier.Operation.ADDITION
            ));

            // 护甲额外加成（★重点：放进同一个 if 里）
            modifiers.put(EntityAttributes.GENERIC_ARMOR, new EntityAttributeModifier(
                    ARMOR_MODIFIER_UUIDS.get(this.type),
                    "Abyssal Hunters Armor Bonus",
                    getExtraArmorValue(),
                    EntityAttributeModifier.Operation.ADDITION
            ));} else if (this.getMaterial() == ModArmorMaterials.SHADOW_GUARD) {

            // ===== 影卫套 =====
            modifiers.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(
                    ARMOR_MODIFIER_UUIDS.get(this.type), // 正式项目建议单独一组 UUID
                    "Shadow Guard Attack Bonus",
                    3.0,
                    EntityAttributeModifier.Operation.ADDITION
            ));

            modifiers.put(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier(
                    HEALTH_MODIFIER_UUIDS.get(this.type),
                    "Shadow Guard Speed Bonus",
                    0.05,
                    EntityAttributeModifier.Operation.MULTIPLY_TOTAL
            ));
        }

        return modifiers;
    }

    // 辅助方法：根据部位返回不同的额外护甲值
    private double getExtraArmorValue() {
        return switch (this.type) {
            case HELMET -> 3.0;     // 额外加 3 点护甲
            case CHESTPLATE -> 8.0;  // 额外加 8 点护甲
            case LEGGINGS -> 6.0;   // 额外加 6 点护甲
            case BOOTS -> 3.0;      // 额外加 3 点护甲
        };
    }





}


//    // 每件盔甲的额外护甲加成（突破20上限）
//    private static final UUID ARMOR_BONUS_UUID = UUID.fromString("e4bdbb4e-8e2c-4c28-9c2b-9b9e8a8c1111");
//
//    /**
//     * 给盔甲添加额外护甲属性，突破原版20上限
//     */
//    @Override
//    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(
//            EquipmentSlot slot, ItemStack stack) {
//
//        // 先拿原本的属性
//        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = super.getAttributeModifiers(slot, stack);
//
//        // 只给对应部位加额外护甲
//        if (slot == this.getSlotType() && this.getMaterial() == ModArmorMaterials.ABYSSAL_HUNTERS) {
//            modifiers.put(
//                    EntityAttributes.GENERIC_ARMOR,
//                    new EntityAttributeModifier(
//                            ARMOR_BONUS_UUID,
//                            "mod_armor_bonus",
//                            getBonusArmorValue(),
//                            EntityAttributeModifier.Operation.ADDITION
//                    )
//            );
//        }
//
//        return modifiers;
//    }
//
//    private double getBonusArmorValue() {
//        return switch (this.getSlotType()) {
//            case HELMET -> 2.0;
//            case CHESTPLATE -> 3.0;
//            case LEGGINGS -> 2.0;
//            case BOOTS -> 1.0;
//        };
//    }



