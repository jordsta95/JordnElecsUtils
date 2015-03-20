package com.jordsta.stuff.items;

import com.jordsta.stuff.Reference;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class DoubledItems extends ItemBlock{

	final static String[] doubledOre = new String[] {
		"iron","gold","diamond","emerald","ultradian","superium","uberium",
			//mod support
			"tin","copper","aluminium","lead","sliver","ferrous"
		};
	
	public DoubledItems(Block block) {
		super(block);
		this.setHasSubtypes(true);
	}
	public String getUnlocalizedName(ItemStack stack) {
		int i = stack.getItemDamage();
		if (i <0 || i >= doubledOre.length){
			i = 0;
		}
		
		return super.getUnlocalizedName() + "."+ "doubleOre_" + doubledOre[i];
	}
	public int getMetadata(int meta){
	return meta;
}
	
}
