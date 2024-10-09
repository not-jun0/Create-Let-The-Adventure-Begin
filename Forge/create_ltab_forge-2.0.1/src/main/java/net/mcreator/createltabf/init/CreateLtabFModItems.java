
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createltabf.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.createltabf.item.SandFragmentItem;
import net.mcreator.createltabf.item.IceFragmentItem;
import net.mcreator.createltabf.item.GrassFragmentItem;
import net.mcreator.createltabf.item.EchoesOfTheUnderworldItem;
import net.mcreator.createltabf.item.EarthFragmentItem;
import net.mcreator.createltabf.CreateLtabFMod;

public class CreateLtabFModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreateLtabFMod.MODID);
	public static final RegistryObject<Item> ECHOES_OF_THE_UNDERWORLD = REGISTRY.register("echoes_of_the_underworld", () -> new EchoesOfTheUnderworldItem());
	public static final RegistryObject<Item> DUNGEON_CORE = block(CreateLtabFModBlocks.DUNGEON_CORE);
	public static final RegistryObject<Item> SAND_FRAGMENT = REGISTRY.register("sand_fragment", () -> new SandFragmentItem());
	public static final RegistryObject<Item> EARTH_FRAGMENT = REGISTRY.register("earth_fragment", () -> new EarthFragmentItem());
	public static final RegistryObject<Item> ICE_FRAGMENT = REGISTRY.register("ice_fragment", () -> new IceFragmentItem());
	public static final RegistryObject<Item> GRASS_FRAGMENT = REGISTRY.register("grass_fragment", () -> new GrassFragmentItem());
	public static final RegistryObject<Item> LONELY_KNIGHT_SPAWN_EGG = REGISTRY.register("lonely_knight_spawn_egg", () -> new ForgeSpawnEggItem(CreateLtabFModEntities.LONELY_KNIGHT, -1, -1, new Item.Properties()));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
