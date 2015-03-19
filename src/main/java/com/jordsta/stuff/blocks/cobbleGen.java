package com.jordsta.stuff.blocks;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class cobbleGen extends Block {

	public cobbleGen() {
		super(Material.rock);
		setBlockName("cobbleGen");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JordTab.JordTab);
		setHardness(5.0f);
		setResistance(3.0f);
		setHarvestLevel("pickaxe", 1);
		
	}
	
	//make cobble

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float hitX, float hitY, float hitZ)
	{

				dropItemStack(new ItemStack(Blocks.cobblestone, 1), world, x, y + 2, z);
				return true;
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
	
	
}
