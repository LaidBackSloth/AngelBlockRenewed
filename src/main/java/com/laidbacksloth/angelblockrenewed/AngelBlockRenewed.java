package com.laidbacksloth.angelblockrenewed;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("angelblockrenewed")
public class AngelBlockRenewed {
    public static final String MOD_ID = "angelblockrenewed";

    public AngelBlockRenewed() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockRegistry.register(eventBus);
        eventBus.addListener(this::creativeModTabs);
    }

    public void creativeModTabs(CreativeModeTabEvent.BuildContents event) {
        event.registerSimple(CreativeModeTabs.TOOLS_AND_UTILITIES, BlockRegistry.ANGEL_BLOCK_ITEM.get());
    }
}