package com.jordsta.stuff.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class oreDict {	
	public static void Register(){
		
		OreDictionary.registerOre("ingotCopper", itemRegist.ingots);
		OreDictionary.registerOre("ingotLead", new ItemStack(itemRegist.ingots, 1, 1));
		OreDictionary.registerOre("ingotTin", new ItemStack(itemRegist.ingots, 2, 2));
		OreDictionary.registerOre("ingotNickel", new ItemStack(itemRegist.ingots,3, 3));
		OreDictionary.registerOre("ingotAluminum", new ItemStack(itemRegist.ingots, 4, 4));
		OreDictionary.registerOre("ingotSilver", new ItemStack(itemRegist.ingots, 5, 5));
	}
}
