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

public class secretWoodD extends Block {
	public secretWoodD(){
		super(Material.plants);
		setBlockName("secretWoodD");
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
		blockIcon = iconRegister.registerIcon("minecraft:planks_big_oak");
	}

}
