package com.jordsta.stuff.init;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.blocks.safetyTorch;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import elec332.core.util.blocks.baseblock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Elec332 on 13-12-2014.
 */
public class blockRegist {

    public static Block endOre, safetyTorch, dropLight, blankGlass, superiumOre, ultraOre, PortalFrame;
    static CreativeTabs Tab = JordTab.JordTab;

    public static void Register(FMLPreInitializationEvent event) {
        ultraOre = Ore("ultraOre", itemRegist.ultraShard, 2, 20.0F, event);
        superiumOre = Ore("superiumOre", itemRegist.superium, 10, 16.0F, event);
        endOre = Ore("endOre", itemRegist.unrefinedCurrency, 20, 20.0F, event);
        PortalFrame = new baseblock(Material.rock, "PortalFrame", Tab, event, 1).setToolLevel("pickaxe", 20).setHardness(20.0f).setResistance(3.0f);
        safetyTorch = new safetyTorch();
        dropLight = new baseblock(Material.sand, "dropLight", Tab, event, 0).setHardness(20.0f).setResistance(3.0f).setStepSound(Block.soundTypeGlass).setLightLevel(1.0F);
        blankGlass = new baseblock(Material.glass, "blankGlass", Tab, event, 0).setNoOpaqueCube().setHardness(2.0F).setResistance(1.0F);
    }

    static Block Ore(String name, Item itemDropped, int harvestlevel, Float hardness, FMLPreInitializationEvent event){
        return new baseblock(Material.rock, name, Tab, event, 1).setItemDropped(itemDropped).setToolLevel("pickaxe", harvestlevel).setHardness(hardness).setResistance(3.0F);
    }
}


