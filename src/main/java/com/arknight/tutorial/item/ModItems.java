package com.arknight.tutorial.item;

import com.arknight.tutorial.ArknightMod;
import com.arknight.tutorial.FriedRiceExplosionManager;
import com.arknight.tutorial.block.ModBlocks;
import com.arknight.tutorial.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class ModItems {

    //材料 及 货币
    public static final Item ORIGINIUM = registerItem("originium", new Item(new Item.Settings()));          //源石
    public static final Item RAW_ORIGINIUM = registerItem("raw_originium", new Item(new Item.Settings()));  //源石碎片
    public static final Item CARDBOARD = registerItem("material/cardboard", new Item(new Item.Settings())); //纸板
    public static final Item ORIGINIUM_ORE = registerItem("originium_ore", new Item(new Item.Settings()));  //源石锭
    public static final Item LUNGMEN_DOLLAR = registerItem("lungmen_dollar", new Item(new Item.Settings()));//龙门币
    public static final Item ORUNDUM = registerItem("orundum", new Item(new Item.Settings()));              //合成玉
    public static final Item ORIGINIUM_WITH_IMPURITIES = registerItem("originium_with_impurities", new Item(new Item.Settings()));  //杂质源石

    //测试食物
    public static final Item CORN = registerItems("corn", new Item(new Item.Settings().food(ModFoodComponents.CORN)));
    public static final Item STRAWBERRY = registerItems("strawberry", new Item(new Item.Settings().food(ModFoodComponents.STRAWBERRY)));
    public static final Item CHEESE = registerItems("cheese", new Item(new Item.Settings().food(ModFoodComponents.CHEESE)));

    //自制食物
    public static final Item A_BAG_OF_SUGAR = registerItems("a_bag_of_sugar", new Item(new Item.Settings().food(ModFoodComponents.A_BAG_OF_SUGAR)));
    public static final Item SUGAR_GROUP = registerItems("sugar_group", new Item(new Item.Settings().food(ModFoodComponents.SUGAR_GROUP)));
    public static final Item SUGAR_CUBE = registerItems("sugar_cube", new Item(new Item.Settings().food(ModFoodComponents.SUGAR_CUBE)));
    public static final Item SALTED_EGG_YOLK = registerItems("salted_egg_yolk", new Item(new Item.Settings().food(ModFoodComponents.SALTED_EGG_YOLK)));

    public static final Item HUA_GUI_PO = registerItems("hua_gui_po", new Item(new Item.Settings().food(ModFoodComponents.HUA_GUI_PO)));//画桂魄

    public static final Item FLOUR = registerItem("flour", new Item(new Item.Settings()));//
    public static final Item DOUGH = registerItem("dough", new Item(new Item.Settings()));//
    public static final Item DOUGH_WRAPPER = registerItem("dough_wrapper", new Item(new Item.Settings()));//
    public static final Item UNFORMED_ZANGJINBO = registerItem("unformed_zangjinbo", new Item(new Item.Settings()));
    public static final Item MEAT_FLOSS = registerItems("meat_floss", new Item(new Item.Settings().food(ModFoodComponents.MEAT_FLOSS)));

    public static final Item ZANG_JIN_BO = registerItems("zang_jin_bo", new Item(new Item.Settings()));
    public static final Item COOKED_ZANG_JIN_BO = registerItems("cooked_zang_jin_bo", new Item(new Item.Settings().food(ModFoodComponents.ZANG_JIN_BO)));

    public static final Item UNFORMED_QING_QIU_YU = registerItem("unformed_qing_qiu_yu", new Item(new Item.Settings()));
    public static final Item QING_QIU_YU = registerItems("qing_qiu_yu", new Item(new Item.Settings().food(ModFoodComponents.QING_QIU_YU)));//清秋玉

    public static final Item UNCOOKED_GLUTINOUS_RICE_DOUGH = registerItem("uncooked_glutinous_rice_dough", new Item(new Item.Settings()));
    public static final Item COOKED_GLUTINOUS_RICE_DOUGH = registerItems("cooked_glutinous_rice_dough", new Item(new Item.Settings().food(ModFoodComponents.COOKED_GLUTINOUS_RICE_DOUGH)));
    public static final Item GLUTINOUS_RICE_DOUGH_WRAPPER = registerItems("glutinous_rice_dough_wrapper", new Item(new Item.Settings()));
    public static final Item UNFORMED_LIANG_XIAO_QING = registerItem("unformed_liang_xiao_qing", new Item(new Item.Settings()));
    public static final Item LIANG_XIAO_QING = registerItems("liang_xiao_qing", new Item(new Item.Settings().food(ModFoodComponents.LIANG_QING_YU)));//良宵晴

    public static final Item STARCH = registerItem("starch", new Item(new Item.Settings()));//淀粉
    public static final Item STARCH_DOUGH = registerItems("starch_dough", new Item(new Item.Settings()));
    public static final Item COOKED_STARCH_DOUGH = registerItems("cooked_starch_dough", new Item(new Item.Settings()));
    public static final Item STARCH_DOUGH_WRAPPER = registerItems("starch_dough_wrapper", new Item(new Item.Settings()));

    public static final Item CANNED_VEGETABLES_AND_RADISHES = registerItems("canned_vegetables_and_radishes", new Item(new Item.Settings().food(ModFoodComponents.CANNED_VEGETABLES_AND_RADISHES).recipeRemainder(ModItems.EMPTY_CAN)));

    public static final Item GUANG_HAN_LE = registerItems("guang_han_le", new Item(new Item.Settings().food(ModFoodComponents.GUANG_HAN_LE)));

    public static final Item REFRESHING_SPORTS_DRINK = registerItems("refreshing_sports_drink", new Item(new Item.Settings().food(ModFoodComponents.REFRESHING_SPORTS_DRINK)){
        @Override
        public UseAction getUseAction(ItemStack stack) {
            return UseAction.DRINK; // 👈 改成喝的动画
        }
    });

    public static final Item EMERGENCY_RATIONAL_COMPOUND = registerItems("emergency_rational_compound", new Item(new Item.Settings().food(ModFoodComponents.EMERGENCY_RATIONAL_COMPOUND)){
        @Override
        public UseAction getUseAction(ItemStack stack) {
            return UseAction.DRINK; // 👈 改成喝的动画
        }
    });

    public static final Item EMERGENCY_RATIONAL_CONCENTRATE = registerItems("emergency_rational_concentrate", new Item(new Item.Settings().food(ModFoodComponents.EMERGENCY_RATIONAL_CONCENTRATE)){
        @Override
        public UseAction getUseAction(ItemStack stack) {
            return UseAction.DRINK; // 👈 改成喝的动画
        }
    });

    public static final Item FURNACE_FRIED_RICE_FROM_WISH_A_DALE = registerItem(
            "furnace_fried_rice",
            new Item(new Item.Settings()
                    .food(ModFoodComponents.FURNACE_FRIED_RICE_FROM_WISH_A_DALE)
                    .maxCount(16)
            ) {

                @Override
                public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {

                    ItemStack result = super.finishUsing(stack, world, user);

                    if (!world.isClient && world instanceof ServerWorld serverWorld) {

                        user.setOnFireFor(12);

                        double x = user.getX();
                        double y = user.getY() + 1;
                        double z = user.getZ();

                        FriedRiceExplosionManager.start(serverWorld, x, y, z);
                    }

                    return result;
                }});

    public static final Item EDIBLE_CUBE = registerItems("edible_cube", new Item(new Item.Settings().food(ModFoodComponents.EDIBLE_CUBE)));

    public static final Item ROASTED_ALMOND_CHOCOLATE = registerItems("roasted_almond_chocolate", new Item(new Item.Settings().food(ModFoodComponents.ROASTED_ALMOND_CHOCOLATE)));
    public static final Item SALTED_EGG_YOLK_FLAVORED_CHOCOLATE = registerItems("salted_egg_yolk_flavored_chocolate", new Item(new Item.Settings().food(ModFoodComponents.SALTED_EGG_YOLK_FLAVORED_CHOCOLATE)));

    public static final Item CRUNCHY_SHELL_SUGAR_OIL_FRUIT = registerItems("crunchy_shell_sugar_oil_fruit", new Item(new Item.Settings().food(ModFoodComponents.CRUNCHY_SHELL_SUGAR_OIL_FRUIT)));
    //蔬菜
    public static final Item KALE = registerItems("kale", new Item(new Item.Settings().food(ModFoodComponents.KALE)));

    //作物
    public static final Item GLUTINOUS_RICE = registerItem("glutinous_rice", new AliasedBlockItem(ModBlocks.GLUTINOUS_RICE_CROP, new Item.Settings()));
    public static final Item STRAWBERRY_SEEDS = registerItems("strawberry_seeds", new AliasedBlockItem(ModBlocks.STRAWBERRY_CROP, new Item.Settings()));
    public static final Item KALE_SEEDS = registerItems("kale_seeds", new AliasedBlockItem(ModBlocks.KALE_CROP, new Item.Settings()));

    //调料
    public static final Item SALT = registerItem("salt", new Item(new Item.Settings()));

    //工具
    public static final Item MOONCAKE_MOLD = registerItem("mooncake_mold", new Item(new Item.Settings().maxCount(1)));
    public static final Item ROLLING_PIN = registerItem("rolling_pin", new Item(new Item.Settings()));

    public static final Item EMPTY_CAN = Registry.register(Registries.ITEM, new Identifier(ArknightMod.MOD_ID, "empty_can"), new Item(new Item.Settings()));

    //燃料
    public static final Item ANTHRACITE = registerItems("anthracite", new Item(new Item.Settings()));
    //盔甲
        //深海猎人盔甲
    public static final Item ABYSSAL_HUNTERS_HELMET = registerItems("abyssal_hunters_helmet",
            new ModArmorItem(ModArmorMaterials.ABYSSAL_HUNTERS, ArmorItem.Type.HELMET, new Item.Settings()));

    public static final Item ABYSSAL_HUNTERS_CHESTPLATE = registerItems("abyssal_hunters_chestplate",
            new ModArmorItem(ModArmorMaterials.ABYSSAL_HUNTERS, ArmorItem.Type.CHESTPLATE, new Item.Settings()));

    public static final Item ABYSSAL_HUNTERS_LEGGINGS = registerItems("abyssal_hunters_leggings",
            new ModArmorItem(ModArmorMaterials.ABYSSAL_HUNTERS, ArmorItem.Type.LEGGINGS, new Item.Settings()));

    public static final Item ABYSSAL_HUNTERS_BOOTS = registerItems("abyssal_hunters_boots",
            new ModArmorItem(ModArmorMaterials.ABYSSAL_HUNTERS, ArmorItem.Type.BOOTS, new Item.Settings()));
        //影卫
    public static final Item SHADOWGUARD_HELMET = registerItems("shadowguard_helmet",
            new ModArmorItem(ModArmorMaterials.SHADOW_GUARD, ArmorItem.Type.HELMET, new Item.Settings()));
    public static final Item SHADOWGUARD_CHESTPLATE = registerItems("shadowguard_chestplate",
            new ModArmorItem(ModArmorMaterials.SHADOW_GUARD, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
    public static final Item SHADOWGUARD_LEGGINGS = registerItems("shadowguard_leggings",
            new ModArmorItem(ModArmorMaterials.SHADOW_GUARD, ArmorItem.Type.LEGGINGS, new Item.Settings()));
    public static final Item SHADOWGUARD_BOOTS = registerItems("shadowguard_boots",
            new ModArmorItem(ModArmorMaterials.SHADOW_GUARD, ArmorItem.Type.BOOTS, new Item.Settings()));



    public static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM,RegistryKey.of(Registries.ITEM.getKey(),new Identifier(ArknightMod.MOD_ID,id)),item);
    }

    public static Item registerItem(String id, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ArknightMod.MOD_ID,id),item);
    }

    public static Item register(String id, Item item) {
        return register(new Identifier(ArknightMod.MOD_ID, id), item);
    }

    public static Item register(Identifier id, Item item) {
        return register(RegistryKey.of(Registries.ITEM.getKey(), id), item);
    }

    public static Item register(RegistryKey<Item> key, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return Registry.register(Registries.ITEM, key, item);
    }

    private static void addItemToItemGroup(FabricItemGroupEntries entries) {
        //entries.add(ORIGINIUM);
        entries.add(RAW_ORIGINIUM);

    }

    private static void addItemToItemGroup2(FabricItemGroupEntries entries) {
        entries.add(CARDBOARD);

    }

    public static void registerItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemToItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToItemGroup2);
    }

//    private static void createFireRing(ServerWorld world, double x, double y, double z, double radius) {
//
//        int points = 60; // 环的密度
//
//        for (int i = 0; i < points; i++) {
//
//            double angle = 2 * Math.PI * i / points;
//            double offsetX = radius * Math.cos(angle);
//            double offsetZ = radius * Math.sin(angle);
//
//            world.spawnParticles(
//                    ParticleTypes.FLAME,
//                    x + offsetX,
//                    y,
//                    z + offsetZ,
//                    5,
//                    0.1, 0.1, 0.1,
//                    0.01
//            );
//
//            world.spawnParticles(
//                    ParticleTypes.LAVA,
//                    x + offsetX,
//                    y,
//                    z + offsetZ,
//                    2,
//                    0.05, 0.05, 0.05,
//                    0.02
//            );
//        }
//    }
}
