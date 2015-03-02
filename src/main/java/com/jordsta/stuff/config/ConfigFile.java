package com.jordsta.stuff.config;

import com.jordsta.stuff.Main;

public class ConfigFile {

	public static ConfigFile INSTANCE = new ConfigFile();

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
	//Cake
	public static boolean happyVazkii;
	public static final boolean happyVazkiiVar = false;
	
	
	public void syncConfig(){
		//Disable Uberium
		final String UBERIUM = Main.config.CATEGORY_GENERAL + Main.config.CATEGORY_SPLITTER + "Materials";
		Main.config.addCustomCategoryComment(UBERIUM, "Disable materials here");
		this.disableUberium = Main.config.get(UBERIUM, "I don't like being OP", disableUberiumVar).getBoolean(disableUberiumVar);
		if(Main.config.hasChanged()){
			Main.config.save();
		}
		
		//Disable Superium
		final String SUPERIUM = Main.config.CATEGORY_GENERAL + Main.config.CATEGORY_SPLITTER + "Materials";
		Main.config.addCustomCategoryComment(SUPERIUM, "Disable materials here");
		this.disableSuperium = Main.config.get(SUPERIUM, "I hate nether ores", disableSuperiumVar).getBoolean(disableSuperiumVar);
		if(Main.config.hasChanged()){
			Main.config.save();
		}
		
		//Disable Ultradian
		final String ULTRADIAN = Main.config.CATEGORY_GENERAL + Main.config.CATEGORY_SPLITTER + "Materials";
		Main.config.addCustomCategoryComment(ULTRADIAN, "Disable materials here");
		this.disableUltradian = Main.config.get(ULTRADIAN, "The overworld has too many ores", disableUltradianVar).getBoolean(disableUltradianVar);
		if(Main.config.hasChanged()){
			Main.config.save();
		}
		
		//Disable Cakesword
		final String CAKE = Main.config.CATEGORY_GENERAL + Main.config.CATEGORY_SPLITTER + "Mod Interaction";
		Main.config.addCustomCategoryComment(CAKE, "Disable mod interaction exploits, and other stuff, here");
		this.happyVazkii = Main.config.get(CAKE, "I like making Vazkii happy", happyVazkiiVar).getBoolean(happyVazkiiVar);
		if(Main.config.hasChanged()){
			Main.config.save();
		}
	}
}
		