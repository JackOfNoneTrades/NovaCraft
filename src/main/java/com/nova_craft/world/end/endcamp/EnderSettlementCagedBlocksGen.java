package com.nova_craft.world.end.endcamp;

import net.minecraft.world.gen.feature.*;
import net.minecraft.block.*;
import net.minecraft.world.*;
import java.util.*;

import com.nova_craft.registry.OtherModBlocks;
import com.nova_craftBlocks.NovaCraftBlocks;

import net.minecraft.init.*;

public class EnderSettlementCagedBlocksGen extends WorldGenerator
{
	public EnderSettlementCagedBlocksGen() {

	}

    public boolean generate(final World world, final Random random, final int i, final int j, final int k) {

		world.setBlock(i + 5, j + 0, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 7, j + 1, k + 3, Blocks.end_stone, 0, 2);
		world.setBlock(i + 7, j + 1, k + 5, Blocks.end_stone, 0, 2);
		world.setBlock(i + 5, j + 1, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 11, j + 1, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 3, j + 1, k + 8, Blocks.end_stone, 0, 2);
		world.setBlock(i + 8, j + 1, k + 8, Blocks.end_stone, 0, 2);
		world.setBlock(i + 5, j + 2, k + 3, Blocks.end_stone, 0, 2);
		world.setBlock(i + 7, j + 2, k + 3, Blocks.end_stone, 0, 2);
		world.setBlock(i + 3, j + 2, k + 4, Blocks.end_stone, 0, 2);
		world.setBlock(i + 9, j + 2, k + 4, Blocks.end_stone, 0, 2);
		world.setBlock(i + 6, j + 2, k + 5, Blocks.end_stone, 0, 2);
		world.setBlock(i + 7, j + 2, k + 5, Blocks.end_stone, 0, 2);
		world.setBlock(i + 5, j + 2, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 7, j + 2, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 10, j + 2, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 11, j + 2, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 5, j + 2, k + 7, Blocks.end_stone, 0, 2);
		world.setBlock(i + 3, j + 2, k + 8, Blocks.end_stone, 0, 2);
		world.setBlock(i + 6, j + 2, k + 9, Blocks.end_stone, 0, 2);
		world.setBlock(i + 4, j + 3, k + 3, Blocks.end_stone, 0, 2);
		world.setBlock(i + 5, j + 3, k + 3, Blocks.end_stone, 0, 2);
		world.setBlock(i + 6, j + 3, k + 3, Blocks.end_stone, 0, 2);
		world.setBlock(i + 7, j + 3, k + 3, Blocks.end_stone, 0, 2);
		world.setBlock(i + 8, j + 3, k + 3, Blocks.end_stone, 0, 2);
		world.setBlock(i + 3, j + 3, k + 4, Blocks.end_stone, 0, 2);
		world.setBlock(i + 9, j + 3, k + 4, Blocks.end_stone, 0, 2);
		world.setBlock(i + 5, j + 3, k + 5, Blocks.end_stone, 0, 2);
		world.setBlock(i + 6, j + 3, k + 5, Blocks.end_stone, 0, 2);
		world.setBlock(i + 7, j + 3, k + 5, Blocks.end_stone, 0, 2);
		world.setBlock(i + 11, j + 3, k + 5, Blocks.end_stone, 0, 2);
		world.setBlock(i + 3, j + 3, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 5, j + 3, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 6, j + 3, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 7, j + 3, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 9, j + 3, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 10, j + 3, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 11, j + 3, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 3, j + 3, k + 7, Blocks.end_stone, 0, 2);
		world.setBlock(i + 5, j + 3, k + 7, Blocks.end_stone, 0, 2);
		world.setBlock(i + 6, j + 3, k + 7, Blocks.end_stone, 0, 2);
		world.setBlock(i + 7, j + 3, k + 7, Blocks.end_stone, 0, 2);
		world.setBlock(i + 9, j + 3, k + 7, Blocks.end_stone, 0, 2);
		world.setBlock(i + 11, j + 3, k + 7, Blocks.end_stone, 0, 2);
		world.setBlock(i + 3, j + 3, k + 8, Blocks.end_stone, 0, 2);
		world.setBlock(i + 9, j + 3, k + 8, Blocks.end_stone, 0, 2);
		world.setBlock(i + 4, j + 3, k + 9, Blocks.end_stone, 0, 2);
		world.setBlock(i + 5, j + 3, k + 9, Blocks.end_stone, 0, 2);
		world.setBlock(i + 6, j + 3, k + 9, Blocks.end_stone, 0, 2);
		world.setBlock(i + 8, j + 3, k + 9, Blocks.end_stone, 0, 2);
		world.setBlock(i + 5, j + 3, k + 10, Blocks.end_stone, 0, 2);
		world.setBlock(i + 7, j + 3, k + 10, Blocks.end_stone, 0, 2);
		world.setBlock(i + 6, j + 4, k + 0, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 5, j + 4, k + 1, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 6, j + 4, k + 1, Blocks.end_stone, 0, 2);
		world.setBlock(i + 7, j + 4, k + 1, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 4, j + 4, k + 2, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 5, j + 4, k + 2, Blocks.end_stone, 0, 2);
		world.setBlock(i + 6, j + 4, k + 2, Blocks.end_stone, 0, 2);
		world.setBlock(i + 7, j + 4, k + 2, Blocks.end_stone, 0, 2);
		world.setBlock(i + 8, j + 4, k + 2, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 3, j + 4, k + 3, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 4, j + 4, k + 3, Blocks.end_stone, 0, 2);
		world.setBlock(i + 5, j + 4, k + 3, Blocks.end_stone, 0, 2);
		world.setBlock(i + 6, j + 4, k + 3, Blocks.end_stone, 0, 2);
		world.setBlock(i + 7, j + 4, k + 3, Blocks.end_stone, 0, 2);
		world.setBlock(i + 8, j + 4, k + 3, Blocks.end_stone, 0, 2);
		world.setBlock(i + 9, j + 4, k + 3, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 2, j + 4, k + 4, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 3, j + 4, k + 4, Blocks.end_stone, 0, 2);
		world.setBlock(i + 4, j + 4, k + 4, NovaCraftBlocks.vacuum_sand, 0, 2);
		world.setBlock(i + 5, j + 4, k + 4, NovaCraftBlocks.vacuum_sand, 0, 2);
		world.setBlock(i + 6, j + 4, k + 4, NovaCraftBlocks.vacuum_sand, 0, 2);
		world.setBlock(i + 7, j + 4, k + 4, NovaCraftBlocks.vacuum_sand, 0, 2);
		world.setBlock(i + 8, j + 4, k + 4, NovaCraftBlocks.vacuum_sand, 0, 2);
		world.setBlock(i + 9, j + 4, k + 4, Blocks.end_stone, 0, 2);
		world.setBlock(i + 10, j + 4, k + 4, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 1, j + 4, k + 5, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 2, j + 4, k + 5, Blocks.end_stone, 0, 2);
		world.setBlock(i + 3, j + 4, k + 5, Blocks.end_stone, 0, 2);
		world.setBlock(i + 4, j + 4, k + 5, NovaCraftBlocks.vacuum_sand, 0, 2);
		world.setBlock(i + 5, j + 4, k + 5, Blocks.end_stone, 0, 2);
		world.setBlock(i + 6, j + 4, k + 5, Blocks.end_stone, 0, 2);
		world.setBlock(i + 7, j + 4, k + 5, Blocks.end_stone, 0, 2);
		world.setBlock(i + 8, j + 4, k + 5, NovaCraftBlocks.vacuum_sand, 0, 2);
		world.setBlock(i + 9, j + 4, k + 5, Blocks.end_stone, 0, 2);
		world.setBlock(i + 10, j + 4, k + 5, Blocks.end_stone, 0, 2);
		world.setBlock(i + 11, j + 4, k + 5, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 0, j + 4, k + 6, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 1, j + 4, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 2, j + 4, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 3, j + 4, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 4, j + 4, k + 6, NovaCraftBlocks.vacuum_sand, 0, 2);
		world.setBlock(i + 5, j + 4, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 6, j + 4, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 7, j + 4, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 8, j + 4, k + 6, NovaCraftBlocks.vacuum_sand, 0, 2);
		world.setBlock(i + 9, j + 4, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 10, j + 4, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 11, j + 4, k + 6, Blocks.end_stone, 0, 2);
		world.setBlock(i + 12, j + 4, k + 6, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 1, j + 4, k + 7, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 2, j + 4, k + 7, Blocks.end_stone, 0, 2);
		world.setBlock(i + 3, j + 4, k + 7, Blocks.end_stone, 0, 2);
		world.setBlock(i + 4, j + 4, k + 7, NovaCraftBlocks.vacuum_sand, 0, 2);
		world.setBlock(i + 5, j + 4, k + 7, Blocks.end_stone, 0, 2);
		world.setBlock(i + 6, j + 4, k + 7, Blocks.end_stone, 0, 2);
		world.setBlock(i + 7, j + 4, k + 7, Blocks.end_stone, 0, 2);
		world.setBlock(i + 8, j + 4, k + 7, NovaCraftBlocks.vacuum_sand, 0, 2);
		world.setBlock(i + 9, j + 4, k + 7, Blocks.end_stone, 0, 2);
		world.setBlock(i + 10, j + 4, k + 7, Blocks.end_stone, 0, 2);
		world.setBlock(i + 11, j + 4, k + 7, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 2, j + 4, k + 8, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 3, j + 4, k + 8, Blocks.end_stone, 0, 2);
		world.setBlock(i + 4, j + 4, k + 8, NovaCraftBlocks.vacuum_sand, 0, 2);
		world.setBlock(i + 5, j + 4, k + 8, NovaCraftBlocks.vacuum_sand, 0, 2);
		world.setBlock(i + 6, j + 4, k + 8, NovaCraftBlocks.vacuum_sand, 0, 2);
		world.setBlock(i + 7, j + 4, k + 8, NovaCraftBlocks.vacuum_sand, 0, 2);
		world.setBlock(i + 8, j + 4, k + 8, NovaCraftBlocks.vacuum_sand, 0, 2);
		world.setBlock(i + 9, j + 4, k + 8, Blocks.end_stone, 0, 2);
		world.setBlock(i + 10, j + 4, k + 8, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 3, j + 4, k + 9, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 4, j + 4, k + 9, Blocks.end_stone, 0, 2);
		world.setBlock(i + 5, j + 4, k + 9, Blocks.end_stone, 0, 2);
		world.setBlock(i + 6, j + 4, k + 9, Blocks.end_stone, 0, 2);
		world.setBlock(i + 7, j + 4, k + 9, Blocks.end_stone, 0, 2);
		world.setBlock(i + 8, j + 4, k + 9, Blocks.end_stone, 0, 2);
		world.setBlock(i + 9, j + 4, k + 9, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 4, j + 4, k + 10, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 5, j + 4, k + 10, Blocks.end_stone, 0, 2);
		world.setBlock(i + 6, j + 4, k + 10, Blocks.end_stone, 0, 2);
		world.setBlock(i + 7, j + 4, k + 10, Blocks.end_stone, 0, 2);
		world.setBlock(i + 8, j + 4, k + 10, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 5, j + 4, k + 11, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 6, j + 4, k + 11, Blocks.end_stone, 0, 2);
		world.setBlock(i + 7, j + 4, k + 11, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 6, j + 4, k + 12, OtherModBlocks.end_bricks, 0, 2);
		world.setBlock(i + 8, j + 5, k + 3, OtherModBlocks.purpur_pillar, 0, 2);
		world.setBlock(i + 5, j + 5, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 5, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 5, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 2, j + 5, k + 6, OtherModBlocks.purpur_pillar, 0, 2);
		world.setBlock(i + 5, j + 5, k + 6, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 5, k + 6, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 5, k + 6, Blocks.obsidian, 0, 2);
		world.setBlock(i + 5, j + 5, k + 7, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 5, k + 7, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 5, k + 7, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 5, k + 9, OtherModBlocks.purpur_pillar, 0, 2);
		world.setBlock(i + 8, j + 6, k + 3, OtherModBlocks.end_rod, 1, 2);
		world.setBlock(i + 5, j + 6, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 6, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 6, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 2, j + 6, k + 6, OtherModBlocks.end_rod, 1, 2);
		world.setBlock(i + 5, j + 6, k + 6, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 6, k + 6, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 6, k + 6, Blocks.obsidian, 0, 2);
		world.setBlock(i + 5, j + 6, k + 7, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 6, k + 7, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 6, k + 7, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 6, k + 9, OtherModBlocks.end_rod, 1, 2);
		world.setBlock(i + 5, j + 7, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 7, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 7, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 5, j + 7, k + 6, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 7, k + 6, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 7, k + 6, Blocks.obsidian, 0, 2);
		world.setBlock(i + 5, j + 7, k + 7, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 7, k + 7, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 7, k + 7, Blocks.obsidian, 0, 2);
		world.setBlock(i + 5, j + 8, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 8, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 8, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 5, j + 8, k + 6, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 8, k + 6, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 8, k + 6, Blocks.obsidian, 0, 2);
		world.setBlock(i + 5, j + 8, k + 7, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 8, k + 7, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 8, k + 7, Blocks.obsidian, 0, 2);
		world.setBlock(i + 5, j + 9, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 9, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 9, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 5, j + 9, k + 6, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 9, k + 6, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 9, k + 6, Blocks.obsidian, 0, 2);
		world.setBlock(i + 5, j + 9, k + 7, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 9, k + 7, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 9, k + 7, Blocks.obsidian, 0, 2);
		world.setBlock(i + 5, j + 10, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 10, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 10, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 5, j + 10, k + 6, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 10, k + 6, Blocks.glowstone, 0, 2);
		world.setBlock(i + 7, j + 10, k + 6, Blocks.obsidian, 0, 2);
		world.setBlock(i + 5, j + 10, k + 7, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 10, k + 7, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 10, k + 7, Blocks.obsidian, 0, 2);
		world.setBlock(i + 5, j + 11, k + 5, Blocks.iron_bars, 0, 2);
		world.setBlock(i + 6, j + 11, k + 5, Blocks.iron_bars, 0, 2);
		world.setBlock(i + 7, j + 11, k + 5, Blocks.iron_bars, 0, 2);
		world.setBlock(i + 5, j + 11, k + 6, Blocks.iron_bars, 0, 2);
		world.setBlock(i + 6, j + 11, k + 6, Blocks.chest, 5, 2);
		world.setBlock(i + 7, j + 11, k + 6, Blocks.iron_bars, 0, 2);
		world.setBlock(i + 5, j + 11, k + 7, Blocks.iron_bars, 0, 2);
		world.setBlock(i + 6, j + 11, k + 7, Blocks.iron_bars, 0, 2);
		world.setBlock(i + 7, j + 11, k + 7, Blocks.iron_bars, 0, 2);
		world.setBlock(i + 5, j + 12, k + 5, Blocks.iron_bars, 0, 2);
		world.setBlock(i + 6, j + 12, k + 5, Blocks.iron_bars, 0, 2);
		world.setBlock(i + 7, j + 12, k + 5, Blocks.iron_bars, 0, 2);
		world.setBlock(i + 5, j + 12, k + 6, Blocks.iron_bars, 0, 2);
		world.setBlock(i + 7, j + 12, k + 6, Blocks.iron_bars, 0, 2);
		world.setBlock(i + 5, j + 12, k + 7, Blocks.iron_bars, 0, 2);
		world.setBlock(i + 6, j + 12, k + 7, Blocks.iron_bars, 0, 2);
		world.setBlock(i + 7, j + 12, k + 7, Blocks.iron_bars, 0, 2);
		world.setBlock(i + 5, j + 13, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 13, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 13, k + 5, Blocks.obsidian, 0, 2);
		world.setBlock(i + 5, j + 13, k + 6, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 13, k + 6, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 13, k + 6, Blocks.obsidian, 0, 2);
		world.setBlock(i + 5, j + 13, k + 7, Blocks.obsidian, 0, 2);
		world.setBlock(i + 6, j + 13, k + 7, Blocks.obsidian, 0, 2);
		world.setBlock(i + 7, j + 13, k + 7, Blocks.obsidian, 0, 2);

    	return true;
    }

}
