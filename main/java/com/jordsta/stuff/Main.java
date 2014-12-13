package com.jordsta.stuff;

import com.jordsta.stuff.blocks.*;
import com.jordsta.stuff.items.*;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class Main
{
	//Proxies
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;

	//Blocks
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
    
    
  
    //Items
    public static Item unrefinedCurrency;
    public static Item moneyPick;
    public static Item lightDust;
    public static Item ironNugget;
    public static Item moneyAxe;
    public static Item moneyShovel;
    public static Item moneyBlade;
    public static Item diamondRod;
    
    //Tool Material
    public static final Item.ToolMaterial MONEY = EnumHelper.addToolMaterial("MONEY", 7, -1, 600.0F, 2.0F, 25);
    public static final Item.ToolMaterial MONEY2 = EnumHelper.addToolMaterial("MONEY2", 7, -1, 200.0F, 246.0F, 25);
    
    
    
    @EventHandler
    public void preInit (FMLPreInitializationEvent event)
    {
    	
    	
    	
    	//World gen
    	GameRegistry.registerWorldGenerator(new endOreGen(), -1);
    	

    	
    	//New Block
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
    	
    	
    	//New Items
    	unrefinedCurrency = new unrefinedCurrency();
    	moneyPick = new moneyPick(20, MONEY);
    	lightDust = new lightDust();
    	ironNugget = new ironNugget();
    	moneyBlade = new moneyBlade(20, MONEY2);
    	moneyShovel = new moneyShovel(20, MONEY);
    	moneyAxe = new moneyAxe(20, MONEY);
    	diamondRod = new diamondRod();
    	
    	//Register Blocks
    	RegisterHelper.registerBlock(endOre);
    	RegisterHelper.registerBlock(safetyTorch);
    	RegisterHelper.registerBlock(dropLight);
    	RegisterHelper.registerBlock(blankGlass);
    	RegisterHelper.registerBlock(secretStone);
    	RegisterHelper.registerBlock(secretCobble);
    	RegisterHelper.registerBlock(secretDirt);
    	RegisterHelper.registerBlock(secretSand);
    	RegisterHelper.registerBlock(secretGravel);
    	RegisterHelper.registerBlock(secretWoodA);
    	RegisterHelper.registerBlock(secretWoodB);
    	RegisterHelper.registerBlock(secretWoodD);
    	RegisterHelper.registerBlock(secretWoodJ);
    	RegisterHelper.registerBlock(secretWoodO);
    	RegisterHelper.registerBlock(secretWoodS);
    	
    	
    	
    	//Register Items
    	RegisterHelper.registerItem(unrefinedCurrency);
    	RegisterHelper.registerItem(moneyPick);
    	RegisterHelper.registerItem(lightDust);
    	//RegisterHelper.registerItem(ironNugget);
    	RegisterHelper.registerItem(moneyAxe);
    	RegisterHelper.registerItem(moneyBlade);
    	RegisterHelper.registerItem(moneyShovel);
    	RegisterHelper.registerItem(diamondRod);   
    	
    	//OreDict
    	OreDictionary.registerOre("nuggetIron", new ItemStack(ironNugget));
    	
    	
    	//Recipes
    	//GameRegistry.addRecipe(new ItemStack(crafting), new Object[]{
    	//"AAA","AAA","AAA",'A', craftUsing;
    	GameRegistry.addRecipe(new ItemStack(Main.diamondRod),new Object[]{
    		"D  "," D ","  D",'D',Items.diamond
    	});
    	GameRegistry.addRecipe(new ItemStack(Main.unrefinedCurrency),new Object[]{
    		"SSS","SDS","SSS",'S',Items.nether_star,'D',Blocks.diamond_block
    	});
    	GameRegistry.addRecipe(new ItemStack(Main.moneyAxe),new Object[]{
    		"UU","UG"," R",'U',Main.unrefinedCurrency,'G',Items.gold_ingot,'R',Main.diamondRod
    	});
    	GameRegistry.addRecipe(new ItemStack(Main.moneyBlade),new Object[]{
    		" U ","GUG"," R ",'U',Main.unrefinedCurrency,'G',Items.gold_ingot,'R',Main.diamondRod
    	});
    	GameRegistry.addRecipe(new ItemStack(Main.moneyShovel),new Object[]{
    		"U","G","R",'U',Main.unrefinedCurrency,'G',Items.gold_ingot,'R',Main.diamondRod
    	});
    	GameRegistry.addRecipe(new ItemStack(Main.moneyPick),new Object[]{
    		"UUU"," G "," R ",'U',Main.unrefinedCurrency,'G',Items.gold_ingot,'R',Main.diamondRod
    	});
    	GameRegistry.addRecipe(new ItemStack(Main.blankGlass, 9),new Object[]{
    		"GGG","GGG","GGG",'G',Blocks.glass
    	});
    	GameRegistry.addRecipe(new ItemStack(Main.secretCobble, 8),new Object[]{
    		"BBB","BGB","BBB",'B',Blocks.cobblestone,'G',Main.blankGlass
    	});
    	GameRegistry.addRecipe(new ItemStack(Main.secretDirt, 8),new Object[]{
    		"BBB","BGB","BBB",'B',Blocks.dirt,'G',Main.blankGlass
    	});
    	GameRegistry.addRecipe(new ItemStack(Main.secretSand, 8),new Object[]{
    		"BBB","BGB","BBB",'B',Blocks.sand,'G',Main.blankGlass
    	});
    	GameRegistry.addRecipe(new ItemStack(Main.secretGravel, 8),new Object[]{
    		"BBB","BGB","BBB",'B',Blocks.gravel,'G',Main.blankGlass
    	});
    	GameRegistry.addRecipe(new ItemStack(Main.secretWoodO, 8),new Object[]{
    		"BBB","BGB","BBB",'B',new ItemStack(Blocks.planks, 1, 0),'G',Main.blankGlass
    	});
    	GameRegistry.addRecipe(new ItemStack(Main.secretWoodB, 8),new Object[]{
    		"BBB","BGB","BBB",'B',new ItemStack(Blocks.planks, 1, 1),'G',Main.blankGlass
    	});
    	GameRegistry.addRecipe(new ItemStack(Main.secretWoodS, 8),new Object[]{
    		"BBB","BGB","BBB",'B',new ItemStack(Blocks.planks, 1, 2),'G',Main.blankGlass
    	});
    	GameRegistry.addRecipe(new ItemStack(Main.secretWoodJ, 8),new Object[]{
    		"BBB","BGB","BBB",'B',new ItemStack(Blocks.planks, 1, 3),'G',Main.blankGlass
    	});
    	GameRegistry.addRecipe(new ItemStack(Main.secretWoodA, 8),new Object[]{
    		"BBB","BGB","BBB",'B',new ItemStack(Blocks.planks, 1, 4),'G',Main.blankGlass
    	});
    	GameRegistry.addRecipe(new ItemStack(Main.secretWoodD, 8),new Object[]{
    		"BBB","BGB","BBB",'B',new ItemStack(Blocks.planks, 1, 5),'G',Main.blankGlass
    	});
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
    	proxy.registerTileEntities();
    }
}
