package com.arknight.tutorial.datagen;

import com.arknight.tutorial.block.ModBlocks;
import com.arknight.tutorial.item.ModItemGroups;
import com.arknight.tutorial.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModZhCnLangProvider extends FabricLanguageProvider {
    public ModZhCnLangProvider(FabricDataOutput dataOutput){
        super(dataOutput, "zh_cn");
    }
    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.CARDBOARD, "纸板");
        translationBuilder.add(ModItems.ORIGINIUM, "至纯源石");
        translationBuilder.add(ModItems.RAW_ORIGINIUM, "源石碎片");
        translationBuilder.add(ModItems.ORIGINIUM_ORE, "源石锭");
        translationBuilder.add(ModItems.LUNGMEN_DOLLAR, "龙门币");

        translationBuilder.add(ModBlocks.ORIGINIUM_BLOCK, "至纯源石块");
        translationBuilder.add(ModBlocks.RAW_ORIGINIUM_BLOCK, "源石矿");
        translationBuilder.add(ModBlocks.DEEPSLATE_RAW_ORIGINIUM_ORE, "深层源石矿");

        translationBuilder.add(ModItemGroups.ARKNIGHT_GROUP, "Arknight Group");
        translationBuilder.add("arknight_group2", "Arknight Group2");

    }
}
