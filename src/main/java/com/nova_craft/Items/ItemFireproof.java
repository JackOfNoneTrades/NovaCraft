package com.nova_craft.Items;

import com.nova_craft.entity.EntityFireProofItemNovaCraft;
import com.nova_craft.registry.NovaCraftCreativeTabs;
import com.nova_craft.registry.NovaCraftCreativeTabs.NovacraftTab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemFireproof extends Item {

	public ItemFireproof() {
		this.setCreativeTab(NovaCraftCreativeTabs.items);
	}


	public boolean hasCustomEntity(final ItemStack stack) {
        return true;
    }

    public Entity createEntity(final World world, final Entity location, final ItemStack itemstack) {
        return (Entity)new EntityFireProofItemNovaCraft(world, location, itemstack);
    }

}
