package com.jordsta.stuff.items;

import com.jordsta.stuff.JCreativeTabs;
import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;
import net.minecraft.item.ItemSpade;

public class moneyShovel extends ItemSpade{
    public moneyShovel(int i, ToolMaterial mat){
        super(mat);
    	setUnlocalizedName("moneyShovel");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JordTab.JordTab);
        RegisterHelper.registerItem(this);
    }
}

