package com.laidbacksloth.angelblockrenewed;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("angelblockrenewed")
public class AngelBlockRenewed {
    public static final String MOD_ID = "angelblockrenewed";

    public AngelBlockRenewed() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockRegistry.register(eventBus);
    }
}