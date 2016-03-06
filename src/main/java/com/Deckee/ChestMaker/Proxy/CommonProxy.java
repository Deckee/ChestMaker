package com.Deckee.ChestMaker.Proxy;

import net.minecraft.entity.player.EntityPlayer;

/**
 * Created by adam on 2/26/2016.
 */
public abstract class CommonProxy
{

    public abstract void preInit();

    public abstract void init();

    public abstract void postInit();

    public abstract EntityPlayer getClientPlayer();
}
