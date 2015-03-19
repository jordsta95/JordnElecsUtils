package com.jordsta.stuff.blocks;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.init.blockRegist;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class waterGenerator extends Block {
	
	public waterGenerator() {
		super(Material.rock);
		setBlockName("waterGenerator");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JordTab.JordTab);
		setHardness(5.0f);
		setResistance(3.0f);
		setHarvestLevel("pickaxe", 1);	
	}
	
	 public void onNeighborBlockChange(World world, int posX, int posY, int posZ, Block neighbourBlock){
	     if(world.getBlock(posX+1, posY, posZ) == Blocks.water){   
	    	 if(world.getBlock(posX-1, posY, posZ) == Blocks.water){
	    		 if(world.getBlock(posX, posY, posZ+1) == Blocks.water){ 
	    			 if(world.getBlock(posX, posY, posZ-1) == Blocks.water){ 
	    				 if(world.getBlock(posX, posY+1, posZ) == blockRegist.cable){ 
	    					 world.setBlock(posX, posY+1, posZ, blockRegist.cable, 1, 1);
	    					 world.setBlock(posX+1, posY, posZ, Blocks.air);
	    					 world.setBlock(posX-1, posY, posZ, Blocks.air);
	    					 world.setBlock(posX, posY, posZ-1, Blocks.air);
	    					 world.setBlock(posX, posY, posZ+1, Blocks.air);
	    				 }
	    			 }
	    		 }
	    	 }
	     	}
	     }

}
