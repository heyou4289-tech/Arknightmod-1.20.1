package com.arknight.tutorial;

import com.arknight.tutorial.block.ModBlocks;
import com.arknight.tutorial.item.ModItemGroups;
import com.arknight.tutorial.item.ModItems;
import com.arknight.tutorial.villager.ModPointOfInterestTypes;
import com.arknight.tutorial.villager.ModTraders;
import com.arknight.tutorial.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ArknightMod implements ModInitializer {
	public static final String MOD_ID = "arknight-mod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
        ModItems.registerItems();
        ModBlocks.registerModBlocks();
        ModItemGroups.registerGroups();

        ModTraders.registerTraders();
        ModVillagers.registerModVillagers();
        FriedRiceExplosionManager.init();
        //ModPointOfInterestTypes.ORIGINIUM_BLOCK_POI.toString();


        //FuelRegistry.INSTANCE.add(ModItems.ANTHRACITE, 1600);
		LOGGER.info("Hello Fabric world!");
	}
}