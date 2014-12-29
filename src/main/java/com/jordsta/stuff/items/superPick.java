package com.jordsta.stuff.items;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class superPick extends ItemPickaxe {
public superPick(int i, ToolMaterial mat){
    super(mat);
	setUnlocalizedName("superPick");
	setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	setCreativeTab(JordTab.JordTab);
    RegisterHelper.registerItem(this);
}
}
