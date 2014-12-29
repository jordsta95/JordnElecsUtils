package com.jordsta.stuff.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/**
 * Created by Elec332 on 13-12-2014.
 */
public class recipeRegist {

    public static void Register() {

        GameRegistry.addRecipe(new ItemStack(itemRegist.diamondRod), new Object[]{
                "D  ", " D ", "  D", 'D', Items.diamond
        });
        GameRegistry.addRecipe(new ItemStack(itemRegist.unrefinedCurrency), new Object[]{
                "SIS", "IDI", "SIS", 'S', Items.nether_star, 'D', Blocks.diamond_block, 'S',itemRegist.superium
        });
        GameRegistry.addRecipe(new ItemStack(itemRegist.moneyAxe), new Object[]{
            "UU", "UG", " R", 'U', itemRegist.unrefinedCurrency, 'G', Items.gold_ingot, 'R', itemRegist.diamondRod
    });
    GameRegistry.addRecipe(new ItemStack(itemRegist.moneyBlade), new Object[]{
            " U ", "GUG", " R ", 'U', itemRegist.unrefinedCurrency, 'G', Items.gold_ingot, 'R', itemRegist.diamondRod
    });
    GameRegistry.addRecipe(new ItemStack(itemRegist.moneyShovel), new Object[]{
            "U", "G", "R", 'U', itemRegist.unrefinedCurrency, 'G', Items.gold_ingot, 'R', itemRegist.diamondRod
    });
    GameRegistry.addRecipe(new ItemStack(itemRegist.moneyPick), new Object[]{
            "UUU", " G ", " R ", 'U', itemRegist.unrefinedCurrency, 'G', Items.gold_ingot, 'R', itemRegist.diamondRod
    });
        GameRegistry.addRecipe(new ItemStack(blockRegist.blankGlass, 9), new Object[]{
                "GGG", "GGG", "GGG", 'G', Blocks.glass
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.secretCobble, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', Blocks.cobblestone, 'G', blockRegist.blankGlass
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.secretDirt, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', Blocks.dirt, 'G', blockRegist.blankGlass
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.secretSand, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', Blocks.sand, 'G', blockRegist.blankGlass
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.secretGravel, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', Blocks.gravel, 'G', blockRegist.blankGlass
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.secretWoodO, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', new ItemStack(Blocks.planks, 1, 0), 'G', blockRegist.blankGlass
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.secretWoodB, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', new ItemStack(Blocks.planks, 1, 1), 'G', blockRegist.blankGlass
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.secretWoodS, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', new ItemStack(Blocks.planks, 1, 2), 'G', blockRegist.blankGlass
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.secretWoodJ, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', new ItemStack(Blocks.planks, 1, 3), 'G', blockRegist.blankGlass
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.secretWoodA, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', new ItemStack(Blocks.planks, 1, 4), 'G', blockRegist.blankGlass
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.secretWoodD, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', new ItemStack(Blocks.planks, 1, 5), 'G', blockRegist.blankGlass
        });
        GameRegistry.addRecipe(new ItemStack(itemRegist.lightDust),new Object[]{
        	"GRD",'G',Items.glowstone_dust,'R',Items.redstone,'D',Items.diamond
        });
        GameRegistry.addRecipe(new ItemStack(itemRegist.superAxe), new Object[]{
        	"SS ","SG"," G",'S',itemRegist.superium,'G',Items.gold_ingot
        });
        GameRegistry.addRecipe(new ItemStack(itemRegist.superPick), new Object[]{
        	"SSS"," G "," G ",'S',itemRegist.superium,'G',Items.gold_ingot
        });
        GameRegistry.addRecipe(new ItemStack(itemRegist.superShovel), new Object[]{
        	"S","G","G",'S',itemRegist.superium,'G',Items.gold_ingot
        });
        GameRegistry.addRecipe(new ItemStack(itemRegist.superSword), new Object[]{
        	"S","S","G",'S',itemRegist.superium,'G',Items.gold_ingot
        });
        GameRegistry.addRecipe(new ItemStack(itemRegist.superAxe), new Object[]{
        	"SSS","SDS","SSS",'S',Items.emerald,'D',Blocks.diamond_block
        });
    }
    
}
