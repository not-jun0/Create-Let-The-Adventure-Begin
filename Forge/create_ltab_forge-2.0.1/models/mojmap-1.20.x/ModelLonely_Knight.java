
public class ModelLonely_Knight<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("create_ltab", "model_lonely_knight"), "main");
	public final ModelPart Knight;
	public final ModelPart body;
	public final ModelPart rightarm;
	public final ModelPart rightlowerarm;
	public final ModelPart leftarm;
	public final ModelPart leftlowerarm;
	public final ModelPart rightleg;
	public final ModelPart lowerrightleg;
	public final ModelPart leftleg;
	public final ModelPart lowerleftleg;
	public final ModelPart sword;
	public final ModelPart head;

	public ModelLonely_Knight(ModelPart root) {
		this.Knight = root.getChild("Knight");
		this.body = root.getChild("Knight").getChild("body");
		this.rightarm = root.getChild("Knight").getChild("rightarm");
		this.rightlowerarm = root.getChild("Knight").getChild("rightarm").getChild("rightlowerarm");
		this.leftarm = root.getChild("Knight").getChild("leftarm");
		this.leftlowerarm = root.getChild("Knight").getChild("leftarm").getChild("leftlowerarm");
		this.rightleg = root.getChild("Knight").getChild("rightleg");
		this.lowerrightleg = root.getChild("Knight").getChild("rightleg").getChild("lowerrightleg");
		this.leftleg = root.getChild("Knight").getChild("leftleg");
		this.lowerleftleg = root.getChild("Knight").getChild("leftleg").getChild("lowerleftleg");
		this.sword = root.getChild("Knight").getChild("rightarm").getChild("rightlowerarm").getChild("sword");
		this.head = root.getChild("Knight").getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Knight = partdefinition.addOrReplaceChild("Knight", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.1631F, 0.0F));
		PartDefinition body = Knight.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-3.9889F, -7.5F, -1.9111F, 8.0F, 13.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(54, 0)
						.addBox(-1.4889F, 3.5F, -2.4111F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(25, 54)
						.addBox(-4.4889F, 3.5F, -2.4111F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(11, 54)
						.addBox(2.5111F, 3.5F, -2.4111F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-4.4889F, 2.1F, -2.4111F, 9.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(0.5611F, -6.9F, -2.1111F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 18)
						.addBox(0.5611F, -2.9F, -2.1111F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(51, 54)
						.addBox(-3.5889F, -2.9F, -2.1111F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 46)
						.addBox(-4.5889F, -6.9F, -2.1111F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.0111F, -17.6187F, -0.0889F));
		PartDefinition rightarm = Knight.addOrReplaceChild("rightarm", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-4.5F, -22.6187F, -0.25F, 1.2122F, -0.5435F, -1.2511F));
		PartDefinition armor_r1 = rightarm.addOrReplaceChild("armor_r1",
				CubeListBuilder.create().texOffs(60, 26).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 6.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2F, -0.2F, 0.2F, 0.0F, 1.5708F, -1.5708F));
		PartDefinition armor_r2 = rightarm.addOrReplaceChild("armor_r2",
				CubeListBuilder.create().texOffs(12, 57).addBox(-2.0F, -3.0F, -2.0F, 0.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.2F, -0.2F, 0.2F, 0.0F, 1.5708F, -1.5708F));
		PartDefinition upperarm_r1 = rightarm.addOrReplaceChild("upperarm_r1",
				CubeListBuilder.create().texOffs(0, 41).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 1.5708F, -1.5708F));
		PartDefinition rightlowerarm = rightarm.addOrReplaceChild("rightlowerarm", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-6.0F, 0.0F, 0.0F, -0.165F, -0.2326F, 0.2071F));
		PartDefinition lowerarm_r1 = rightlowerarm.addOrReplaceChild("lowerarm_r1",
				CubeListBuilder.create().texOffs(44, 12).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 1.5708F));
		PartDefinition sword = rightlowerarm.addOrReplaceChild("sword",
				CubeListBuilder.create().texOffs(30, 21)
						.addBox(-1.0F, 2.2857F, -0.5F, 2.0F, 16.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 30)
						.addBox(-1.0F, 18.2857F, 0.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(36, 39)
						.addBox(-3.0F, 1.2857F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(39, 57)
						.addBox(-1.0F, -2.7143F, -0.5F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 39)
						.addBox(-1.5F, -3.7143F, -1.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -0.6671F, -0.25F, 0.0337F, 0.1015F, -3.2338F));
		PartDefinition leftarm = Knight.addOrReplaceChild("leftarm", CubeListBuilder.create(),
				PartPose.offsetAndRotation(4.5F, -24.3687F, 0.0F, 1.4162F, 0.0376F, 1.1865F));
		PartDefinition armor_r3 = leftarm.addOrReplaceChild("armor_r3",
				CubeListBuilder.create().texOffs(56, 12).addBox(-2.0F, 3.0F, -1.9241F, 4.0F, 1.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.35F, -1.0F, 0.05F, 0.0F, -1.5708F, -1.5708F));
		PartDefinition armor_r4 = leftarm.addOrReplaceChild("armor_r4",
				CubeListBuilder.create().texOffs(53, 32).addBox(-2.0F, 0.0F, -1.9241F, 4.0F, 4.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.35F, -1.0F, 0.05F, 0.0F, -1.5708F, -1.5708F));
		PartDefinition upperarm_r2 = leftarm.addOrReplaceChild("upperarm_r2",
				CubeListBuilder.create().texOffs(18, 34).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1F, 0.0F, -0.45F, 0.0F, -1.5708F, -1.5708F));
		PartDefinition leftlowerarm = leftarm.addOrReplaceChild("leftlowerarm", CubeListBuilder.create(),
				PartPose.offsetAndRotation(6.1F, 0.0F, -0.5F, 6.2907F, 0.372F, 6.2528F));
		PartDefinition lowerarm_r2 = leftlowerarm.addOrReplaceChild("lowerarm_r2",
				CubeListBuilder.create().texOffs(34, 34).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, -1.5708F, -1.5708F));
		PartDefinition rightleg = Knight.addOrReplaceChild("rightleg",
				CubeListBuilder.create().texOffs(44, 22)
						.addBox(-1.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(39, 54)
						.addBox(-1.6F, -0.1F, -2.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(53, 59)
						.addBox(-2.0F, 0.0F, -2.9F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -12.0F, 0.0F, -0.2091F, 0.0823F, 0.0413F));
		PartDefinition lowerrightleg = rightleg.addOrReplaceChild("lowerrightleg",
				CubeListBuilder.create().texOffs(32, 6).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.2145F, -0.0872F, -0.0038F));
		PartDefinition leftleg = Knight.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(16, 44).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, 0.0867F, -0.0475F, -0.031F));
		PartDefinition lowerleftleg = leftleg.addOrReplaceChild("lowerleftleg",
				CubeListBuilder.create().texOffs(32, 44)
						.addBox(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 16)
						.addBox(-2.5F, 4.25F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, 0.253F, -0.0468F, 0.0324F));
		PartDefinition head = Knight.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, -3.5639F, -2.8546F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(56, 23)
						.addBox(-3.0F, 2.4361F, -3.1046F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 9)
						.addBox(-4.0F, 0.9361F, -3.3546F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 40)
						.addBox(-4.0F, -2.0639F, -3.4046F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 33)
						.addBox(-1.0F, -4.0639F, -1.9046F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(24, 6)
						.addBox(-2.0F, -3.0639F, -3.2046F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 59)
						.addBox(-4.25F, 0.9361F, -3.1046F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(45, 0)
						.addBox(-4.25F, -2.0639F, -2.9546F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(20, 61)
						.addBox(-4.5F, -1.5639F, 1.8954F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-4.75F, -0.5639F, 2.8954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
						.addBox(3.25F, 0.9361F, -3.1046F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(44, 37)
						.addBox(3.25F, -2.0639F, -2.9546F, 1.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(60, 43)
						.addBox(3.5F, -1.5639F, 1.8954F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
						.addBox(3.75F, -0.5639F, 2.8954F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -29.5547F, -1.3954F, 0.1331F, 0.0F, 0.0F));
		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 33).addBox(1.0F, -3.0F, -1.0F, 1.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.5F, 2.7361F, -2.4046F, 0.1047F, 0.0F, 0.0F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, 0.0F, 2.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -1.6139F, -2.4546F, 0.4363F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);
		this.animateWalk(Lonely_Knight_Animations.WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((LonelyKnightEntity) entity).idleAnimationState, Lonely_Knight_Animations.IDLE, ageInTicks, 1f);
		this.animate(((LonelyKnightEntity) entity).attackAnimationState, Lonely_Knight_Animations.ATTACK, ageInTicks,
				1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0f, 30.0f);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0f, 45.0f);
		this.head.yRot = pNetHeadYaw * ((float) Math.PI / 180);
		this.head.xRot = pHeadPitch * ((float) Math.PI / 180);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Knight.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return Knight;
	}
}
