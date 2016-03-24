package com.Deckee.ChestMaker;

import com.Deckee.ChestMaker.Blocks.Blockregister;
import com.Deckee.ChestMaker.Proxy.CommonProxy;
import com.Deckee.ChestMaker.Reference.Reference;
import com.Deckee.ChestMaker.utility.Crafting;
import com.Deckee.ChestMaker.utility.LogHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by adam on 3/19/2016.
 */
@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class ChestMaker {

    @Mod.Instance(Reference.MODID)
    public static ChestMaker instance;


    @SidedProxy(clientSide = Reference.ClientProxy, serverSide = Reference.ServerProxy)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Blockregister.init();
        Crafting.init();
        proxy.preInit();
        LogHelper.info("I prefer the hard truths of Zombies to the easy lies of Elves");

    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {

        proxy.postInit();
    }
}


/**
 @Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
 public class ExampleMod
 {
 public static final String MODID = "examplemod";
 public static final String VERSION = "1.0";

 @EventHandler public void init(FMLInitializationEvent event)
 {
 // some example code
 System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
 }
 }

 */