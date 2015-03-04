package com.jordsta.stuff.init;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;

public class regenArmour extends ItemArmor {

	public regenArmour(ArmorMaterial material, int armorType) {
		super(material, 0, armorType);
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JordTab.JordTab);
	}

	@Override
public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == itemRegist.regenArmour)                        
		{
			return Reference.MODID + ":models/armor/RegenArmour_layer_1.png";
		}
		else if(stack.getItem() == itemRegist.regenArmour)
		{
			return Reference.MODID + ":models/armor/SuperArmour_layer_2.png";
		}
				else{
			System.out.println("Invalid Item for Regen Armour");
		return null;
	}
	}
	
	
	
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
	if(player.getCurrentArmor(1) != null || player.getCurrentArmor(2) != null){
		ItemStack helmet2 = player.getCurrentArmor(3);
		ItemStack plate2 = player.getCurrentArmor(2);
		ItemStack legs2 = player.getCurrentArmor(1);
		ItemStack boots = player.getCurrentArmor(0);
		if(legs2.getItem() == itemRegist.regenArmour || plate2.getItem() == itemRegist.regenArmour)                                                                                                                                                  
		{
			player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 5, 2));
			itemStack.damageItem(10, player);
		}
}
	}	
}