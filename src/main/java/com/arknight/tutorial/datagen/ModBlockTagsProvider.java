package com.arknight.tutorial.datagen;

import com.arknight.tutorial.block.ModBlocks;
import com.arknight.tutorial.tag.ModBlockTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.ORIGINIUM_BLOCK)
                .add(ModBlocks.RAW_ORIGINIUM_BLOCK)
                .add(ModBlocks.DEEPSLATE_RAW_ORIGINIUM_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ORIGINIUM_BLOCK)
                .add(ModBlocks.RAW_ORIGINIUM_BLOCK)
                .add(ModBlocks.DEEPSLATE_RAW_ORIGINIUM_ORE);

        getOrCreateTagBuilder(ModBlockTags.ORIGINIUM_ORES)
                .add(ModBlocks.RAW_ORIGINIUM_BLOCK)
                .add(ModBlocks.DEEPSLATE_RAW_ORIGINIUM_ORE);
    }
}
