package com.jordsta.stuff.blocks;

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
		"iron","gold","diamond","emerald","ultradian","superium","uberium",
			//mod support
			"tin","copper","aluminium","lead","silver","ferrous"
		};
		
		public doubled(){
			super(Material.rock);
			this.setCreativeTab(JordTab.JordTab);
			this.setHardness(5.0f);
			this.setResistance(3.0f);
			
		}




		@SideOnly(Side.CLIENT)
		public void registerBlockIcons(IIconRegister iconRegister){
			texture = new IIcon[doubledOre.length];
			for(int i = 0; i < doubledOre.length; i++){
				texture[i] = iconRegister.registerIcon(Reference.MODID + ":" + "doubleOre_" + doubledOre[i]);
			}
		}
		@Override
		@SideOnly(Side.CLIENT)
		public void getSubBlocks(Item block, CreativeTabs creativeTabs, List list){			
			for (int i = 0; i < doubledOre.length; i++){
				list.add(new ItemStack(block, 1, i));
			}
		}

		@SideOnly(Side.CLIENT)
		public IIcon getIcon(int side, int meta) {
			return texture[meta];
		}
		
	public int damageDropped(int meta){
		return meta;
	}

}
