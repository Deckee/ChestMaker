package com.Deckee.ChestMaker.TileEntitys;

import com.Deckee.ChestMaker.Blocks.BlockchestMakertile;
import com.Deckee.ChestMaker.ChestMaker;
import com.Deckee.ChestMaker.IConfigurable;
import com.Deckee.ChestMaker.Reference.Reference;
import com.Deckee.ChestMaker.utility.Config;
import com.Deckee.ChestMaker.utility.LogHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by adam on 3/8/2016.
 */
public class TileEntityautochest extends TileEntity implements IConfigurable {
    private int timer = 15;

    @Override
    public void updateEntity(){
if (worldObj.isAirBlock(xCoord,yCoord+1,zCoord)== true){
        if (timer>0)timer--;

        if (timer == 0 && !worldObj.isRemote){

            worldObj.setBlock(xCoord,yCoord+1,zCoord,Blocks.chest);
            worldObj.playSoundEffect(xCoord,yCoord-2,zCoord,"random.chestopen",.80f,1.0f);

        }

    }}
    public void readFromNBT(NBTTagCompound tag)
    {
      super.readFromNBT(tag);
        timer = tag.getInteger("timer");
    }
public void writeToNBT(NBTTagCompound tag)
{
 super.writeToNBT(tag);
 tag.setInteger("timer",timer);
}
@Override
    public boolean isEnabled(){
    return ChestMaker.sound;
}
}