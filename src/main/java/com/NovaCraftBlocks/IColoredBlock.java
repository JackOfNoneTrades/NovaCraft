package com.nova_craftBlocks;

import net.minecraft.item.ItemStack;

public interface IColoredBlock {

	public int getColorFromItemStack(ItemStack stack, int pass);

}
