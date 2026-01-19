package com.arknight.tutorial.item;

import com.arknight.tutorial.ArknightMod;
import com.arknight.tutorial.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    //教程跟进
    public static final Item ICE_ETHER = registerItem("ice_ether", new Item(new Item.Settings()));
    public static final Item RAW_ICE_ETHER = registerItem("raw_ice_ether", new Item(new Item.Settings()));

    //材料 及 货币
    public static final Item ORIGINIUM = registerItem("originium", new Item(new Item.Settings()));          //源石
    public static final Item RAW_ORIGINIUM = registerItem("raw_originium", new Item(new Item.Settings()));  //源石碎片
    public static final Item CARDBOARD = registerItem("material/cardboard", new Item(new Item.Settings())); //纸板
    public static final Item ORIGINIUM_ORE = registerItem("originium_ore", new Item(new Item.Settings()));  //源石锭
    public static final Item LUNGMEN_DOLLAR = registerItem("lungmen_dollar", new Item(new Item.Settings()));//龙门币
    public static final Item ORUNDUM = registerItem("orundum", new Item(new Item.Settings()));              //合成玉

    //测试食物
    public static final Item CORN = registerItems("corn", new Item(new Item.Settings().food(ModFoodComponents.CORN)));
    public static final Item STRAWBERRY = registerItems("strawberry", new Item(new Item.Settings().food(ModFoodComponents.STRAWBERRY)));
    public static final Item CHEESE = registerItems("cheese", new Item(new Item.Settings().food(ModFoodComponents.CHEESE)));

    //自制食物
    public static final Item A_BAG_OF_SUGAR = registerItems("a_bag_of_sugar", new Item(new Item.Settings().food(ModFoodComponents.A_BAG_OF_SUGAR)));
    public static final Item SUGAR_GROUP = registerItems("sugar_group", new Item(new Item.Settings().food(ModFoodComponents.SUGAR_GROUP)));
    public static final Item SUGAR_CUBE = registerItems("sugar_cube", new Item(new Item.Settings().food(ModFoodComponents.SUGAR_CUBE)));
    public static final Item SALTED_EGG_YOLK = registerItems("salted_egg_yolk", new Item(new Item.Settings().food(ModFoodComponents.SALTED_EGG_YOLK)));

    public static final Item FLOUR = registerItem("flour", new Item(new Item.Settings()));//
    public static final Item DOUGH = registerItem("dough", new Item(new Item.Settings()));//
    public static final Item DOUGH_WRAPPER = registerItem("dough_wrapper", new Item(new Item.Settings()));//
    public static final Item UNFORMED_ZANGJINBO = registerItem("unformed_zangjinbo", new Item(new Item.Settings()));
    public static final Item MEAT_FLOSS = registerItems("meat_floss", new Item(new Item.Settings().food(ModFoodComponents.MEAT_FLOSS)));

    public static final Item ZANG_JIN_BO = registerItems("zang_jin_bo", new Item(new Item.Settings()));
    public static final Item COOKED_ZANG_JIN_BO = registerItems("cooked_zang_jin_bo", new Item(new Item.Settings().food(ModFoodComponents.ZANG_JIN_BO)));

    public static final Item UNFORMED_QING_QIU_YU = registerItem("unformed_qing_qiu_yu", new Item(new Item.Settings()));
    public static final Item QING_QIU_YU = registerItems("qing_qiu_yu", new Item(new Item.Settings().food(ModFoodComponents.QING_QIU_YU)));

    public static final Item UNCOOKED_GLUTINOUS_RICE_DOUGH = registerItem("uncooked_glutinous_rice_dough", new Item(new Item.Settings()));
    public static final Item COOKED_GLUTINOUS_RICE_DOUGH = registerItems("cooked_glutinous_rice_dough", new Item(new Item.Settings().food(ModFoodComponents.COOKED_GLUTINOUS_RICE_DOUGH)));
    public static final Item GLUTINOUS_RICE_DOUGH_WRAPPER = registerItems("glutinous_rice_dough_wrapper", new Item(new Item.Settings()));
    public static final Item UNFORMED_LIANG_XIAO_QING = registerItem("unformed_liang_xiao_qing", new Item(new Item.Settings()));
    public static final Item LIANG_XIAO_QING = registerItems("liang_xiao_qing", new Item(new Item.Settings().food(ModFoodComponents.LIANG_QING_YU)));

    public static final Item STARCH = registerItem("starch", new Item(new Item.Settings()));//淀粉
    public static final Item STARCH_DOUGH = registerItems("starch_dough", new Item(new Item.Settings()));
    public static final Item COOKED_STARCH_DOUGH = registerItems("cooked_starch_dough", new Item(new Item.Settings()));
    public static final Item STARCH_DOUGH_WRAPPER = registerItems("starch_dough_wrapper", new Item(new Item.Settings()));

    public static final Item CANNED_VEGETABLES_AND_RADISHES = registerItems("canned_vegetables_and_radishes", new Item(new Item.Settings().food(ModFoodComponents.CANNED_VEGETABLES_AND_RADISHES).recipeRemainder(ModItems.EMPTY_CAN)));

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
