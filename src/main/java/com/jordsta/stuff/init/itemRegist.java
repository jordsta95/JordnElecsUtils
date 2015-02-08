package com.jordsta.stuff.init;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Main;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.config.ConfigFile;
import com.jordsta.stuff.helpers.RegisterHelper;
import com.jordsta.stuff.items.superArmour;
import com.jordsta.stuff.items.uberArmour;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import elec332.core.api.dimension.Igniter;
import elec332.core.util.items.baseItem;
import elec332.core.util.items.tools.baseAxe;
import elec332.core.util.items.tools.basePickaxe;
import elec332.core.util.items.tools.baseShovel;
import elec332.core.util.items.tools.baseSword;
import net.minecraft.creativetab.CreativeTabs;
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
    
    public static Item unrefinedCurrency, lightDust, diamondRod;
    public static Item moneyPick, moneyAxe, moneyShovel, moneyBlade;
    public static Item superium, superPick, superShovel, superAxe, superSword, superChest, superHelmet, superBoots, superLegs;
    public static Item uberChest, uberHelmet, uberBoots, uberLegs, uberMixAxe;
    public static Item ultraShard, ultraBar, ultraPick, ultraCoal, ultraSword, ultraShovel, ultraAxe;
    

    static CreativeTabs Tab = JordTab.JordTab;
    
    /*Post 0.7 from here on out. THIS WILL BE MESSY. No, I won't clean it up unless I see fit
    Also, I will not accept pull requests that only change this code!
      */
  
    
    public static void Register(FMLPreInitializationEvent event) {
        new Igniter(JordTab.JordTab, Main.dimensionID, "portalIgniter").setTextureName(Reference.MODID + ":" + "igniter");

         lightDust = new baseItem("lightDust", Tab, event);

        //Ultradian
        if(!ConfigFile.disableUltradian){
            ultraShard = new baseItem("ultraShard", Tab, event);
            ultraBar = new baseItem("ultraBar", Tab, event);
            ultraCoal = new baseItem("ultraCoal", Tab, event);
            if(!ConfigFile.disableSuperium)
                ultraPick = Pickaxe(ULTRA, "ultraPick", event);
            else
                ultraPick = Pickaxe(SUPER, "ultraPick", event);
            ultraAxe = Axe(ULTRA, "ultraAxe", event);
            ultraShovel = Shovel(ULTRA, "ultraShovel", event);
            ultraSword = Sword(ULTRA2, "ultraSword", event);
        }

        //Superium
        if(!ConfigFile.disableSuperium){
            superium = new baseItem("superium", Tab, event);
            superPick = Pickaxe(SUPER, "superPick", event);
            superAxe = Axe(SUPER, "superAxe", event);
            superShovel = Shovel(SUPER, "superShovel", event);
            superSword = Sword(SUPER2, "superSword", event);
            RegisterHelper.registerItem(superChest = new superArmour(SuperArmour, 1).setUnlocalizedName("superChest").setTextureName(Reference.MODID + ":superChest"));
            RegisterHelper.registerItem(superHelmet = new superArmour(SuperArmour, 0).setUnlocalizedName("superHelmet").setTextureName(Reference.MODID + ":superHelmet"));
            RegisterHelper.registerItem(superLegs = new superArmour(SuperArmour, 2).setUnlocalizedName("superLegs").setTextureName(Reference.MODID + ":superLegs"));
            RegisterHelper.registerItem(superBoots = new superArmour(SuperArmour, 3).setUnlocalizedName("superBoots").setTextureName(Reference.MODID + ":superBoots"));
        }

        //Uberium
        if(!ConfigFile.disableUberium){
            diamondRod = new baseItem("diamondRod", Tab, event);
            unrefinedCurrency = new baseItem("unrefinedCurrency", Tab, event);
            moneyPick = Pickaxe(MONEY, "moneyPick", event);
            moneyAxe = Axe(MONEY, "moneyAxe", event);
            moneyShovel = Shovel(MONEY, "moneyShovel", event);
            moneyBlade = Sword(MONEY2, "moneyBlade", event);
            RegisterHelper.registerItem(uberChest = new uberArmour(UberArmour, 1).setUnlocalizedName("uberChest").setTextureName(Reference.MODID + ":uberChest"));
            RegisterHelper.registerItem(uberHelmet = new uberArmour(UberArmour, 0).setUnlocalizedName("uberHelmet").setTextureName(Reference.MODID + ":uberHelmet"));
            RegisterHelper.registerItem(uberLegs = new uberArmour(UberArmour, 2).setUnlocalizedName("uberLegs").setTextureName(Reference.MODID + ":uberLegs"));
            RegisterHelper.registerItem(uberBoots = new uberArmour(UberArmour, 3).setUnlocalizedName("uberBoots").setTextureName(Reference.MODID + ":uberBoots"));
            //uberMixAxe = new uberMixAxe(20, MONEY); -- We don't talk about this!
        }
        
        

        /*Post 0.7 from here on out. THIS WILL BE MESSY. No, I won't clean it up unless I see fit
        Also, I will not accept pull requests that only change this code!
          */


    }

    static Item Axe(Item.ToolMaterial material, String name, FMLPreInitializationEvent event){
        return new baseAxe(material, name, Tab, event);
    }

    static Item Pickaxe(Item.ToolMaterial material, String name, FMLPreInitializationEvent event){
        return new basePickaxe(material, name, Tab, event);
    }

    static Item Shovel(Item.ToolMaterial material, String name, FMLPreInitializationEvent event){
        return new baseShovel(material, name, Tab, event);
    }

    static Item Sword(Item.ToolMaterial material, String name, FMLPreInitializationEvent event){
        return new baseSword(material, name, Tab, event);
    }
}
