package com.jordsta.stuff.items;

import java.util.List;

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
import com.jordsta.stuff.init.itemRegist;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

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
			return Reference.MODID + ":models/armor/RegenArmour_1.png";
		}
		else if(stack.getItem() == itemRegist.regenArmour1)
		{
			return Reference.MODID + ":models/armor/RegenArmour_2.png";
		}
				else{
			System.out.println("Invalid Item for Regen Armour");
		return null;
	}
	}
	
	
	
	
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
	if(player.getCurrentArmor(1) != null){
		ItemStack helmet2 = player.getCurrentArmor(3);
		ItemStack plate2 = player.getCurrentArmor(2);
		ItemStack legs2 = player.getCurrentArmor(1);
		ItemStack boots = player.getCurrentArmor(0);
		if(legs2.getItem() == itemRegist.regenArmour)                                                                                                                                                  
		{
			player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 5, 2));
			itemStack.damageItem(10, player);
		}
}
	if(player.getCurrentArmor(2) != null){
		ItemStack helmet2 = player.getCurrentArmor(3);
		ItemStack plate2 = player.getCurrentArmor(2);
		ItemStack legs2 = player.getCurrentArmor(1);
		ItemStack boots = player.getCurrentArmor(0);
		if(plate2.getItem() == itemRegist.regenArmour)                                                                                                                                                  
		{
			player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 5, 2));
			itemStack.damageItem(10, player);
		}
}
	}	
	

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("Who needs golden apples?");
    }
	
}