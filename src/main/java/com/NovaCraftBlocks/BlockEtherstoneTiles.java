package com.nova_craftBlocks;

import java.util.Random;

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
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockEtherstoneTiles extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon iconFace, iconTop;

	public BlockEtherstoneTiles() {
		super(Material.rock);
		this.setHardness(2);
		this.setResistance(3);
		this.setStepSound(ModSounds.soundEtherstoneBricks);
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
		blockIcon = iconRegister.registerIcon("nova_craft:etherstone_tiles");
		iconFace = iconRegister.registerIcon("nova_craft:etherstone_tiles");
		iconTop = iconRegister.registerIcon("nova_craft:etherstone_tiles");
	}

}

