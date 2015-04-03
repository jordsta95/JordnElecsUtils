package com.jordsta.stuff.blocks;

import java.util.List;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.init.blockRegist;
import com.jordsta.stuff.init.itemRegist;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;

public class smelter extends Block {
	public smelter() {
		super(Material.rock);
		setBlockName("smelter");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JordTab.JordTab);
		setHardness(5.0f);
		setResistance(3.0f);
		setHarvestLevel("pickaxe", 1);
		}

	/*
	 public void onNeighborBlockChange(World world, int posX, int posY, int posZ, Block neighbourBlock){
	     if(world.getBlock(posX, posY - 1, posZ) == blockRegist.cable){   
		 if (world.getBlock(posX, posY, posZ + 1) == blockRegist.doubled){ 
			 world.setBlock(posX, posY-1, posZ, blockRegist.cable);
			 dropItemStack(new ItemStack(Items.iron_ingot, 2), world, posX, posY + 1, posZ);
	        }
		 
		 
	     }
	 }
	*/ 
	 
		public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ)
		{
			if(world.getBlock(x, y - 1, z) == blockRegist.cablePowered){  
			if (world.getBlock(x, y, z + 1) == blockRegist.doubled && world.getBlockMetadata(x, y, z + 1)  == 0){ 
				dropItemStack(new ItemStack(Items.iron_ingot, 2), world, x, y + 1, z);
				world.setBlock(x, y, z + 1, Blocks.air);
				world.setBlock(x, y-1, z, blockRegist.cable);
				return true;
			}
			if(world.getBlock(x, y, z + 1) == blockRegist.doubled && world.getBlockMetadata(x, y, z + 1)  == 1){
				dropItemStack(new ItemStack(Items.gold_ingot, 2), world, x, y + 1, z);
				world.setBlock(x, y, z + 1, Blocks.air);
				world.setBlock(x, y-1, z, blockRegist.cable);
				return true;
			}
			if(world.getBlock(x, y, z + 1) == blockRegist.doubled && world.getBlockMetadata(x, y, z + 1)  == 2){
				dropItemStack(new ItemStack(Items.diamond, 2), world, x, y + 1, z);
				world.setBlock(x, y, z + 1, Blocks.air);
				world.setBlock(x, y-1, z, blockRegist.cable);
				return true;
			}
			if(world.getBlock(x, y, z + 1) == blockRegist.doubled && world.getBlockMetadata(x, y, z + 1)  == 3){
				dropItemStack(new ItemStack(Items.emerald, 2), world, x, y + 1, z);
				world.setBlock(x, y, z + 1, Blocks.air);
				world.setBlock(x, y-1, z, blockRegist.cable);
				return true;
			}
			if(world.getBlock(x, y, z + 1) == blockRegist.doubled && world.getBlockMetadata(x, y, z + 1)  == 4){
				dropItemStack(new ItemStack(itemRegist.ultraShard, 2), world, x, y + 1, z);
				world.setBlock(x, y, z + 1, Blocks.air);
				world.setBlock(x, y-1, z, blockRegist.cable);
				return true;
			}
			if(world.getBlock(x, y, z + 1) == blockRegist.doubled && world.getBlockMetadata(x, y, z + 1)  == 5){
				dropItemStack(new ItemStack(itemRegist.superium, 2), world, x, y + 1, z);
				world.setBlock(x, y, z + 1, Blocks.air);
				world.setBlock(x, y-1, z, blockRegist.cable);
				return true;
			}
			if(world.getBlock(x, y, z + 1) == blockRegist.doubled && world.getBlockMetadata(x, y, z + 1)  == 6){
				dropItemStack(new ItemStack(itemRegist.unrefinedCurrency, 2), world, x, y + 1, z);
				world.setBlock(x, y, z + 1, Blocks.air);
				world.setBlock(x, y-1, z, blockRegist.cable);
				return true;
			}
			if(world.getBlock(x, y, z + 1) == blockRegist.doubled && world.getBlockMetadata(x, y, z + 1)  == 7){
				dropItemStack(new ItemStack(itemRegist.ingots, 2, 2), world, x, y + 1, z);
				world.setBlock(x, y, z + 1, Blocks.air);
				world.setBlock(x, y-1, z, blockRegist.cable);
				return true;
			}
			if(world.getBlock(x, y, z + 1) == blockRegist.doubled && world.getBlockMetadata(x, y, z + 1)  == 8){
				dropItemStack(new ItemStack(itemRegist.ingots, 2), world, x, y + 1, z);
				world.setBlock(x, y, z + 1, Blocks.air);
				world.setBlock(x, y-1, z, blockRegist.cable);
				return true;
			}
			if(world.getBlock(x, y, z + 1) == blockRegist.doubled && world.getBlockMetadata(x, y, z + 1)  == 9){
				dropItemStack(new ItemStack(itemRegist.ingots, 2, 4), world, x, y + 1, z);
				world.setBlock(x, y, z + 1, Blocks.air);
				world.setBlock(x, y-1, z, blockRegist.cable);
				return true;
			}
			if(world.getBlock(x, y, z + 1) == blockRegist.doubled && world.getBlockMetadata(x, y, z + 1)  == 10){
				dropItemStack(new ItemStack(itemRegist.ingots, 2, 1), world, x, y + 1, z);
				world.setBlock(x, y, z + 1, Blocks.air);
				world.setBlock(x, y-1, z, blockRegist.cable);
				return true;
			}
			if(world.getBlock(x, y, z + 1) == blockRegist.doubled && world.getBlockMetadata(x, y, z + 1)  == 11){
				dropItemStack(new ItemStack(itemRegist.ingots, 2, 5), world, x, y + 1, z);
				world.setBlock(x, y, z + 1, Blocks.air);
				world.setBlock(x, y-1, z, blockRegist.cable);
				return true;
			}
			if(world.getBlock(x, y, z + 1) == blockRegist.doubled && world.getBlockMetadata(x, y, z + 1)  == 12){
				dropItemStack(new ItemStack(itemRegist.ingots, 2, 3), world, x, y + 1, z);
				world.setBlock(x, y, z + 1, Blocks.air);
				world.setBlock(x, y-1, z, blockRegist.cable);
				return true;
			}
			}
			
			
			return false;
			  
		}
		


	 
	 
		public static void dropItemStack(ItemStack item, World world, int x, int y, int z)
		{
		EntityItem entityitem = new EntityItem(world, x, y, z, item);
		entityitem.posX = x;
		entityitem.posY = y;
		entityitem.posZ = z;
		if(world.isRemote){
		
		}else
		world.spawnEntityInWorld(entityitem);

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
		  
			public static String name = "smelter";
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
