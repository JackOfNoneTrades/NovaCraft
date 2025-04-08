package com.nova_craftBlocks.ores;

import java.util.Random;

import com.nova_craft.NovaCraft;
import com.nova_craft.Items.NovaCraftItems;
import com.nova_craft.sounds.ModSounds;
import com.nova_craftBlocks.NovaCraftBlocks;
import com.nova_craftBlocks.decorative.BlocksNovaCraftSlab;
import com.ibm.icu.impl.duration.impl.Utils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockVaniteBricks extends Block {

	public BlockVaniteBricks() {
		super(Material.iron);
		this.setHardness(15);
		this.setResistance(25);
		this.setStepSound(ModSounds.soundNullstone);
		this.setHarvestLevel("pickaxe", 3);
	}

}


