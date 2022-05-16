package com.deathstructor.moremetals.setup;

import com.deathstructor.moremetals.MoreMetals;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModTags {
    public static final class Blocks {
        public static final ITag.INamedTag<Block> ORES_COBALT = forge("ores/cobalt");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_COBALT = forge("storage_blocks/cobalt");

        public static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.bind(new ResourceLocation("forge", path).toString());
        }

        public static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.bind(new ResourceLocation(MoreMetals.MOD_ID, path).toString());
        }
    }

    public static final class Items {
        public static final ITag.INamedTag<Item> ORES_COBALT = forge("ores/cobalt");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_COBALT = forge("storage_blocks/cobalt");

        public static final ITag.INamedTag<Item> INGOTS_COBALT= forge("ingots/cobalt");

        public static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.bind(new ResourceLocation("forge", path).toString());
        }

        public static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.bind(new ResourceLocation(MoreMetals.MOD_ID, path).toString());
        }
    }
}
