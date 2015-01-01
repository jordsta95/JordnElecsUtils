package com.jordsta.stuff.init;

import com.jordsta.stuff.helpers.RegisterHelper;
import com.jordsta.stuff.items.*;
import net.minecraft.item.Item;
<<<<<<< HEAD:main/java/com/jordsta/stuff/init/itemRegist.java
=======
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
>>>>>>> origin/master:src/main/java/com/jordsta/stuff/init/itemRegist.java
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
<<<<<<< HEAD:main/java/com/jordsta/stuff/init/itemRegist.java
        RegisterHelper.registerItem(unrefinedCurrency = new baseItem("unrefinedCurrency"));
        moneyPick = new moneyPick(20, MONEY);
        RegisterHelper.registerItem(lightDust = new baseItem("lightDust"));
        RegisterHelper.registerItem(ironNugget = new baseItem("ironNugget"));
        moneyBlade = new moneyBlade(20, MONEY2);
        moneyShovel = new moneyShovel(20, MONEY);
        moneyAxe = new moneyAxe(20, MONEY);
        RegisterHelper.registerItem(diamondRod = new baseItem("diamondRod"));
    }
=======
        RegisterHelper.registerItem(unrefinedCurrency = new unrefinedCurrency("unrefinedCurrency"));
        moneyPick = new moneyPick(20, MONEY);
        RegisterHelper.registerItem(lightDust = new unrefinedCurrency("lightDust"));
       // RegisterHelper.registerItem(ironNugget = new baseItem("ironNugget"));
        moneyBlade = new moneyBlade(20, MONEY2);
        moneyShovel = new moneyShovel(20, MONEY);
        moneyAxe = new moneyAxe(20, MONEY);
        RegisterHelper.registerItem(diamondRod = new unrefinedCurrency("diamondRod"));
        RegisterHelper.registerItem(superium = new superium("superium"));
        superAxe = new superAxe(20, SUPER);
        superPick = new superPick(20, SUPER);
        superShovel = new superShovel(20, SUPER);
        superSword = new superSword(20, SUPER2);
        RegisterHelper.registerItem(superChest = new superChest(SuperArmour, 1));
        RegisterHelper.registerItem(superHelmet = new superHelmet(SuperArmour, 0));
        RegisterHelper.registerItem(superLegs = new superLegs(SuperArmour, 2));
        RegisterHelper.registerItem(superBoots = new superBoots(SuperArmour, 3));
    }
    
>>>>>>> origin/master:src/main/java/com/jordsta/stuff/init/itemRegist.java
}
