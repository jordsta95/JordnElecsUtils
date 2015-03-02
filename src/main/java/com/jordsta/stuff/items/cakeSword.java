package com.jordsta.stuff.items;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;

public class cakeSword extends ItemSword {

	public cakeSword(int i, ToolMaterial mat) {
		super(mat);
     	setUnlocalizedName("cakeSword");
 		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
 		setCreativeTab(JordTab.JordTab);
        RegisterHelper.registerItem(this);
	}


    public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side, float px, float py, float pz)
    {
        if (world.getBlock(x, y + 1, z) == Blocks.air)
        {
              world.setBlock(x, y + 1, z, Blocks.cake);
              
              return true;
        }
        return false;
    }

}
