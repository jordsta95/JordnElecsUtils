package com.jordsta.stuff;

import net.minecraft.world.World;

public class Proxy {
	
	protected static Proxy proxyInstance = null;

	public static void setInstance(Proxy newProxy)
	{
		proxyInstance = newProxy;
	}
	
	public static Proxy getProxy()
	{
		if (proxyInstance == null)
		{
			proxyInstance = new Proxy();
		}
		
		return proxyInstance;
	}

	public World getWorld()
	{
		return null;
	}
	
}
