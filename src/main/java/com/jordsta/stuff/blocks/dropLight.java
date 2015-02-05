package com.jordsta.stuff.blocks;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;
import com.jordsta.stuff.init.itemRegist;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class dropLight extends BlockFalling {
	
	public dropLight()
		{
			setBlockName("dropLight");
			setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(JordTab.JordTab);
			setHardness(20.0f);
			setResistance(3.0f);
			setStepSound(Block.soundTypeGlass);
			setLightLevel(1.0F);
			RegisterHelper.registerBlock(this);
		}
	public static boolean fallinstantly = true;
	
	public Block getBlockDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return Blocks.glowstone;
	}


}
