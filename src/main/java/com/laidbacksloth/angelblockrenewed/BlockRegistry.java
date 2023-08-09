package com.laidbacksloth.angelblockrenewed;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    public static final Block ANGEL_BLOCK_BLOCK = Registry.register(Registry.BLOCK, new Identifier(AngelBlockRenewed.MOD_ID, "angel_block"),
            new AngelBlockBlock(FabricBlockSettings.of(Material.NETHER_WOOD).breakInstantly().resistance(0).nonOpaque()));

    public static final Item ANGEL_BLOCK_ITEM = Registry.register(Registry.ITEM, new Identifier(AngelBlockRenewed.MOD_ID, "angel_block"),
            new AngelBlockItem(ANGEL_BLOCK_BLOCK, new FabricItemSettings().group(ItemGroup.MISC)));

    public static void register() {
    }
}
