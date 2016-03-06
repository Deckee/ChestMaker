package com.Deckee.ChestMaker.Blocks;

import com.Deckee.ChestMaker.Reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by adam on 2/13/2016.
 */
public class BlackBlock extends Block {
    protected BlackBlock(String BlackBlock, Material mat) {
        super(mat);

        this.setBlockName("BlackBlock");
        this.setBlockTextureName(Reference.MODNAME + ":" + "black");
        this.setHardness(5.0F);
        this.setResistance(6.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setStepSound(soundTypeWood);
        this.setCreativeTab(CreativeTabs.tabDecorations);

    }
}