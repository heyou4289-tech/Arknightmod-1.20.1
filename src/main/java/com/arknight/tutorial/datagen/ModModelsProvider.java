package com.arknight.tutorial.datagen;

import com.arknight.tutorial.block.ModBlocks;
import com.arknight.tutorial.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ORIGINIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RAW_ORIGINIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORIGINIUM_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_ORIGINIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORIGINIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.LUNGMEN_DOLLAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORIGINIUM_ORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CARDBOARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRAWBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANTHRACITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORUNDUM, Models.GENERATED);
    }
}
