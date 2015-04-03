package com.jordsta.stuff.items;

import thaumcraft.api.IGoggles;
import thaumcraft.api.nodes.IRevealer;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.init.itemRegist;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;



public class visViewer extends ItemArmor implements IGoggles, IRevealer{
	

	public visViewer(ArmorMaterial material, int armorType) {
		super(material, 0, armorType);
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JordTab.JordTab);
	}
	
	@Override
	public boolean showNodes(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

	@Override
	public boolean showIngamePopups(ItemStack itemstack, EntityLivingBase player) {
		return true;
	}

	@Override
public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == itemRegist.visViewerS)
		{
			return Reference.MODID + ":models/armor/SuperArmour_layer_vis.png";
		}
		if(stack.getItem() == itemRegist.visViewerU)
		{
			return Reference.MODID + ":models/armor/UberArmour_layer_vis.png";
		}

				else{
			System.out.println("Invalid Item for Vis Viewing Armour");
		return null;
	}
}
	
	
	
}