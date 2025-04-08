package com.nova_craftBlocks.crystals;

import com.nova_craft.sounds.ModSounds;
import com.nova_craft.sounds.Reference;
import com.nova_craftBlocks.NovaCraftBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockVariegatedShard extends Block {

	public BlockVariegatedShard() {
		this(Material.glass);
	}
	public BlockVariegatedShard(Material material) {
		super(material);
		setHardness(7.5F);
		setResistance(7.5F);
		this.setStepSound(ModSounds.soundCrystal);
	}

}
