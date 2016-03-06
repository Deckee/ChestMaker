package com.Deckee.ChestMaker.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by adam on 1/24/2016.
 */
public class Blockreg {
    public static Block ChestMaker;
    public static Block BlackBlock;



    public static final void init()
    {
        GameRegistry.registerBlock(BlackBlock = new BlackBlock("BlackBlock", Material.wood),"BlackBlock");
        GameRegistry.registerBlock(ChestMaker = new ChestMaker("ChestMaker", Material.wood),"ChestMaker");


        OreDictionary.registerOre("blockChest", new ItemStack(Blocks.chest));
    }
}
//GameRegistry.registerBlock(PathBlock = new pathBlock("PathBlock", Material.iron),"PathBlock");