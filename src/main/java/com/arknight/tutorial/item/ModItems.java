package com.arknight.tutorial.item;

import com.arknight.tutorial.ArknightMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ORIGINIUM = registerItem("originium", new Item(new Item.Settings()));          //源石
    public static final Item RAW_ORIGINIUM = registerItem("raw_originium", new Item(new Item.Settings()));  //源石碎片
    public static final Item CARDBOARD = registerItem("material/cardboard", new Item(new Item.Settings())); //纸板
    public static final Item ORIGINIUM_ORE = registerItem("originium_ore", new Item(new Item.Settings()));  //源石锭


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
}
