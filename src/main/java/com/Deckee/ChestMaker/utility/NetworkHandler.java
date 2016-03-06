package com.Deckee.ChestMaker.utility;

import com.Deckee.ChestMaker.Reference.Reference;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;

/**
 * Created by adam on 2/24/2016.
 */
public class NetworkHandler {
    private static SimpleNetworkWrapper INSTANCE;
    public static void init()
    {
        INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MODID);




    }

}
