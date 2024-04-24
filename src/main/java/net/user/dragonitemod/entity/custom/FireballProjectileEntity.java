package net.user.dragonitemod.entity.custom;

import net.user.dragonitemod.block.ModBlocks;
import net.user.dragonitemod.block.custom.CorruptedBlock;
import net.user.dragonitemod.entity.ModEntities;
import net.user.dragonitemod.item.ModItems;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

public class FireballProjectileEntity extends ThrowableItemProjectile {
    public FireballProjectileEntity(EntityType<? extends ThrowableItemProjectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public FireballProjectileEntity(Level pLevel) {
        super(ModEntities.FIREBALL_PROJECTILE.get(), pLevel);
    }

    public FireballProjectileEntity(Level pLevel, LivingEntity livingEntity) {
        super(ModEntities.FIREBALL_PROJECTILE.get(), livingEntity, pLevel);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.FIREBALL.get();
    }

    @Override
    protected void onHitBlock(BlockHitResult pResult) {
        if(!this.level().isClientSide()) {
            this.level().broadcastEntityEvent(this, ((byte) 3));
            this.level().setBlock(blockPosition(), ((CorruptedBlock) ModBlocks.CORRUPTED_BLOCK.get()).getRandomBlockState(), 3);
        }

        this.discard();
        super.onHitBlock(pResult);
    }
}
