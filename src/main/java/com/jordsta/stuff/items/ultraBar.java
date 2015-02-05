package com.jordsta.stuff.items;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;

import net.minecraft.item.Item;

public class ultraBar extends Item {
	public ultraBar(){
        setCreativeTab(JordTab.JordTab);
        setUnlocalizedName("ultraBar");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
}
