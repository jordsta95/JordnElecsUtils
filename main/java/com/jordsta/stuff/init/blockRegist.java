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

    public static void Register() {
        endOre = new endOre();
        safetyTorch = new safetyTorch();
        dropLight = new dropLight();
        blankGlass = new blankGlass();
        secretStone = new secretStone();
    }
}
