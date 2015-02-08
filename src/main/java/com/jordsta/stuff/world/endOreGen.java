package com.jordsta.stuff.world;

import com.jordsta.stuff.init.blockRegist;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;


public class endOreGen implements IWorldGenerator {
	

	@Override
	  public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) { 
      switch(world.provider.dimensionId){
      case 1:
      generateNether(world, random, chunkX * 16, chunkZ * 16);
      break;
      case 0:
          generateSurface(world, random, chunkX * 16, chunkZ * 16);
          break;
      case -1:
          generateEnd(world, random, chunkX * 16, chunkZ * 16);
          break;
      case 24:
    	    generateDim(world, random, chunkX * 16, chunkZ * 16);
    	    break;
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
         }  

               
  }

  private void generateNether(World world, Random random, int chunkX,
          int chunkZ) {
      for(int i = 0; i < 60; i++){
          int xCoord = chunkX + random.nextInt(16);
          int yCoord = random.nextInt(60);
          int zCoord = chunkZ + random.nextInt(16);
      } 
  }


  private void generateDim(World world, Random random, int chunkX, int chunkZ) {
      for(int i = 0; i < 60; i++){
          int xCoord = chunkX + random.nextInt(16);
          int yCoord = random.nextInt(60);
          int zCoord = chunkZ + random.nextInt(16);
          (new WorldGenMinable(blockRegist.endOre, 6, Blocks.stone)).generate(world, random, xCoord, yCoord, zCoord);}  

               
  }
    
}
