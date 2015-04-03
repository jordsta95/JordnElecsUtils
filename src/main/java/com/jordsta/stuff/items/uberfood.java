package com.jordsta.stuff.items;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class uberfood extends ItemFood {

	public uberfood(int heal, float saturation, boolean wolfMeat){
		super(heal, saturation, wolfMeat);
     	setUnlocalizedName("uberfood");
 		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
 		setCreativeTab(JordTab.JordTab);
        RegisterHelper.registerItem(this);		
	}
}
