package com.nova_craft;


import com.nova_craft.TileEntity.AncientChestRenderer;
import com.nova_craft.TileEntity.TileEntityAncientChest;
import com.nova_craft.TileEntity.TileEntityAncientChestRenderer;
import com.nova_craft.TileEntity.TileEntityDeepOneEgg;
import com.nova_craft.TileEntity.TileEntityDeepOneEggActivated;
import com.nova_craft.TileEntity.TileEntityDeepOneEggActivatedRenderer;
import com.nova_craft.TileEntity.TileEntityDeepOneEggRenderer;
import com.nova_craft.TileEntity.TileEntityUnbreakbleAncientChest;
import com.nova_craft.TileEntity.UnbreakableAncientChestRenderer;
import com.nova_craft.entity.renderer.DeepOneEggActivatedRenderer;
import com.nova_craft.entity.renderer.DeepOneEggRenderer;
import com.nova_craft.entity.renderer.RendersNovaCraft;
import com.nova_craft.renderer.BlockAetherClusterRenderer;
import com.nova_craft.renderer.BlockCopartzClusterRenderer;
import com.nova_craft.renderer.BlockEchoClusterRenderer;
import com.nova_craft.renderer.BlockEmissiveLayerRenderer;
import com.nova_craft.renderer.BlockEmissiveLayerRenderer3D;
import com.nova_craft.renderer.BlockEndiumLogRenderer;
import com.nova_craft.renderer.BlockEndiumPlantRenderer;
import com.nova_craft.renderer.BlockLarimarClusterRenderer;
import com.nova_craft.renderer.BlockLegendaryBeaconRenderer;
import com.nova_craft.renderer.BlockMoltenCrystalCauldronRenderer;
import com.nova_craft.renderer.BlockMoltenVaniteCauldronRenderer;
import com.nova_craft.renderer.BlockNullClusterRenderer;
import com.nova_craft.renderer.BlockNullcubeSlimeRenderer;
import com.nova_craft.renderer.BlockSculkSpikeRenderer;
import com.nova_craft.renderer.BlockSculkTentacleRenderer;
import com.nova_craft.renderer.BlockTsavorokiteClusterRenderer;
import com.nova_craft.renderer.BlockVaniteCauldronRenderer;
import com.nova_craft.renderer.BlockVaniteClusterRenderer;
import com.nova_craft.renderer.BlockYttrlinsiteClusterRenderer;
import com.nova_craft.renderer.RenderIDs;
import com.nova_craftBlocks.NovaCraftBlocks;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.player.EntityPlayer;

public class ClientProxy extends CommonProxy
{

	private static int renderIdDeepOneEgg;
	private static int renderIdDeepOneEggActivated;

	@Override
	public void init(FMLInitializationEvent event) {
		registerEvent(new NovaCraftClientEvents());
	}

	@Override
    public void registerRenderers() {
		RenderingRegistry.registerBlockHandler(new BlockCopartzClusterRenderer());
		RenderingRegistry.registerBlockHandler(new BlockLarimarClusterRenderer());
		RenderingRegistry.registerBlockHandler(new BlockTsavorokiteClusterRenderer());
		RenderingRegistry.registerBlockHandler(new BlockYttrlinsiteClusterRenderer());
		RenderingRegistry.registerBlockHandler(new BlockEchoClusterRenderer());
		RenderingRegistry.registerBlockHandler(new BlockAetherClusterRenderer());
		RenderingRegistry.registerBlockHandler(new BlockNullClusterRenderer());

		RenderingRegistry.registerBlockHandler(new BlockSculkTentacleRenderer());
		RenderingRegistry.registerBlockHandler(new BlockSculkSpikeRenderer());

		RenderingRegistry.registerBlockHandler(new BlockEndiumLogRenderer());
		RenderingRegistry.registerBlockHandler(new BlockEndiumPlantRenderer());

		RenderingRegistry.registerBlockHandler(new BlockNullcubeSlimeRenderer());

		RenderingRegistry.registerBlockHandler(new BlockVaniteCauldronRenderer());
		RenderingRegistry.registerBlockHandler(new BlockMoltenVaniteCauldronRenderer());
		RenderingRegistry.registerBlockHandler(new BlockMoltenCrystalCauldronRenderer());

		RenderingRegistry.registerBlockHandler(new BlockVaniteClusterRenderer());
		RenderingRegistry.registerBlockHandler(new BlockLegendaryBeaconRenderer());

		RenderingRegistry.registerBlockHandler(new BlockEmissiveLayerRenderer(RenderIDs.EMISSIVE_DOUBLE_LAYER));
		RenderingRegistry.registerBlockHandler(new BlockEmissiveLayerRenderer3D(RenderIDs.EMISSIVE_DOUBLE_LAYER_3D));

		RendersNovaCraft.initialization();

		ClientProxy.renderIdDeepOneEgg = RenderingRegistry.getNextAvailableRenderId();
        ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntityDeepOneEgg.class, (TileEntitySpecialRenderer)new TileEntityDeepOneEggRenderer());
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)new DeepOneEggRenderer(ClientProxy.renderIdDeepOneEgg));

        ClientProxy.renderIdDeepOneEggActivated = RenderingRegistry.getNextAvailableRenderId();
        ClientRegistry.bindTileEntitySpecialRenderer((Class)TileEntityDeepOneEggActivated.class, (TileEntitySpecialRenderer)new TileEntityDeepOneEggActivatedRenderer());
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)new DeepOneEggActivatedRenderer(ClientProxy.renderIdDeepOneEggActivated));

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAncientChest.class, new TileEntityAncientChestRenderer());
        NovaCraftBlocks.AncientChestRenderId = RenderingRegistry.getNextAvailableRenderId();
		RenderingRegistry.registerBlockHandler(new AncientChestRenderer(new TileEntityAncientChest()));

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityUnbreakbleAncientChest.class, new TileEntityAncientChestRenderer());
        NovaCraftBlocks.UnbreakableAncientChestRenderId = RenderingRegistry.getNextAvailableRenderId();
		RenderingRegistry.registerBlockHandler(new UnbreakableAncientChestRenderer(new TileEntityUnbreakbleAncientChest()));
	}

	@Override
    public int getBlockRender(final Block blockID) {
        if (blockID == NovaCraftBlocks.deep_one_egg) {
            return ClientProxy.renderIdDeepOneEgg;
        }
        if (blockID == NovaCraftBlocks.deep_one_egg_activated) {
            return ClientProxy.renderIdDeepOneEggActivated;
        }
        return -1;
	}

	@Override
	public EntityPlayer getPlayer() {
		return Minecraft.getMinecraft().thePlayer;
	}

}
