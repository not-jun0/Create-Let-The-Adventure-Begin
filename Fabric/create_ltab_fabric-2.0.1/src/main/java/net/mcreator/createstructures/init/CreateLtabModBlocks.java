
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createstructures.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.createstructures.block.WaterWheelSpawnerBlock;
import net.mcreator.createstructures.block.SpikeTrapBlock;
import net.mcreator.createstructures.block.LargeWaterWheelSpawnerBlock;
import net.mcreator.createstructures.block.DungeonCoreBlock;
import net.mcreator.createstructures.CreateLtabMod;

public class CreateLtabModBlocks {
	public static Block DUNGEON_CORE;
	public static Block WATER_WHEEL_SPAWNER;
	public static Block LARGE_WATER_WHEEL_SPAWNER;
	public static Block SPIKE_TRAP;

	public static void load() {
		DUNGEON_CORE = register("dungeon_core", new DungeonCoreBlock());
		WATER_WHEEL_SPAWNER = register("water_wheel_spawner", new WaterWheelSpawnerBlock());
		LARGE_WATER_WHEEL_SPAWNER = register("large_water_wheel_spawner", new LargeWaterWheelSpawnerBlock());
		SPIKE_TRAP = register("spike_trap", new SpikeTrapBlock());
	}

	public static void clientLoad() {
		DungeonCoreBlock.clientInit();
		WaterWheelSpawnerBlock.clientInit();
		LargeWaterWheelSpawnerBlock.clientInit();
		SpikeTrapBlock.clientInit();
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(CreateLtabMod.MODID, registryName), block);
	}
}
