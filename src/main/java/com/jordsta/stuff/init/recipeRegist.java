package com.jordsta.stuff.init;

import com.jordsta.stuff.Reference;
import com.jordsta.stuff.config.ConfigFile;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
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
        ItemStack netherstar = new ItemStack(Items.nether_star);
        ItemStack diaBlock = new ItemStack(Blocks.diamond_block);
        ItemStack superium = new ItemStack(itemRegist.superium);
        ItemStack gold = new ItemStack(Items.gold_ingot);
        ItemStack diaRod = new ItemStack(itemRegist.diamondRod);

        //Ultradian
        if(!ConfigFile.disableUltradian){
            GameRegistry.addRecipe(new ItemStack(itemRegist.ultraBar), new Object[]{
                    "SSS","SSS","SSS",'S',itemRegist.ultraShard
            });
            GameRegistry.addRecipe(new ItemStack(itemRegist.ultraCoal), new Object[]{
                    "SCC",'S',Items.coal,'C',itemRegist.ultraShard
            });
            GameRegistry.addRecipe(new ItemStack(itemRegist.ultraPick), new Object[]{
                    "SSS"," G "," G ",'S',itemRegist.ultraBar,'G',Items.stick
            });
            GameRegistry.addRecipe(new ItemStack(itemRegist.ultraSword), new Object[]{
                    "S","S","G",'S',itemRegist.ultraBar,'G',Items.stick
            });
            GameRegistry.addRecipe(new ItemStack(itemRegist.ultraShovel), new Object[]{
                    "S","G","G",'S',itemRegist.ultraBar,'G',Items.stick
            });
            GameRegistry.addRecipe(new ItemStack(itemRegist.ultraAxe), new Object[]{
                    "SS","SG"," G",'S',itemRegist.ultraBar,'G',Items.stick
            });
        }



        //Superium
        if(!ConfigFile.disableSuperium){
            GameRegistry.addRecipe(new ItemStack(itemRegist.superAxe), new Object[]{
                    "SS","SG"," G",'S',superium,'G',gold
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
            GameRegistry.addRecipe(new ItemStack(itemRegist.superHelmet), new Object[]{
                    "SSS","S S",'S',superium
            });
            GameRegistry.addRecipe(new ItemStack(itemRegist.superBoots), new Object[]{
                    "S S","S S",'S',superium
            });
            GameRegistry.addRecipe(new ItemStack(itemRegist.superLegs), new Object[]{
                    "SSS","S S","S S",'S',superium
            });
            GameRegistry.addRecipe(new ItemStack(itemRegist.superChest), new Object[]{
                    "S S","SSS","SSS",'S',superium
            });
        }

        //Uberium
        if(!ConfigFile.disableUberium){
            GameRegistry.addRecipe(new ItemStack(itemRegist.diamondRod), new Object[]{
                    "D  ", " D ", "  D", 'D', diamond
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
            });
            GameRegistry.addRecipe(new ItemStack(itemRegist.uberHelmet), new Object[]{
                    "SSS","S S",'S',unrefinedCurrency
            });
            GameRegistry.addRecipe(new ItemStack(itemRegist.uberBoots), new Object[]{
                    "S S","S S",'S',unrefinedCurrency
            });
            GameRegistry.addRecipe(new ItemStack(itemRegist.uberLegs), new Object[]{
                    "SSS","S S","S S",'S',unrefinedCurrency
            });
            GameRegistry.addRecipe(new ItemStack(itemRegist.uberChest), new Object[]{
                    "S S","SSS","SSS",'S',unrefinedCurrency
            });
        }

        GameRegistry.addRecipe(new ItemStack(blockRegist.blankGlass, 9), new Object[]{
                "GGG", "GGG", "GGG", 'G', new ItemStack(Blocks.glass)
        });
        GameRegistry.addRecipe(new ItemStack(itemRegist.lightDust),new Object[]{
        	"GRD",'G',new ItemStack(Items.glowstone_dust),'R', new ItemStack(Items.redstone),'D',diamond
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.dropLight), new Object[]{
        	" G ","GSG"," G ",'G',Items.glowstone_dust,'S',Blocks.sand
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.safetyTorch), new Object[]{
        	"G G","STS","STS",'G',itemRegist.lightDust,'S',Blocks.stone,'T',Blocks.torch
        });
        GameRegistry.addRecipe(new ItemStack(blockRegist.PortalFrame, 2), new Object[]{
                "SNS","EDE","SNS",'S',Blocks.obsidian,'N',Items.nether_star,'E',Blocks.end_stone,'D',Blocks.diamond_block
        });
        
        
        GameRegistry.addRecipe(new ItemStack(itemRegist.regenArmour), new Object[]{
            "GGG","G G","GGG",'G',Items.golden_apple
    });
        GameRegistry.addRecipe(new ItemStack(itemRegist.safePearlRod), new Object[]{
            " IE"," DI","G G",'I',Items.ender_eye,'E',Items.ender_pearl,'G',Items.ghast_tear
    });
        
        
        if(!ConfigFile.disableSuperium)
            GameRegistry.addRecipe(new ItemStack(GameRegistry.findItem(Reference.MODID, "portalIgniter")), new Object[]{
                "NS ","SSS","SD ",'S',itemRegist.superium,'N',Items.nether_star,'D',Items.diamond
            });
         else
            GameRegistry.addRecipe(new ItemStack(GameRegistry.findItem(Reference.MODID, "portalIgniter")), new Object[]{
                "NS ","SSS","SD ",'S',Items.diamond,'N',Items.nether_star,'D',Items.gold_ingot
            });
    }
    
    

    public static void AddGhostBlockRecipePlank(Block block, int meta){
        AddGhostBlockRecipe(block, Blocks.planks, meta);
    }

    public static void AddGhostBlockRecipe(Block block, Block material, int meta){
        GameRegistry.addRecipe(new ItemStack(block, 8), new Object[]{
                "BBB", "BGB", "BBB", 'B', new ItemStack(material, 1, meta), 'G', new ItemStack(blockRegist.blankGlass)
        });
    }
    
}
