package com.arknight.tutorial.datagen;

import com.arknight.tutorial.block.ModBlocks;
import com.arknight.tutorial.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }

    //public static List<ItemConvertible>   //烧炼
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ORIGINIUM, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORIGINIUM_BLOCK);
        //offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORIGINIUM_BLOCK, RecipeCategory.MISC, ModItems.ORIGINIUM);


        //generateCookingRecipes(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, 400, ModItems.xxxx, ModItems.xxx， 0.35f);//营火烧食物


        //offerSmelting(exporter, xxx, RecipeCategory.MISC, ModItems.xxx, 0.7f, 200, "xxxx");//熔炉烧炼
        //offerBlasting(exporter, xxx, RecipeCategory.MISC, ModItems.xxx, 0.7f, 100, "xxxx");//高炉烧炼



    }
}
