package com.Deckee.ChestMaker.Blocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by adam on 3/19/2016.
 */
public class Blockregister {
    public static Block ChestMaker;

    public static void init() {
        GameRegistry.registerBlock(ChestMaker = new Chestmaker("ChestMaker").setBlockUnbreakable(), "ChestMaker");

        OreDictionary.registerOre("chestWood", new ItemStack(Blocks.chest));

    }
}
