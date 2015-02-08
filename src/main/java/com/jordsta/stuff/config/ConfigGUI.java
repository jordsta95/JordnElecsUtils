package com.jordsta.stuff.config;

import com.jordsta.stuff.Main;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ConfigGUI extends GuiConfig {

	public ConfigGUI(GuiScreen screen){
		super(screen, new ConfigElement(Main.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
				"warmod", false, false, GuiConfig.getAbridgedConfigPath(Main.config.toString()));
	}
}
