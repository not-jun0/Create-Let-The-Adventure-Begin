
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createltabf.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.createltabf.client.model.ModelLonely_Knight;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CreateLtabFModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelLonely_Knight.LAYER_LOCATION, ModelLonely_Knight::createBodyLayer);
	}
}
