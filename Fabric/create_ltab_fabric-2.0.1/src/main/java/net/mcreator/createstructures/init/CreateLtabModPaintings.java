
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createstructures.init;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.createstructures.CreateLtabMod;

public class CreateLtabModPaintings {
	public static void load() {
		Registry.register(BuiltInRegistries.PAINTING_VARIANT, new ResourceLocation(CreateLtabMod.MODID, "the_void"), new PaintingVariant(64, 48));
	}
}
