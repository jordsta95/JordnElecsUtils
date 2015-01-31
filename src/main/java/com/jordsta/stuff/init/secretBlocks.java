package com.jordsta.stuff.init;

import com.jordsta.stuff.JordTab;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import elec332.core.helper.modInfoHelper;
import elec332.core.helper.registerHelper;
import elec332.core.helper.stringHelper;
import elec332.core.util.blocks.baseblock;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockWood;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.ArrayList;

/**
 * Created by Elec332 on 31-1-2015.
 */
public class secretBlocks {

    @SuppressWarnings("unchecked")
    static ArrayList<String> plankTypes = stringHelper.convertStringArrayToArraylist(BlockWood.field_150096_a);
    @SuppressWarnings("unchecked")
    static ArrayList<String> miscBlocks = stringHelper.convertStringArrayToArraylist(new String[]{"sand", "gravel", "stone", "cobblestone", "dirt"});

    public static void Register(FMLPreInitializationEvent event) {
        for (int i = 0; i < plankTypes.size(); i++) {
            String name = plankTypes.get(i);
            recipeRegist.AddGhostBlockRecipePlank(new baseblock(Material.plants, "Ghost" + name, JordTab.JordTab, event, 1).setGhost().setBlockTextureName("minecraft:planks_" + name), i);
        }

        for (String name : miscBlocks) {
            if (name.equalsIgnoreCase("sand") || name.equalsIgnoreCase("gravel"))
                recipeRegist.AddGhostBlockRecipe(new FallingGhostBlock(name, event), GameRegistry.findBlock("minecraft", name), 0);
            else
                recipeRegist.AddGhostBlockRecipe(new baseblock(Material.plants, "Ghost" + name, JordTab.JordTab, event, 1).setGhost().setBlockTextureName("minecraft:" + name),GameRegistry.findBlock("minecraft", name), 0);
        }
    }
}

    class FallingGhostBlock extends BlockFalling {
        public FallingGhostBlock(String name, FMLPreInitializationEvent event) {
            super(Material.plants);
            setCreativeTab(JordTab.JordTab);
            this.name = name;
            setBlockName(modInfoHelper.getModID(event) + ".Ghost" + name);
            registerHelper.registerBlock(this, "Ghost" + name);
        }

        String name;

        @Override
        public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
            return null;
        }

        public boolean isOpaqueCube() {
            return false;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public void registerBlockIcons(IIconRegister iconRegister) {
            blockIcon = iconRegister.registerIcon("minecraft:" + name);
        }
    }
