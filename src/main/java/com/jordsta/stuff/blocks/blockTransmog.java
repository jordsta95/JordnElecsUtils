package com.jordsta.stuff.blocks;

import java.util.List;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.init.blockRegist;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class blockTransmog extends Block {

	public blockTransmog() {
		super(Material.rock);
		setBlockName("blockTransmog");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JordTab.JordTab);
		setHardness(5.0f);
		setResistance(3.0f);
		setHarvestLevel("pickaxe", 1);	
	}
	
	//(isBlockOreDict("oreSilver", world.getBlock(posX, posY + 1, posZ)))
	//(world.getBlock(posX+1, posY, posZ) == Blocks.water)
	//world.setBlock(posX, posY - 1, posZ, blockRegist.cable);
	
	 public void onNeighborBlockChange(World world, int posX, int posY, int posZ, Block neighbourBlock){
	     //Water Generator	
		 if(isBlockOreDict("plankWood", world.getBlock(posX+1, posY, posZ))){ 
	     		if(isBlockOreDict("plankWood", world.getBlock(posX-1, posY, posZ))){
	     			if(isBlockOreDict("plankWood", world.getBlock(posX, posY, posZ+1))){
	     				if(isBlockOreDict("plankWood", world.getBlock(posX, posY, posZ-1))){
	     					if(world.getBlock(posX, posY + 1, posZ) == Blocks.iron_block){
	     						world.setBlock(posX, posY + 1, posZ, blockRegist.waterGenerator);
	     						world.setBlock(posX, posY, posZ + 1, Blocks.air);
	     						world.setBlock(posX, posY, posZ - 1, Blocks.air);
	     						world.setBlock(posX + 1, posY, posZ, Blocks.air);
	     						world.setBlock(posX - 1, posY, posZ, Blocks.air);
	     					}
	     				}
	     			}
	     		}
	    	 
	     	}
	     	//Smelter
		 if(world.getBlock(posX+1, posY, posZ) == Blocks.emerald_block){
			 if(world.getBlock(posX-1, posY, posZ) == Blocks.emerald_block){
				 if(world.getBlock(posX, posY, posZ + 1) == Blocks.furnace){
					 if(world.getBlock(posX, posY, posZ - 1) == Blocks.diamond_block){
  						world.setBlock(posX, posY + 1, posZ, blockRegist.smelter);
  						world.setBlock(posX, posY, posZ + 1, Blocks.air);
  						world.setBlock(posX, posY, posZ - 1, Blocks.air);
  						world.setBlock(posX + 1, posY, posZ, Blocks.air);
  						world.setBlock(posX - 1, posY, posZ, Blocks.air);
					 }
				}
			}
		 }
		 
		 	//Ore Purifier
		 if(world.getBlock(posX+1, posY, posZ) == Blocks.diamond_block){
			 if(world.getBlock(posX-1, posY, posZ) == Blocks.iron_bars){
				 if(world.getBlock(posX, posY, posZ + 1) == Blocks.furnace){
					 if(world.getBlock(posX, posY, posZ - 1) == Blocks.diamond_block){
  						world.setBlock(posX, posY + 1, posZ, blockRegist.doubler);
  						world.setBlock(posX, posY, posZ + 1, Blocks.air);
  						world.setBlock(posX, posY, posZ - 1, Blocks.air);
  						world.setBlock(posX + 1, posY, posZ, Blocks.air);
  						world.setBlock(posX - 1, posY, posZ, Blocks.air);
					 }
				}
			}
		 }
		 
		 //Cable
		 if(world.getBlock(posX, posY + 2, posZ) == Blocks.iron_block){
			 if(world.getBlock(posX, posY + 1, posZ) == Blocks.redstone_block){
					world.setBlock(posX, posY + 1, posZ, blockRegist.cable);
					world.setBlock(posX, posY, posZ + 1, blockRegist.cable);
					world.setBlock(posX, posY, posZ - 1, blockRegist.cable);
					world.setBlock(posX + 1, posY, posZ, blockRegist.cable);
					world.setBlock(posX - 1, posY, posZ, blockRegist.cable);
					world.setBlock(posX, posY + 2, posZ, Blocks.air);
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
	  
		public static String name = "blockTransmog";
		private IIcon[] icons = new IIcon[6];

		@Override
		public void registerBlockIcons(IIconRegister iconRegister){
			for (int i = 0; i <icons.length; i++){
				icons[i] = iconRegister.registerIcon(Reference.MODID + ":" + name + i);
			}
		}
		
		@Override
		public IIcon getIcon(int side, int meta){
			return icons[side];
		}
}
