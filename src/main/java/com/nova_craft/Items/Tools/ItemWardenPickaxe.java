package com.nova_craft.Items.Tools;

import java.util.List;

import com.nova_craft.Items.NovaCraftItems;
import com.nova_craft.entity.EntityFireProofItemNovaCraft;
import com.nova_craft.registry.NovaCraftCreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class ItemWardenPickaxe extends ItemPickaxe
{
    public ItemWardenPickaxe() {
        super(NCToolMaterial.WARDEN);
        this.setCreativeTab((CreativeTabs)NovaCraftCreativeTabs.tools);
    }

    public boolean hasCustomEntity(final ItemStack stack) {
        return true;
    }

    public Entity createEntity(final World world, final Entity location, final ItemStack itemstack) {
        return (Entity)new EntityFireProofItemNovaCraft(world, location, itemstack);
    }

    @Override
   	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
   		return repair.getItem() == NovaCraftItems.warden_shard;
   	}

    public void addInformation(final ItemStack stack, final EntityPlayer player, final List tooltip, final boolean who) {
        tooltip.add(EnumChatFormatting.DARK_AQUA + "" + StatCollector.translateToLocal("tooltip.warden_tools.desc"));
    }
}
