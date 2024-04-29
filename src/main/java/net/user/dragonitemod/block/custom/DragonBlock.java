package net.user.dragonitemod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class DragonBlock extends Block {
    public DragonBlock(Properties pProperties) {
        super(pProperties);
    }

    // Overrides use method to play a sound when interacted with
    // TODO Add powers when used
    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos,
                                 Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {

        // Plays the ender Dragon Growl
        pLevel.playSound(pPlayer, pPos, SoundEvents.ENDER_DRAGON_GROWL, SoundSource.BLOCKS,
                1f, 1f);



        return InteractionResult.SUCCESS;
    }
}
