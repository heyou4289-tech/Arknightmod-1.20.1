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
        translationBuilder.add(ModItems.CARDBOARD, "Cardboard");
        translationBuilder.add(ModItems.ORIGINIUM, "Pure Originium");
        translationBuilder.add(ModItems.RAW_ORIGINIUM, "Originium Shard");
        translationBuilder.add(ModItems.ORIGINIUM_ORE, "Originium Ore");
        translationBuilder.add(ModItems.LUNGMEN_DOLLAR, "Lungmen Dollar");
        translationBuilder.add(ModItems.ORUNDUM, "Orundum");

        translationBuilder.add(ModItems.ANTHRACITE, "Anthracite");

        translationBuilder.add(ModItems.CORN, "corn");
        translationBuilder.add(ModItems.STRAWBERRY, "strawberry");
        translationBuilder.add(ModItems.CHEESE, "cheese");

        translationBuilder.add(ModBlocks.ORIGINIUM_BLOCK, "Pure Originium Block");
        translationBuilder.add(ModBlocks.RAW_ORIGINIUM_BLOCK, "Raw Originium Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_RAW_ORIGINIUM_ORE, "Deepslate Raw Originium Ore");

        translationBuilder.add(ModItemGroups.ARKNIGHT_GROUP, "Arknight Group");
        translationBuilder.add("arknight_group2", "Arknight Group2");
    }
}
