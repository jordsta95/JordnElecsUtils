package com.jordsta.stuff.init;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.blocks.blockTransmog;
import com.jordsta.stuff.blocks.cable;
import com.jordsta.stuff.blocks.cablePowered;
import com.jordsta.stuff.blocks.cobbleGen;
import com.jordsta.stuff.blocks.doubled;
import com.jordsta.stuff.blocks.doubler;
import com.jordsta.stuff.blocks.energyBlock;
import com.jordsta.stuff.blocks.feeder;
import com.jordsta.stuff.blocks.safetyTorch;
import com.jordsta.stuff.blocks.smelter;
import com.jordsta.stuff.blocks.waterGenerator;
import com.jordsta.stuff.config.ConfigFile;
import com.jordsta.stuff.helpers.RegisterHelper;
import com.jordsta.stuff.items.DoubledItems;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import elec332.core.util.blocks.baseblock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Elec332 on 13-12-2014.
 */
public class blockRegist {

    public static Block endOre, safetyTorch, dropLight, blankGlass, superiumOre, ultraOre, PortalFrame;
    
    
      static CreativeTabs Tab = JordTab.JordTab;
    
    /*Post 0.7 from here on out. THIS WILL BE MESSY. No, I won't clean it up unless I see fit
    Also, I will not accept pull requests that only change this code!
      */

      //Machines
    public static Block cobbleGen;
    public static Block doubler;
    public static Block doubled;
    public static Block smelter;
    public static Block blockTransmog;
    
    //power system
    public static Block cable;
    public static Block cablePowered;
    public static Block waterGenerator;
    public static Block feeder;

    public static void Register(FMLPreInitializationEvent event) {
        //Ultradian
        if(!ConfigFile.disableUltradian){
    		ultraOre = Ore("ultraOre", itemRegist.ultraShard, 2, 20.0F, event);
    	}

        //Superium
    	if(!ConfigFile.disableSuperium){
    		if(!ConfigFile.disableUltradian)
                superiumOre = Ore("superiumOre", itemRegist.superium, 10, 16.0F, event);
    		else
                superiumOre = Ore("superiumOre", itemRegist.superium, 3, 16.0F, event);
    	}

        //Uberium
    	if(!ConfigFile.disableUberium){
    		if(!ConfigFile.disableSuperium){
                endOre = Ore("endOre", itemRegist.unrefinedCurrency, 20, 20.0F, event);
                PortalFrame = new baseblock(Material.rock, "PortalFrame", Tab, event, 1).setToolLevel("pickaxe", 20).setHardness(20.0f).setResistance(3.0f);
    	    }
    		else if(!ConfigFile.disableUltradian){
    	        endOre = Ore("endOre", itemRegist.unrefinedCurrency, 3, 20.0F, event);
    	        PortalFrame = new baseblock(Material.rock, "PortalFrame", Tab, event, 1).setToolLevel("pickaxe", 3).setHardness(20.0f).setResistance(3.0f);
    		}
    	}
        
        
        
        safetyTorch = new safetyTorch();
        dropLight = new baseblock(Material.sand, "dropLight", Tab, event, 0).setHardness(20.0f).setResistance(3.0f).setStepSound(Block.soundTypeGlass).setLightLevel(1.0F);
        blankGlass = new baseblock(Material.glass, "blankGlass", Tab, event, 0).setNoOpaqueCube().setHardness(2.0F).setResistance(1.0F);
    /*Post 0.7 from here on out. THIS WILL BE MESSY. No, I won't clean it up unless I see fit
      Also, I will not accept pull requests that only change this code!
        */
        
        
        //machines
        doubler = new doubler();
        RegisterHelper.registerBlock(doubler);
        
        doubled = new doubled().setBlockName("doubled");
        GameRegistry.registerBlock(doubled, DoubledItems.class, doubled.getUnlocalizedName().substring(5));
        
        cobbleGen = new cobbleGen();
        RegisterHelper.registerBlock(cobbleGen);
        
        smelter = new smelter();
        RegisterHelper.registerBlock(smelter);
                
        waterGenerator = new waterGenerator();
        RegisterHelper.registerBlock(waterGenerator);
        
        blockTransmog = new blockTransmog();
        RegisterHelper.registerBlock(blockTransmog);	
        
        cable = new cable();
        RegisterHelper.registerBlock(cable);
        
        cablePowered = new cablePowered();
        RegisterHelper.registerBlock(cablePowered);
        
        feeder = new feeder();
        
    
    }

    static Block Ore(String name, Item itemDropped, int harvestlevel, Float hardness, FMLPreInitializationEvent event){
        return new baseblock(Material.rock, name, Tab, event, 1).setItemDropped(itemDropped).setToolLevel("pickaxe", harvestlevel).setHardness(hardness).setResistance(3.0F);
    }
    
    
}


