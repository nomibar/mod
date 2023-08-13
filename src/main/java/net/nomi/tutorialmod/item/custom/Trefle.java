package net.nomi.tutorialmod.item.custom;


import net.minecraft.client.gui.screens.advancements.AdvancementsScreen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.nomi.tutorialmod.block.ModBlocks;
import net.nomi.tutorialmod.item.ModItems;
import org.jetbrains.annotations.NotNull;
import net.minecraft.sounds.SoundSource;


public class Trefle extends Item {
    public Trefle(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        outputRandomNumber(player);
        int nombrerandom=getRandomNumber();
            if (nombrerandom >= 0 && nombrerandom <= 9){
                if (player instanceof ServerPlayer) {
                    ServerPlayer serverPlayer = (ServerPlayer) player;
                    serverPlayer.sendSystemMessage(Component.literal("Tu as gagné !"));
                    ItemStack zircon = new ItemStack(ModItems.ZIRCON.get());
                    BlockPos position = serverPlayer.blockPosition();
                    ItemEntity itemEntity = new ItemEntity(level, position.getX(), position.getY(), position.getZ(), zircon);
                    level.addFreshEntity(itemEntity);
                }player.getCooldowns().addCooldown(this, 1200);
            }
            else if (nombrerandom >= 50 && nombrerandom <= 59){
                if (player instanceof ServerPlayer) {
                    ServerPlayer serverPlayer = (ServerPlayer) player;
                    serverPlayer.sendSystemMessage(Component.literal("Tu as gagné !"));
                    ItemStack zircon = new ItemStack(ModItems.RAW_ZIRCON.get());
                    BlockPos position = serverPlayer.blockPosition();
                    ItemEntity itemEntity = new ItemEntity(level, position.getX(), position.getY(), position.getZ(),zircon);
                    level.addFreshEntity(itemEntity);
                }player.getCooldowns().addCooldown(this, 1200);
            }
            else if (nombrerandom >= 10 && nombrerandom <= 14){
                if (player instanceof ServerPlayer) {
                    ServerPlayer serverPlayer = (ServerPlayer) player;
                    serverPlayer.sendSystemMessage(Component.literal("Tu as gagné !"));
                    ItemStack zircon = new ItemStack(ModItems.ZIRCON_BOOT.get());
                    BlockPos position = serverPlayer.blockPosition();
                    ItemEntity itemEntity = new ItemEntity(level, position.getX(), position.getY(), position.getZ(),zircon);
                    level.addFreshEntity(itemEntity);
                }player.getCooldowns().addCooldown(this, 1200);
            }
            else if (nombrerandom >= 15 && nombrerandom <= 19){
                if (player instanceof ServerPlayer) {
                    ServerPlayer serverPlayer = (ServerPlayer) player;
                    serverPlayer.sendSystemMessage(Component.literal("Tu as gagné !"));
                    ItemStack zircon = new ItemStack(ModItems.ZIRCON_CHESTPLATE.get());
                    BlockPos position = serverPlayer.blockPosition();
                    ItemEntity itemEntity = new ItemEntity(level, position.getX(), position.getY(), position.getZ(),zircon);
                    level.addFreshEntity(itemEntity);
                }player.getCooldowns().addCooldown(this, 1200);
            }
            else if (nombrerandom >= 20 && nombrerandom <= 24){
                if (player instanceof ServerPlayer) {
                    ServerPlayer serverPlayer = (ServerPlayer) player;
                    serverPlayer.sendSystemMessage(Component.literal("Tu as gagné !"));
                    ItemStack zircon = new ItemStack(ModItems.ZIRCON_HELMET.get());
                    BlockPos position = serverPlayer.blockPosition();
                    ItemEntity itemEntity = new ItemEntity(level, position.getX(), position.getY(), position.getZ(),zircon);
                    level.addFreshEntity(itemEntity);
                }player.getCooldowns().addCooldown(this, 1200);
            }
            else if (nombrerandom >= 25 && nombrerandom <= 29){
                if (player instanceof ServerPlayer) {
                    ServerPlayer serverPlayer = (ServerPlayer) player;
                    serverPlayer.sendSystemMessage(Component.literal("Tu as gagné !"));
                    ItemStack zircon = new ItemStack(ModItems.ZIRCON_LEGGING.get());
                    BlockPos position = serverPlayer.blockPosition();
                    ItemEntity itemEntity = new ItemEntity(level, position.getX(), position.getY(), position.getZ(),zircon);
                    level.addFreshEntity(itemEntity);
                }player.getCooldowns().addCooldown(this, 1200);
            }
            else if (nombrerandom == 45){
                if (player instanceof ServerPlayer) {
                    ServerPlayer serverPlayer = (ServerPlayer) player;
                    serverPlayer.sendSystemMessage(Component.literal("Tu as gagné !"));
                    ItemStack zircon = new ItemStack(ModBlocks.ZIRCON_BLOCK.get());
                    BlockPos position = serverPlayer.blockPosition();
                    ItemEntity itemEntity = new ItemEntity(level, position.getX(), position.getY(), position.getZ(),zircon);
                    level.addFreshEntity(itemEntity);
                }player.getCooldowns().addCooldown(this, 1200);
            }

            else{
                if (player instanceof ServerPlayer) {
                    ServerPlayer serverPlayer = (ServerPlayer) player;
                    serverPlayer.sendSystemMessage(Component.literal("Tu as perdu !"));
                    serverPlayer.playSound(SoundEvents.ENDERMAN_DEATH , SoundSource.PLAYERS.ordinal(),1.0F);
                    ItemStack dirt = new ItemStack(Items.DIRT);
                    BlockPos position = serverPlayer.blockPosition();
                    ItemEntity itemEntity = new ItemEntity(level, position.getX(), position.getY(), position.getZ(), dirt);
                    level.addFreshEntity(itemEntity);


                }player.getCooldowns().addCooldown(this, 1);
        }






        return new InteractionResultHolder<>(InteractionResult.SUCCESS, player.getItemInHand(hand));
    }
    private void outputRandomNumber(Player player ){
        player.sendSystemMessage(Component.literal("Ton nombre est " + getRandomNumber()));
    }



    private int getRandomNumber() {

        return RandomSource.createNewThreadLocalInstance().nextInt(100);
    }

}

