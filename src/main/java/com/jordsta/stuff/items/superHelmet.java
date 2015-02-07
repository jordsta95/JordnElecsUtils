package com.jordsta.stuff.items;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.init.itemRegist;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class superHelmet extends ItemArmor {

	public superHelmet(ArmorMaterial material, int armorType) {
		super(material, 0, armorType);
    	setUnlocalizedName("superHelmet");
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
