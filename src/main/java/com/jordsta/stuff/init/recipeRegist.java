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
        ItemStack unrefinedCurrency = new ItemStack(itemRegist.unrefinedCurrency);
        ItemStack diamond = new ItemStack(Items.diamond);
        ItemStack blankGlass = new ItemStack(blockRegist.blankGlass);
        ItemStack netherstar = new ItemStack(Items.nether_star);
        ItemStack diaBlock = new ItemStack(Blocks.diamond_block);
        ItemStack superium = new ItemStack(itemRegist.superium);
        ItemStack gold = new ItemStack(Items.gold_ingot);
        ItemStack diaRod = new ItemStack(itemRegist.diamondRod);

        GameRegistry.addRecipe(new ItemStack(itemRegist.diamondRod), new Object[]{
                "D  ", " D ", "  D", 'D', diamond
        });
        GameRegistry.addRecipe(new ItemStack(itemRegist.unrefinedCurrency), new Object[]{
<<<<<<< HEAD:main/java/com/jordsta/stuff/init/recipeRegist.java
                "SSS", "SDS", "SSS", 'S', Items.nether_star, 'D', Blocks.diamond_block
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
=======
                "SIS", "IDI", "SIS", 'S', netherstar, 'D', diaBlock, 'S', superium
        });
        GameRegistry.addRecipe(new ItemStack(itemRegist.moneyAxe), new Object[]{
            "UU", "UG", " R", 'U', unrefinedCurrency, 'G', gold, 'R', diaRod
        });
        GameRegistry.addRecipe(new ItemStack(itemRegist.moneyBlade), new Object[]{
                " U ", "GUG", " R ", 'U', unrefinedCurrency, 'G', gold, 'R', diaRod
        });
        GameRegistry.addRecipe(new ItemStack(itemRegist.moneyShovel), new Object[]{
                "U", "G", "R", 'U', unrefinedCurrency, 'G', gold, 'R', diaRod
        });
        GameRegistry.addRecipe(new ItemStack(itemRegist.moneyPick), new Object[]{
                "UUU", " G ", " R ", 'U', unrefinedCurrency, 'G', gold, 'R', diaRod
>>>>>>> origin/master:src/main/java/com/jordsta/stuff/init/recipeRegist.java
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.blankGlass, 9), new Object[]{
                "GGG", "GGG", "GGG", 'G', new ItemStack(Blocks.glass)
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.secretCobble, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', new ItemStack(Blocks.cobblestone), 'G', blankGlass
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.secretDirt, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', new ItemStack(Blocks.dirt), 'G', blankGlass
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.secretSand, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', new ItemStack(Blocks.sand), 'G', blankGlass
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.secretGravel, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', new ItemStack(Blocks.gravel), 'G', blankGlass
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.secretWoodO, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', new ItemStack(Blocks.planks, 1, 0), 'G', blankGlass
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.secretWoodB, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', new ItemStack(Blocks.planks, 1, 1), 'G', blankGlass
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.secretWoodS, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', new ItemStack(Blocks.planks, 1, 2), 'G', blankGlass
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.secretWoodJ, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', new ItemStack(Blocks.planks, 1, 3), 'G', blankGlass
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.secretWoodA, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', new ItemStack(Blocks.planks, 1, 4), 'G', blankGlass
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.secretWoodD, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', new ItemStack(Blocks.planks, 1, 5), 'G', blankGlass
        });
<<<<<<< HEAD:main/java/com/jordsta/stuff/init/recipeRegist.java
=======
        GameRegistry.addRecipe(new ItemStack(itemRegist.lightDust),new Object[]{
        	"GRD",'G',new ItemStack(Items.glowstone_dust),'R', new ItemStack(Items.redstone),'D',diamond
        });
        GameRegistry.addRecipe(new ItemStack(itemRegist.superAxe), new Object[]{
        	"SS ","SG"," G",'S',superium,'G',gold
        });
        GameRegistry.addRecipe(new ItemStack(itemRegist.superPick), new Object[]{
        	"SSS"," G "," G ",'S',superium,'G',gold
        });
        GameRegistry.addRecipe(new ItemStack(itemRegist.superShovel), new Object[]{
        	"S","G","G",'S',superium,'G',gold
        });
        GameRegistry.addRecipe(new ItemStack(itemRegist.superSword), new Object[]{
        	" S "," S "," G ",'S', superium,'G',gold
        });
        GameRegistry.addRecipe(new ItemStack(itemRegist.superAxe), new Object[]{
        	"SSS","SDS","SSS",'S',new ItemStack(Items.emerald),'D',diaBlock
        });
>>>>>>> origin/master:src/main/java/com/jordsta/stuff/init/recipeRegist.java
    }
}
