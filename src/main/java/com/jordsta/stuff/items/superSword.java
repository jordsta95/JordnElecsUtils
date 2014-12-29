package com.jordsta.stuff.items;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class superSword extends ItemSword {
	public superSword(int i, ToolMaterial mat){
	    super(mat);
		setUnlocalizedName("superSword");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JordTab.JordTab);
	    RegisterHelper.registerItem(this);
	}

}
