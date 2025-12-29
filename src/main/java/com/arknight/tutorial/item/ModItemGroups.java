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
                        .icon(() -> new ItemStack(ModItems.ORIGINIUM))
                        .entries(((displayContext, entries) -> {
                            entries.add(ModItems.ORIGINIUM);
                            entries.add(ModItems.ORIGINIUM_ORE);
                            entries.add(ModBlocks.ORIGINIUM_BLOCK);
                            entries.add(ModItems.RAW_ORIGINIUM);
                            entries.add(ModBlocks.RAW_ORIGINIUM_BLOCK);
                            entries.add(ModBlocks.DEEPSLATE_RAW_ORIGINIUM_ORE);
                            entries.add(ModItems.LUNGMEN_DOLLAR);

                        })).build());
    }

    public static final ItemGroup ARKNIGHT_GROUP2 = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(ArknightMod.MOD_ID, "arknight_group2"),
            ItemGroup.create(null,-1)
                    .displayName(Text.translatable("itemGroup.arknight_group2"))
                    .icon(() -> new ItemStack(ModItems.CARDBOARD))
                    .entries((displayContext, entries) ->{
                        entries.add(ModItems.CARDBOARD);
                        //entries.add(Items.DIAMOND);
                    }).build());

}
