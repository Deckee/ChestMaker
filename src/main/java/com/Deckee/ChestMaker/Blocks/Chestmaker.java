package com.Deckee.ChestMaker.Blocks;

import com.Deckee.ChestMaker.utility.Compat.WAILA.WailaCompatibility;
import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;

import java.util.List;


/**
 * Created by adam on 3/19/2016.
 */
public class Chestmaker extends Block implements WailaCompatibility.WailaInfoProvider {
    public Chestmaker() {
        super(Material.WOOD);
        setUnlocalizedName("ChestMaker");
        setRegistryName("ChestMaker");
        this.setCreativeTab(CreativeTabs.DECORATIONS);//i know its useless
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this),getRegistryName());
    }

    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    public boolean isFullCube(IBlockState state) {
        return false;
    }

    public MapColor getMapColor(IBlockState state) {
        return MapColor.WOOD;
    }

    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float X, float Y, float Z) {

        if (!world.isRemote) {
            world.playSound((EntityPlayer) null, pos.add(X, Y + 1, Z), SoundEvents.BLOCK_CHEST_OPEN, SoundCategory.BLOCKS, .80F, 1.0F);

        }
        if (world.isAirBlock(pos.up(1))) {

            world.setBlockState(pos.up(1), Blocks.CHEST.getDefaultState());
            world.playSound((EntityPlayer) null, pos.add(X, Y, Z), SoundEvents.BLOCK_CHEST_OPEN, SoundCategory.BLOCKS, .80F, 1.0F);
        }

        return true;

    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer player, List<String> list, boolean whatIsThis) {
        super.addInformation(itemStack, player, list, whatIsThis);
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
            list.add(TextFormatting.WHITE + "This block Will Spawn A Chest");
            list.add(TextFormatting.WHITE + "Right Click To Use");
            list.add(TextFormatting.DARK_RED + "May Be Cheaty");
        } else {
            list.add(TextFormatting.GREEN + "[Hold Shift For Info]");
        }

    }

    @Override
    public List<String> getWailaBody(ItemStack itemStack, List<String> currenttip, IWailaDataAccessor accessor, IWailaConfigHandler config) {
        Block block = accessor.getBlock();
        if (block instanceof Chestmaker) {
            currenttip.add(TextFormatting.BOLD+"The ChestMaker");
        }
        return currenttip;
    }


}
