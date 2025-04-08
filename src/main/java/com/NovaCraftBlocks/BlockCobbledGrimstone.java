package com.nova_craftBlocks;

import com.nova_craft.NovaCraft;
import com.nova_craft.sounds.ModSounds;
import com.ibm.icu.impl.duration.impl.Utils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCobbledGrimstone extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon iconFace, iconTop;

	public BlockCobbledGrimstone() {
		super(Material.rock);
		this.setHardness(3);
		this.setResistance(6);
		this.setStepSound(ModSounds.soundGrimstone);
		this.setHarvestLevel("pickaxe", 1);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta){
		return side == 0 || side == 1 ? iconTop : meta >= 1 && side-1 == meta ? iconFace : blockIcon;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		blockIcon = iconRegister.registerIcon("nova_craft:cobbled_grimstone");
		iconFace = iconRegister.registerIcon("nova_craft:cobbled_grimstone");
		iconTop = iconRegister.registerIcon("nova_craft:cobbled_grimstone");
	}

}

