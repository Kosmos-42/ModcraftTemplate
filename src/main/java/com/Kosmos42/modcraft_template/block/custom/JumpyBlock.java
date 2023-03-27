package com.Kosmos42.modcraft_template.block.custom;

import com.Kosmos42.modcraft_template.Item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;


public class JumpyBlock extends Block {
    public JumpyBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void stepOn(Level level, BlockPos blockPos, BlockState state, Entity entity) {
        if(entity instanceof LivingEntity livingEntity){
            livingEntity.addEffect(new MobEffectInstance(MobEffects.JUMP, 200, 20, false, false, false));
            if(livingEntity instanceof Player player){
                player.setItemInHand(InteractionHand.MAIN_HAND, new ItemStack(ModItems.EIGHT_BALL.get()));
            }
        }

        super.stepOn(level, blockPos, state, entity);
    }

    //@Override
    /*public InteractionResult use(BlockState blockState, Level level, BlockPos pos, Player player,
                                 InteractionHand interactionHand, BlockHitResult blockHitResult) {

        player.sendSystemMessage(Component.literal("Right clicked the block"));

        return super.use(blockState, level, pos, player, interactionHand, blockHitResult);
    }*/
}
