package com.arknight.tutorial.item;

import com.arknight.tutorial.ArknightMod;
import com.arknight.tutorial.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> ARKNIGHT_GROUP = register("arknight_group");

    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(ArknightMod.MOD_ID, id));
    }


    public static void registerGroups() {
        Registry.register(
                Registries.ITEM_GROUP,
                ARKNIGHT_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 7)
                        .displayName(Text.translatable("arknight_group"))
                        .icon(() -> new ItemStack(ModItems.CORN))
                        .entries(((displayContext, entries) -> {
                            entries.add(ModItems.CORN);
                            entries.add(ModItems.CHEESE);
                            entries.add(ModItems.STRAWBERRY);
                            entries.add(ModItems.STRAWBERRY_SEEDS);
                            //作物
                            entries.add(ModItems.GLUTINOUS_RICE);

                            entries.add(ModItems.UNCOOKED_GLUTINOUS_RICE_DOUGH);
                            entries.add(ModItems.COOKED_GLUTINOUS_RICE_DOUGH);
                            entries.add(ModItems.GLUTINOUS_RICE_DOUGH_WRAPPER);
                            entries.add(ModItems.UNFORMED_LIANG_XIAO_QING);
                            entries.add(ModItems.LIANG_XIAO_QING);

                            entries.add(ModItems.STARCH);
                            entries.add(ModItems.STARCH_DOUGH);
                            entries.add(ModItems.COOKED_STARCH_DOUGH);
                            entries.add(ModItems.STARCH_DOUGH_WRAPPER);
                            entries.add(ModItems.UNFORMED_QING_QIU_YU);
                            //自制食物
                            entries.add(ModItems.SALT);
                            entries.add(ModItems.MEAT_FLOSS);
                            entries.add(ModItems.SALTED_EGG_YOLK);
                            entries.add(ModItems.FLOUR);
                            entries.add(ModItems.DOUGH);
                            entries.add(ModItems.DOUGH_WRAPPER);
                            entries.add(ModItems.UNFORMED_ZANGJINBO);
                            entries.add(ModItems.ZANG_JIN_BO);
                            entries.add(ModItems.COOKED_ZANG_JIN_BO);
                            entries.add(ModItems.QING_QIU_YU);

                            entries.add(ModItems.A_BAG_OF_SUGAR);
                            entries.add(ModItems.SUGAR_GROUP);
                            entries.add(ModItems.SUGAR_CUBE);

                        })).build());
    }

    public static final ItemGroup ARKNIGHT_GROUP2 = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(ArknightMod.MOD_ID, "arknight_group2"),
            ItemGroup.create(null,-1)
                    .displayName(Text.translatable("itemGroup.arknight_group2"))
                    .icon(() -> new ItemStack(ModItems.CARDBOARD))
                    .entries((displayContext, entries) ->{
                        entries.add(ModItems.ANTHRACITE);
                        entries.add(ModItems.CARDBOARD);
                        entries.add(ModBlocks.ICE_ETHER_ORE);
                        entries.add(ModItems.ICE_ETHER);
                        entries.add(ModBlocks.ICE_ETHER_BLOCK);
                        entries.add(ModItems.RAW_ICE_ETHER);
                        entries.add(ModBlocks.RAW_ICE_ETHER_BLOCK);
                        entries.add(ModItems.ORIGINIUM);
                        entries.add(ModBlocks.ORIGINIUM_BLOCK);
                        entries.add(ModItems.RAW_ORIGINIUM);
                        entries.add(ModBlocks.RAW_ORIGINIUM_BLOCK);
                        entries.add(ModBlocks.DEEPSLATE_RAW_ORIGINIUM_ORE);
                        entries.add(ModItems.ORUNDUM);
                        entries.add(ModItems.LUNGMEN_DOLLAR);
                        entries.add(ModItems.ORIGINIUM_ORE);
                        entries.add(ModBlocks.SALT_ORE);
                        entries.add(ModItems.MOONCAKE_MOLD);
                        entries.add(ModItems.ROLLING_PIN);
                        //entries.add(Items.DIAMOND);
                    }).build());



}
