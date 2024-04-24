package net.user.dragonitemod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.user.dragonitemod.DragoniteMod;
import net.user.dragonitemod.entity.custom.PigDragon;

public class PigRenderer extends MobRenderer<PigDragon, PigDragonModel<PigDragon>> {
    public PigRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new PigDragonModel<>(pContext.bakeLayer(ModModelLayers.PIGDRAGON_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(PigDragon pEntity) {
        return new ResourceLocation(DragoniteMod.MOD_ID, "textures/entity/pigdragon.png");
    }

    @Override
    public void render(PigDragon pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
