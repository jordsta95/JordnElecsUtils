package com.jordsta.stuff.world;

import com.jordsta.stuff.init.blockRegist;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class ultraGen implements IWorldGenerator {
	

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
            (new WorldGenMinable(blockRegist.ultraOre, 4, Blocks.stone)).generate(world, random, xCoord, yCoord, zCoord);}  

                 
    }
 
    private void generateNether(World world, Random random, int chunkX,
            int chunkZ) {
        for(int i = 0; i < 60; i++){
            int xCoord = chunkX + random.nextInt(16);
            int yCoord = random.nextInt(60);
            int zCoord = chunkZ + random.nextInt(16);
        } 
    }

}
