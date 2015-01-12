package com.jordsta.stuff.items;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;

import net.minecraft.item.Item;

public class ultraCoal extends Item {
	public ultraCoal(){
        setCreativeTab(JordTab.JordTab);
        setUnlocalizedName("ultraCoal");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
}
