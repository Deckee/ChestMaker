package com.Deckee.ChestMaker;

import com.Deckee.ChestMaker.Blocks.Blockautochest;
import com.Deckee.ChestMaker.Blocks.BlockchestMakertile;
import com.Deckee.ChestMaker.Blocks.Blockreg;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by adam on 1/24/2016.
 */
public final class Crafting {
public static final void init() {
        GameRegistry.addRecipe(new ItemStack(Blockreg.Blockautochest,1),new Object[]{"PCP","PMP","PRP",'P',Blocks.piston,'C',Blocks.chest,'M',Blockreg.ChestMaker,'R',Blocks.redstone_block});
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blockreg.BlackBlock,16),new Object[]{"oi",'o',"blockCoal",'i', "dyeBlack"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blockreg.ChestMaker,1),new Object[]{"WPW", "PCP", "WPW", 'W',"logWood", 'P',"plankWood", 'C',"blockChest"}));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blockreg.ChestMaker,1),new Object[]{"WCW","CWC","WCW",'W',"logWood", 'C',"blockChest"}));
}

}
//        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(DeckTechItems.steelAxe),new Object[]{"II ","IS ", " S ",'S',"stickWood",'I',"plateSteel"}));
