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
        //for study
        translationBuilder.add(ModItems.ICE_ETHER, "Ice Ether");
        translationBuilder.add(ModItems.RAW_ICE_ETHER, "Raw Ice Ether");
        translationBuilder.add(ModBlocks.RAW_ICE_ETHER_BLOCK, "Raw Ice Ether Block");
        translationBuilder.add(ModBlocks.ICE_ETHER_BLOCK, "Ice Ether Block");
        translationBuilder.add(ModBlocks.ICE_ETHER_ORE, "Ice Ether Ore");

        //for mod
        translationBuilder.add(ModItems.CARDBOARD, "Cardboard");
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

        translationBuilder.add(ModItems.CANNED_VEGETABLES_AND_RADISHES, "vegetables and radishes can");
        translationBuilder.add(ModItems.KALE, "kale");

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

        translationBuilder.add(ModItemGroups.ARKNIGHT_GROUP, "Arknight Group");
        translationBuilder.add("arknight_group2", "Arknight Group2");
    }
}
