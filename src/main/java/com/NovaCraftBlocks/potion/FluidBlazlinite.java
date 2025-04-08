package com.nova_craftBlocks.potion;

import net.minecraftforge.fluids.*;

public class FluidBlazlinite extends Fluid
{
    public FluidBlazlinite(final String fluidName) {
        super(fluidName);
        this.setIcons(BlockBlazlinite.BlazliniteStillIcon, BlockBlazlinite.BlazliniteFlowingIcon);
    }
}
