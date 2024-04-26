package net.user.dragonitemod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.user.dragonitemod.DragoniteMod;
import net.user.dragonitemod.entity.custom.ZombieDragon;

public class ZombieRenderer extends MobRenderer<ZombieDragon, DragonZombieModel<ZombieDragon>> {
    public ZombieRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new DragonZombieModel<>(pContext.bakeLayer(ModModelLayers.ZOMBIEDRAGON_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(ZombieDragon pEntity) {
        return new ResourceLocation(DragoniteMod.MOD_ID, "textures/entity/zombiedragon.png");
    }

    @Override
    public void render(ZombieDragon pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
