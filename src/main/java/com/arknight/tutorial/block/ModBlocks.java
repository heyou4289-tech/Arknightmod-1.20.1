package com.arknight.tutorial.block;

import com.arknight.tutorial.ArknightMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ORIGINIUM_BLOCK = register("originium_block", new Block(AbstractBlock.Settings.create()
                                                            .requiresTool()
                                                            .strength(20.0f,600.0f)
                                                            .luminance(state -> 7)
                                                            .nonOpaque()));
    public static final Block RAW_ORIGINIUM_BLOCK = register("raw_originium_block", new Block(AbstractBlock.Settings.create()
                                                            .strength(3.0f,3.0f)
                                                            .requiresTool()
                                                            .luminance(state -> 4)
                                                            .nonOpaque()));


    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, new Identifier(ArknightMod.MOD_ID, id), block);
    }

    public static void registerBlockItems(String id, Block block) {
        Registry.register(Registries.ITEM, new Identifier(ArknightMod.MOD_ID, id),
                new BlockItem(block,new Item.Settings()));
    }

    public static void registerModBlocks() {

    }
}

