package com.nova_craftBlocks.crystals;

import java.util.Random;

import com.nova_craft.Items.NovaCraftItems;
import com.nova_craft.sounds.ModSounds;
import com.nova_craft.sounds.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IProjectile;
import net.minecraft.item.Item;
import net.minecraft.world.World;

public class BlockAether extends Block {

	public BlockAether() {
		this(Material.glass);
	}
	public BlockAether(Material material) {
		super(material);
		setHardness(4.5F);
		setResistance(4.5F);
		this.setStepSound(ModSounds.soundCrystal);
	}

	protected boolean canSilkHarvest()
    {
    	return true;
    }


	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
	        return null;
	}

}

