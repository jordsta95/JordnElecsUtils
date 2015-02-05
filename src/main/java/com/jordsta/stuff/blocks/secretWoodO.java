package com.jordsta.stuff.blocks;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.helpers.RegisterHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class secretWoodO extends Block {
	public secretWoodO(){
		super(Material.plants);
		setBlockName("secretWoodO");
		setCreativeTab(JordTab.JordTab);
		RegisterHelper.registerBlock(this);
	}
	
	@Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        return null;
    }
	public boolean isOpaqueCube(){
		return false;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon("minecraft:planks_oak");
	}

}
