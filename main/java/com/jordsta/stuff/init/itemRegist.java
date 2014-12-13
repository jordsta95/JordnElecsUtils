package com.jordsta.stuff.init;

import com.jordsta.stuff.helpers.RegisterHelper;
import com.jordsta.stuff.items.*;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Elec332 on 13-12-2014.
 */
public class itemRegist {
    public static final Item.ToolMaterial MONEY = EnumHelper.addToolMaterial("MONEY", 7, -1, 600.0F, 2.0F, 25);
    public static final Item.ToolMaterial MONEY2 = EnumHelper.addToolMaterial("MONEY2", 7, -1, 200.0F, 246.0F, 25);

    public static Item unrefinedCurrency;
    public static Item moneyPick;
    public static Item lightDust;
    public static Item ironNugget;
    public static Item moneyAxe;
    public static Item moneyShovel;
    public static Item moneyBlade;
    public static Item diamondRod;;

    public static void Register() {
        RegisterHelper.registerItem(unrefinedCurrency = new baseItem("unrefinedCurrency"));
        RegisterHelper.registerItem(moneyPick = new moneyPick(20, MONEY));
        RegisterHelper.registerItem(lightDust = new baseItem("lightDust"));
        RegisterHelper.registerItem(ironNugget = new baseItem("ironNugget"));
        RegisterHelper.registerItem(moneyBlade = new moneyBlade(20, MONEY2));
        RegisterHelper.registerItem(moneyShovel = new moneyShovel(20, MONEY));
        RegisterHelper.registerItem(moneyAxe = new moneyAxe(20, MONEY));
        RegisterHelper.registerItem(diamondRod = new baseItem("diamondRod"));
    }
}
