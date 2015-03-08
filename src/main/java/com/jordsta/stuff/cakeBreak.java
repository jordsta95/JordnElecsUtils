package com.jordsta.stuff;

import com.jordsta.stuff.init.itemRegist;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;

public class cakeBreak {
	@SubscribeEvent
	public void onBlockBreak(BlockEvent.BreakEvent event) {
		if(event.block==net.minecraft.init.Blocks.cake) {
			if (event.getPlayer().getCurrentEquippedItem().getItem() == Items.diamond_sword) {
			event.getPlayer().inventory.setInventorySlotContents(event.getPlayer().inventory.currentItem, new ItemStack(itemRegist.cakeSword, 1, -1));}
			}
	}

}
