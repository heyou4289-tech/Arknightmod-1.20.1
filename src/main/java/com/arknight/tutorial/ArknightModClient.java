package com.arknight.tutorial;

import com.arknight.tutorial.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class ArknightModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.ORIGINIUM_BLOCK,
                RenderLayer.getTranslucent()
        );
    }
}