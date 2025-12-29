package com.arknight.tutorial.datagen;

import com.arknight.tutorial.block.ModBlocks;
import com.arknight.tutorial.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }
    @Override
    public void generate() {
        addDrop(ModBlocks.ORIGINIUM_BLOCK);

//        addDrop(ModBlocks.RAW_ORIGINIUM_BLOCK, oreDrops(ModBlocks.RAW_ORIGINIUM_BLOCK, ModItems.RAW_ORIGINIUM));
//        addDrop(ModBlocks.DEEPSLATE_RAW_ORIGINIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_RAW_ORIGINIUM_ORE, ModItems.RAW_ORIGINIUM));
        addDrop(ModBlocks.RAW_ORIGINIUM_BLOCK, likeCopperOreDrops(ModBlocks.RAW_ORIGINIUM_BLOCK, ModItems.RAW_ORIGINIUM, 1.0f,3.0f));
        addDrop(ModBlocks.DEEPSLATE_RAW_ORIGINIUM_ORE, likeCopperOreDrops(ModBlocks.DEEPSLATE_RAW_ORIGINIUM_ORE, ModItems.RAW_ORIGINIUM, 1.0f,3.0f));

    }

    public LootTable.Builder likeCopperOreDrops(Block drop, Item item, float min, float max) {
        return dropsWithSilkTouch(
                drop,
                (LootPoolEntry.Builder<?>)this.applyExplosionDecay(
                        drop,
                        ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max)))
                                .apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))
                )
        );
    }
}
