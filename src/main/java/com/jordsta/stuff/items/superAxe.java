package com.jordsta.stuff.items;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class superAxe extends ItemAxe {
public superAxe(int i, ToolMaterial mat){
    super(mat);
	setUnlocalizedName("superAxe");
	setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	setCreativeTab(JordTab.JordTab);
    RegisterHelper.registerItem(this);
}
}
