package com.Deckee.ChestMaker.NetWorking;

import com.Deckee.ChestMaker.utility.LogHelper;
import net.minecraft.entity.player.EntityPlayer;
import io.netty.buffer.ByteBuf;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

/**
 * Created by adam on 3/6/2016.
 */
public class MessageChest extends MessageBase<MessageChest> {


    @Override
    public void fromBytes(ByteBuf buf){}

    @Override
    public void toBytes(ByteBuf buf){}

    @Override
    public void handleClientSide(MessageChest message,EntityPlayer player)
    {
        player.worldObj.playSoundEffect(player.posX,player.posY-2,player.posZ,"random.chestopen",.80F,1.0F);

    }

    @Override
    public void handleServerSide(MessageChest message,EntityPlayer player)
    {


        player.worldObj.playSoundEffect(player.posX,player.posY-2,player.posZ,"random.chestopen",.80F,1.0F);

    }
























}
