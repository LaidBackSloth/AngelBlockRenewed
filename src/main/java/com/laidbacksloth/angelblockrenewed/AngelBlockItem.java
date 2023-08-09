package com.laidbacksloth.angelblockrenewed;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AngelBlockItem extends BlockItem {
    public AngelBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            double x = user.getX() + user.getRotationVec(1).x * 4.5;
            double y = user.getEyeY() + user.getRotationVec(1).y * 4.5;
            double z = user.getZ() + user.getRotationVec(1).z * 4.5;
            BlockPos pos = new BlockPos(x, y, z);

            if (world.isInBuildLimit(pos) && world.getBlockState(pos).getMaterial().isReplaceable()) {
                world.setBlockState(pos, BlockRegistry.ANGEL_BLOCK_BLOCK.getDefaultState(), 3);
                if (!user.isCreative()) {
                    if (hand == Hand.MAIN_HAND) {
                        user.getInventory().removeStack(user.getInventory().selectedSlot, 1);
                    } else {
                        user.getOffHandStack().decrement(1);
                    }
                }
            }
        }
        return super.use(world, user, hand);
    }
}
