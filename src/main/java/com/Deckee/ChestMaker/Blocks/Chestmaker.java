package com.Deckee.ChestMaker.Blocks;

import com.Deckee.ChestMaker.utility.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


/**
 * Created by adam on 3/19/2016.
 */
public class Chestmaker extends Block {
    public Chestmaker(String unlocalizedName, Material material, float hardness, float resistance) {
        super(material);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setUnlocalizedName("ChestMaker");
        this.setHardness(4F);
        this.setResistance(4F);
        this.setCreativeTab(CreativeTabs.tabDecorations);

    }

    public Chestmaker(String unlocalizedName, float hardness, float resistance) {
        this(unlocalizedName, Material.rock, hardness, resistance);
    }


    public Chestmaker(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }


    public MapColor getMapColor(IBlockState state) {
        return MapColor.blackColor;
    }


    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float X, float Y, float Z) {

        if (!world.isRemote) {
            world.playSound((EntityPlayer) null, pos.add(X, Y + 1, Z), SoundEvents.block_chest_open, SoundCategory.BLOCKS, .80F, 1.0F);

        }
        if (world.isAirBlock(pos.up(1))) {

            world.setBlockState(pos.up(1), Blocks.chest.getDefaultState());
            world.playSound((EntityPlayer) null, pos.add(X, Y, Z), SoundEvents.block_chest_open, SoundCategory.BLOCKS, .80F, 1.0F);

            LogHelper.info("Thanks for testing");
        }

        return true;

    }


}



