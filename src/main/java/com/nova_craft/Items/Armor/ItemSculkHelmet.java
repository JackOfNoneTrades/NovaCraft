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

public class ItemSculkHelmet extends ItemArmor
{
    public ItemSculkHelmet() {
        super(NCArmorMaterial.SCULK, 0, 0);
        this.setCreativeTab(NovaCraftCreativeTabs.tools);
    }

    public String getArmorTexture(final ItemStack stack, final Entity entity, final int slot, final String type) {
        if (stack.getItem() == NovaCraftItems.sculk_helmet) {
            return "nova_craft:textures/armor/sculk_layer_1.png";
        }
        FMLLog.log(Level.ERROR, "Invaild Texture for Sculk Helmet", new Object[0]);
        return null;
    }

    public void addInformation(final ItemStack stack, final EntityPlayer player, final List tooltip, final boolean who) {
 	   tooltip.add(EnumChatFormatting.BLUE + "" + StatCollector.translateToLocal("tooltip.sculk_armor.desc"));
 	}
}
