package com.nova_craftBlocks.stalactites;

import java.util.Random;

import com.nova_craft.NovaCraft;
import com.nova_craft.Items.NovaCraftItems;
import com.nova_craft.sounds.ModSounds;
import com.nova_craftBlocks.NovaCraftBlocks;
import com.ibm.icu.impl.duration.impl.Utils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockIcicle extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon iconFace, iconTop;

	public BlockIcicle() {
		super(Material.glass);
		this.setHardness(0.1F);
		this.setResistance(0.1F);
		float f = 0.5F;
		this.setBlockBounds(0.2F, 0.0F, 0.2F, 0.8F, 1.0F, 0.8F);
		this.setStepSound(soundTypeGlass);
		this.setHarvestLevel("pickaxe", 0);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta){
		return side == 0 || side == 1 ? iconTop : meta >= 1 && side-1 == meta ? iconFace : blockIcon;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		blockIcon = iconRegister.registerIcon("nova_craft:icicle");
		iconFace = iconRegister.registerIcon("nova_craft:icicle");
		iconTop = iconRegister.registerIcon("nova_craft:icicle");
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	public int getRenderType() {
		return 1;
	  }

	protected boolean canSilkHarvest()
    {
    	return true;
    }

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	  {
	       return null;
	  }


	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        return null;
    }

}
