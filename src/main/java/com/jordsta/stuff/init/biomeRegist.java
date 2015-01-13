package com.jordsta.stuff.init;

import com.jordsta.stuff.world.deltarianBiome;

import net.minecraft.world.biome.BiomeGenBase;

public class biomeRegist {
	
	public static BiomeGenBase deltarianBiome;
	
	public static void Register(){
		registerBiomes();
	}

	private static void registerBiomes() {
		deltarianBiome = new deltarianBiome(45).setBiomeName("Deltarian");
		
	}

}
