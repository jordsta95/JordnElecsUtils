package com.jordsta.stuff.integration.tinkers;

import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ticonRegist {

	//TiCon Liquid Uberium
    public static Block uberiumFluid;
    public static Fluid fluidUberium;
    public static Material materialUberium;
    public static Item uberBucket;
    
    
	
	public static void Register(){
		
		
        //Fluid Uberium
        fluidUberium = new Fluid("Uberium");
        FluidRegistry.registerFluid(fluidUberium);
        materialUberium = new MaterialLiquid(MapColor.magentaColor);
        uberiumFluid = new uberiumFluid(fluidUberium, materialUberium).setBlockName("uberiumFluid").setBlockTextureName(Reference.MODID + ":" + "uberiumFluid");
        uberBucket = new uberBucket(uberiumFluid).setMaxStackSize(1).setContainerItem(Items.bucket);
        RegisterHelper.registerBlock(uberiumFluid);
        RegisterHelper.registerItem(uberBucket);
	}
	
	
}
