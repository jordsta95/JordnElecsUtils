package com.jordsta.stuff.blocks;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class safetyTorch extends Block implements ITileEntityProvider{
	public safetyTorch()
	{
		super(Material.glass);
		this.setCreativeTab(JordTab.JordTab);
		this.setBlockName("safetyTorch");
		this.setLightLevel(4.0F);
		this.setTickRandomly(true);
		setHardness(1.0f);
		setResistance(1.0f);
		RegisterHelper.registerBlock(this);
	}
	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) 
	{
		return new InterdictionTile();
	}

	public static String name = "safetyTorch";
	private IIcon[] icons = new IIcon[6];

	@Override
	public void registerBlockIcons(IIconRegister iconRegister){
		for (int i = 0; i <icons.length; i++){
			icons[i] = iconRegister.registerIcon(Reference.MODID + ":" + name + i);
		}
	}
	
	@Override
	public IIcon getIcon(int side, int meta){
		return icons[side];
	}
}