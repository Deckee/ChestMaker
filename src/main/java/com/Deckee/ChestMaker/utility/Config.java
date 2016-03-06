package com.Deckee.ChestMaker.utility;
import com.Deckee.ChestMaker.ChestMaker;
import com.Deckee.ChestMaker.Reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import java.io.File;
/**
 * Created by adam on 2/23/2016.
 */
public final class Config {
    public static Configuration configuration;
    public static boolean hi = false;
    public static boolean maker = true;



    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
            LogHelper.debug("config");
        }
    }
    private static void loadConfiguration()
    {
        hi = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL,false, "hi");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MODID))
        {
            loadConfiguration();
        }
    }
}

