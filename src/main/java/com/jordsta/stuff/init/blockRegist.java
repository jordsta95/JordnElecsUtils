package com.jordsta.stuff.init;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.blocks.*;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import elec332.core.util.blocks.baseblock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWood;
import net.minecraft.block.material.Material;

/**
 * Created by Elec332 on 13-12-2014.
 */
public class blockRegist {

    public static Block endOre;
    public static Block safetyTorch;
    public static Block dropLight;
    public static Block blankGlass;
    public static Block secretStone;
    public static Block secretDirt;
    public static Block secretWoodO;
    public static Block secretWoodB;
    public static Block secretWoodS;
    public static Block secretWoodJ;
    public static Block secretWoodD;
    public static Block secretWoodA;
    public static Block secretCobble;
    public static Block secretGravel;
    public static Block secretSand;
    public static Block superiumOre;
    public static Block ultraOre;
    public static Block horizontalPortal;

    public static void Register(FMLPreInitializationEvent event) {
        for (int i = 0; i < BlockWood.field_150096_a.length; i++) {
            String name = BlockWood.field_150096_a[i];
            new baseblock(Material.plants, "Ghost" + name, JordTab.JordTab, event, 1).setGhost().setBlockTextureName("minecraft:planks_" + name);
        }

        endOre = new endOre();
        safetyTorch = new safetyTorch();
        dropLight = new dropLight();
        blankGlass = new blankGlass();
        secretStone = new secretStone();
        secretCobble = new secretCobble();
        secretDirt = new secretDirt();
        secretSand = new secretSand();
        secretGravel = new secretGravel();
        superiumOre = new superiumOre();
        ultraOre = new ultraOre();
    }
}


