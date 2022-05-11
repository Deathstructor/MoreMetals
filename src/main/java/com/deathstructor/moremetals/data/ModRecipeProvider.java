package com.deathstructor.moremetals.data;

import com.deathstructor.moremetals.MoreMetals;
import com.deathstructor.moremetals.setup.ModBlocks;
import com.deathstructor.moremetals.setup.ModItems;
import net.minecraft.data.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapelessRecipe(ModItems.COBALT_INGOT.get(), 9)
                .addIngredient(ModBlocks.COBALT_BLOCK.get())
                .addCriterion("has_item", hasItem(ModItems.COBALT_INGOT.get()))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(ModBlocks.COBALT_BLOCK.get())
                .key('#', ModItems.COBALT_INGOT.get())
                .patternLine("###")
                .patternLine("###")
                .patternLine("###")
                .addCriterion("has_item", hasItem(ModItems.COBALT_INGOT.get()))
                .build(consumer);

        CookingRecipeBuilder.smeltingRecipe(Ingredient.fromItems(ModBlocks.COBALT_ORE.get()), ModItems.COBALT_INGOT.get(), 1f, 200)
                .addCriterion("has_item", hasItem(ModBlocks.COBALT_ORE.get()))
                .build(consumer, modId("cobalt_ingot_smelting"));
        CookingRecipeBuilder.blastingRecipe(Ingredient.fromItems(ModBlocks.COBALT_ORE.get()), ModItems.COBALT_INGOT.get(), 1f, 100)
                .addCriterion("has_item", hasItem(ModBlocks.COBALT_ORE.get()))
                .build(consumer, modId("cobalt_ingot_blasting"));
    }

    private static ResourceLocation modId(String path) {
        return new ResourceLocation(MoreMetals.MOD_ID, path);
    }
}
