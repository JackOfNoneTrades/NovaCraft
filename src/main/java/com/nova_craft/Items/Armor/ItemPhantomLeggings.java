package com.nova_craft.Items.Armor;

import cpw.mods.fml.common.FMLLog;

import java.util.List;

import org.apache.logging.log4j.Level;

import com.nova_craft.Items.NovaCraftItems;
import com.nova_craft.registry.NovaCraftCreativeTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemArmor;

public class ItemPhantomLeggings extends ItemArmor
{
    public ItemPhantomLeggings() {
        super(NCArmorMaterial.PHANTOM, 0, 2);
        this.setCreativeTab(NovaCraftCreativeTabs.tools);
    }

    public String getArmorTexture(final ItemStack stack, final Entity entity, final int slot, final String type) {
        if (stack.getItem() == NovaCraftItems.phantom_leggings) {
            return "nova_craft:textures/armor/phantom_layer_2.png";
        }
        FMLLog.log(Level.ERROR, "Invaild Texture for Phantom Leggings", new Object[0]);
        return null;
    }

    @Override
   	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
   		return repair.getItem() == NovaCraftItems.phantom_membrane;
   	}

    public void addInformation(final ItemStack stack, final EntityPlayer player, final List tooltip, final boolean who) {
 	   tooltip.add(EnumChatFormatting.WHITE + "" + StatCollector.translateToLocal("tooltip.phantom_armor.desc"));
 	}
}
