package com.jordsta.stuff.blocks;

import java.util.List;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.init.blockRegist;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class cable extends Block {

public cable(){
	super(Material.rock);
	setBlockName("cable");
	setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	setCreativeTab(JordTab.JordTab);
	setHardness(5.0f);
	setResistance(3.0f);
	setHarvestLevel("pickaxe", 1);
	
}


}
