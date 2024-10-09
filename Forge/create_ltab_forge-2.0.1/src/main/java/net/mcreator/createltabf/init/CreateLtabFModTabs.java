
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createltabf.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.createltabf.CreateLtabFMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CreateLtabFModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateLtabFMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(CreateLtabFModItems.LONELY_KNIGHT_SPAWN_EGG.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CreateLtabFModItems.ECHOES_OF_THE_UNDERWORLD.get());
			tabData.accept(CreateLtabFModItems.SAND_FRAGMENT.get());
			tabData.accept(CreateLtabFModItems.EARTH_FRAGMENT.get());
			tabData.accept(CreateLtabFModItems.ICE_FRAGMENT.get());
			tabData.accept(CreateLtabFModItems.GRASS_FRAGMENT.get());
		}
	}
}
