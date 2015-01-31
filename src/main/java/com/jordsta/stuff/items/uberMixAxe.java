package com.jordsta.stuff.items;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import com.jordsta.stuff.helpers.RegisterHelper;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class uberMixAxe extends ItemPickaxe {
    public uberMixAxe(int i, ToolMaterial mat){
        super(mat);
    	setUnlocalizedName("uberMixAxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JordTab.JordTab);
        RegisterHelper.registerItem(this);
    }

    @Override
    public boolean canHarvestBlock(Block block, ItemStack stack)
    {
        return block != Blocks.bedrock;
    }
}
