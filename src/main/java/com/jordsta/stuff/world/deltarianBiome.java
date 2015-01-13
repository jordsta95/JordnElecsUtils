package com.jordsta.stuff.world;

import net.minecraft.world.biome.BiomeGenBase;

public class deltarianBiome extends BiomeGenBase{

	private static final  Height biomeHeight = new Height(0.4F, 0.4F);
	public deltarianBiome(int id) {
		super(id);

		this.setHeight(biomeHeight);
		this.setColor(1475532);
		this.setTemperatureRainfall(0.9F, 1.0F);
		this.waterColorMultiplier = 11028712;
		
	}


	public int getBiomeGrassColor(int x, int y, int z){
		return 1475532;
	}
	

	public int getBiomeFolliageColor(int x, int y, int z){
		return 6982829;
	}
	
	
}
