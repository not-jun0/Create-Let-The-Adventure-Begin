
package net.mcreator.createstructures.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.network.chat.Component;

import net.mcreator.createstructures.init.CreateLtabModSounds;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import java.util.List;

public class EchoesoftheUnderworldItem extends RecordItem {
	public EchoesoftheUnderworldItem() {
		super(12, CreateLtabModSounds.ECHOES_OF_THE_UNDERWORLD, new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 1200);
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(content -> content.accept(this));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}
}
