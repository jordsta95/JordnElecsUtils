package com.jordsta.stuff.world;

import com.jordsta.stuff.Main;
import com.jordsta.stuff.init.biomeRegist;
import com.jordsta.stuff.init.blockRegist;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType;
import net.minecraftforge.event.terraingen.TerrainGen;

import java.util.Random;


public class endOreGen implements IWorldGenerator {
	

	@Override
	  public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) { 
      switch(world.provider.dimensionId){
      case 1:
      generateNether(world, random, chunkX * 16, chunkZ * 16);
      case 0:
          generateSurface(world, random, chunkX * 16, chunkZ * 16);
      case -1:
          generateEnd(world, random, chunkX * 16, chunkZ * 16);
      }
  }

  private void generateEnd(World world, Random random, int chunkX, int chunkZ) {
      for(int i = 0; i < 60; i++){
          int xCoord = chunkX + random.nextInt(16);
          int yCoord = random.nextInt(60);
          int zCoord = chunkZ + random.nextInt(16);
      }
  }

  private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
      for(int i = 0; i < 60; i++){
          int xCoord = chunkX + random.nextInt(16);
          int yCoord = random.nextInt(60);
          int zCoord = chunkZ + random.nextInt(16);
          (new WorldGenMinable(blockRegist.endOre, 400, Blocks.stone)).generate(world, random, xCoord, yCoord, zCoord);}  

               
  }

  private void generateNether(World world, Random random, int chunkX,
          int chunkZ) {
      for(int i = 0; i < 60; i++){
          int xCoord = chunkX + random.nextInt(16);
          int yCoord = random.nextInt(60);
          int zCoord = chunkZ + random.nextInt(16);
      } 
  }
 

    private boolean canGen(World world, Random rand, int x, int z) {
        int dim = Main.dimensionID;
        if (dim != Main.dimensionID){
            return false;
    }
     return true;
    }
    
}
