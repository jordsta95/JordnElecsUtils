package com.jordsta.stuff.dimensions;

import com.jordsta.stuff.Main;
import com.jordsta.stuff.init.blockRegist;
import elec332.core.api.dimension.IDimAPIProvider;
import net.minecraft.block.Block;
import net.minecraft.world.WorldProvider;

/**
 * Created by Elec332 on 29-1-2015.
 */
public class DimInfo implements IDimAPIProvider {

    /**
     * Returns the Dimension ID of custom dimension
     */
    @Override
    public int getDimID() {
        return Main.dimensionID;
    }

    /**
     * Returns the WordProvider of custom dimension
     */
    @Override
    public Class<? extends WorldProvider> getWorldProvider() {
        return JordsUtilsDimension.class;
    }

    /**
     * Returns if the dimension should be loaded even if there
     * is no-one in the dimension
     * (Enable only if really necessary)
     */
    @Override
    public boolean keepDimLoaded() {
        return false;
    }

    /**
     * Returns if DimensionAPI sould make a portalBlock for you
     * THIS IS RECOMMENDED
     */
    @Override
    public boolean makePortalBlock() {
        return true;
    }

    /**
     * Returns the unlocalised name of the PortalBlock
     */
    @Override
    public String portalUnlocalisedName() {
        return "JordPortal";
    }

    /**
     * Returns frame where the portal should be made of
     */
    @Override
    public Block getPortalFrameBlock() {
        return blockRegist.horizontalPortal;
    }
}