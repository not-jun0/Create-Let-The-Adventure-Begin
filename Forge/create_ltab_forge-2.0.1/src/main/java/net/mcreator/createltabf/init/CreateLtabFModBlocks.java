
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createltabf.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.createltabf.block.DungeonCoreBlock;
import net.mcreator.createltabf.CreateLtabFMod;

public class CreateLtabFModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateLtabFMod.MODID);
	public static final RegistryObject<Block> DUNGEON_CORE = REGISTRY.register("dungeon_core", () -> new DungeonCoreBlock());
}
