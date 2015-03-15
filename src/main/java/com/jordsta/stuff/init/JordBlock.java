package com.jordsta.stuff.init;


import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class JordBlock extends Block{

	
	public JordBlock() {
		super (Material.rock);
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName());
		setCreativeTab(JordTab.JordTab);
	}
	
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		if(blockRegist.ultraOre != null){
			return itemRegist.ultraShard;
		} else if(blockRegist.superiumOre != null){
			return itemRegist.superium;	
		} else if(blockRegist.endOre != null){
			return itemRegist.unrefinedCurrency;
		}
		
		return null;
	}
}
