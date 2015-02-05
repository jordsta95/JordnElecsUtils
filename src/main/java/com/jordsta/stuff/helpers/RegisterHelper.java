package com.jordsta.stuff.helpers;

import com.jordsta.stuff.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class RegisterHelper 
{
	public static void registerBlock(Block block){
		GameRegistry.registerBlock(block, Reference.MODID + " " + block.getUnlocalizedName().substring(5));
	}
	
	public static void registerItem(Item item){
		GameRegistry.registerItem(item, Reference.MODID + " " + item.getUnlocalizedName().substring(5));
	}

	public static void registerOreDict(Item item, String name){
		OreDictionary.registerOre(name, new ItemStack(item));
	}
}
