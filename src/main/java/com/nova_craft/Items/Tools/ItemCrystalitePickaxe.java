package com.nova_craft.Items.Tools;

import com.nova_craft.entity.EntityFireProofItemNovaCraft;
import com.nova_craft.registry.NovaCraftCreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCrystalitePickaxe extends ItemPickaxe
{
    public ItemCrystalitePickaxe() {
        super(NCToolMaterial.CRYSTALITE);
        this.setCreativeTab((CreativeTabs)NovaCraftCreativeTabs.tools);
    }

    public boolean hasCustomEntity(final ItemStack stack) {
        return true;
    }

    public Entity createEntity(final World world, final Entity location, final ItemStack itemstack) {
        return (Entity)new EntityFireProofItemNovaCraft(world, location, itemstack);
    }
}
