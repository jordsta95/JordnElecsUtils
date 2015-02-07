package com.jordsta.stuff.config;

import com.jordsta.stuff.Main;

import cpw.mods.fml.common.FMLCommonHandler;

public class ConfigFile {
	//!!!WARMING!!! This file will be very messy!
//Set what will be disabled when true
	//Uberium
	public static boolean disableUberium;
	public static final boolean disableUberiumVar = false;
	//Superium
	public static boolean disableSuperium;
	public static final boolean disableSuperiumVar = false;
	//Ultradian
	public static boolean disableUltradian;
	public static final boolean disableUltradianVar = false;
	
	
	public static void syncConfig(){
		FMLCommonHandler.instance().bus().register(Main.instance);
		//Disable Uberium
		final String UBERIUM = Main.config.CATEGORY_GENERAL + Main.config.CATEGORY_SPLITTER + "Materials";
		Main.config.addCustomCategoryComment(UBERIUM, "Disable materials here");
		disableUberium = Main.config.get(UBERIUM, "I don't like being OP", disableUberiumVar).getBoolean(disableUberiumVar);
		if(Main.config.hasChanged()){
			Main.config.save();
		}
		
		//Disable Superium
		final String SUPERIUM = Main.config.CATEGORY_GENERAL + Main.config.CATEGORY_SPLITTER + "Materials";
		Main.config.addCustomCategoryComment(SUPERIUM, "Disable materials here");
		disableSuperium = Main.config.get(SUPERIUM, "I hate nether ores", disableSuperiumVar).getBoolean(disableSuperiumVar);
		if(Main.config.hasChanged()){
			Main.config.save();
		}
		
		//Disable Ultradian
		final String ULTRADIAN = Main.config.CATEGORY_GENERAL + Main.config.CATEGORY_SPLITTER + "Materials";
		Main.config.addCustomCategoryComment(ULTRADIAN, "Disable materials here");
		disableUltradian = Main.config.get(ULTRADIAN, "The overworld has too many ores", disableUltradianVar).getBoolean(disableUltradianVar);
		if(Main.config.hasChanged()){
			Main.config.save();
		}
	
		
	}
}
		