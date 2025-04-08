package com.nova_craft;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import com.nova_craft.TileEntity.ContainerLegendaryBeacon;
import com.nova_craft.TileEntity.TileEntityLegendaryBeacon;
import com.nova_craft.container.AdvancedEnchantmentTableContainer;
import com.nova_craft.container.AdvancedSmithingTableContainer;
import com.nova_craft.container.LegendaryEnchantmentTableContainer;
import com.nova_craft.gui.GuiAdvancedEnchantmentTable;
import com.nova_craft.gui.GuiAdvancedSmithingTable;
import com.nova_craft.gui.GuiLegendaryBeacon;
import com.nova_craft.gui.GuiLegendaryEnchantmentTable;
import com.nova_craftBlocks.NovaCraftBlocks;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy  implements IGuiHandler {

    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        //NovaCraft.logger.info(Config.greeting);
        NovaCraft.logger.info("I am X at version " + Tags.VERSION);
    }

    public void init(FMLInitializationEvent event) {}

    public void postInit(FMLPostInitializationEvent event) {}

    public void serverStarting(FMLServerStartingEvent event) {}

    public void registerRenderers() {
    }

	public int getBlockRender(final Block blockID) {
        return 27;
    }

	@Override
	public Object getClientGuiElement(final int par1, final EntityPlayer par2EntityPlayer, final World par3World, final int par4, final int par5, final int par6) {
        final TileEntity var7 = par3World.getTileEntity(par4, par5, par6);
        switch (par1) {
            default: {
                if (par1 == 1) {
                    return (par1 == 1 && par3World.getBlock(par4, par5, par6) == NovaCraftBlocks.advanced_smithing_table) ? new GuiAdvancedSmithingTable(par2EntityPlayer.inventory, par3World, par4, par5, par6) : null;
                }
                if (par1 == 2) {
                final TileEntity tileentity = par3World.getTileEntity(par4, par5, par6);
                if (tileentity instanceof TileEntityLegendaryBeacon) {
                    return new GuiLegendaryBeacon(par2EntityPlayer.inventory, (TileEntityLegendaryBeacon)tileentity);
                }
                break;
              }
                if (par1 == 3) {
        			return new GuiLegendaryEnchantmentTable(par2EntityPlayer.inventory, par2EntityPlayer.worldObj, par4, par5, par6, null);
        	  }
                if (par1 == 4) {
        			return new GuiAdvancedEnchantmentTable(par2EntityPlayer.inventory, par2EntityPlayer.worldObj, par4, par5, par6, null);
        		}
            }
        }

        return null;
    }

	@Override
    public Object getServerGuiElement(final int par1, final EntityPlayer par2EntityPlayer, final World par3World, final int par4, final int par5, final int par6) {
        final TileEntity var7 = par3World.getTileEntity(par4, par5, par6);
        switch (par1) {
            default: {
                if (par1 == 1) {
                    return (par1 == 1 && par3World.getBlock(par4, par5, par6) == NovaCraftBlocks.advanced_smithing_table) ? new AdvancedSmithingTableContainer(par2EntityPlayer.inventory, par3World, par4, par5, par6) : null;
                }
                if (par1 == 2) {
                final TileEntity tileentity = par3World.getTileEntity(par4, par5, par6);
                if (tileentity instanceof TileEntityLegendaryBeacon) {
                    return new ContainerLegendaryBeacon(par2EntityPlayer.inventory, (TileEntityLegendaryBeacon)tileentity);
                }
                break;
              }
                if (par1 == 3) {
        			return (par1 == 3 && par3World.getBlock(par4, par5, par6) == NovaCraftBlocks.legendary_enchantment_table) ? new LegendaryEnchantmentTableContainer(par2EntityPlayer.inventory, par2EntityPlayer.worldObj, par4, par5, par6) : null;
        	  }
                if (par1 == 4) {
        			return (par1 == 4 && par3World.getBlock(par4, par5, par6) == NovaCraftBlocks.advanced_enchantment_table) ? new AdvancedEnchantmentTableContainer(par2EntityPlayer.inventory, par2EntityPlayer.worldObj, par4, par5, par6) : null;
        	  }
            }
        }
        return null;
    }

	public EntityPlayer getPlayer() {
		return null;
	}

	public static void registerEvent(Object event) {
		FMLCommonHandler.instance().bus().register(event);
		MinecraftForge.EVENT_BUS.register(event);

	}
}
