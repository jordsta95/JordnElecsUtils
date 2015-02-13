package com.jordsta.stuff.init;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class uberiumFluid extends BlockFluidClassic {

	public uberiumFluid(Fluid fluid, Material material) {
		super(fluid, material.water);
		setCreativeTab(JordTab.JordTab);
	}
}
