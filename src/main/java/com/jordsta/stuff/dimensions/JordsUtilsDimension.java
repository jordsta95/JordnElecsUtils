package com.jordsta.stuff.dimensions;

import com.jordsta.stuff.Main;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

import com.jordsta.stuff.init.biomeRegist;
import com.jordsta.stuff.world.deltarianBiome;

public class JordsUtilsDimension extends WorldProvider{

	public void registerWorldChunkManaer(){
			this.worldChunkMgr = new WorldChunkManagerHell(biomeRegist.deltarianBiome, 0.2F);
			this.dimensionId = Main.dimensionID;
		
		
	}
	
	public IChunkProvider createChunckGenerator(){
		return new ChunkProviderUber(worldObj, worldObj.getSeed(), false);
	}

	public String getDimensionName() 
	{
		return "Deltarian";
	}

}
