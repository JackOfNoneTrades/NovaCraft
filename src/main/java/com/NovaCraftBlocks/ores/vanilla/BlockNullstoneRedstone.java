package com.nova_craftBlocks.ores.vanilla;

import java.util.Random;

import com.nova_craft.sounds.ModSounds;
import com.nova_craftBlocks.NovaCraftBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockNullstoneRedstone extends Block
{
    private boolean field_150187_a;
    //private static final String __OBFID = "CL_00000294";

    public BlockNullstoneRedstone(boolean p_i45420_1_)
    {
        super(Material.rock);
        this.setHardness(7);
        this.setStepSound(ModSounds.soundNullstone);
		this.setResistance(14);

        if (p_i45420_1_)
        {
            this.setTickRandomly(true);
        }

        this.field_150187_a = p_i45420_1_;
    }

    /**
     * How many world ticks before ticking
     */
    public int tickRate(World p_149738_1_)
    {
        return 60;
    }

    /**
     * Called when a player hits the block. Args: world, x, y, z, player
     */
    public void onBlockClicked(World p_149699_1_, int p_149699_2_, int p_149699_3_, int p_149699_4_, EntityPlayer p_149699_5_)
    {
        this.func_150185_e(p_149699_1_, p_149699_2_, p_149699_3_, p_149699_4_);
        super.onBlockClicked(p_149699_1_, p_149699_2_, p_149699_3_, p_149699_4_, p_149699_5_);
    }

    /**
     * Called whenever an entity is walking on top of this block. Args: world, x, y, z, entity
     */
    public void onEntityWalking(World p_149724_1_, int p_149724_2_, int p_149724_3_, int p_149724_4_, Entity p_149724_5_)
    {
        this.func_150185_e(p_149724_1_, p_149724_2_, p_149724_3_, p_149724_4_);
        super.onEntityWalking(p_149724_1_, p_149724_2_, p_149724_3_, p_149724_4_, p_149724_5_);
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        this.func_150185_e(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_);
        return super.onBlockActivated(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_, p_149727_5_, p_149727_6_, p_149727_7_, p_149727_8_, p_149727_9_);
    }

    private void func_150185_e(World p_150185_1_, int p_150185_2_, int p_150185_3_, int p_150185_4_)
    {
        this.func_150186_m(p_150185_1_, p_150185_2_, p_150185_3_, p_150185_4_);

        if (this == NovaCraftBlocks.nullstone_redstone)
        {
            p_150185_1_.setBlock(p_150185_2_, p_150185_3_, p_150185_4_,NovaCraftBlocks.lit_nullstone_redstone);
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
        if (this == NovaCraftBlocks.lit_nullstone_redstone)
        {
            p_149674_1_.setBlock(p_149674_2_, p_149674_3_, p_149674_4_, NovaCraftBlocks.nullstone_redstone);
        }
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Items.redstone;
    }

    /**
     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
     */
    public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_)
    {
        return this.quantityDropped(p_149679_2_) + p_149679_2_.nextInt(p_149679_1_ + 1);
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random p_149745_1_)
    {
        return 4 + p_149745_1_.nextInt(2);
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_)
    {
        super.dropBlockAsItemWithChance(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, p_149690_6_, p_149690_7_);
    }

    private Random rand = new Random();
    @Override // World, meta, fortune
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        if (this.getItemDropped(p_149690_5_, rand, p_149690_7_) != Item.getItemFromBlock(this))
        {
            return 1 + rand.nextInt(5);
        }
        return 0;
    }

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
    {
        if (this.field_150187_a)
        {
            this.func_150186_m(p_149734_1_, p_149734_2_, p_149734_3_, p_149734_4_);
        }
    }

    private void func_150186_m(World p_150186_1_, int p_150186_2_, int p_150186_3_, int p_150186_4_)
    {
        Random random = p_150186_1_.rand;
        double d0 = 0.0625D;

        for (int l = 0; l < 12; ++l)
        {
            double d1 = (double)((float)p_150186_2_ + random.nextFloat());
            double d2 = (double)((float)p_150186_3_ + random.nextFloat());
            double d3 = (double)((float)p_150186_4_ + random.nextFloat());

            if (l == 0 && !p_150186_1_.getBlock(p_150186_2_, p_150186_3_ + 1, p_150186_4_).isOpaqueCube())
            {
                d2 = (double)(p_150186_3_ + 1) + d0;
            }

            if (l == 1 && !p_150186_1_.getBlock(p_150186_2_, p_150186_3_ - 1, p_150186_4_).isOpaqueCube())
            {
                d2 = (double)(p_150186_3_ + 0) - d0;
            }

            if (l == 2 && !p_150186_1_.getBlock(p_150186_2_, p_150186_3_, p_150186_4_ + 1).isOpaqueCube())
            {
                d3 = (double)(p_150186_4_ + 1) + d0;
            }

            if (l == 3 && !p_150186_1_.getBlock(p_150186_2_, p_150186_3_, p_150186_4_ - 1).isOpaqueCube())
            {
                d3 = (double)(p_150186_4_ + 0) - d0;
            }

            if (l == 4 && !p_150186_1_.getBlock(p_150186_2_ + 1, p_150186_3_, p_150186_4_).isOpaqueCube())
            {
                d1 = (double)(p_150186_2_ + 1) + d0;
            }

            if (l == 5 && !p_150186_1_.getBlock(p_150186_2_ - 1, p_150186_3_, p_150186_4_).isOpaqueCube())
            {
                d1 = (double)(p_150186_2_ + 0) - d0;
            }

            if (d1 < (double)p_150186_2_ || d1 > (double)(p_150186_2_ + 1) || d2 < 0.0D || d2 > (double)(p_150186_3_ + 1) || d3 < (double)p_150186_4_ || d3 > (double)(p_150186_4_ + 1))
            {
                p_150186_1_.spawnParticle("reddust", d1, d2, d3, 0.0D, 0.0D, 0.0D);
            }
        }
    }

    /**
     * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
     * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
     */
    protected ItemStack createStackedBlock(int p_149644_1_)
    {
        return new ItemStack(NovaCraftBlocks.nullstone_redstone);
    }
}
