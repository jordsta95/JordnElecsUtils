package com.jordsta.stuff.blocks;

import com.jordsta.stuff.JCreativeTabs;

import com.jordsta.stuff.helpers.RegisterHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class secretGravel extends BlockFalling {
	public secretGravel(){
		super(Material.sand);
		setBlockName("secretGravel");
		setCreativeTab(JCreativeTabs.TAB);
		RegisterHelper.registerBlock(this);
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
		blockIcon = iconRegister.registerIcon("minecraft:gravel");
	}
	public static boolean fallinstantly = true;

}
