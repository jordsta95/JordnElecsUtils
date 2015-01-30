package com.jordsta.stuff.dimensions;

import net.minecraftforge.common.DimensionManager;

import java.util.HashMap;

import elec332.core.api.dimension.PortalBlock;

/**
 * Created by Elec332 on 29-1-2015.
 */
public class DimStuff {

    static HashMap<Integer, PortalBlock> Registry = new HashMap<Integer, PortalBlock>();

    public static void Register(DimInfo provider){
        DimensionManager.registerProviderType(provider.getDimID(), provider.getWorldProvider(), provider.keepDimLoaded());
        DimensionManager.registerDimension(provider.getDimID(), provider.getDimID());
        if (provider.makePortalBlock()){
            RegisterPortal(new PortalBlock(provider.portalUnlocalisedName(), provider.getPortalFrameBlock(), provider.getDimID()), provider.getDimID());
        }
    }

    public static void RegisterPortal(PortalBlock PortalBlock, int DimID){
        Registry.put(DimID, PortalBlock);
    }

    public static PortalBlock getPortalFromDIM(int DimID){
        return Registry.get(DimID);
    }
}