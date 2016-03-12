package com.Deckee.ChestMaker.utility;

import com.Deckee.ChestMaker.Reference.NAMES;
import com.Deckee.ChestMaker.TileEntitys.TileEntityautochest;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by adam on 3/8/2016.
 */
public class ModTileEntities {
    public static void init(){
        GameRegistry.registerTileEntity(TileEntityautochest.class, NAMES.TileEintities.Auto_Chest);
    }
}
