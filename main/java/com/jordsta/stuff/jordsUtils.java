package com.jordsta.stuff;

import com.jordsta.stuff.init.itemRegist;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class jordsUtils extends CreativeTabs {

    public jordsUtils(String tabLabel)
    {
        super(tabLabel);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
        return itemRegist.moneyPick;
    }

}
