package com.jordsta.stuff.blocks;

import com.jordsta.stuff.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class feeder extends Block {
	
	public feeder(){
		super(Material.rock);
		setBlockName("feeder");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setHardness(5.0f);
		setResistance(3.0f);
		setHarvestLevel("pickaxe", 1);
		
	}
	
	public void onNeighborBlockChange(World world, int posX, int posY, int posZ, Block neighbourBlock){
		 if(world.getBlock(posX, posY - 1, posZ) == Blocks.air){

		 }
		
	}

}
