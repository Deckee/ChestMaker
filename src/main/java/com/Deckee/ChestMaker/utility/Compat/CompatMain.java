package com.Deckee.ChestMaker.utility.Compat;

import com.Deckee.ChestMaker.utility.Compat.WAILA.WailaCompatibility;
import net.minecraftforge.fml.common.Loader;

/**
 * Created by adam on 2016-05-30.
 */
public class CompatMain {


 /**   public static void registerTOP() {
        if (Loader.isModLoaded("theoneprobe")) {
            TOPCompatibility.registered();

        }
    }**/
   public static void registerWaila() {
       if (Loader.isModLoaded("Waila")) {
           WailaCompatibility.register();
       }
   }
}
