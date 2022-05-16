package com.deathstructor.moremetals.data;

import com.deathstructor.moremetals.MoreMetals;
import com.deathstructor.moremetals.setup.ModBlocks;
import com.deathstructor.moremetals.setup.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, MoreMetals.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        tag(ModTags.Blocks.ORES_COBALT).addTag(ModTags.Blocks.ORES_COBALT);
        tag(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_COBALT);
        tag(ModTags.Blocks.STORAGE_BLOCKS_COBALT).addTag(ModTags.Blocks.STORAGE_BLOCKS_COBALT);
        tag(Tags.Blocks.STORAGE_BLOCKS).addTag(ModTags.Blocks.STORAGE_BLOCKS_COBALT);
    }
}
