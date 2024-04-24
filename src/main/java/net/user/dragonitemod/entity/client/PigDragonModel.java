package net.user.dragonitemod.entity.client;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.user.dragonitemod.entity.animations.ModAnimationDefinitions;
import net.user.dragonitemod.entity.custom.PigDragon;

public class PigDragonModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "pigdragonmodel"), "main");
	private final ModelPart pigdragon;
	private final ModelPart leftwing;
	private final ModelPart rightwing;
	private final ModelPart head;

	public PigDragonModel(ModelPart root) {
		this.pigdragon = root.getChild("pigdragon");
		this.leftwing = root.getChild("leftwing");
		this.rightwing = root.getChild("rightwing");
		this.head = pigdragon.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition pigdragon = partdefinition.addOrReplaceChild("pigdragon", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = pigdragon.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(0, 60).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 60).addBox(-1.0F, -3.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 60).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 60).addBox(-1.0F, 3.0F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition head = pigdragon.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 24).addBox(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(28, 0).addBox(-2.0F, 0.0F, -9.0F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(2.0F, -6.0F, -7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 60).addBox(-4.0F, -6.0F, -7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.0F, -6.0F));

		PartDefinition leg1 = pigdragon.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(32, 20).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -6.0F, 7.0F));

		PartDefinition leg2 = pigdragon.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(32, 20).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -6.0F, 7.0F));

		PartDefinition leg3 = pigdragon.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(32, 20).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, -6.0F, -5.0F));

		PartDefinition leg4 = pigdragon.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(32, 20).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, -6.0F, -5.0F));

		PartDefinition leftwing = partdefinition.addOrReplaceChild("leftwing", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leftwing_r1 = leftwing.addOrReplaceChild("leftwing_r1", CubeListBuilder.create().texOffs(36, 57).addBox(5.0F, -7.0F, -2.0F, 12.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition rightwing = partdefinition.addOrReplaceChild("rightwing", CubeListBuilder.create(), PartPose.offset(0.0F, 25.0F, 0.0F));

		PartDefinition rightwing_r1 = rightwing.addOrReplaceChild("rightwing_r1", CubeListBuilder.create().texOffs(36, 57).addBox(-17.0F, -7.0F, -1.0F, 12.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -13.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.animation, limbSwing, limbSwingAmount, 2f, 2.5f);

		// Apply wing animations for the idle state
		this.animate(((PigDragon) entity).idleAnimationState, ModAnimationDefinitions.idle, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0f, 30.0f);
		pHeadPitch = Mth.clamp(pHeadPitch, -30.0f, 30.0f);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180f);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180f);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		pigdragon.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightwing.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return pigdragon;
	}
}