package net.nomi.tutorialmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class jumping_block extends Block {

    int compteur = 0;

    public jumping_block(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
        if (!level.isClientSide() && interactionHand == InteractionHand.MAIN_HAND) {
            player.sendSystemMessage(Component.literal("effet change"));
            compteur = compteur+1;
        }

        return super.use(blockState, level, blockPos, player, interactionHand, blockHitResult);
    }

    @Override
    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        if (entity instanceof LivingEntity livingEntity && compteur == 0){
            livingEntity.addEffect(new MobEffectInstance(MobEffects.JUMP,200));
            livingEntity.removeEffect(MobEffects.NIGHT_VISION);
            livingEntity.removeEffect(MobEffects.SATURATION);
            livingEntity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            livingEntity.removeEffect(MobEffects.MOVEMENT_SPEED);
            livingEntity.removeEffect(MobEffects.ABSORPTION);
            livingEntity.removeEffect(MobEffects.FIRE_RESISTANCE);
            livingEntity.removeEffect(MobEffects.POISON);
            livingEntity.removeEffect(MobEffects.HEAL);
            livingEntity.removeEffect(MobEffects.DARKNESS);

        }
        else if (entity instanceof LivingEntity livingEntity && compteur == 1) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,200));
            livingEntity.removeEffect(MobEffects.NIGHT_VISION);
            livingEntity.removeEffect(MobEffects.SATURATION);
            livingEntity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            livingEntity.removeEffect(MobEffects.JUMP);
            livingEntity.removeEffect(MobEffects.ABSORPTION);
            livingEntity.removeEffect(MobEffects.FIRE_RESISTANCE);
            livingEntity.removeEffect(MobEffects.POISON);
            livingEntity.removeEffect(MobEffects.HEAL);
            livingEntity.removeEffect(MobEffects.DARKNESS);

        }
        else if (entity instanceof LivingEntity livingEntity && compteur == 2) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,200));
            livingEntity.removeEffect(MobEffects.NIGHT_VISION);
            livingEntity.removeEffect(MobEffects.SATURATION);
            livingEntity.removeEffect(MobEffects.JUMP);
            livingEntity.removeEffect(MobEffects.MOVEMENT_SPEED);
            livingEntity.removeEffect(MobEffects.ABSORPTION);
            livingEntity.removeEffect(MobEffects.FIRE_RESISTANCE);
            livingEntity.removeEffect(MobEffects.POISON);
            livingEntity.removeEffect(MobEffects.HEAL);
            livingEntity.removeEffect(MobEffects.DARKNESS);
        }
        else if (entity instanceof LivingEntity livingEntity && compteur == 3) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION,200));
            livingEntity.removeEffect(MobEffects.NIGHT_VISION);
            livingEntity.removeEffect(MobEffects.SATURATION);
            livingEntity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            livingEntity.removeEffect(MobEffects.MOVEMENT_SPEED);
            livingEntity.removeEffect(MobEffects.JUMP);
            livingEntity.removeEffect(MobEffects.FIRE_RESISTANCE);
            livingEntity.removeEffect(MobEffects.POISON);
            livingEntity.removeEffect(MobEffects.HEAL);
            livingEntity.removeEffect(MobEffects.DARKNESS);
        }
        else if (entity instanceof LivingEntity livingEntity && compteur == 4) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE,200));
            livingEntity.removeEffect(MobEffects.NIGHT_VISION);
            livingEntity.removeEffect(MobEffects.SATURATION);
            livingEntity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            livingEntity.removeEffect(MobEffects.MOVEMENT_SPEED);
            livingEntity.removeEffect(MobEffects.ABSORPTION);
            livingEntity.removeEffect(MobEffects.JUMP);
            livingEntity.removeEffect(MobEffects.POISON);
            livingEntity.removeEffect(MobEffects.HEAL);
            livingEntity.removeEffect(MobEffects.DARKNESS);
        }
        else if (entity instanceof LivingEntity livingEntity && compteur == 5) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.POISON,200));
            livingEntity.removeEffect(MobEffects.NIGHT_VISION);
            livingEntity.removeEffect(MobEffects.SATURATION);
            livingEntity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            livingEntity.removeEffect(MobEffects.MOVEMENT_SPEED);
            livingEntity.removeEffect(MobEffects.ABSORPTION);
            livingEntity.removeEffect(MobEffects.FIRE_RESISTANCE);
            livingEntity.removeEffect(MobEffects.JUMP);
            livingEntity.removeEffect(MobEffects.HEAL);
            livingEntity.removeEffect(MobEffects.DARKNESS);
        }

        else if (entity instanceof LivingEntity livingEntity && compteur == 6) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.HEAL,200));
            livingEntity.removeEffect(MobEffects.NIGHT_VISION);
            livingEntity.removeEffect(MobEffects.SATURATION);
            livingEntity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            livingEntity.removeEffect(MobEffects.MOVEMENT_SPEED);
            livingEntity.removeEffect(MobEffects.ABSORPTION);
            livingEntity.removeEffect(MobEffects.FIRE_RESISTANCE);
            livingEntity.removeEffect(MobEffects.POISON);
            livingEntity.removeEffect(MobEffects.JUMP);
            livingEntity.removeEffect(MobEffects.DARKNESS);

        }

        else if (entity instanceof LivingEntity livingEntity && compteur == 7) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.DARKNESS,200));
            livingEntity.removeEffect(MobEffects.NIGHT_VISION);
            livingEntity.removeEffect(MobEffects.SATURATION);
            livingEntity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            livingEntity.removeEffect(MobEffects.MOVEMENT_SPEED);
            livingEntity.removeEffect(MobEffects.ABSORPTION);
            livingEntity.removeEffect(MobEffects.FIRE_RESISTANCE);
            livingEntity.removeEffect(MobEffects.POISON);
            livingEntity.removeEffect(MobEffects.HEAL);
            livingEntity.removeEffect(MobEffects.JUMP);
        }
        else if (entity instanceof LivingEntity livingEntity && compteur == 8) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.SATURATION,200));
            livingEntity.removeEffect(MobEffects.NIGHT_VISION);
            livingEntity.removeEffect(MobEffects.JUMP);
            livingEntity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            livingEntity.removeEffect(MobEffects.MOVEMENT_SPEED);
            livingEntity.removeEffect(MobEffects.ABSORPTION);
            livingEntity.removeEffect(MobEffects.FIRE_RESISTANCE);
            livingEntity.removeEffect(MobEffects.POISON);
            livingEntity.removeEffect(MobEffects.HEAL);
            livingEntity.removeEffect(MobEffects.DARKNESS);
        }
        else if (entity instanceof LivingEntity livingEntity && compteur == 9) {
            livingEntity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION,200));
            livingEntity.removeEffect(MobEffects.JUMP);
            livingEntity.removeEffect(MobEffects.SATURATION);
            livingEntity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
            livingEntity.removeEffect(MobEffects.MOVEMENT_SPEED);
            livingEntity.removeEffect(MobEffects.ABSORPTION);
            livingEntity.removeEffect(MobEffects.FIRE_RESISTANCE);
            livingEntity.removeEffect(MobEffects.POISON);
            livingEntity.removeEffect(MobEffects.HEAL);
            livingEntity.removeEffect(MobEffects.DARKNESS);
        }
        else{
            compteur=0;
        }







        super.stepOn(level, blockPos, blockState, entity);
    }
}
