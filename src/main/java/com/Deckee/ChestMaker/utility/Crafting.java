package com.Deckee.ChestMaker.utility;


import com.Deckee.ChestMaker.Blocks.Blockregister;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by adam on 3/20/2016.
 */
public final class Crafting {
    public static void init() {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blockregister.chestmaker, 1), new Object[]{"WCW", "CWC", "WCW", 'W', "logWood", 'C', "chestWood"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blockregister.voidDarkNess, 32), new Object[]{"oi", 'o', "blockCoal", 'i', "dyeBlack"}));
    }


}
