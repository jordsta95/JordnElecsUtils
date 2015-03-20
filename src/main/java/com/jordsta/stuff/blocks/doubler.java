package com.jordsta.stuff.blocks;

import java.util.List;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.init.blockRegist;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

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
	     if(world.getBlock(posX, posY - 1, posZ) == blockRegist.cablePowered){   
		 if (isBlockOreDict("oreIron", world.getBlock(posX, posY + 1, posZ))){                    
	            world.setBlock(posX, posY + 1, posZ, blockRegist.doubled);
	            world.setBlock(posX, posY - 1, posZ, blockRegist.cable);
	        }
	        if (isBlockOreDict("oreGold", world.getBlock(posX, posY + 1, posZ))){                    
	            world.setBlock(posX, posY + 1, posZ, blockRegist.doubled, 1, 1);
	            world.setBlock(posX, posY - 1, posZ, blockRegist.cable);
	        }
	        if (isBlockOreDict("oreDiamond", world.getBlock(posX, posY + 1, posZ))){                    
	            world.setBlock(posX, posY + 1, posZ, blockRegist.doubled, 2, 1);
	            world.setBlock(posX, posY - 1, posZ, blockRegist.cable);
	        }
	        if (isBlockOreDict("oreEmerald", world.getBlock(posX, posY + 1, posZ))){                    
	            world.setBlock(posX, posY + 1, posZ, blockRegist.doubled, 3, 1);
	            world.setBlock(posX, posY - 1, posZ, blockRegist.cable);
	        }
	        if (world.getBlock(posX, posY + 1, posZ) == blockRegist.ultraOre){                    
	            world.setBlock(posX, posY + 1, posZ, blockRegist.doubled, 4, 1);
	            world.setBlock(posX, posY - 1, posZ, blockRegist.cable);
	        }
	        if (world.getBlock(posX, posY + 1, posZ) == blockRegist.superiumOre){                    
	            world.setBlock(posX, posY + 1, posZ, blockRegist.doubled, 5, 1);
	            world.setBlock(posX, posY - 1, posZ, blockRegist.cable);
	        }
	        if (world.getBlock(posX, posY + 1, posZ) == blockRegist.endOre){                    
	            world.setBlock(posX, posY + 1, posZ, blockRegist.doubled, 6, 1);
	            world.setBlock(posX, posY - 1, posZ, blockRegist.cable);
	        }
	        if (isBlockOreDict("oreTin", world.getBlock(posX, posY + 1, posZ))){                    
	            world.setBlock(posX, posY + 1, posZ, blockRegist.doubled, 7, 1);
	            world.setBlock(posX, posY - 1, posZ, blockRegist.cable);
	        }
	        if (isBlockOreDict("oreCopper", world.getBlock(posX, posY + 1, posZ))){                    
	            world.setBlock(posX, posY + 1, posZ, blockRegist.doubled, 8, 1);
	            world.setBlock(posX, posY - 1, posZ, blockRegist.cable);
	            
	        }
	        if (isBlockOreDict("oreAluminum", world.getBlock(posX, posY + 1, posZ))){                    
	            world.setBlock(posX, posY + 1, posZ, blockRegist.doubled, 9, 1);
	            world.setBlock(posX, posY - 1, posZ, blockRegist.cable);
	        }
	        if (isBlockOreDict("oreLead", world.getBlock(posX, posY + 1, posZ))){                    
	            world.setBlock(posX, posY + 1, posZ, blockRegist.doubled, 10, 1);
	            world.setBlock(posX, posY - 1, posZ, blockRegist.cable);
	        }
	        if (isBlockOreDict("oreSilver", world.getBlock(posX, posY + 1, posZ))){                    
	            world.setBlock(posX, posY + 1, posZ, blockRegist.doubled, 11, 1);
	            world.setBlock(posX, posY - 1, posZ, blockRegist.cable);
	        }
	        if (isBlockOreDict("oreNickel", world.getBlock(posX, posY + 1, posZ))){                    
	            world.setBlock(posX, posY + 1, posZ, blockRegist.doubled, 12, 1);
	            world.setBlock(posX, posY - 1, posZ, blockRegist.cable);
	        }
	     }
	    }

	 
	 //Thanks to chbachman for this code
	  public boolean isBlockOreDict(String oreDict, Block block){
	        ItemStack stack = new ItemStack(block); //Change the block to an itemstack, for later comparison.
	        List<ItemStack> oreList = OreDictionary.getOres(oreDict); //Get the list of itemstacks valid for the given id.

	        for(int i = 0; i < oreList.size(); i++){
	            if(OreDictionary.itemMatches(oreList.get(i), stack, false)){ //Check if the oreList has the block at the positon
	                return true; //We found the block in it, so we are good.
	            }
	        }
	        
	        return false; //We didn't find it.
	    }
	

}
