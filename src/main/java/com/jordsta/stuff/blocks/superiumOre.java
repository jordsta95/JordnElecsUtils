package com.jordsta.stuff.blocks;

import java.util.Random;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;
import com.jordsta.stuff.init.itemRegist;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class superiumOre extends Block {
	public superiumOre()
		{
			super(Material.rock);
			setBlockName("superiumOre");
			setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(JordTab.JordTab);
			setHardness(16.0f);
			setResistance(3.0f);
			setHarvestLevel("pickaxe", 3);
			RegisterHelper.registerBlock(this);
		}
	
    public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_)
    {
        return this.quantityDropped(p_149679_2_) + p_149679_2_.nextInt(p_149679_1_ + 1);
    }
		
		@Override
		public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
		{
			return itemRegist.superium;
		}


}
