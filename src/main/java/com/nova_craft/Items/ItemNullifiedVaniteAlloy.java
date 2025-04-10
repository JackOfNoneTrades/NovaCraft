package com.nova_craft.Items;

import com.nova_craft.entity.EntityFireProofItemNovaCraft;
import com.nova_craft.registry.NovaCraftCreativeTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemNullifiedVaniteAlloy extends Item {

	public ItemNullifiedVaniteAlloy()
    {
        this.setCreativeTab(NovaCraftCreativeTabs.items);
    }

	public boolean isBeaconPayment(final ItemStack stack) {
	     return true;
	 }

	public boolean hasCustomEntity(final ItemStack stack) {
	      return true;
	 }

	public Entity createEntity(final World world, final Entity location, final ItemStack itemstack) {
	       return (Entity)new EntityFireProofItemNovaCraft(world, location, itemstack);
	 }

	@Override
	public boolean hasEffect(ItemStack stack, int pass) {
		return true;
	}

}
