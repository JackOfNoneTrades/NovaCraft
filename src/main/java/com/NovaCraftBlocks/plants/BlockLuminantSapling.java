package com.nova_craftBlocks.plants;

import java.util.Random;

import com.nova_craft.sounds.ModSounds;

import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BlockLuminantSapling extends BlockBush implements IGrowable {

	public WorldGenerator treeGenObject = null;

	public BlockLuminantSapling(WorldGenerator treeGen) {
		super(Material.plants);
		float f = 0.4F;
		this.treeGenObject = treeGen;
		this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
		this.setStepSound(ModSounds.soundMoss);
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random random) {
		if (!world.isRemote) {
			super.updateTick(world, x, y, z, random);

			if (world.getBlockLightValue(x, y + 1, z) >= 9 && random.nextInt(30) == 0) {
				this.growTree(world, x, y, z, random);
			}
		}
	}

	public void growTree(World world, int x, int y, int z, Random rand) {
		world.setBlock(x, y, z, Blocks.air);

		if (!this.treeGenObject.generate(world, world.rand, x, y, z)) {
			world.setBlock(x, y, z, this);
		}
	}

	@Override
	public boolean func_149851_a(World worldIn, int x, int y, int z, boolean isClient) {
		return true;
	}

	@Override
	public boolean func_149852_a(World worldIn, Random rand, int x, int y, int z) {
		return true;
	}

	@Override
	public void func_149853_b(World worldIn, Random rand, int x, int y, int z) {
		if (worldIn.rand.nextFloat() < 0.45D) {
			this.growTree(worldIn, x, y, z, rand);
		}

	}

}
