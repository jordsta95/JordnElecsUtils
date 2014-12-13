package com.jordsta.stuff.blocks;

import com.jordsta.stuff.JCreativeTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class secretWoodD extends Block {
	public secretWoodD(){
		super(Material.wood);
		setBlockName("secretWoodD");
		setCreativeTab(JCreativeTabs.TAB);
	}
	
	@Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        return null;
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon("minecraft:planks_big_oak");
	}

}
