package com.Deckee.ChestMaker.Blocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by adam on 3/19/2016.
 */
//make ore dict
public class Blockregister {
    public static Chestmaker chestmaker;
    public static VoidDarkNess voidDarkNess;


    public static void init() {
        chestmaker = new Chestmaker();
        voidDarkNess = new VoidDarkNess();
        OreDictionary.registerOre("chestWood", new ItemStack(Blocks.CHEST));


    }
}