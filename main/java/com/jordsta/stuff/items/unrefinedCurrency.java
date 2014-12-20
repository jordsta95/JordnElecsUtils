package com.jordsta.stuff.items;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import net.minecraft.item.Item;

/**
 * Created by Elec332 on 13-12-2014.
 */
public class unrefinedCurrency extends Item{
    public unrefinedCurrency(String name){
        setCreativeTab(JordTab.JordTab);
        setUnlocalizedName(name);
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
    }
}
