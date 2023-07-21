package com.laidbacksloth.angelblockrenewed;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockRegistry {
    public static final Block ANGEL_BLOCK_BLOCK = Registry.register(Registries.BLOCK, new Identifier(AngelBlockRenewed.MOD_ID, "angel_block"),
            new AngelBlockBlock(FabricBlockSettings.create().mapColor(MapColor.OAK_TAN).burnable().breakInstantly().resistance(0).nonOpaque()));

    public static final Item ANGEL_BLOCK_ITEM = Registry.register(Registries.ITEM, new Identifier(AngelBlockRenewed.MOD_ID, "angel_block"),
            new AngelBlockItem(ANGEL_BLOCK_BLOCK, new FabricItemSettings()));

    public static void register() {
    }
}
