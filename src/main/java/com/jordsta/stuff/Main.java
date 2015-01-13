package com.jordsta.stuff;

import java.awt.Dimension;

import net.minecraftforge.common.DimensionManager;

import com.jordsta.stuff.dimensions.JordsUtilsDimension;
import com.jordsta.stuff.init.biomeRegist;
import com.jordsta.stuff.init.blockRegist;
import com.jordsta.stuff.init.itemRegist;
import com.jordsta.stuff.init.oredictRegist;
import com.jordsta.stuff.init.recipeRegist;
import com.jordsta.stuff.proxies.CommonProxy;
import com.jordsta.stuff.world.endOreGen;
import com.jordsta.stuff.world.superiumOreGen;
import com.jordsta.stuff.world.ultraGen;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class Main
{

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;
	
	
	
	
	public static final int dimensionID = 24;
	
	
	

    @EventHandler
    public void preInit (FMLPreInitializationEvent event)
    {
    	//World gen
    	GameRegistry.registerWorldGenerator(new endOreGen(), -1);
    	GameRegistry.registerWorldGenerator(new superiumOreGen(), 1);
    	GameRegistry.registerWorldGenerator(new ultraGen(), 0);
    	


    	//Register Blocks
		blockRegist.Register();

		//Register items
		itemRegist.Register();

		//OreDict
		oredictRegist.Register();


		//Recipes
		recipeRegist.Register();
		
		//Biomes
		biomeRegist.Register();
		
		DimensionManager.registerProviderType(Main.dimensionID, JordsUtilsDimension.class, false);
		DimensionManager.registerDimension(Main.dimensionID, Main.dimensionID);
		
		
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	proxy.registerTileEntities();
    	
    	//Fuel Handler
    	GameRegistry.registerFuelHandler(new ultraCoalFuel());
    }
}
