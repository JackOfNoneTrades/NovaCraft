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

public class BlockNullstone extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon iconFace, iconTop;

	public BlockNullstone() {
		super(Material.rock);
		this.setHardness(5);
		this.setResistance(12);
		this.setStepSound(ModSounds.soundNullstone);
		this.setHarvestLevel("pickaxe", 3);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta){
		return side == 0 || side == 1 ? iconTop : meta >= 1 && side-1 == meta ? iconFace : blockIcon;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		blockIcon = iconRegister.registerIcon("nova_craft:nullstone");
		iconFace = iconRegister.registerIcon("nova_craft:nullstone");
		iconTop = iconRegister.registerIcon("nova_craft:nullstone");
	}

	public Item getItemDropped(final int metadata, final Random rand, final int fortune) {
        return Item.getItemFromBlock(NovaCraftBlocks.cobbled_nullstone);
    }

}
