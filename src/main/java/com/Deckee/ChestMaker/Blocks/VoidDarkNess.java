package com.Deckee.ChestMaker.Blocks;

import com.Deckee.ChestMaker.utility.Compat.WAILA.WailaCompatibility;
import mcp.mobius.waila.api.IWailaConfigHandler;
import mcp.mobius.waila.api.IWailaDataAccessor;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.input.Keyboard;

import java.util.List;

/**
 * Created by adam on 2016-03-23.
 */
public class VoidDarkNess extends Block {
    public VoidDarkNess() {
        super(Material.CLAY);
        setUnlocalizedName("VoidDarkNess");
        setRegistryName("VoidDarkNess");
        setCreativeTab(CreativeTabs.DECORATIONS);
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this),getRegistryName());
    }

    public MapColor getMapColor(IBlockState state) {
        return MapColor.CLAY;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer player, List<String> list, boolean whatIsThis) {
        super.addInformation(itemStack, player, list, whatIsThis);
        if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
            list.add(TextFormatting.WHITE + "A Building Block");

        } else {
            list.add(TextFormatting.GREEN + "[Hold Shift For Info]");
        }


    }


}
