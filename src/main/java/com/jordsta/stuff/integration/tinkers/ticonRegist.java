package com.jordsta.stuff.integration.tinkers;

import java.io.IOException;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class ticonRegist {

	//TiCon Liquid Uberium
    public static Block uberiumFluid;
    public static Fluid fluidUberium;
    public static Material materialUberium;
    public static Item UberiumToolParts;
    
    /*
     TiCon Item textures added as Uberium_<part>. E.g. Uberium_battleaxe_back... These will need to be meta
     */
    
    
	
	public static void Register(){
		
		
        //Fluid Uberium
        fluidUberium = new Fluid("Uberium");
        FluidRegistry.registerFluid(fluidUberium);
        materialUberium = new MaterialLiquid(MapColor.magentaColor);
        uberiumFluid = new uberiumFluid(fluidUberium, materialUberium).setBlockName("uberiumFluid").setBlockTextureName(Reference.MODID + ":" + "uberiumFluid");
        RegisterHelper.registerBlock(uberiumFluid);
        
        //Uberium TiCon Tools
        UberiumToolParts = new UberiumToolParts()/*.setTextureName("Uberium")*/;
        GameRegistry.registerItem(UberiumToolParts, "UberiumToolParts", UberiumToolParts.getUnlocalizedName().substring(5));

        
	}
	
}

