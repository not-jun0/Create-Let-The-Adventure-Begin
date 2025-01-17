
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createstructures.init;

import net.mcreator.createstructures.procedures.WaterWheelSpawnerProProcedure;
import net.mcreator.createstructures.procedures.SpikeTrapEntityWalksOnTheBlockProcedure;
import net.mcreator.createstructures.procedures.LargeWaterWheelSpawnerProProcedure;
import net.mcreator.createstructures.procedures.DungeonCoreUpdateTickProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class CreateLtabModProcedures {
	public static void load() {
		new DungeonCoreUpdateTickProcedure();
		new WaterWheelSpawnerProProcedure();
		new LargeWaterWheelSpawnerProProcedure();
		new SpikeTrapEntityWalksOnTheBlockProcedure();
	}
}
