
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createstructures.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class CreateLtabModSounds {
	public static SoundEvent ECHOES_OF_THE_UNDERWORLD = SoundEvent.createVariableRangeEvent(new ResourceLocation("create_ltab", "echoes_of_the_underworld"));
	public static SoundEvent KOINODISCOQUEEN = SoundEvent.createVariableRangeEvent(new ResourceLocation("create_ltab", "koinodiscoqueen"));

	public static void load() {
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("create_ltab", "echoes_of_the_underworld"), ECHOES_OF_THE_UNDERWORLD);
		Registry.register(BuiltInRegistries.SOUND_EVENT, new ResourceLocation("create_ltab", "koinodiscoqueen"), KOINODISCOQUEEN);
	}
}
