package com.deathstructor.moremetals;

import com.deathstructor.moremetals.setup.Registration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MoreMetals.MOD_ID)
public class MoreMetals {
    public static final String MOD_ID = "moremetals";

    private static final Logger LOGGER = LogManager.getLogger();

    public MoreMetals() {
        Registration.register();
        MinecraftForge.EVENT_BUS.register(this);
    }
}
