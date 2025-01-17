/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createstructures.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.mcreator.createstructures.item.SandFragmentItem;
import net.mcreator.createstructures.item.IceFragmentItem;
import net.mcreator.createstructures.item.GrassFragmentItem;
import net.mcreator.createstructures.item.EchoesoftheUnderworldItem;
import net.mcreator.createstructures.item.EarthFragmentItem;
import net.mcreator.createstructures.CreateLtabMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class CreateLtabModItems {
	public static Item ECHOESOFTHE_UNDERWORLD;
	public static Item DUNGEON_CORE;
	public static Item SAND_FRAGMENT;
	public static Item EARTH_FRAGMENT;
	public static Item ICE_FRAGMENT;
	public static Item GRASS_FRAGMENT;
	public static Item LONELY_KNIGHT_SPAWN_EGG;
	public static Item WATER_WHEEL_SPAWNER;
	public static Item LARGE_WATER_WHEEL_SPAWNER;
	public static Item SPIKE_TRAP;

	public static void load() {
		ECHOESOFTHE_UNDERWORLD = register("echoesofthe_underworld", new EchoesoftheUnderworldItem());
		DUNGEON_CORE = register("dungeon_core", new BlockItem(CreateLtabModBlocks.DUNGEON_CORE, new Item.Properties()));
		SAND_FRAGMENT = register("sand_fragment", new SandFragmentItem());
		EARTH_FRAGMENT = register("earth_fragment", new EarthFragmentItem());
		ICE_FRAGMENT = register("ice_fragment", new IceFragmentItem());
		GRASS_FRAGMENT = register("grass_fragment", new GrassFragmentItem());
		LONELY_KNIGHT_SPAWN_EGG = register("lonely_knight_spawn_egg", new SpawnEggItem(CreateLtabModEntities.LONELY_KNIGHT, -1, -1, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(content -> content.accept(LONELY_KNIGHT_SPAWN_EGG));
		WATER_WHEEL_SPAWNER = register("water_wheel_spawner", new BlockItem(CreateLtabModBlocks.WATER_WHEEL_SPAWNER, new Item.Properties()));
		LARGE_WATER_WHEEL_SPAWNER = register("large_water_wheel_spawner", new BlockItem(CreateLtabModBlocks.LARGE_WATER_WHEEL_SPAWNER, new Item.Properties()));
		SPIKE_TRAP = register("spike_trap", new BlockItem(CreateLtabModBlocks.SPIKE_TRAP, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT).register(content -> content.accept(SPIKE_TRAP));
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(CreateLtabMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
