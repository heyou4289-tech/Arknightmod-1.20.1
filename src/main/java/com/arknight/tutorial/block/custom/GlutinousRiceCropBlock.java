package com.arknight.tutorial.block.custom;

import net.minecraft.block.CropBlock;
import com.arknight.tutorial.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class GlutinousRiceCropBlock extends CropBlock {

    public static final IntProperty AGE = Properties.AGE_7;

    public GlutinousRiceCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        // 重点：作物本身就是种子
        return ModItems.GLUTINOUS_RICE;
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(Blocks.FARMLAND);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBreak(world, pos, state, player);

        if (!world.isClient) {
            world.playSound(
                    null,
                    pos,
                    SoundEvents.BLOCK_CROP_BREAK,
                    SoundCategory.BLOCKS,
                    1.0F,
                    1.0F
            );
        }
    }

    @Override
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        super.onLandedUpon(world, state, pos, entity, fallDistance);

        if (!world.isClient && fallDistance > 0.5F) {
            world.playSound(
                    null,
                    pos,
                    SoundEvents.BLOCK_CROP_BREAK,
                    SoundCategory.BLOCKS,
                    1.0F,
                    1.0F
            );
        }
    }

}
