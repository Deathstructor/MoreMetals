package com.deathstructor.moremetals.data.client;

import com.deathstructor.moremetals.MoreMetals;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, MoreMetals.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // withExistingParent("cobalt_block", modLoc("block/cobalt_block"));
        // withExistingParent("cobalt_ore", modLoc("block/cobalt_ore"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "cobalt_ingot");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
