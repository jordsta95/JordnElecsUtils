package com.jordsta.stuff.dimensions;

import com.jordsta.stuff.Main;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import com.jordsta.stuff.init.biomeRegist;

public class JordsUtilsDimension extends WorldProvider{

	@Override
	public void registerWorldChunkManager(){
			this.worldChunkMgr = new WorldChunkManagerHell(biomeRegist.deltarianBiome, 0.2F);
			this.dimensionId = Main.dimensionID;
	}

	@Override
	public IChunkProvider createChunkGenerator(){
		return new ChunkProviderUber(worldObj, worldObj.getSeed(), false);
	}

	@Override
	public String getDimensionName() 
	{
		return "Deltarian";
	}

}
