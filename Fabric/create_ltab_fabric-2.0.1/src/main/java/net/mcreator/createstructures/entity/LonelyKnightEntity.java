package net.mcreator.createstructures.entity;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.ModificationPhase;
import net.mcreator.createstructures.CreateLtabMod;
import net.mcreator.createstructures.entity.ai.Lonely_KnightAttackGoal;
import net.mcreator.createstructures.init.CreateLtabModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.block.state.BlockState;

public class LonelyKnightEntity extends Monster {
	private static final EntityDataAccessor<Boolean> ATTACKING =
			SynchedEntityData.defineId(LonelyKnightEntity.class, EntityDataSerializers.BOOLEAN);


	public final AnimationState idleAnimationState = new AnimationState();
	private int idleAnimationTimeout = 0;

	public final AnimationState attackAnimationState = new AnimationState();
	public int attackAnimationTimeout = 0;



	@Override
	public void tick() {
		super.tick();

		if(this.level().isClientSide()) {
			setupAnimationStates();
		}
	}

	private void setupAnimationStates() {
		if(this.idleAnimationTimeout <= 0) {
			this.idleAnimationTimeout = 80;
			this.idleAnimationState.start(this.tickCount);
		} else {
			--this.idleAnimationTimeout;
		}

		if(this.isAttacking() && attackAnimationTimeout <= 0) {
			attackAnimationTimeout = 60; // Length in ticks of your animation
			attackAnimationState.start(this.tickCount);
		} else {
			--this.attackAnimationTimeout;
		}

		if(!this.isAttacking()) {
			attackAnimationState.stop();
		}
	}

	@Override
	protected void updateWalkAnimation(float pPartialTick) {
			float f = this.getPose() == Pose.STANDING && !this.attackAnimationState.isStarted() ? Math.min(pPartialTick * 5.0f, 1.0f) : 0.0f;
			this.walkAnimation.update(f, 0.2f);
	}


	public void setAttacking(boolean attacking) {
		this.entityData.set(ATTACKING, attacking);
	}

	public boolean isAttacking() {
		return this.entityData.get(ATTACKING);

	}

	@Override
	protected void defineSynchedData() {
		super.defineSynchedData();
		this.entityData.define(ATTACKING, false);
	}


	public LonelyKnightEntity(EntityType<LonelyKnightEntity> type, Level world) {
		super(type, world);
		setMaxUpStep(0.6f);
		xpReward = 0;
		setNoAi(false);
	}


	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(0, new FloatGoal(this));
		this.goalSelector.addGoal(1, new Lonely_KnightAttackGoal(this, 1.2D, true));
		this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(2, new WaterAvoidingRandomStrollGoal(this, 0.8));
		this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, (float) 12));
		this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Animal.class, (float) 6));
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
	}


	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}


	@Override
	public SoundEvent getAmbientSound() {
		return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.player.breath"));
	}

	@Override
	public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("block.anvil.step")), 0.15f, 1);
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("entity.generic.death"));
	}



	public static void init() {
		BiomeModifications.create(new ResourceLocation(CreateLtabMod.MODID, "lonelyknight_entity_spawn")).add(ModificationPhase.ADDITIONS, BiomeSelectors.all(),
				ctx -> ctx.getSpawnSettings().addSpawn(MobCategory.MONSTER, new MobSpawnSettings.SpawnerData(CreateLtabModEntities.LONELY_KNIGHT, 0, 0, 0)));
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2D);
		builder = builder.add(Attributes.MAX_HEALTH, 50);
		builder = builder.add(Attributes.ARMOR, 10);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 18);
		builder = builder.add(Attributes.ATTACK_KNOCKBACK, 3);
		builder = builder.add(Attributes.KNOCKBACK_RESISTANCE,2);
		return builder;
	}
}
