package com.jordsta.stuff.items;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;
import net.minecraft.item.ItemAxe;

public class moneyAxe extends ItemAxe{
    public moneyAxe(int i, ToolMaterial mat){
        super(mat);
    	setUnlocalizedName("moneyAxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JordTab.JordTab);
        RegisterHelper.registerItem(this);
    }
}
