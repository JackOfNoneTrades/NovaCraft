package com.nova_craftBlocks.container;

import java.util.Iterator;
import java.util.Random;

import com.nova_craft.NovaCraft;
import com.nova_craft.Items.NovaCraftItems;
import com.nova_craft.achievements.AchievementsNovaCraft;
import com.nova_craft.config.Configs;
import com.nova_craft.entity.EntitySculkSymbiote;
import com.nova_craft.particles.ParticleHandler;
import com.nova_craft.registry.OtherModItems;
import com.nova_craft.sounds.ModSounds;
import com.nova_craftBlocks.NovaCraftBlocks;
import com.ibm.icu.impl.duration.impl.Utils;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockMineshaftChest extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon iconFace, iconTop;

	public BlockMineshaftChest() {
		super(Material.rock);
		this.setHardness(10);
		this.setResistance(20);
		this.setStepSound(Block.soundTypeWood);
		this.setHarvestLevel("axe", 0);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta){
		return side == 0 || side == 1 ? iconTop : meta >= 1 && side-1 == meta ? iconFace : blockIcon;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		blockIcon = iconRegister.registerIcon("nova_craft:mineshaft_crate");
		iconFace = iconRegister.registerIcon("nova_craft:mineshaft_crate");
		iconTop = iconRegister.registerIcon("nova_craft:mineshaft_crate");
	}

	public Item getItemDropped(final int metadata, final Random rand, final int fortune) {
        return null;
    }

	protected boolean canSilkHarvest() {
        return false;
    }

	public void onBlockDestroyedByPlayer(World world, int x, int y, int z, int l) {
		int rand2 = (int)(1 + Math.random() * 25);
		int rand = (int)(1 + Math.random() * 3);

		int rand3 = (int)(1 + Math.random() * 5);

		switch (rand2) {

		case 1: if (!world.isRemote) {
			EntityItem entityItem = new EntityItem(world, x, y, z, new ItemStack(Items.iron_ingot, rand + 4));

			world.spawnEntityInWorld(entityItem);
		}
		case 2: if (!world.isRemote) {
					if(rand3 == 2) {
				EntityItem entityItem = new EntityItem(world, x, y, z, new ItemStack(Items.iron_pickaxe, 1));

				world.spawnEntityInWorld(entityItem);
				}
		}
		case 3: if (!world.isRemote) {
			EntityItem entityItem = new EntityItem(world, x, y, z, new ItemStack(Items.gold_ingot, 2 + rand));

			world.spawnEntityInWorld(entityItem);
		}
		case 4: if (!world.isRemote) {
				if(rand3 == 1) {
			EntityItem entityItem = new EntityItem(world, x, y, z, new ItemStack(Items.iron_shovel, 1));

			world.spawnEntityInWorld(entityItem);
			}
		}
		case 5: if (!world.isRemote) {
			EntityItem entityItem = new EntityItem(world, x, y, z, new ItemStack(Items.redstone, rand + 4));

			world.spawnEntityInWorld(entityItem);
		}
		case 6: if (!world.isRemote) {
			EntityItem entityItem = new EntityItem(world, x, y, z, new ItemStack(NovaCraftItems.nullwart, 1));

			world.spawnEntityInWorld(entityItem);
		}
		case 7: if (!world.isRemote) {
			EntityItem entityItem = new EntityItem(world, x, y, z, new ItemStack(NovaCraftItems.pherithium_scraps, rand + 2));

			world.spawnEntityInWorld(entityItem);
		}
		case 8: if (!world.isRemote) {
			EntityItem entityItem = new EntityItem(world, x, y, z, new ItemStack(NovaCraftItems.larimar_shard, rand + 1));

			world.spawnEntityInWorld(entityItem);
		}
		case 9: if (!world.isRemote) {
			EntityItem entityItem = new EntityItem(world, x, y, z, new ItemStack(NovaCraftItems.copartz_shard, rand + 1));

			world.spawnEntityInWorld(entityItem);
		}
		case 10: if (!world.isRemote) {
			EntityItem entityItem = new EntityItem(world, x, y, z, new ItemStack(NovaCraftBlocks.cobbled_nullstone, rand + 3));

			world.spawnEntityInWorld(entityItem);
		}

		case 11: if (!world.isRemote) {
			EntityItem entityItem = new EntityItem(world, x, y, z, new ItemStack(NovaCraftBlocks.sculk_block, 6 + rand));

			world.spawnEntityInWorld(entityItem);
		}

		case 12: if (!world.isRemote) {
			EntityItem entityItem = new EntityItem(world, x, y, z, new ItemStack(NovaCraftBlocks.cobbled_grimstone, rand + 7));

			world.spawnEntityInWorld(entityItem);
		}

		case 13: if (!world.isRemote) {
			EntityItem entityItem = new EntityItem(world, x, y, z, new ItemStack(Blocks.red_mushroom, rand + 2));

			world.spawnEntityInWorld(entityItem);
		}

		case 14: if (!world.isRemote) {
			EntityItem entityItem = new EntityItem(world, x, y, z, new ItemStack(Blocks.brown_mushroom, rand + 4));

			world.spawnEntityInWorld(entityItem);
		}

		case 15: if (!world.isRemote) {
			if(rand3 == 4) {
			EntityItem entityItem = new EntityItem(world, x, y, z, new ItemStack(NovaCraftItems.pherithium_axe, 1));

			world.spawnEntityInWorld(entityItem);
			}
		}
		case 16: if (!world.isRemote) {
			if(rand3 == 5) {
			EntityItem entityItem = new EntityItem(world, x, y, z, new ItemStack(NovaCraftItems.pherithium_pickaxe, 1));

			world.spawnEntityInWorld(entityItem);
			}
		}
		case 17: if (!world.isRemote) {
			EntityItem entityItem = new EntityItem(world, x, y, z, new ItemStack(Items.melon_seeds, rand + 1));

			world.spawnEntityInWorld(entityItem);
		}
		case 18: if (!world.isRemote) {
			EntityItem entityItem = new EntityItem(world, x, y, z, new ItemStack(Blocks.rail, rand + 7));

			world.spawnEntityInWorld(entityItem);
		}
		default: if (!world.isRemote) {
			EntityItem entityItem = new EntityItem(world, x, y, z, new ItemStack(NovaCraftBlocks.sculk_block, 3 + rand));

			world.spawnEntityInWorld(entityItem);

			}
		}
	}

	@Override
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(final World p_149734_1_, final int p_149734_2_, final int p_149734_3_, final int p_149734_4_, final Random p_149734_5_) {
        super.randomDisplayTick(p_149734_1_, p_149734_2_, p_149734_3_, p_149734_4_, p_149734_5_);
        if (p_149734_5_.nextInt(35) == 0) {
            ParticleHandler.TREASURE.spawn(p_149734_1_, p_149734_2_ + p_149734_5_.nextFloat(), p_149734_3_ + 0.1f, p_149734_4_ + p_149734_5_.nextFloat(), 0.0, 0.0, 0.0, 0.0f, new Object[0]);
            ParticleHandler.TREASURE.spawn(p_149734_1_, p_149734_2_ + p_149734_5_.nextFloat(), p_149734_3_ + 0.4f, p_149734_4_ + p_149734_5_.nextFloat(), 0.0, 0.0, 0.0, 0.0f, new Object[0]);
            ParticleHandler.TREASURE.spawn(p_149734_1_, p_149734_2_ + p_149734_5_.nextFloat(), p_149734_3_ + 0.6f, p_149734_4_ + p_149734_5_.nextFloat(), 0.0, 0.0, 0.0, 0.0f, new Object[0]);
            ParticleHandler.TREASURE.spawn(p_149734_1_, p_149734_2_ + p_149734_5_.nextFloat(), p_149734_3_ + 0.9f, p_149734_4_ + p_149734_5_.nextFloat(), 0.0, 0.0, 0.0, 0.0f, new Object[0]);
            ParticleHandler.TREASURE.spawn(p_149734_1_, p_149734_2_ + p_149734_5_.nextFloat(), p_149734_3_ + 1.1f, p_149734_4_ + p_149734_5_.nextFloat(), 0.0, 0.0, 0.0, 0.0f, new Object[0]);
        }

    }

}
