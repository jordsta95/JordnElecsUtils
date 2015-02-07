package com.jordsta.stuff;

import com.jordsta.stuff.init.itemRegist;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class ultraCoalFuel implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == itemRegist.ultraCoal)
		return 4800;
		return 0;
		
	}
}
