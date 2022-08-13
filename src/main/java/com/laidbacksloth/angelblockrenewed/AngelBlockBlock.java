package com.laidbacksloth.angelblockrenewed;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AngelBlockBlock extends Block {
    public AngelBlockBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!player.isCreative()) {
            player.getInventory().offerOrDrop(BlockRegistry.ANGEL_BLOCK_ITEM.getDefaultStack());
        }
        super.onBreak(world, pos, state, player);
    }
}