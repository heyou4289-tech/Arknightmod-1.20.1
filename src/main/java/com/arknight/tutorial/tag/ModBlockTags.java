package com.arknight.tutorial.tag;

import com.arknight.tutorial.ArknightMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.apache.commons.compress.compressors.lz77support.LZ77Compressor;

public class ModBlockTags {
    public static final TagKey<Block> ORIGINIUM_ORES = of("originium_ores");

    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(ArknightMod.MOD_ID,id));
    }
}
