package com.jordsta.stuff.blocks;

import com.jordsta.stuff.JCreativeTabs;
import com.jordsta.stuff.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class blankGlass extends Block {

	public blankGlass()
	{
		super(Material.glass);
		setBlockName("blankGlass");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JCreativeTabs.TAB);
		setHardness(2.0f);
		setResistance(1.0f);
	}
	
	public boolean isOpaqueCube(){
		return false;
	}
}
