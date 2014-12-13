package com.jordsta.stuff.init;

import com.jordsta.stuff.items.*;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Elec332 on 13-12-2014.
 */
public class itemRegist {
    public static final Item.ToolMaterial MONEY = EnumHelper.addToolMaterial("MONEY", 7, -1, 200.0F, 200.0F, 25);

    public static Item unrefinedCurrency;
    public static Item moneyPick;
    public static Item lightDust;
    public static Item ironNugget;
    public static Item moneyAxe;
    public static Item moneyShovel;
    public static Item moneyBlade;

    public static void Register() {
        unrefinedCurrency = new unrefinedCurrency();
        moneyPick = new moneyPick(20, MONEY);
        lightDust = new lightDust();
        ironNugget = new ironNugget();
        moneyBlade = new moneyBlade(20, MONEY);
        moneyShovel = new moneyShovel(20, MONEY);
        moneyAxe = new moneyAxe(20, MONEY);
    }
}
