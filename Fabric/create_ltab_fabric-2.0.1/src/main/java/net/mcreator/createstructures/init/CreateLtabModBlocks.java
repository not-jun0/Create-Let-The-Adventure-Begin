
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createstructures.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.createstructures.block.DungeonCoreBlock;
import net.mcreator.createstructures.CreateLtabMod;

public class CreateLtabModBlocks {
	public static Block DUNGEON_CORE;

	public static void load() {
		DUNGEON_CORE = register("dungeon_core", new DungeonCoreBlock());
	}

	public static void clientLoad() {
		DungeonCoreBlock.clientInit();
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(CreateLtabMod.MODID, registryName), block);
	}
}
