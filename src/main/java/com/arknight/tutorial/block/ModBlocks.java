package com.arknight.tutorial.block;

import com.arknight.tutorial.ArknightMod;
import com.arknight.tutorial.block.custom.GlutinousRiceCropBlock;
import com.arknight.tutorial.block.custom.StrawberryCropBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block ORIGINIUM_BLOCK = register("originium_block", new Block(AbstractBlock.Settings.create()
                                                            .requiresTool()
                                                            .strength(20.0f,600.0f)
                                                            .luminance(state -> 7)
                                                            .nonOpaque()));
    public static final Block RAW_ORIGINIUM_BLOCK = register("raw_originium_block", new Block(AbstractBlock.Settings.create()
                                                            .strength(4.0f,3.0f)
                                                            .requiresTool()
                                                            .luminance(state -> 4)));
    public static final Block DEEPSLATE_RAW_ORIGINIUM_ORE = register("deepslate_raw_originium_ore", new Block(AbstractBlock.Settings.create()
                                                                    .strength(4.5f,3.0f)
                                                                    .requiresTool()
                                                                    .luminance(state -> 4)));
    public static final Block ICE_ETHER_BLOCK = register( "ice_ether_block", new Block(AbstractBlock.Settings.copy(Blocks.STONE)));
    public static final Block RAW_ICE_ETHER_BLOCK = register("raw_ice_ether_block", new Block(AbstractBlock.Settings.create()
                                                            .strength(0.2f, 0.2f)
                                                            .requiresTool()));
    public static final Block ICE_ETHER_ORE = register("ice_ether_ore", new Block(AbstractBlock.Settings.create()
                                                        .strength(3.0f, 3.0f)
                                                        .requiresTool()));

    public static final Block SALT_ORE = register("salt_ore", new Block(AbstractBlock.Settings.create()
            .requiresTool()
            .strength(1.5f, 1.5f)));

    //作物
    public static final Block STRAWBERRY_CROP = Registry.register(Registries.BLOCK, new Identifier(ArknightMod.MOD_ID, "strawberry_crop"),
            new StrawberryCropBlock(AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GLUTINOUS_RICE_CROP =
            Registry.register(
                    Registries.BLOCK,
                    new Identifier(ArknightMod.MOD_ID, "glutinous_rice_crop"),
                    new GlutinousRiceCropBlock(
                            AbstractBlock.Settings.create()
                                    .noCollision()
                                    .ticksRandomly()
                                    .breakInstantly()
                                    .pistonBehavior(PistonBehavior.DESTROY)
                    ));




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

