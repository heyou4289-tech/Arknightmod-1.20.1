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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_ETHER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ICE_ETHER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ICE_ETHER_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SALT_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.ICE_ETHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ICE_ETHER, Models.GENERATED);

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

        itemModelGenerator.register(ModItems.A_BAG_OF_SUGAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUGAR_GROUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUGAR_CUBE, Models.GENERATED);
        itemModelGenerator.register(ModItems.SALT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SALTED_EGG_YOLK, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEAT_FLOSS, Models.GENERATED);

        itemModelGenerator.register(ModItems.MOONCAKE_MOLD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROLLING_PIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.FLOUR, Models.GENERATED);
        itemModelGenerator.register(ModItems.DOUGH, Models.GENERATED);
        itemModelGenerator.register(ModItems.DOUGH_WRAPPER, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNFORMED_ZANGJINBO, Models.GENERATED);
        itemModelGenerator.register(ModItems.ZANG_JIN_BO, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_ZANG_JIN_BO, Models.GENERATED);
    }
}
