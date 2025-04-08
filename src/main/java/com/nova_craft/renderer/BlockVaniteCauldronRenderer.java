package com.nova_craft.renderer;

import com.nova_craftBlocks.NovaCraftBlocks;
import com.nova_craftBlocks.ores.BlockReinforcedVanite;
import com.nova_craftBlocks.potion.BlockVaniteCauldron;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCauldron;
import net.minecraft.block.BlockLiquid;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class BlockVaniteCauldronRenderer implements ISimpleBlockRenderingHandler {

	@Override
	public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer) {
	}

	@Override
	public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId,
			RenderBlocks renderer) {
		{
			renderer.renderBlockCauldron(Blocks.cauldron, x, y, z);
			IIcon vanite = BlockReinforcedVanite.InfusedVanite;
			renderer.renderFaceYPos(block, x, y - 1.0F + (.0625 * 15F), z, vanite);
			return true;
		}
	}

	@Override
	public boolean shouldRender3DInInventory(int modelId) {
		return false;
	}

	@Override
	public int getRenderId() {
		return RenderIDs.VANITE_CAULDRON;
	}

}
