package com.arknight.tutorial.datagen;

import com.arknight.tutorial.item.ModItems;
import com.arknight.tutorial.tag.ModItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModItemTags.COOKED_MEAT)
                .add(Items.COOKED_BEEF)
                .add(Items.COOKED_PORKCHOP)
                .add(Items.COOKED_CHICKEN)
                .add(Items.COOKED_MUTTON)
                .add(Items.COOKED_RABBIT);
    }
}
