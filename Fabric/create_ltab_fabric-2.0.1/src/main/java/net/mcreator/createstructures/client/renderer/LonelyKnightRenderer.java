
package net.mcreator.createstructures.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.createstructures.entity.LonelyKnightEntity;
import net.mcreator.createstructures.client.model.ModelLonely_Knight;

public class LonelyKnightRenderer extends MobRenderer<LonelyKnightEntity, ModelLonely_Knight<LonelyKnightEntity>> {
	public LonelyKnightRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelLonely_Knight(context.bakeLayer(ModelLonely_Knight.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LonelyKnightEntity entity) {
		return new ResourceLocation("create_ltab:textures/entities/lonely_knigt.png");
	}

}
