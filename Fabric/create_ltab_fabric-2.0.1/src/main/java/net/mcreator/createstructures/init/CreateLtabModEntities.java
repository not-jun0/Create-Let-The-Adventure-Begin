
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createstructures.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.createstructures.entity.LonelyKnightEntity;
import net.mcreator.createstructures.CreateLtabMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class CreateLtabModEntities {
	public static EntityType<LonelyKnightEntity> LONELY_KNIGHT;

	public static void load() {
		LONELY_KNIGHT = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(CreateLtabMod.MODID, "lonely_knight"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, LonelyKnightEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).trackRangeBlocks(64).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		LonelyKnightEntity.init();
		FabricDefaultAttributeRegistry.register(LONELY_KNIGHT, LonelyKnightEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
