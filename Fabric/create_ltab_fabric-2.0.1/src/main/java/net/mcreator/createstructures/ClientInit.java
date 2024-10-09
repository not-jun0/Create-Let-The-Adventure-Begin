/*
*	MCreator note:
*
*	If you lock base mod element files, you can edit this file and the proxy files
*	and they won't get overwritten. If you change your mod package or modid, you
*	need to apply these changes to this file MANUALLY.
*
*
*	If you do not lock base mod element files in Workspace settings, this file
*	will be REGENERATED on each build.
*
*/
package net.mcreator.createstructures;

import net.mcreator.createstructures.init.CreateLtabModModels;
import net.mcreator.createstructures.init.CreateLtabModEntityRenderers;
import net.mcreator.createstructures.init.CreateLtabModBlocks;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ClientModInitializer;

@Environment(EnvType.CLIENT)
public class ClientInit implements ClientModInitializer {
	@Override
	public void onInitializeClient() {

		CreateLtabModBlocks.clientLoad();

		CreateLtabModModels.load();
		CreateLtabModEntityRenderers.load();
	}
}
