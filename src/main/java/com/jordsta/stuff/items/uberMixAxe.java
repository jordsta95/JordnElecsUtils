package com.jordsta.stuff.items;

import java.util.Set;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class uberMixAxe extends ItemPickaxe {
    public uberMixAxe(int i, ToolMaterial mat){
        super(mat);
    	setUnlocalizedName("uberMixAxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JordTab.JordTab);
        RegisterHelper.registerItem(this);
    }
    
    private static Material[] pickaxeMaterials = { Material.iron, Material.rock, Material.circuits, Material.glass, Material.piston, Material.anvil, Material.ice };
    private static Material[] spadeMaterials = { Material.grass, Material.ground, Material.sand, Material.clay, Material.snow, Material.craftedSnow };
    private static Material[] axeMaterials = { Material.wood, Material.leaves, Material.vine, Material.cactus, Material.circuits, Material.gourd };
    
    @Override
    public boolean canHarvestBlock(Block block, ItemStack stack)
    {
        if(block != Blocks.bedrock){
        	return true;
        }
       return false;
    }
    


}