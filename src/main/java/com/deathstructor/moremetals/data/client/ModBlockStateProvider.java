package com.deathstructor.moremetals.data.client;

import com.deathstructor.moremetals.MoreMetals;
import com.deathstructor.moremetals.setup.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, MoreMetals.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.COBALT_BLOCK.get());
        simpleBlock(ModBlocks.COBALT_ORE.get());
    }
}
