package com.jordsta.stuff;

import com.jordsta.stuff.init.blockRegist;
import com.jordsta.stuff.init.itemRegist;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Elec332 on 13-12-2014.
 */
public class JordTab {
    public static CreativeTabs JordTab = new CreativeTabs("JordTab") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem()
        {
            return itemRegist.moneyPick != null ? itemRegist.moneyPick : Item.getItemFromBlock(blockRegist.dropLight);
        }
    };
}
