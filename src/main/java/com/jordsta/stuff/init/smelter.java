package com.jordsta.stuff.init;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

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

	 public void onNeighborBlockChange(World world, int posX, int posY, int posZ, Block neighbourBlock){
	     if(world.getBlock(posX, posY - 1, posZ) == blockRegist.cable){   
		 if (world.getBlock(posX, posY, posZ + 1) == blockRegist.doubled){ 
			 world.setBlock(posX, posY-1, posZ, blockRegist.cable);
			
	        }
		 
		 
	     }
	 }
	 
	 
		public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ)
		{
			if (world.getBlock(x, y, z + 1) != blockRegist.doubled){ 

				
				
			}else
				dropItemStack1(new ItemStack(Items.iron_ingot, 2), world, x, y + 1, z);
			world.setBlock(x, y, z + 1, Blocks.air);
			return true;
			  
		}
		

		


		public static void dropItemStack1(ItemStack item, World world, int x, int y, int z)
		{
		EntityItem entityitem = new EntityItem(world, x, y, z, item);
		entityitem.posX = x;
		entityitem.posY = y;
		entityitem.posZ = z;
		if(world.isRemote){
		
		}else
		world.spawnEntityInWorld(entityitem);

		}
	 
	 
		public static void dropItemStack(ItemStack item, World world, int posX, int posY, int posZ)
		{
		EntityItem entityitem = new EntityItem(world, posX, posY, posZ, item);
		entityitem.posX = posX;
		entityitem.posY = posY;
		entityitem.posZ = posY;
		if(world.isRemote){
		
		}else
		world.spawnEntityInWorld(entityitem);

		}
	
}
