package com.Deckee.ChestMaker.Client.Render.Blocks;

import com.Deckee.ChestMaker.Blocks.Blockregister;
import com.Deckee.ChestMaker.Blocks.Chestmaker;
import com.Deckee.ChestMaker.Reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by adam on 3/20/2016.
 */
public final class BlockRenderRegister {
//may be removed is a lie
    public static String modid = Reference.MODID;

    public static void registerBlockRenderer() {
        reg(Blockregister.chestmaker);
        reg(Blockregister.voidDarkNess);

    }

    public static void reg(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }

}
