package com.jordsta.stuff.blocks;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.init.blockRegist;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class doubler extends Block {

	public doubler() {
		super(Material.rock);
		setBlockName("doubler");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JordTab.JordTab);
		setHardness(5.0f);
		setResistance(3.0f);
		setHarvestLevel("pickaxe", 1);
		
	}
	
	//Messy ore doubling
	 public void onNeighborBlockChange(World world, int posX, int posY, int posZ, Block neighbourBlock){
		 if (world.getBlock(posX, posY + 1, posZ) == Blocks.iron_ore){
			 world.setBlock(posX, posY + 1, posZ, blockRegist.blankGlass);
		 }
		 
	}

}
