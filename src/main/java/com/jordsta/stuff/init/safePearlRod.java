package com.jordsta.stuff.init;

import com.jordsta.stuff.EntitySafePearl;
import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;

import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class safePearlRod extends Item {
	
	public safePearlRod() {
		setUnlocalizedName("safePearlRod");
 		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
 		setCreativeTab(JordTab.JordTab);
        RegisterHelper.registerItem(this);
	}

	
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (par3EntityPlayer.ridingEntity != null)
        {
            return par1ItemStack;
        }
        else
        {
            if (par3EntityPlayer.inventory.hasItem(Items.ender_pearl))
            {
                par2World.playSoundAtEntity(par3EntityPlayer, "portal.travel", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
                par1ItemStack.damageItem(10, par3EntityPlayer);
 
                if (!par2World.isRemote)
                {
                    par2World.spawnEntityInWorld(new EntitySafePearl(par2World));
                }
            }
            return par1ItemStack;
 
        }
    }
}
