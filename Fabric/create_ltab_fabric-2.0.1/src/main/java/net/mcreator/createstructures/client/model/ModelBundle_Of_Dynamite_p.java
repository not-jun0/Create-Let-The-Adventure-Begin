package net.mcreator.createstructures.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelBundle_Of_Dynamite_p<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("create_ltab", "model_bundle_of_dynamite_p"), "main");
	public final ModelPart bb_main;

	public ModelBundle_Of_Dynamite_p(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(8, 5).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 5).addBox(-2.0F, -9.0F, -3.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 5)
						.addBox(-3.0F, -9.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 5).addBox(0.0F, -9.0F, -3.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(1, -1).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(1, -1).addBox(0.0F, 0.0F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -12.45F, -1.85F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, -1).addBox(0.4457F, -1.6648F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.325F, -1.2F, 0.663F, -0.0617F, -0.9145F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, -1).addBox(0.4436F, -0.3338F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.325F, -1.2F, 0.2227F, -0.6325F, 0.2117F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, -1).addBox(0.4457F, -1.6648F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, -10.325F, -2.4F, -0.2928F, 0.1966F, -1.0354F));
		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(1, -1).addBox(0.4436F, -0.3338F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.4F, -10.325F, -2.4F, 0.0766F, 0.343F, 0.1851F));
		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(1, -1).addBox(0.4436F, -0.3338F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1F, -10.325F, -2.9F, 1.2877F, 1.3888F, 1.2786F));
		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(1, -1).addBox(0.4457F, -1.6648F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.1F, -10.325F, -2.9F, -1.5108F, 0.5668F, -1.5521F));
		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(2, -1).addBox(0.4436F, -0.3338F, -0.5F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8F, -10.825F, -2.8F, -2.7932F, 1.0213F, -2.6051F));
		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(1, -1).addBox(0.4457F, -1.6648F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.8F, -10.825F, -2.8F, -2.0914F, 0.1624F, -1.5293F));
		PartDefinition cube_r10 = bb_main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(1, -1).addBox(0.4457F, -1.6648F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1F, -10.625F, -1.7F, 2.8914F, -0.0779F, -1.8664F));
		PartDefinition cube_r11 = bb_main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(1, -1).addBox(0.4436F, -0.3338F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.1F, -10.625F, -1.7F, 3.1182F, -0.2608F, -3.0513F));
		PartDefinition cube_r12 = bb_main.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(1, -1).addBox(0.4436F, -0.3338F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -10.625F, -0.6F, 2.9391F, -1.1605F, -2.9213F));
		PartDefinition cube_r13 = bb_main.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(1, -1).addBox(0.4457F, -1.6648F, -0.5F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, -10.625F, -0.6F, 1.9895F, -0.2805F, -1.6934F));
		PartDefinition cube_r14 = bb_main.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(8, 5).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5F, -4.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r15 = bb_main.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(8, 5).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -4.5F, -4.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r16 = bb_main.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(8, 5).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -4.5F, -2.0F, 0.0F, 1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
