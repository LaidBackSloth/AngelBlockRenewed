package com.laidbacksloth.angelblockrenewed;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class AngelBlockRenewed implements ModInitializer {
	public static final String MOD_ID = "angelblockrenewed";

	@Override
	public void onInitialize() {
		BlockRegistry.register();
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(BlockRegistry.ANGEL_BLOCK_ITEM));
	}
}
