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
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;

public class superChest extends ItemArmor{

	public superChest(ArmorMaterial material, int armorType) {
		super(material, 0, armorType);
    	setUnlocalizedName("superChest");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JordTab.JordTab);
	}

	@Override
public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == itemRegist.superChest || stack.getItem() == itemRegist.superHelmet || stack.getItem() == itemRegist.superBoots)
		{
			return Reference.MODID + ":models/armor/SuperArmour_layer_1.png";
		}
		else if(stack.getItem() == itemRegist.superLegs)
		{
			return Reference.MODID + ":models/armor/SuperArmour_layer_2.png";
		}
				else{
			System.out.println("Invalid Item for Super Armour");
		return null;
	}
	}


}