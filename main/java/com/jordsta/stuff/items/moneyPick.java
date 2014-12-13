package com.jordsta.stuff.items;

import com.jordsta.stuff.JCreativeTabs;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;
import net.minecraft.item.ItemPickaxe;

public class moneyPick extends ItemPickaxe{
    public moneyPick(int i, ToolMaterial mat){
        super(mat);
    	setUnlocalizedName("moneyPick");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JCreativeTabs.TAB);
        RegisterHelper.registerItem(this);
    }
}