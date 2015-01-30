package com.jordsta.stuff.init;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Main;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;
import com.jordsta.stuff.items.*;

import elec332.core.api.dimension.igniter;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Elec332 on 13-12-2014.
 */
public class itemRegist {

    public static final Item.ToolMaterial MONEY = EnumHelper.addToolMaterial("MONEY", 36, -1, 600.0F, 2.0F, 25);
    public static final Item.ToolMaterial MONEY2 = EnumHelper.addToolMaterial("MONEY2", 7, -1, 200.0F, 246.0F, 25);
    public static final Item.ToolMaterial SUPER = EnumHelper.addToolMaterial("SUPER", 24, 2000, 35.0F, 2.0F, 25);
    public static final Item.ToolMaterial SUPER2 = EnumHelper.addToolMaterial("SUPER2", 7, 2000, 75.0F, 36.0F, 25);
    public static final Item.ToolMaterial ULTRA = EnumHelper.addToolMaterial("ULTRA", 12, 624, 50.0F, 2.0F, 90);
    public static final Item.ToolMaterial ULTRA2 = EnumHelper.addToolMaterial("ULTRA", 12, 624, 50.0F, 24.0F, 90);
    
    public static ArmorMaterial SuperArmour = EnumHelper.addArmorMaterial("SuperArmour", 45, new int[]{3, 8, 6, 3}, 64);
    public static ArmorMaterial UberArmour = EnumHelper.addArmorMaterial("UberArmour", 45, new int[]{300, 800, 600, 300}, 64);
    
    public static Item unrefinedCurrency;
    public static Item moneyPick;
    public static Item lightDust;
    //public static Item ironNugget;
    public static Item moneyAxe;
    public static Item moneyShovel;
    public static Item moneyBlade;
    public static Item diamondRod;
    public static Item superium;
    public static Item superPick;
    public static Item superShovel;
    public static Item superAxe;
    public static Item superSword;
    public static Item superChest;
    public static Item superHelmet;
    public static Item superBoots;
    public static Item superLegs;
    public static Item uberChest;
    public static Item uberHelmet;
    public static Item uberBoots;
    public static Item uberLegs;
    public static Item uberMixAxe;
    public static Item ultraShard;
    public static Item ultraBar;
    public static Item ultraPick;
    public static Item ultraCoal;
    public static Item ultraSword;
    public static Item ultraShovel;
    public static Item ultraAxe;
    public static Item portalIgniter;
    
    
    public static void Register() {
    	new igniter(JordTab.JordTab, Main.dimensionID, "portalIgniter").setTextureName(Reference.MODID + ":" + "portalIgniter".substring(5));
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
        RegisterHelper.registerItem(superChest = new superArmour(SuperArmour, 1).setUnlocalizedName("superChest").setTextureName(Reference.MODID + ":" + "superChest".substring(5)));
        RegisterHelper.registerItem(superHelmet = new superArmour(SuperArmour, 0).setUnlocalizedName("superHelmet").setTextureName(Reference.MODID + ":" + "superHelmet".substring(5)));
        RegisterHelper.registerItem(superLegs = new superArmour(SuperArmour, 2).setUnlocalizedName("superLegs").setTextureName(Reference.MODID + ":" + "superLegs".substring(5)));
        RegisterHelper.registerItem(superBoots = new superArmour(SuperArmour, 3).setUnlocalizedName("superBoots").setTextureName(Reference.MODID + ":" + "superBoots".substring(5)));
        RegisterHelper.registerItem(uberChest = new uberArmour(UberArmour, 1).setUnlocalizedName("uberChest").setTextureName(Reference.MODID + ":" + "uberChest".substring(5)));
        RegisterHelper.registerItem(uberHelmet = new uberArmour(UberArmour, 0).setUnlocalizedName("uberHelmet").setTextureName(Reference.MODID + ":" + "uberHelmet".substring(5)));
        RegisterHelper.registerItem(uberLegs = new uberArmour(UberArmour, 2).setUnlocalizedName("uberLegs").setTextureName(Reference.MODID + ":" + "uberLegs".substring(5)));
        RegisterHelper.registerItem(uberBoots = new uberArmour(UberArmour, 3).setUnlocalizedName("uberBoots").setTextureName(Reference.MODID + ":" + "uberBoots".substring(5)));
        uberMixAxe = new uberMixAxe(20, MONEY);
        RegisterHelper.registerItem(ultraShard = new ultraShard());
        RegisterHelper.registerItem(ultraBar = new ultraBar());
        ultraPick = new ultraPick(20, ULTRA);
        RegisterHelper.registerItem(ultraCoal = new ultraCoal());
        ultraSword = new ultraSword(20, ULTRA2);
        ultraShovel = new ultraShovel(20, ULTRA);
        ultraAxe = new ultraAxe(20, ULTRA);
        RegisterHelper.registerItem(portalIgniter = new portalIgniter());
    }
    
}
