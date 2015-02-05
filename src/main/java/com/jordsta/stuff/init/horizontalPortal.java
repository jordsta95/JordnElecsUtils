package com.jordsta.stuff.init;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class horizontalPortal extends Block {

	public horizontalPortal()
	{
		super(Material.rock);
		setBlockName("horizontalPortal");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JordTab.JordTab);
		setHardness(20.0f);
		setResistance(3.0f);
		setHarvestLevel("pickaxe", 20);
		RegisterHelper.registerBlock(this);
	}
	
}
