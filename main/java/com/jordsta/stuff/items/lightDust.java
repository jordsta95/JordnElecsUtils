package com.jordsta.stuff.items;

import com.jordsta.stuff.JCreativeTabs;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;
import net.minecraft.item.Item;

public class lightDust extends Item {
	public lightDust(){
		setUnlocalizedName("lightDust");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JCreativeTabs.TAB);
		RegisterHelper.registerItem(this);
	}
}