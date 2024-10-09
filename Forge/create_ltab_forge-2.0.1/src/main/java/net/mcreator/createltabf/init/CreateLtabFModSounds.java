
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createltabf.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.createltabf.CreateLtabFMod;

public class CreateLtabFModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, CreateLtabFMod.MODID);
	public static final RegistryObject<SoundEvent> ECHOES_OF_THE_UNDERWORLD = REGISTRY.register("echoes_of_the_underworld", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("create_ltab_f", "echoes_of_the_underworld")));
}
