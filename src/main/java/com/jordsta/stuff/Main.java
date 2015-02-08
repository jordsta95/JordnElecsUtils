package com.jordsta.stuff;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

import com.jordsta.stuff.config.ConfigFile;
import com.jordsta.stuff.dimensions.DimInfo;
import com.jordsta.stuff.init.*;
import com.jordsta.stuff.proxies.CommonProxy;
import com.jordsta.stuff.world.endOreGen;
import com.jordsta.stuff.world.superiumOreGen;
import com.jordsta.stuff.world.ultraGen;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import elec332.core.api.dimension.DimensionAPI;


@Mod(modid = Reference.MODID, version = Reference.VERSION/*, dependencies = "required-after:ElecCore@[52,"*/)
public class Main {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;
	
	public static final int dimensionID = 24;
	
	public static Configuration config;
	@Mod.Instance(Reference.MODID)
	public static Main instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

		//Config
		this.config = new Configuration(event.getSuggestedConfigurationFile());
		MinecraftForge.EVENT_BUS.register(this);
		ConfigFile.INSTANCE.syncConfig();

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
		
		//Mod Support
		if(Loader.isModLoaded("COFHCore")){
			
		}
		
		if(Loader.isModLoaded("TCon")){
			ticonRegist.Register();
		}
    }
    
    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event){
    	if(event.modID.equals(Reference.MODID)){
    		ConfigFile.INSTANCE.syncConfig();
    	}
    }
    
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	proxy.registerTileEntities();
    	
    	//Fuel Handler
    	GameRegistry.registerFuelHandler(new ultraCoalFuel());
    }
}
