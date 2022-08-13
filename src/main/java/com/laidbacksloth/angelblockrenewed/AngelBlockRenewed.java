package com.laidbacksloth.angelblockrenewed;

import net.fabricmc.api.ModInitializer;

public class AngelBlockRenewed implements ModInitializer {
	public static final String MOD_ID = "angelblockrenewed";

	@Override
	public void onInitialize() {
		BlockRegistry.register();
	}
}
