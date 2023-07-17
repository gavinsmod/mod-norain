package com.peasenet.mod;

import com.peasenet.mods.render.ModNoRain;
import com.peasenet.main.GavinsMod;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoRainMod implements ModInitializer {
    public static Logger LOGGER = LoggerFactory.getLogger("gavinsmod");

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        LOGGER.info("Initializing GEM No Rain...");
        GavinsMod.addMod(new ModNoRain());
    }
}
