package com.arknight.tutorial.datagen;

import com.arknight.tutorial.tag.ModItemTags;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import com.arknight.tutorial.ArknightMod;
import com.arknight.tutorial.block.ModBlocks;
import com.arknight.tutorial.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output) {
        super(output);
    }

    public static final List<ItemConvertible> ICE_ETHER = List.of(ModItems.RAW_ICE_ETHER, ModBlocks.ICE_ETHER_ORE);
    //public static final List<ItemConvertible> UNCOOKED_MOONCAKE = List.of(ModItems.ZANG_JIN_BO);

    //public static List<ItemConvertible>   //烧炼
    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.ORIGINIUM, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORIGINIUM_BLOCK);
        //offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.A_BAG_OF_SUGAR, RecipeCategory.BUILDING_BLOCKS, ModItems.SUGAR_GROUP);
        //offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORIGINIUM_BLOCK, RecipeCategory.MISC, ModItems.ORIGINIUM);


        //generateCookingRecipes(exporter, "campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, 400, ModItems.xxxx, ModItems.xxx， 0.35f);//营火烧食物


        //offerSmelting(exporter, xxx, RecipeCategory.MISC, ModItems.xxx, 0.7f, 200, "xxxx");//熔炉烧炼
        //offerBlasting(exporter, xxx, RecipeCategory.MISC, ModItems.xxx, 0.7f, 100, "xxxx");//高炉烧炼
        offerSmelting(exporter, ICE_ETHER, RecipeCategory.MISC, ModItems.ICE_ETHER, 0.7f, 200, "ice_ether");
        offerBlasting(exporter, ICE_ETHER, RecipeCategory.MISC, ModItems.ICE_ETHER, 0.7f, 100, "ice_ether");


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ORUNDUM, 1)
                .pattern("*#*")
                .pattern("###")
                .pattern("*#*")
                .input('#', ModItems.RAW_ORIGINIUM)
                .input('*', Items.IRON_INGOT)
                .criterion("has_raw_originium", conditionsFromItem(ModItems.RAW_ORIGINIUM))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CARDBOARD, 3)
                .pattern("###")
                .pattern("***")
                .pattern("###")
                .input('#', Items.PAPER)
                .input('*', Items.STRING)
                .criterion("has_cardboard", conditionsFromItem(Items.PAPER))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.A_BAG_OF_SUGAR, 2)
                .input(Items.PAPER)
                .input(Items.SUGAR)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .offerTo(exporter,
                        new Identifier("arknight-mod", "a_bag_of_sugar_from_paper"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.A_BAG_OF_SUGAR, 9)
                .input(ModItems.SUGAR_GROUP)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .offerTo(exporter,
                        new Identifier("arknight-mod", "a_bag_of_sugar_from_group"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SUGAR_GROUP, 1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.A_BAG_OF_SUGAR)
                .criterion("has_sugar_group", conditionsFromItem(Items.SUGAR))
                .offerTo(exporter,
                        new Identifier("arknight-mod", "sugar_group_from_a_bag_of_sugar"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SUGAR_GROUP, 6)
                .input(ModItems.SUGAR_CUBE)
                .criterion(hasItem(Items.SUGAR), conditionsFromItem(Items.SUGAR))
                .offerTo(exporter,
                        new Identifier("arknight-mod", "sugar_group_from_sugar_cube"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SUGAR_CUBE, 1)
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.SUGAR_GROUP)
                .criterion("has_sugar_cube", conditionsFromItem(Items.SUGAR))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SALTED_EGG_YOLK, 2)
                .input(ModItems.SALT)
                .input(Items.EGG)
                .criterion(hasItem(Items.EGG), conditionsFromItem(Items.EGG))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MOONCAKE_MOLD, 1)
                .input(Ingredient.fromTag(ItemTags.WOODEN_SLABS))
                .criterion("has_wooden_slabs", conditionsFromTag(ItemTags.WOODEN_SLABS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ROLLING_PIN, 2)
                .pattern("  *")
                .pattern(" # ")
                .pattern("*  ")
                .input('#', Ingredient.fromTag(ItemTags.PLANKS))
                .input('*', Items.STICK)
                .criterion("has_planks",conditionsFromTag(ItemTags.PLANKS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FLOUR, 3)
                .input(Items.WHEAT)
                .criterion("has_wheat", conditionsFromItem(Items.WHEAT))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DOUGH, 2)
                .input(ModItems.FLOUR)
                .input(ModItems.FLOUR)
                .input(Items.WATER_BUCKET)
                .criterion("has_flour", conditionsFromItem(ModItems.FLOUR))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DOUGH_WRAPPER, 4)
                .input(ModItems.ROLLING_PIN)
                .input(ModItems.DOUGH)
                .criterion("has_flour", conditionsFromItem(ModItems.FLOUR))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.UNFORMED_ZANGJINBO, 1)
                .input(ModItems.SALTED_EGG_YOLK)
                .input(Items.SUGAR)
                .input(ModItems.DOUGH_WRAPPER)
                .criterion("has_sugar", conditionsFromItem(ModItems.FLOUR))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.ZANG_JIN_BO, 1)
                .input(ModItems.MOONCAKE_MOLD)
                .input(ModItems.UNFORMED_ZANGJINBO)
                .criterion("has_mold", conditionsFromItem(ModItems.MOONCAKE_MOLD))
                .offerTo(exporter);

        offerFoodCookingRecipe(exporter, "smoking", RecipeSerializer.SMOKING,
                100, ModItems.ZANG_JIN_BO, ModItems.COOKED_ZANG_JIN_BO, 0.4f);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MEAT_FLOSS, 5)
                .input(ModItems.SALT)
                .input(ModItemTags.COOKED_MEAT)
                .criterion("has_meat", conditionsFromItem(Items.COOKED_BEEF))
                .offerTo(exporter);


    }

}
