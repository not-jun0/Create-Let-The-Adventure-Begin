
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createstructures.init;

import net.mcreator.createstructures.client.renderer.LonelyKnightRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class CreateLtabModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(CreateLtabModEntities.LONELY_KNIGHT, LonelyKnightRenderer::new);
	}
}
