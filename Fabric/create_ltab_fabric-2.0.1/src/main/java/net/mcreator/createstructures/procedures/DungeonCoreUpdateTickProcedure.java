package net.mcreator.createstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class DungeonCoreUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(120 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				new Object() {
					private int ticks = 0;

					public void startDelay(LevelAccessor world) {
						ServerTickEvents.END_SERVER_TICK.register((server) -> {
							this.ticks++;
							if (this.ticks == 20) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 2000, 4, true, false));
								return;
							}
						});
					}
				}.startDelay(world);
			}
		}
	}
}
