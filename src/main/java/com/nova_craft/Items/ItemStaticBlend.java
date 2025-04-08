package com.nova_craft.Items;

import com.nova_craft.registry.NovaCraftCreativeTabs;
import com.nova_craftBlocks.NovaCraftBlocks;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemStaticBlend extends Item
{
    public ItemStaticBlend()
    {
    	maxStackSize = 16;
        this.setCreativeTab(NovaCraftCreativeTabs.items);
    }

    @Override
	public boolean hasEffect(ItemStack stack, int pass) {
		return true;
	}
}
