package io.github.breaklibteam.BreakInfinity;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import io.github.breaklibteam.Decimal.Decimal;

@Mod(modid = BreakInfinity.MODID, name = BreakInfinity.NAME, version = BreakInfinity.VERSION)
public class BreakInfinity {
    public static final String MODID = "BreakInfinity";
    public static final String NAME = "Break Infinity";
    public static final String VERSION = "0.1";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
