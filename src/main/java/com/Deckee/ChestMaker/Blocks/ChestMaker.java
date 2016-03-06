package com.Deckee.ChestMaker.Blocks;


import com.Deckee.ChestMaker.Reference.Reference;
import com.Deckee.ChestMaker.utility.Config;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import com.Deckee.ChestMaker.IConfigurable;

/**
 * Created by adam on 1/19/2016.
 */
public class ChestMaker extends Block {

    protected ChestMaker(String ChestMaker, Material mat){
        super(mat);

        this.setBlockName("ChestMaker");
        this.setBlockTextureName(Reference.MODNAME + ":" + "Chest");
        this.setHardness(5.0F);
        this.setResistance(6.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setStepSound(soundTypeWood);
        this.setCreativeTab(CreativeTabs.tabDecorations);

    }
    public boolean onBlockActivated(World world, int x,int y,int z,EntityPlayer entityPlayer, int side,float hitX,float hitY,float hitZ)
    {
        if (! world.isRemote) {
            world.playSoundEffect(x, y, z, "random.chestopen", .80F, 1.0F);
        }



        if (world.isAirBlock(x,y+1,z)){
        world.setBlock(x,y+1,z, Blocks.chest);}
        return true;
    }

}

