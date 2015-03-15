package com.jordsta.stuff.init;

import java.util.List;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elec332.core.helper.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class doubled extends Block {
	
		@SideOnly(Side.CLIENT)
		private IIcon[] texture;
		
		final static String[] doubledOre = new String[] {
		"iron","gold","diamond","emerald","ultradian","superium","uberium"
			
			
		};
		
		protected doubled(){
			super(Material.rock);
			setBlockName("doubled");
			setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
			setCreativeTab(JordTab.JordTab);
			setHardness(5.0f);
			setResistance(3.0f);
			setHarvestLevel("pickaxe", 1);
		}

		public String getUnlocalizedName(ItemStack stack) {
			return "item."+Reference.MODID+"."+doubledOre[stack.getItemDamage()];
		}

		@SideOnly(Side.CLIENT)
		public void registerIcons(IIconRegister iconRegister){
			texture = new IIcon[doubledOre.length];
			for(int i = 0; i < doubledOre.length; i++){
				texture[i] = iconRegister.registerIcon(Reference.MODID + ":" + "Uberium_" + doubledOre[i]);
			}
		}
		@Override
		@SideOnly(Side.CLIENT)
		public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list){
			for (int i = 0; i < doubledOre.length; i++){
				list.add(new ItemStack(item, 1, i));
			}
		}

		@SideOnly(Side.CLIENT)
		public IIcon getIconFromDamage(int meta) {
			return texture[meta];
		}
		
	

}
