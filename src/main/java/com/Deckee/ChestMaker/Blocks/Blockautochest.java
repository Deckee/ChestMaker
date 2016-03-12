package com.Deckee.ChestMaker.Blocks;

import com.Deckee.ChestMaker.Reference.Reference;
import com.Deckee.ChestMaker.TileEntitys.TileEntityautochest;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by adam on 3/8/2016.
 */
public class Blockautochest extends BlockchestMakertile {


    public Blockautochest() {
        this.setBlockName("Blockautochest");
        this.setBlockTextureName(Reference.MODNAME + ":" + "Chest");
        this.setHardness(5.0F);
        this.setResistance(6.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setStepSound(soundTypeWood);
        this.setCreativeTab(CreativeTabs.tabDecorations);

    }


    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return new TileEntityautochest();
    }

}