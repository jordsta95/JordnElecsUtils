package com.jordsta.stuff.items;

import com.jordsta.stuff.JCreativeTabs;
import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;
import net.minecraft.item.ItemSword;

public class moneyBlade extends ItemSword{
    public moneyBlade(int i, ToolMaterial mat){
        super(mat);
    	setUnlocalizedName("moneyBlade");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JordTab.JordTab);
        RegisterHelper.registerItem(this);
    }
}
