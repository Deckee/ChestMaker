package com.Deckee.ChestMaker.utility.Compat.top;


import com.Deckee.ChestMaker.utility.LogHelper;
import mcjty.theoneprobe.api.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInterModComms;

import javax.annotation.Nullable;

/**
 * Created by adam on 2016-05-30.
 */
public class TOPCompatibility {

    private static boolean registered;

    public static void registered() {
        if (registered)
            return;
        LogHelper.info("LogRegistered");
        registered = true;
        FMLInterModComms.sendFunctionMessage("theoneprobe", "getTheOneProbe", "com.Deckee.ChestMaker.utility.Compat.top.TOPCompatibility$GetTheOneProbe");
    }

    public static class GetTheOneProbe implements com.google.common.base.Function<ITheOneProbe, Void> {

        public static ITheOneProbe probe;

        @Nullable
        @Override
        public Void apply(ITheOneProbe theOneProbe) {

            probe = theOneProbe;

            LogHelper.info("theoneprobe is active");

            probe.registerProvider(new IProbeInfoProvider() {

                @Override
                public String getID() {
                    return "chestmaker:default";
                }

                @Override
                public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world, IBlockState blockState, IProbeHitData data) {
                    if (blockState.getBlock() instanceof TOPInfoProvider) {
                        TOPInfoProvider provider = (TOPInfoProvider) blockState.getBlock();
                        provider.addProbeInfo(mode, probeInfo, player, world, blockState, data);


                    }

                }

            });
            return null;
        }

    }

}
