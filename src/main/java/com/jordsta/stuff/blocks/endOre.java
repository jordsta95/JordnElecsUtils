package com.jordsta.stuff.blocks;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;
import com.jordsta.stuff.init.itemRegist;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class endOre extends Block {

	public endOre()
	{
		super(Material.rock);
		setBlockName("endOre");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JordTab.JordTab);
		setHardness(20.0f);
		setResistance(3.0f);
		setHarvestLevel("pickaxe", 20);
		RegisterHelper.registerBlock(this);
	}
	
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return itemRegist.unrefinedCurrency;
	}

}
