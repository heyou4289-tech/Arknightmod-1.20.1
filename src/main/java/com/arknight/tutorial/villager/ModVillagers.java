package com.arknight.tutorial.villager;

import com.arknight.tutorial.ArknightMod;
import com.arknight.tutorial.block.ModBlocks;
import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import org.jetbrains.annotations.Nullable;

public class ModVillagers {
    public static final VillagerProfession ORIGINIUM_MERCHANT = register("originium_merchant",
            ModPointOfInterestTypes.ORIGINIUM_KEY, SoundEvents.ENTITY_VILLAGER_WORK_ARMORER);

   public static final PointOfInterestType ORIGINIUM_BLOCK_POI = registerPoints("originium_block_poi", ModBlocks.ORIGINIUM_BLOCK);

    public static VillagerProfession register(String id, RegistryKey<PointOfInterestType> heldWorkstation, @Nullable SoundEvent workSound) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(ArknightMod.MOD_ID, id),
                new VillagerProfession(id, entry -> entry.matchesKey(heldWorkstation), entry -> entry.matchesKey(heldWorkstation),
                        ImmutableSet.of(), ImmutableSet.of(), workSound));
    }

    public static PointOfInterestType registerPoints(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(ArknightMod.MOD_ID, name), 1, 1, block);
    }

    public static void registerModVillagers() {

    }
}
