package com.jordsta.stuff.world;

import com.jordsta.stuff.init.blockRegist;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderEnd;
import net.minecraft.world.gen.ChunkProviderGenerate;
import net.minecraft.world.gen.ChunkProviderHell;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;


public class superiumOreGen implements IWorldGenerator {
	
	   public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	    {
	        if (!(chunkGenerator instanceof ChunkProviderHell) && !(chunkGenerator instanceof ChunkProviderEnd))
	        {
	            for (int i = 0; i < 32; i++)
	            {
	                int randPosX = (chunkX * 16) + random.nextInt(16);
	                int randPosY = random.nextInt(256);
	                int randPosZ = (chunkZ * 16) + random.nextInt(16);
	                
	            }
	        }
	        if (!(chunkGenerator instanceof ChunkProviderGenerate) && !(chunkGenerator instanceof ChunkProviderEnd))
	        {
	            for (int i = 0; i < 10; i++)
	            {
	                int randPosX = (chunkX * 16) + random.nextInt(16);
	                int randPosY = random.nextInt(4);
	                int randPosZ = (chunkZ * 16) + random.nextInt(16);
	                new WorldGenMinable(blockRegist.superiumOre, 1, 40, Blocks.netherrack).generate(world, random, randPosX, randPosY, randPosZ);
	            }
	        }
	        if (!(chunkGenerator instanceof ChunkProviderHell) && !(chunkGenerator instanceof ChunkProviderGenerate))
	        {
	            for (int i = 0; i < 32; i++)
	            {
	                int randPosX = (chunkX * 16) + random.nextInt(16);
	                int randPosY = random.nextInt(256);
	                int randPosZ = (chunkZ * 16) + random.nextInt(16);
	                
	            }
	        }
	    }
}
