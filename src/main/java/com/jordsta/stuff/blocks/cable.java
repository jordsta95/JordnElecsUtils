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

	@SideOnly(Side.CLIENT)
	private IIcon[] texture;
	
	final static String[] doubledOre = new String[] {
	"Unpowered","Powered"
	};
	
	public cable(){
		super(Material.rock);
		this.setCreativeTab(JordTab.JordTab);
		this.setHardness(5.0f);
		this.setResistance(3.0f);
		
	}




	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		texture = new IIcon[doubledOre.length];
		for(int i = 0; i < doubledOre.length; i++){
			texture[i] = iconRegister.registerIcon(Reference.MODID + ":" + "cable" + doubledOre[i]);
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


public void onNeighborBlockChange(World world, int posX, int posY, int posZ, Block neighbourBlock){
	 if(world.getBlock(posX, posY - 1, posZ) == blockRegist.cable && world.getBlockMetadata(posX, posY - 1, posZ)  == 1){   
   	 world.setBlock(posX, posY, posZ+1, blockRegist.cable, 1, 1);
    }
    }

}
