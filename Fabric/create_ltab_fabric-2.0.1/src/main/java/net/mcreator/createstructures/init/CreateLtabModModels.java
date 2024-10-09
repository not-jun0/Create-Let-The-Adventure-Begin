
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createstructures.init;

import net.mcreator.createstructures.client.model.ModelLonely_Knight;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class CreateLtabModModels {
	public static void load() {
		EntityModelLayerRegistry.registerModelLayer(ModelLonely_Knight.LAYER_LOCATION, ModelLonely_Knight::createBodyLayer);
	}
}
