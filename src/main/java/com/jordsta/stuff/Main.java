package com.jordsta.stuff;

import com.jordsta.stuff.dimensions.DimInfo;
import com.jordsta.stuff.init.*;
import com.jordsta.stuff.proxies.CommonProxy;
import com.jordsta.stuff.world.endOreGen;
import com.jordsta.stuff.world.superiumOreGen;
import com.jordsta.stuff.world.ultraGen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import elec332.core.api.dimension.DimensionAPI;


@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class Main {

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
		blockRegist.Register(event);
		secretBlocks.Register(event);

		//Register items
		itemRegist.Register(event);

		//Recipes
		recipeRegist.Register();
		
		//Biomes
		biomeRegist.Register();

		//Register with DimensionAPI
		DimensionAPI.Register(new DimInfo());
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	proxy.registerTileEntities();
    	
    	//Fuel Handler
    	GameRegistry.registerFuelHandler(new ultraCoalFuel());
    }
}
