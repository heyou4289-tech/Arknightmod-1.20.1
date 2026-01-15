package com.arknight.tutorial.datagen;

import com.arknight.tutorial.block.ModBlocks;
import com.arknight.tutorial.block.custom.GlutinousRiceCropBlock;
import com.arknight.tutorial.block.custom.StrawberryCropBlock;
import com.arknight.tutorial.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }
    @Override
    public void generate() {
        addDrop(ModBlocks.ORIGINIUM_BLOCK);
        addDrop(ModBlocks.ICE_ETHER_BLOCK);
        addDrop(ModBlocks.RAW_ICE_ETHER_BLOCK);

//        addDrop(ModBlocks.RAW_ORIGINIUM_BLOCK, oreDrops(ModBlocks.RAW_ORIGINIUM_BLOCK, ModItems.RAW_ORIGINIUM));
//        addDrop(ModBlocks.DEEPSLATE_RAW_ORIGINIUM_ORE, oreDrops(ModBlocks.DEEPSLATE_RAW_ORIGINIUM_ORE, ModItems.RAW_ORIGINIUM));
        addDrop(ModBlocks.RAW_ORIGINIUM_BLOCK, likeCopperOreDrops(ModBlocks.RAW_ORIGINIUM_BLOCK, ModItems.RAW_ORIGINIUM, 1.0f,3.0f));
        addDrop(ModBlocks.DEEPSLATE_RAW_ORIGINIUM_ORE, likeCopperOreDrops(ModBlocks.DEEPSLATE_RAW_ORIGINIUM_ORE, ModItems.RAW_ORIGINIUM, 1.0f,3.0f));
        addDrop(ModBlocks.ICE_ETHER_ORE, likeCopperOreDrops(ModBlocks.ICE_ETHER_ORE, ModItems.RAW_ICE_ETHER, 2.0f, 4.0f));
        addDrop(ModBlocks.SALT_ORE, likeCopperOreDrops(ModBlocks.SALT_ORE, ModItems.SALT, 3.0f, 7.0f));

        //作物crop
        LootCondition.Builder strawberryBuilder =
                BlockStatePropertyLootCondition.builder(ModBlocks.STRAWBERRY_CROP)
                        .properties(StatePredicate.Builder.create()
                                .exactMatch(StrawberryCropBlock.AGE, 5));
        addDrop(ModBlocks.STRAWBERRY_CROP,
                cropDrops(
                        ModBlocks.STRAWBERRY_CROP,
                        ModItems.STRAWBERRY,
                        ModItems.STRAWBERRY_SEEDS,
                        strawberryBuilder));

        LootCondition.Builder glutinousRiceBuilder =
                BlockStatePropertyLootCondition.builder(ModBlocks.GLUTINOUS_RICE_CROP)
                        .properties(StatePredicate.Builder.create()
                                .exactMatch(GlutinousRiceCropBlock.AGE, 7));

        addDrop(
                ModBlocks.GLUTINOUS_RICE_CROP,
                cropDrops(
                        ModBlocks.GLUTINOUS_RICE_CROP,
                        ModItems.GLUTINOUS_RICE,
                        ModItems.GLUTINOUS_RICE,
                        glutinousRiceBuilder));

        //………………………………

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
