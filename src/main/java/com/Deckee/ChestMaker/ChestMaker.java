package com.Deckee.ChestMaker;

import com.Deckee.ChestMaker.Blocks.Blockreg;
import com.Deckee.ChestMaker.Client.Settings.KeyInputHandler;
import com.Deckee.ChestMaker.NetWorking.NetworkHandler;
import com.Deckee.ChestMaker.Proxy.CommonProxy;
import com.Deckee.ChestMaker.Proxy.IProxy;
import com.Deckee.ChestMaker.Reference.Reference;
import com.Deckee.ChestMaker.utility.Config;
import com.Deckee.ChestMaker.utility.LogHelper;
import com.Deckee.ChestMaker.utility.ModTileEntities;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Optional;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.ItemStack;

/**
 * Created by adam on 1/24/2016.
 *
 */
@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class ChestMaker {
@Mod.Instance(Reference.MODID)
public static ChestMaker instance;


    @SidedProxy(clientSide = Reference.ClientProxy, serverSide = Reference.ServerProxy)
    public static CommonProxy proxy;
    public static boolean sound = true;




    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

             Config.init(event.getSuggestedConfigurationFile());

             FMLCommonHandler.instance().bus().register(new Config());

                proxy.preInit();
        NetworkHandler.init();

             Blockreg.init();

             Crafting.init();
        ModTileEntities.init();


        LogHelper.info("I prefer the hard truths of Zombies to the easy lies of Elves");

       }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {

        FMLCommonHandler.instance().bus().register(new KeyInputHandler());
        proxy.init();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit();


    }
}

