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
    protected void buildShapelessRecipes(Consumer<IFinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(ModItems.COBALT_INGOT.get(), 9)
                .requires(ModBlocks.COBALT_BLOCK.get())
                .unlockedBy("has_item", has(ModItems.COBALT_INGOT.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(ModBlocks.COBALT_BLOCK.get())
                .define('#', ModItems.COBALT_INGOT.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .unlockedBy("has_item", has(ModItems.COBALT_INGOT.get()))
                .save(consumer);

        CookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.COBALT_ORE.get()), ModItems.COBALT_INGOT.get(), 1f, 200)
                .unlockedBy("has_item", has(ModBlocks.COBALT_ORE.get()))
                .save(consumer, modId("cobalt_ingot_smelting"));
        CookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.COBALT_ORE.get()), ModItems.COBALT_INGOT.get(), 1f, 100)
                .unlockedBy("has_item", has(ModBlocks.COBALT_ORE.get()))
                .save(consumer, modId("cobalt_ingot_blasting"));
    }

    private static ResourceLocation modId(String path) {
        return new ResourceLocation(MoreMetals.MOD_ID, path);
    }
}
