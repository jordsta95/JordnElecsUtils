package com.jordsta.stuff.items;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.init.itemRegist;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.common.ISpecialArmor.ArmorProperties;

public class uberArmour extends ItemArmor implements ISpecialArmor{

    public uberArmour(ArmorMaterial material, int armorType) {
        super(material, 0, armorType);
        setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
        setCreativeTab(JordTab.JordTab);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == itemRegist.uberChest || stack.getItem() == itemRegist.uberHelmet || stack.getItem() == itemRegist.uberBoots)
        {
            return Reference.MODID + ":models/armor/UberArmour_layer_1.png";
        }
        else if(stack.getItem() == itemRegist.uberLegs)
        {
            return Reference.MODID + ":models/armor/UberArmour_layer_2.png";
        }
        else{
            System.out.println("Invalid Item for Uber Armour");
            return null;
        }
    }

    @Override
    public ArmorProperties getProperties(EntityLivingBase player,
                                         ItemStack armor, DamageSource source, double damage, int slot) {
        if (source.isExplosion())
        {
            return new ArmorProperties(1, 1.0D, (int) 105.7);
        }
        if (source.setDamageBypassesArmor() != null)
        {
            return new ArmorProperties(1, 1.0D, 500);
        }

        if (source.equals(itemRegist.moneyBlade))
        {
            return new ArmorProperties(1, 1.0D, 500000);
        }
        if (source.causeMobDamage(player) != null)
        {
            return new ArmorProperties(1, 1.0D, (int) 105.7);
        }

        if (source.wither != null)
        {
            return new ArmorProperties(1, 1.0D, 500);
        }
        if (source.canHarmInCreative())
        {
            return new ArmorProperties(1, 1.0D, (int) 100);
        }
        if (source.causePlayerDamage(null) != null)
        {
            return new ArmorProperties(1, 1.0D, (int) 100);
        }

        if (slot == 0 || slot == 3)
        {
            return new ArmorProperties(0, 0.2D, 250);
        }
        return new ArmorProperties(0, 0.3D, 350);

    }

    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack,
                            DamageSource source, int damage, int slot) {
        // TODO Auto-generated method stub

    }

}