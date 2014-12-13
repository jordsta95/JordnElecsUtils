package com.jordsta.stuff.blocks;

import com.jordsta.stuff.JCreativeTabs;
import com.jordsta.stuff.Main;
import com.jordsta.stuff.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.item.Item;

import java.util.Random;

public class dropLight extends BlockFalling {
	
	public dropLight()
		{
			setBlockName("dropLight");
			setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(JCreativeTabs.TAB);
			setHardness(20.0f);
			setResistance(3.0f);
			setStepSound(Block.soundTypeGlass);
			setLightLevel(1.0F);
		}
	public static boolean fallinstantly = true;
	
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return Main.lightDust;
	}


}
