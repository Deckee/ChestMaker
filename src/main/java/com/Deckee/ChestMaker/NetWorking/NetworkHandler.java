package com.Deckee.ChestMaker.NetWorking;

import com.Deckee.ChestMaker.Reference.Reference;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

/**
 * Created by adam on 3/6/2016.
 */
public class NetworkHandler {
    private static SimpleNetworkWrapper INSTANCE;



    public static void init(){
  INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.MODID);
  INSTANCE.registerMessage(MessageChest.class,MessageChest.class,0, Side.SERVER);
  INSTANCE.registerMessage(MessageChest.class,MessageChest.class,1, Side.CLIENT);




    }
  public static void sendToServer(MessageBase message){
      INSTANCE.sendToServer(message);
  }

}
