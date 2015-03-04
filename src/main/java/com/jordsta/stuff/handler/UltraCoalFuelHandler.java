package com.jordsta.stuff.handler;

import com.jordsta.stuff.init.itemRegist;
import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

public class UltraCoalFuelHandler implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == itemRegist.ultraCoal)
		return 4800;
		return 0;
		
	}
}
