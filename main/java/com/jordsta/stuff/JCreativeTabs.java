package com.jordsta.stuff;

import com.jordsta.stuff.init.itemRegist;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class JCreativeTabs
{
    public static final net.minecraft.creativetab.CreativeTabs TAB = new CreativeTabs(Reference.MODID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return itemRegist.moneyPick;
        }
    };
}
