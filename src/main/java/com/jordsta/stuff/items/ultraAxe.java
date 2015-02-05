package com.jordsta.stuff.items;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ultraAxe extends ItemAxe {
	public ultraAxe (int i, ToolMaterial mat){
	    super(mat);
		setUnlocalizedName("ultraAxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JordTab.JordTab);
	    RegisterHelper.registerItem(this);
	}

}
