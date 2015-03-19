package com.jordsta.stuff.init;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CableItems extends ItemBlock{

	final static String[] doubledOre = new String[] {
	"Unpowered","Powered"
	};
	
	public CableItems(Block block) {
		super(block);
		this.setHasSubtypes(true);
	}
	public String getUnlocalizedName(ItemStack stack) {
		int i = stack.getItemDamage();
		if (i <0 || i >= doubledOre.length){
			i = 0;
		}
		
		return super.getUnlocalizedName() + "."+ "cable" + doubledOre[i];
	}
	public int getMetadata(int meta){
	return meta;
}

}