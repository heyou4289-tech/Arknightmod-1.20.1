package com.arknight.tutorial.block.custom;

import com.arknight.tutorial.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
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

public class KaleCropBlock extends CropBlock {

    // 4 个阶段：0~3
    public static final IntProperty AGE = Properties.AGE_3;

    public KaleCropBlock(Settings settings) {
        super(settings);
    }

    /* 生长阶段属性 */
    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    /* 最大生长阶段 */
    @Override
    public int getMaxAge() {
        return 3;
    }

    /* 种子（也是掉落的种子） */
    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.KALE_SEEDS;
    }

    /* 注册 AGE 属性 */
    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

    /* 只能种在耕地上 */
    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(Blocks.FARMLAND);
    }

    /* 作物被破坏时的声音（像胡萝卜 / 小麦） */
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
}
