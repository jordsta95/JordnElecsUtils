package com.jordsta.stuff.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.IProjectile;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;

import java.util.ArrayList;
import java.util.List;

public class InterdictionTile extends TileEntity
{
	private static List<Class> blacklist = new ArrayList(); 
	private AxisAlignedBB bBox = null;
	
	public static boolean addEntityToBlackList(Class entClass)
	{
		if (blacklist.contains(entClass))
		{
			return false;
		}
		
		blacklist.add(entClass);
		return true;
	}
	
	public void updateEntity()
	{
		if (bBox == null)
		{
			bBox = AxisAlignedBB.getBoundingBox(xCoord - 8, yCoord - 8, zCoord - 8, xCoord + 8, yCoord + 8, zCoord + 8);
		}
		
		List<Entity> list = worldObj.getEntitiesWithinAABB(Entity.class, bBox);
		
		for (Entity ent : list)
		{
			if (blacklist.contains(ent.getClass()))
			{
				continue;
			}
			
			if ((ent instanceof EntityLiving) || (ent instanceof IProjectile))
			{
			
				Vec3 p = Vec3.createVectorHelper(xCoord, yCoord, zCoord);
				Vec3 t = Vec3.createVectorHelper(ent.posX, ent.posY, ent.posZ);
				double distance = p.distanceTo(t) + 0.1D;

				Vec3 r = Vec3.createVectorHelper(t.xCoord - p.xCoord, t.yCoord - p.yCoord, t.zCoord - p.zCoord);

				ent.motionX += r.xCoord / 3.5D / distance;
				ent.motionY += r.yCoord / 3.5D / distance;
				ent.motionZ += r.zCoord / 3.5D / distance;
			}
		}
	}
}