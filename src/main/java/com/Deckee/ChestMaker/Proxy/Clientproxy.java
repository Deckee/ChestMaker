package com.Deckee.ChestMaker.Proxy;

import com.Deckee.ChestMaker.Client.Settings.Keybindings;
import com.Deckee.ChestMaker.Client.Settings.KeyInputHandler;
import com.Deckee.ChestMaker.Reference.Key;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by adam on 2/26/2016.
 */
public class Clientproxy extends CommonProxy {

    @Override
    public void preInit() {
        registerKeybinds();
    }

    private void registerKeybinds() {
        FMLCommonHandler.instance().bus().register(new KeyInputHandler());
        for (Keybindings key : Keybindings.values()) {
            ClientRegistry.registerKeyBinding(key.getKeyBinding());
        }
    }
     @Override
    public void init(){


     }

    @Override
    public void postInit(){

    }

    @Override
    public EntityPlayer getClientPlayer(){
        return Minecraft.getMinecraft().thePlayer;
    }





















    //@Override
   // public void registerKeyBindings()
   // {
      //  ClientRegistry.registerKeyBinding(KeyBindings.chest);
   // }
}
