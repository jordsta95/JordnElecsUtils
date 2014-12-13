package com.jordsta.stuff.init;

import com.jordsta.stuff.blocks.*;
import net.minecraft.block.Block;

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

    public static void Register() {
        endOre = new endOre();
        safetyTorch = new safetyTorch();
        dropLight = new dropLight();
        blankGlass = new blankGlass();
        secretStone = new secretStone();
        secretCobble = new secretCobble();
        secretDirt = new secretDirt();
        secretSand = new secretSand();
        secretGravel = new secretGravel();
        secretWoodO = new secretWoodO();
        secretWoodB = new secretWoodB();
        secretWoodS = new secretWoodS();
        secretWoodJ = new secretWoodJ();
        secretWoodA = new secretWoodA();
        secretWoodD = new secretWoodD();
    }
}
