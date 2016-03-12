package com.Deckee.ChestMaker.Blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by adam on 3/8/2016.
 */
public abstract class BlockchestMakertile extends BlockContainer {
    public BlockchestMakertile(Material material){
        super(material);
    }
    public BlockchestMakertile(){
        this(Material.rock);
    }


}
