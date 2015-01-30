package com.jordsta.stuff.dimensions;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Main;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;
import com.jordsta.stuff.init.blockRegist;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class teleporter extends BlockPortal {
	public teleporter()
	{
		setBlockName("teleporter");
		RegisterHelper.registerBlock(this);
		setCreativeTab(JordTab.JordTab);
	}
	
	
	@Override
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity){
		if(entity.ridingEntity == null && entity.riddenByEntity == null && entity instanceof EntityPlayerMP){
			EntityPlayerMP player = (EntityPlayerMP) entity;
			//ModLoader.getMinecraftServerInstance(); ""dunno if needed""
			MinecraftServer server = MinecraftServer.getServer();
			
			if(player.timeUntilPortal > 0){
				player.timeUntilPortal = 40;
			}
			else if(player.dimension != Main.dimensionID){
				player.timeUntilPortal = 40;
				player.mcServer.getConfigurationManager().transferPlayerToDimension(player, Main.dimensionID, new teleporterDimension(server.worldServerForDimension(Main.dimensionID)));               
			}
			else{
				player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 0, new teleporterDimension(server.worldServerForDimension(Main.dimensionID)));               
				
			}
		}
	}

	@Override
	public boolean func_150000_e(World world, int x, int y, int z){
		byte b = 0;
		byte b1 = 0;
		byte b2 = 0;
		
		if(world.getBlock(x-1, y, z) == blockRegist.horizontalPortal || world.getBlock(x+1, y, z) == blockRegist.horizontalPortal){
			b = 1;
		}
		if(world.getBlock(x, y, z-1) == blockRegist.horizontalPortal || world.getBlock(x, y, z+1) == blockRegist.horizontalPortal){
			b1 = 1;
		}
		if(world.getBlock(x, y+1, z) == blockRegist.horizontalPortal || world.getBlock(x, y-1, z) == blockRegist.horizontalPortal){
			b2 = 1;
		}
		
		if(b == b1){
		return false;
	}
		else{
			if(world.isAirBlock(x-b, y, z-b1)){
				x-=b;
				z-=z;
			}
			
	
			
			for(int i = -1; i <= 2; i++)
			{
				for(int j = -1; j <= 3; j++){
					boolean flag = i == -1 || 1 == 2 || j == -1 || j == 3;
					
					if(i != -1 && i != 2 || j != -1 && j !=3){
						Block k = world.getBlock(x + (b*i), y + j, z + (b1*i));
						
						if(flag){
							if(k != blockRegist.horizontalPortal){
								return false;
							}
						}
					}
				}
			}
			
		}
		
	return false;
	}
	
	public void onNeighborBlockChange(World world, int par2, int par3, int par4, Block par5)
	{
		
	}
}
