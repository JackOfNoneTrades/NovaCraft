package com.nova_craftBlocks.ores.vanilla;

import java.util.Random;

import com.nova_craft.registry.NovaCraftCreativeTabs;
import com.nova_craft.sounds.ModSounds;
import com.nova_craftBlocks.NovaCraftBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockNullstoneOre extends Block
{
    //private static final String __OBFID = "CL_00000282";

    public BlockNullstoneOre()
    {
        super(Material.rock);
        this.setHardness(7);
		this.setResistance(14);
		this.setStepSound(ModSounds.soundNullstone);
		this.setCreativeTab(NovaCraftCreativeTabs.blocks);
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return this == NovaCraftBlocks.nullstone_diamond ? Items.diamond : (this == NovaCraftBlocks.nullstone_lapis ? Items.dye : (this == NovaCraftBlocks.nullstone_emerald ? Items.emerald : Item.getItemFromBlock(this)));
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random p_149745_1_)
    {
        return this == NovaCraftBlocks.nullstone_lapis ? 6 + p_149745_1_.nextInt(5) : 1;
    }

    /**
     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
     */
    public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_)
    {
        if (p_149679_1_ > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, p_149679_2_, p_149679_1_))
        {
            int j = p_149679_2_.nextInt(p_149679_1_ + 3) - 1;

            if (j < 0)
            {
                j = 0;
            }

            return this.quantityDropped(p_149679_2_) * (j + 1);
        }
        else
        {
            return this.quantityDropped(p_149679_2_);
        }
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_)
    {
        super.dropBlockAsItemWithChance(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, p_149690_6_, p_149690_7_);
    }

    private Random rand = new Random();
    @Override
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
        {
            int j1 = 0;

             if (this == NovaCraftBlocks.nullstone_diamond)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 6, 9);
            }
            else if (this == NovaCraftBlocks.nullstone_emerald)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 5, 9);
            }
            else if (this == NovaCraftBlocks.nullstone_lapis)
            {
                j1 = MathHelper.getRandomIntegerInRange(rand, 4, 10);
            }

            return j1;
        }
        return 0;
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int p_149692_1_)
    {
        return this == NovaCraftBlocks.nullstone_lapis ? 4 : 0;
    }
}
