package com.arknight.tutorial.villager;

import com.arknight.tutorial.ArknightMod;
import com.arknight.tutorial.block.ModBlocks;
import com.google.common.collect.ImmutableSet;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import org.jetbrains.annotations.Nullable;

public class ModPointOfInterestTypes {
    public static final RegistryKey<PointOfInterestType> ORIGINIUM_KEY = of("originium_block_poi");

//    public static final PointOfInterestType ORIGINIUM_BLOCK_POI =
//            Registry.register(
//                    Registries.POINT_OF_INTEREST_TYPE,
//                    ModPointOfInterestTypes.ORIGINIUM_KEY.getValue(),
//                    new PointOfInterestType(
//                            ImmutableSet.copyOf(ModBlocks.ORIGINIUM_BLOCK.getStateManager().getStates()),
//                            1,
//                            1
//                    )
//            );


    private static RegistryKey<PointOfInterestType> of(String id) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, new Identifier(ArknightMod.MOD_ID, id));
    }
}
