package com.arknight.tutorial.datagen;

import com.arknight.tutorial.block.ModBlocks;
import com.arknight.tutorial.item.ModItemGroups;
import com.arknight.tutorial.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public class ModEnUsLangProvider extends FabricLanguageProvider {
    public ModEnUsLangProvider(FabricDataOutput dataOutput){
        super(dataOutput, "en_us");
    }
    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        //for mod
        translationBuilder.add(ModItems.CARDBOARD, "Cardboard");
        translationBuilder.add(ModItems.ORIGINIUM_WITH_IMPURITIES, "Originium with Impurities");
        translationBuilder.add(ModItems.ORIGINIUM, "Pure Originium");
        translationBuilder.add(ModItems.RAW_ORIGINIUM, "Originium Shard");
        translationBuilder.add(ModItems.ORIGINIUM_ORE, "Originium Ore");
        translationBuilder.add(ModItems.LUNGMEN_DOLLAR, "Lungmen Dollar");
        translationBuilder.add(ModItems.ORUNDUM, "Orundum");

        translationBuilder.add(ModItems.ANTHRACITE, "Anthracite");

        //food
        translationBuilder.add(ModItems.CORN, "corn");
        translationBuilder.add(ModItems.STRAWBERRY, "strawberry");
        translationBuilder.add(ModItems.CHEESE, "cheese");

        translationBuilder.add(ModItems.A_BAG_OF_SUGAR, "a bag of sugar");
        translationBuilder.add(ModItems.SUGAR_GROUP, "sugar group");
        translationBuilder.add(ModItems.SUGAR_CUBE, "sugar cube");

        translationBuilder.add(ModItems.HUA_GUI_PO, "Hua Gui Po");

        //food
        translationBuilder.add(ModItems.SALTED_EGG_YOLK, "salted egg yolk");
        translationBuilder.add(ModItems.FLOUR, "flour");
        translationBuilder.add(ModItems.DOUGH, "dough");
        translationBuilder.add(ModItems.DOUGH_WRAPPER, "dough wrapper");
        translationBuilder.add(ModItems.UNFORMED_ZANGJINBO, "unformed zangjinbo");
        translationBuilder.add(ModItems.ZANG_JIN_BO, "uncooked_zang jin bo");
        translationBuilder.add(ModItems.COOKED_ZANG_JIN_BO, "zang jin bo");

        translationBuilder.add(ModItems.UNFORMED_QING_QIU_YU, "unformed qing qiu yu");
        translationBuilder.add(ModItems.QING_QIU_YU, "qing qiu yu");

        translationBuilder.add(ModItems.MEAT_FLOSS, "meat floss");
        translationBuilder.add(ModItems.UNCOOKED_GLUTINOUS_RICE_DOUGH, "uncooked glutinous rice dough");
        translationBuilder.add(ModItems.COOKED_GLUTINOUS_RICE_DOUGH, "cooked_glutinous_rice_dough");
        translationBuilder.add(ModItems.GLUTINOUS_RICE_DOUGH_WRAPPER, "glutinous rice dough wrapper");
        translationBuilder.add(ModItems.UNFORMED_LIANG_XIAO_QING, "unformed liang xiao qing");
        translationBuilder.add(ModItems.LIANG_XIAO_QING, "liang xiao qing");

        translationBuilder.add(ModItems.GUANG_HAN_LE, "Guang Han Le");

        translationBuilder.add(ModItems.CANNED_VEGETABLES_AND_RADISHES, "vegetables and radishes can");
        translationBuilder.add(ModItems.KALE, "kale");

        translationBuilder.add(ModItems.REFRESHING_SPORTS_DRINK, "refreshing sports drink");

        translationBuilder.add(ModItems.CRUNCHY_SHELL_SUGAR_OIL_FRUIT, "crunchy shell sugar oil fruit");
        translationBuilder.add(ModItems.EMERGENCY_RATIONAL_COMPOUND, "emergency rational compound");
        translationBuilder.add(ModItems.EMERGENCY_RATIONAL_CONCENTRATE, "emergency rational concentrate");
        translationBuilder.add(ModItems.ROASTED_ALMOND_CHOCOLATE, "roasted almond chocolate");
        translationBuilder.add(ModItems.SALTED_EGG_YOLK_FLAVORED_CHOCOLATE, "salted egg yolk flavored chocolate");
        translationBuilder.add(ModItems.EDIBLE_CUBE, "edible cube");
        translationBuilder.add(ModItems.FURNACE_FRIED_RICE_FROM_WISH_A_DALE, "furnace fried rice from Wiš'adel");

        //crop
        translationBuilder.add(ModItems.GLUTINOUS_RICE, "glutinous rice");
        translationBuilder.add(ModItems.STRAWBERRY_SEEDS, "Strawberry seed");

        translationBuilder.add(ModBlocks.ORIGINIUM_BLOCK, "Pure Originium Block");
        translationBuilder.add(ModBlocks.RAW_ORIGINIUM_BLOCK, "Raw Originium Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_RAW_ORIGINIUM_ORE, "Deepslate Raw Originium Ore");

        //tool
        translationBuilder.add(ModItems.MOONCAKE_MOLD, "mooncake mold");
        translationBuilder.add(ModItems.ROLLING_PIN, "rolling pin");

        translationBuilder.add(ModItems.EMPTY_CAN, "empty can");

        //seasoning
        translationBuilder.add(ModBlocks.SALT_ORE, "salt ore");
        translationBuilder.add(ModItems.SALT, "salt");

        translationBuilder.add(ModItems.STARCH, "starch");
        translationBuilder.add(ModItems.STARCH_DOUGH, "starch dough");
        translationBuilder.add(ModItems.COOKED_STARCH_DOUGH, "cooked starch dough");
        translationBuilder.add(ModItems.STARCH_DOUGH_WRAPPER, "starch dough wrapper");

        //盔甲
        translationBuilder.add(ModItems.ABYSSAL_HUNTERS_HELMET, "Abyssal Hunter's Helmet");
        translationBuilder.add(ModItems.ABYSSAL_HUNTERS_CHESTPLATE, "Abyssal Hunter's Chestplate");
        translationBuilder.add(ModItems.ABYSSAL_HUNTERS_LEGGINGS, "Abyssal Hunter's Leggings");
        translationBuilder.add(ModItems.ABYSSAL_HUNTERS_BOOTS, "Abyssal Hunter's Boots");

        translationBuilder.add(ModItems.SHADOWGUARD_HELMET, "Shadow Guard Helmet");
        translationBuilder.add(ModItems.SHADOWGUARD_CHESTPLATE, "Shadow Guard Chestplate");
        translationBuilder.add(ModItems.SHADOWGUARD_LEGGINGS, "Shadow Guard Leggings");
        translationBuilder.add(ModItems.SHADOWGUARD_BOOTS, "Shadow Guard Boots");

        translationBuilder.add(ModItemGroups.ARKNIGHT_GROUP, "Arknight Group");
        translationBuilder.add("arknight_group2", "Arknight Group2");

        //villager
        translationBuilder.add("entity.minecraft.villager.originium_merchant", "Originium_Merchant");
    }
}
