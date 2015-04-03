package com.jordsta.stuff.items;

import java.util.List;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elec332.core.helper.RegisterHelper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ingots extends Item 
{
	@SideOnly(Side.CLIENT)
	private IIcon[] texture;
	
	final static String[] type = new String[] {
	"Copper","Lead","Tin","Ferrous","Aluminium","Silver"
	};
	
	public ingots(){
		super();
		this.setCreativeTab(JordTab.JordTab);
		this.setHasSubtypes(true);
		RegisterHelper.registerItem(this, "ingots");
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item."+Reference.MODID+"."+type[stack.getItemDamage()];
		}


	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		texture = new IIcon[type.length];
		for(int i = 0; i < type.length; i++){
			texture[i] = iconRegister.registerIcon(Reference.MODID + ":" + "ingot" + type[i]);
		}
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs creativeTabs, List list){
		for (int i = 0; i < type.length; i++){
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int meta) {
		return texture[meta];
	}


}
