package com.jordsta.stuff.items;

import com.jordsta.stuff.JCreativeTabs;
import com.jordsta.stuff.Reference;
import net.minecraft.item.ItemAxe;

public class moneyAxe extends ItemAxe{
    public moneyAxe(int i, ToolMaterial mat){
        super(mat);
    	setUnlocalizedName("moneyAxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JCreativeTabs.TAB);
    }
}
