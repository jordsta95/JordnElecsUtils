package com.jordsta.stuff.items;

//import com.jordsta.stuff.EntitySafePearl;
import java.util.List;

import com.jordsta.stuff.EntitySafePearl;
import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
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

	/**
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
	
**/
	   public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	    {
	        if (par3EntityPlayer.ridingEntity != null)
	        {
	            return par1ItemStack;
	        }
	        else
	        {
	            par2World.playSoundAtEntity(par3EntityPlayer, "portal.travel", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	            par1ItemStack.damageItem(10, par3EntityPlayer);
	 
	            if (!par2World.isRemote)
	            {
	                par2World.spawnEntityInWorld(new EntityEnderPearl(par2World, par3EntityPlayer));
	            }
	            return par1ItemStack;
	        }
	    }
	
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("This will throw 'safe pearls' in the future");
    }

}
