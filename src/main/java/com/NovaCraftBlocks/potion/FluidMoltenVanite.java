package com.nova_craftBlocks.potion;

import net.minecraftforge.fluids.Fluid;

public class FluidMoltenVanite extends Fluid
{
    public FluidMoltenVanite(final String fluidName) {
        super(fluidName);
        this.setIcons(BlockMoltenVanite.MoltenVaniteStillIcon, BlockMoltenVanite.MoltenVaniteFlowingIcon);
    }
}
