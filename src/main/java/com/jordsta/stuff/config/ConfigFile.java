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
	//InfiCake
	public static boolean InfiCake;
	public static final boolean InfiCakeVar = false;
	//Thaumcraft
	public static boolean visViewer;
	public static final boolean visViewerVar = false;
	//Blood Magic
	public static boolean regen;
	public static final boolean regenVar = false;
	
	
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
		
		//Disable Inficake
		final String INFICAKE = Main.config.CATEGORY_GENERAL + Main.config.CATEGORY_SPLITTER + "Mod Interaction";
		Main.config.addCustomCategoryComment(INFICAKE, "Disable mod interaction exploits, and other stuff, here");
		this.InfiCake = Main.config.get(INFICAKE, "I am a monster", InfiCakeVar).getBoolean(InfiCakeVar);
		if(Main.config.hasChanged()){
			Main.config.save();
		}
		//Disable Vis Viewers
		final String VISVIEWER = Main.config.CATEGORY_GENERAL + Main.config.CATEGORY_SPLITTER + "Mod Interaction";
		Main.config.addCustomCategoryComment(VISVIEWER, "Disable mod interaction exploits, and other stuff, here");
		this.visViewer = Main.config.get(VISVIEWER, "Viewing vis should make me more vulnerable", visViewerVar).getBoolean(visViewerVar);
		if(Main.config.hasChanged()){
			Main.config.save();
		}
		//Disable regen armour
		final String REGEN = Main.config.CATEGORY_GENERAL + Main.config.CATEGORY_SPLITTER + "Mod Interaction";
		Main.config.addCustomCategoryComment(REGEN, "Disable mod interaction exploits, and other stuff, here");
		this.regen = Main.config.get(REGEN, "Too many people make WayofTime sad", regenVar).getBoolean(regenVar);
		if(Main.config.hasChanged()){
			Main.config.save();
		}
	}
}
		