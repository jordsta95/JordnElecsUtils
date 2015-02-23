package com.jordsta.stuff.integration.tinkers;

import java.util.List;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class UberiumToolParts extends Item
{
	@SideOnly(Side.CLIENT)
	private IIcon[] texture;
	
	final static String[] uberParts = new String[] {
		//arrow
		"arrow_head","arrow_shaft",
		//axe
		"axe_handle","axe_head","axe_head_broken",
		//battlaxe
		"battleaxe_back","battleaxe_backhead","battleaxe_binding","battleaxe_front","battleaxe_fronthead","battleaxe_fronthead_broken","battleaxe_handle","battleaxe_head","battleaxe_head_broken",
		//Zisteau
		"battlesign_handle","battlesign_head","battlesign_head_broken",
		//Broadsword
		"sword_accessory","sword_blade","sword_blade_broken","sword_handle",
		//Chisel
		"chisel_handle","chisel_head","chisel_head_broken",
		//Cleaver
		"cleaver_guard","cleaver_handle","cleaver_head","cleaver_head_broken","cleaver_shield",
		//Cutlass
		"cutlass_blade","cutlass_blade_broken","cutlass_guard","cutlass_handle",
		//Dagger
		"dagger_accessory","dagger_blade","dagger_blade_broken","dagger_handle",
		//Excavator
		"excavator_binding","excavator_grip","excavator_handle","excavator_handle","excavator_head","excavator_head_broken",
		//Rod
		"fishingrod","fishingrod_bobber",
		//Dinner time
		"frypan_handle","frypan_head","frypan_head_broken",
		//Hammer
		"hammer_back","hammer_front","hammer_handle","hammer_handle_broken","hammer_head",
		//longsword
		"longsword_accesory","longsword_blade","longsowrd_blade_broken","longsword_handle",
		//Lumberaxe
		"lumberaxe_binding","lumberaxe_handle","lumberaxe_head","lumberaxe_head_broken","lumberaxe_shield",
		//mattock
		"mattock_back","mattock_handle","mattock_head","mattock_head_broken",
		//pickaxe
		"pickaxe_accessory","pickaxe_handle","pickaxe_head","pickaxe_head_broken",
		//pickmattock
		"pickmattock_accessory","pickmattock_back","pickmattock_handle","pickmattock_head","pickmattock_head_broken",
		//rapier
		"rapier_accessory","rapier_blade","rapier_blade_broken","rapier_handle",
		//Sycthe
		"scythe_accessory","scythe_binding","sycthe_handle","scythe_head","scythe_head_broken",
		//Shortbow
		"bow_bottom","bow_bottom_1","bow_bottom_2","bow_bottom_3","bow_top","bot_top_1","bow_top_2","bow_top_3",
		//shovel
		"shovel_handle","shovel_head","shovel_head_broken"
	};
	
protected UberiumToolParts(){
	super();
	this.setCreativeTab(JordTab.JordTab);
	this.setHasSubtypes(true);
	
}

@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister iconRegister){
	texture = new IIcon[uberParts.length];
	
	for(int i = 0; i < uberParts.length; i++){
		texture[i] = iconRegister.registerIcon(Reference.MODID + ":" + "Uberium_" + uberParts[i]);
	}
}
@Override
@SideOnly(Side.CLIENT)
public void getSubItems(Item item, CreativeTabs creativeTabs, List list){
	for (int i = 0; i < uberParts.length; i++){
		list.add(new ItemStack(item, 1, i));
	}
}

@SideOnly(Side.CLIENT)
public IIcon getIcon(int side, int meta){
	return texture[meta];
}
	
}
