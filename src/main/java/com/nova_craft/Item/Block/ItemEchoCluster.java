package com.nova_craft.Item.Block;

import com.nova_craft.core.Utils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemEchoCluster extends ItemBlock {

	private static final String[] item_names = new String[] {"echo_bud", "small_echo_bud", "medium_large_echo_bud", "echo_cluster"};

	public ItemEchoCluster(Block p_i45328_1_) {
		super(p_i45328_1_);
		setHasSubtypes(true);
	}

	public int getMetadata(int p_77647_1_)
	{
		return p_77647_1_ < 6 ? 0 : 6;
	}

    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int p_77617_1_)
    {
    	return field_150939_a.getIcon(0, p_77617_1_);
    }

	public String getUnlocalizedName(ItemStack p_77667_1_)
	{
		return "tile." + Utils.getUnlocalisedName(item_names[p_77667_1_.getItemDamage() % 4]);
	}
}
