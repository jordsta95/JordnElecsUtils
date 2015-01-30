package com.jordsta.stuff.init;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;

import elec332.core.api.dimension.DimensionAPI;
import elec332.core.helper.registerHelper;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class portalIgniter extends Item {
	public portalIgniter(){
    	setUnlocalizedName("portalIgniter");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JordTab.JordTab);
        RegisterHelper.registerItem(this);
	}
	
	
    public portalIgniter(CreativeTabs cTab, int DimID, String name) {
        this.setMaxStackSize(1);
        this.DimID = DimID;
    }

    int DimID;

    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer player, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
        ++par5;
        if (player.getCurrentEquippedItem() != null) {
            if (player.canPlayerEdit(par4, par5, par6, par7, par1ItemStack) && par3World.getBlock(par4, par5, par6).getMaterial() == Material.air) {
                if (DimensionAPI.getPortalFromDIM(DimID).tryToCreatePortal(par3World, par4, par5, par6) && par3World.isRemote) {
                    player.inventory.decrStackSize(player.inventory.currentItem, 1);
                }
                return true;
            }
        }
        return false;
    }
}
