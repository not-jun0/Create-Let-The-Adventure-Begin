
package net.mcreator.createltabf.entity;

import net.mcreator.createltabf.entity.ai.Lonely_KnightAttackGoal;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.*;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;
import net.minecraft.core.BlockPos;

import net.mcreator.createltabf.init.CreateLtabFModEntities;

public class LonelyKnightEntity extends PathfinderMob {
	private static final EntityDataAccessor<Boolean> ATTACKING =
			SynchedEntityData.defineId(LonelyKnightEntity.class, EntityDataSerializers.BOOLEAN);


	public final AnimationState idleAnimationState = new AnimationState();
	private int idleAnimationTimeout = 0;

	public final AnimationState attackAnimationState = new AnimationState();
	public int attackAnimationTimeout = 0;

	public LonelyKnightEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(CreateLtabFModEntities.LONELY_KNIGHT.get(), world);
	}

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
		setPersistenceRequired();
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
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
