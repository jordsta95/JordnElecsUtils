package com.jordsta.stuff.dimensions;

import com.jordsta.stuff.Main;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class JordsUtilsDimension extends WorldProvider{

	public void registerWorldChunkManaer(){
		this.worldChunkMgr = new WorldChunkManager(){
			
		};
		this.dimensionId = Main.dimensionID;
	}
	
	public IChunkProvider createChunckGenerator(){
		return new ChunkProviderUber(worldObj, worldObj.getSeed(), true);
	}

	public String getDimensionName() 
	{
		return "UberWorld";
	}

}
