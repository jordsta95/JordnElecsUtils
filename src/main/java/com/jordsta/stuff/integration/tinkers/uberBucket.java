package com.jordsta.stuff.integration.tinkers;

import com.jordsta.stuff.JordTab;
import com.jordsta.stuff.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBucket;

public class uberBucket extends ItemBucket {
	

	public uberBucket(Block p_i45331_1_) {
		super(ticonRegist.uberiumFluid);
		setUnlocalizedName("uberBucket");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(JordTab.JordTab);
	}

}
