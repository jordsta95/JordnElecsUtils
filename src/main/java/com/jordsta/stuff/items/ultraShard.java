package com.jordsta.stuff.items;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;

import net.minecraft.item.Item;

public class ultraShard extends Item {
	public ultraShard(){
        setCreativeTab(JordTab.JordTab);
        setUnlocalizedName("ultraShard");
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}

}
