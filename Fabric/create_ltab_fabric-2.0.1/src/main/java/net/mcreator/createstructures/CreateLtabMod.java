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

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.createstructures.init.CreateLtabModSounds;
import net.mcreator.createstructures.init.CreateLtabModProcedures;
import net.mcreator.createstructures.init.CreateLtabModPaintings;
import net.mcreator.createstructures.init.CreateLtabModItems;
import net.mcreator.createstructures.init.CreateLtabModEntities;
import net.mcreator.createstructures.init.CreateLtabModBlocks;

import net.fabricmc.api.ModInitializer;

public class CreateLtabMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "create_ltab";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing CreateLtabMod");

		CreateLtabModEntities.load();
		CreateLtabModBlocks.load();
		CreateLtabModItems.load();

		CreateLtabModPaintings.load();
		CreateLtabModProcedures.load();

		CreateLtabModSounds.load();

	}
}
