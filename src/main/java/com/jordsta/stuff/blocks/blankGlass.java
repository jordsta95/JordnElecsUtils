package com.jordsta.stuff.blocks;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class blankGlass extends Block {

	public blankGlass()
	{
		super(Material.glass);
		setBlockName("blankGlass");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JordTab.JordTab);
		setHardness(2.0f);
		setResistance(1.0f);
		RegisterHelper.registerBlock(this);
	}
	
	public boolean isOpaqueCube(){
		return false;
	}
}
