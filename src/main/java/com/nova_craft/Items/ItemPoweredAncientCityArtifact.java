package com.nova_craft.Items;

import com.nova_craft.registry.NovaCraftCreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemPoweredAncientCityArtifact extends Item {

	public ItemPoweredAncientCityArtifact() {
		this.setCreativeTab(NovaCraftCreativeTabs.items);
		maxStackSize = 1;
	}

	@Override
	public boolean hasEffect(ItemStack stack, int pass) {
		return true;
	}

}
