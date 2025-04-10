package com.nova_craft.Items.Tools;

import java.util.List;

import com.nova_craft.Items.NovaCraftItems;
import com.nova_craft.registry.NovaCraftCreativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

public class ItemPherithiumHoe extends ItemHoe
{
    public ItemPherithiumHoe() {
        super(NCToolMaterial.PHERITHIUM);
        this.setCreativeTab((CreativeTabs)NovaCraftCreativeTabs.tools);
    }

    @Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return repair.getItem() == NovaCraftItems.pherithium_ingot;
	}

    public void addInformation(final ItemStack stack, final EntityPlayer player, final List tooltip, final boolean who) {
        tooltip.add(EnumChatFormatting.GREEN + "" + StatCollector.translateToLocal("tooltip.pherithium_tools.desc"));
    }
}
