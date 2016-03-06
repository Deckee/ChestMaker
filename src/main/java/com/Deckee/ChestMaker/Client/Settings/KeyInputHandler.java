package com.Deckee.ChestMaker.Client.Settings;


import com.Deckee.ChestMaker.NetWorking.MessageChest;
import com.Deckee.ChestMaker.NetWorking.NetworkHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by adam on 2/27/2016.
 */
public class KeyInputHandler {
    private Keybindings getPressedKey()

    {for (Keybindings key : Keybindings.values()){
    if (key.isPressed())return key;}
        return null;

    }
    @SubscribeEvent
    public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
    {
        Keybindings key = getPressedKey();
        if (key != null){
            switch (key){
                case chest:
                    NetworkHandler.sendToServer(new MessageChest());
                    break;

            }
        }
    }

}


/**
 * EntityPlayer player = Minecraft.getMinecraft().thePlayer;
 player.worldObj.playSound(player.posX,player.posY,player.posZ,"random.chestopen",.80F,1.0F,true);
 */