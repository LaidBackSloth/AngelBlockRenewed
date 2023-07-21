package com.laidbacksloth.angelblockrenewed;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AngelBlockRenewed.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AngelBlockRenewed.MOD_ID);

    public static final RegistryObject<Block> ANGEL_BLOCK_BLOCK = BLOCKS.register("angel_block",
            () -> new AngelBlockBlock(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).instabreak().explosionResistance(0).noOcclusion()));

    public static final RegistryObject<Item> ANGEL_BLOCK_ITEM = ITEMS.register("angel_block",
            () -> new AngelBlockItem(ANGEL_BLOCK_BLOCK.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}
