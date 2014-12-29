package com.jordsta.stuff.items;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;

import net.minecraft.item.Item;

public class superium extends Item {
	public superium(String name){
        setCreativeTab(JordTab.JordTab);
        setUnlocalizedName(name);
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
    }

}
