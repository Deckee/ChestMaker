package com.Deckee.ChestMaker.Proxy;

import com.Deckee.ChestMaker.Client.Render.Blocks.BlockRenderRegister;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by adam on 3/20/2016.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit() {

    }

    @Override
    public void init() {
        BlockRenderRegister.registerBlockRenderer();

    }

    @Override
    public void postInit() {

    }

    @Override
    public EntityPlayer getClientPlayer() {
        return Minecraft.getMinecraft().thePlayer;

    }
}

