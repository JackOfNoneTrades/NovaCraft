package com.NovaCraft.world.ancient_city;

import net.minecraft.world.gen.feature.*;
import net.minecraft.block.*;
import net.minecraft.world.*;
import java.util.*;

import com.NovaCraft.config.Configs;
import com.NovaCraft.registry.OtherModBlocks;
import com.NovaCraftBlocks.NovaCraftBlocks;

import cpw.mods.fml.common.Loader;
import net.minecraft.init.*;

public class AncientCityPositiveXRightBranch2Gen2 extends WorldGenerator
{
	public AncientCityPositiveXRightBranch2Gen2() {

	}
	
	private static final Block cobbled_deepslate = OtherModBlocks.cobbled_deepslate;
	private static final Block deepslate = OtherModBlocks.deepslate;
	private static final Block sculk_block = NovaCraftBlocks.sculk_block;
	private static final Block soul_lantern = OtherModBlocks.soul_lantern; //1
	private static final Block SoulLantern = OtherModBlocks.SoulLantern;
	private static final Block soul_sand = Blocks.soul_sand;
	private static final Block basalt_nether = OtherModBlocks.Basalt; //netherlicious
	private static final Block basalt_et = OtherModBlocks.basalt; //et futurum requiem	
	private static final Block smooth_basalt_nether = OtherModBlocks.BasaltBricks; //netherlicious 6
	private static final Block smooth_basalt_et = OtherModBlocks.smooth_basalt; //et futurum requiem
	
	private static final Block polished_deepslate = OtherModBlocks.polished_deepslate;
	private static final Block deepslate_brick_slab = OtherModBlocks.deepslate_brick_slab;
	private static final Block deepslate_tile_stairs = OtherModBlocks.deepslate_tile_stairs;
	private static final Block deepslate_brick_stairs = OtherModBlocks.deepslate_brick_stairs;
	private static final Block polished_deepslate_stairs = OtherModBlocks.polished_deepslate_stairs;
	private static final Block cobbled_deepslate_stairs = OtherModBlocks.cobbled_deepslate_stairs;
	private static final Block deepslate_wall = OtherModBlocks.deepslate_wall;
	private static final Block deepslate_brick_wall = OtherModBlocks.deepslate_brick_wall;
	private static final Block fence_dark_oak = OtherModBlocks.fence_dark_oak;	
	private static final Block deepslate_bricks = OtherModBlocks.deepslate_bricks;
	private static final Block cracked_deepslate_bricks = OtherModBlocks.deepslate_bricks;
	private static final Block deepslate_tiles = OtherModBlocks.deepslate_bricks;
	private static final Block cracked_deepslate_tiles = OtherModBlocks.deepslate_bricks;
	private static final Block chiseled_deepslate = OtherModBlocks.deepslate_bricks;
	
	private Block PlaceDeepslate;
	private Block PlaceDeepslateBricks;
	private Block PlaceDeepslateTiles;
	private Block PlaceCrackedDeepslateTiles;
	private Block PlaceCrackedDeepslateBricks;
	private Block PlaceChiseledDeepslate;
	private Block PlacePolishedDeepslate;
	private Block PlaceSoulLantern;
	private Block PlaceCobbledDeepslate;
	private Block PlaceSoulFire;
	private Block PlaceDarkOakFence;
	private Block PlaceBasalt;
	private Block PlaceSmoothBasalt;
	private Block ShouldPlaceSoulSand;
	
	private Block PlaceDeepslateBrickSlab;
	private Block PlaceDeepslateTileStairs;
	private Block PlaceDeepslateBrickStairs;
	private Block PlacePolishedDeepslateStairs;
	private Block PlaceCobbledDeepslateStairs;
	private Block PlaceDeepslateWall;
	private Block PlaceDeepslateBrickWall;
	
	private Block determineIfDarkOakFenceExists(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableDarkOakFenceInAncientCity == true && (existingBlock == null || existingBlock != fence_dark_oak)) {
            return Blocks.fence;
        } else {
            return fence_dark_oak;
        }
    }
	
	private Block determineIfCobbledDeepslateExists(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableCobbledDeepslateInAncientCity == true && (existingBlock == null || existingBlock != cobbled_deepslate)) {
            return NovaCraftBlocks.cobbled_grimstone; // Fallback to grimstone
        } else {
            return cobbled_deepslate; // Default to deepslate
        }
    }
	
	private Block determineIfDeepslateExists(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableDeepslateInAncientCity == true && (existingBlock == null || existingBlock != deepslate)) {
            return NovaCraftBlocks.grimstone; 
        } else {
            return deepslate;
        }
    }
	
	private Block determineIfDeepslateBricksExists(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableDeepslateBricksInAncientCity == true && (existingBlock == null || existingBlock != deepslate_bricks)) {
            return NovaCraftBlocks.grimstone_bricks;
        } else {
            return deepslate_bricks;
        }
    }
	
	private Block determineIfCrackedDeepslateBricksExists(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableDeepslateBricksInAncientCity == true && (existingBlock == null || existingBlock != cracked_deepslate_bricks)) {
            return NovaCraftBlocks.cracked_grimstone_bricks;
        } else {
            return cracked_deepslate_bricks;
        }
    }
	
	private Block determineIfDeepslateTilesExist(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableDeepslateBricksInAncientCity == true && (existingBlock == null || existingBlock != deepslate_tiles)) {
            return NovaCraftBlocks.grimstone_tiles;
        } else {
            return deepslate_tiles;
        }
    }
	
	private Block determineIfCrackedDeepslateTilesExist(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableDeepslateBricksInAncientCity == true && (existingBlock == null || existingBlock != cracked_deepslate_tiles)) {
            return NovaCraftBlocks.cracked_grimstone_tiles;
        } else {
            return cracked_deepslate_tiles;
        }
    }
	
	private Block determineIfPolishedDeepslateExists(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableDeepslateBricksInAncientCity == true && (existingBlock == null || existingBlock != polished_deepslate)) {
            return NovaCraftBlocks.polished_grimstone;
        } else {
            return polished_deepslate;
        }
    }
	
	private Block determineIfChiseledDeepslateExist(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableDeepslateBricksInAncientCity == true && (existingBlock == null || existingBlock != chiseled_deepslate)) {
            return NovaCraftBlocks.chiseled_grimstone;
        } else {
            return chiseled_deepslate;
        }
    }
	
	
	//Slabs, Walls, and Stairs
	private Block determineIfDeepslateTileStairsExists(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableDeepslateBricksInAncientCity == true && (existingBlock == null || existingBlock != deepslate_tile_stairs)) {
            return NovaCraftBlocks.grimstone_tiled_stairs;
        } else {
            return deepslate_tile_stairs;
        }
    }
	
	private Block determineIfDeepslateBrickStairsExists(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableDeepslateBricksInAncientCity == true && (existingBlock == null || existingBlock != deepslate_brick_stairs)) {
            return NovaCraftBlocks.grimstone_brick_stairs;
        } else {
            return deepslate_brick_stairs;
        }
    }
	
	private Block determineIfPolishedDeepslateStairsExists(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableDeepslateBricksInAncientCity == true && (existingBlock == null || existingBlock != polished_deepslate_stairs)) {
            return NovaCraftBlocks.grimstone_stairs;
        } else {
            return polished_deepslate_stairs;
        }
    }
	
	private Block determineIfCobbledDeepslateStairsExists(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableCobbledDeepslateInAncientCity == true && (existingBlock == null || existingBlock != cobbled_deepslate_stairs)) {
            return NovaCraftBlocks.cobbled_grimstone_stairs;
        } else {
            return cobbled_deepslate_stairs;
        }
    }
	
	private Block determineIfDeepslateWallExists(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableDeepslateBricksInAncientCity == true && (existingBlock == null || existingBlock != deepslate_wall)) {
            return NovaCraftBlocks.cobbled_grimstone_wall;
        } else {
            return deepslate_wall;
        }
    }
	
	private Block determineIfDeepslateBrickWallExists(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableDeepslateBricksInAncientCity == true && (existingBlock == null || existingBlock != deepslate_brick_wall)) {
            return NovaCraftBlocks.grimstone_brick_wall;
        } else {
            return deepslate_brick_wall;
        }
    }
	
	private Block determineIfDeepslateSlabExists(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableDeepslateBricksInAncientCity == true && (existingBlock == null || existingBlock != deepslate_brick_slab)) {
            return NovaCraftBlocks.grimstone_brick_slab;
        } else {
            return deepslate_brick_slab;
        }
    }
	
	private Block determineIfSoulLanternExists(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableEtFuturumSoulLanternInAncientCity == true && Loader.isModLoaded("netherlicious") && (existingBlock == null || existingBlock != soul_lantern)) {
        		return SoulLantern;
        } else if (Loader.isModLoaded("etfuturum") && (existingBlock == null || existingBlock != SoulLantern)) {
            return soul_lantern;
        } else {
        	return Blocks.air;
        }
    }
	
	private Block determineIfBasaltExists(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);
        
        if (Configs.disableNetherliciousBasaltInAncientCity == true && Loader.isModLoaded("etfuturum") && (existingBlock == null || existingBlock != basalt_et)) {
    		return basalt_et;
        } else if (Loader.isModLoaded("netherlicious") && (existingBlock == null || existingBlock != basalt_nether)) {
        	return basalt_nether;
    	} else {
    		return NovaCraftBlocks.polished_vanite_bricks;
    	}
    }
	
	private Block determineIfShouldPlaceSoulSand(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableEtFuturumSoulFireInAncientCity == true && Loader.isModLoaded("netherlicious") && (existingBlock == null || existingBlock != soul_sand)) {
    		return soul_sand;
        } else if (Loader.isModLoaded("etfuturum") && (existingBlock == null || existingBlock != soul_sand)) {
        	 return soul_sand;	
         }	else {
        	 return Blocks.netherrack;	     	
        }
    }
	
	private Block determineIfSmoothBasaltExists(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);
        
        if (Configs.disableNetherliciousSmoothBasaltInAncientCity == true && Loader.isModLoaded("etfuturum") && (existingBlock == null || existingBlock != smooth_basalt_et)) {
    		return smooth_basalt_et;
        } else if (Loader.isModLoaded("netherlicious") && (existingBlock == null || existingBlock != smooth_basalt_nether)) {
        	return smooth_basalt_nether;
    	} else {
    		return NovaCraftBlocks.polished_vanite_bricks;
    	}
    }
    
    public boolean generate(final World world, final Random random, final int i, final int j, final int k) {
    	PlaceCobbledDeepslate = determineIfCobbledDeepslateExists(world, i + 15, j + 2, k + 3);
    	
    	
    	PlaceDeepslateBricks = determineIfDeepslateBricksExists(world, i + 1, j + 1, k + 23);
    	PlaceCrackedDeepslateBricks = determineIfCrackedDeepslateBricksExists(world, i + 7, j + 1, k + 23);
    	PlaceDeepslateTiles = determineIfDeepslateTilesExist(world, i + 4, j + 2, k + 0);
    	PlaceCrackedDeepslateTiles = determineIfCrackedDeepslateTilesExist(world, i + 18, j + 2, k + 6);
    	PlaceChiseledDeepslate = determineIfChiseledDeepslateExist(world, i + 4, j + 2, k + 3);
    	PlacePolishedDeepslate = determineIfPolishedDeepslateExists(world, i + 1, j + 2, k + 1);
    	
    	PlaceDeepslateBrickStairs = determineIfDeepslateBrickStairsExists(world, i + 25, j + 1, k + 32);
    	
    	world.setBlock(i + 13, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 20, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 21, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 22, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 25, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 26, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 27, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 28, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 29, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 30, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 31, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 32, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 1, k + 22, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 1, k + 23, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 2, j + 1, k + 23, Blocks.wool, 7, 2);
		world.setBlock(i + 3, j + 1, k + 23, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 4, j + 1, k + 23, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 5, j + 1, k + 23, Blocks.wool, 7, 2);
		world.setBlock(i + 6, j + 1, k + 23, Blocks.wool, 7, 2);
		world.setBlock(i + 7, j + 1, k + 23, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 8, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 20, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 21, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 22, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 25, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 26, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 27, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 28, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 29, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 30, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 31, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 32, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 1, k + 23, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 1, k + 24, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 2, j + 1, k + 24, Blocks.wool, 7, 2);
		world.setBlock(i + 3, j + 1, k + 24, Blocks.wool, 7, 2);
		world.setBlock(i + 4, j + 1, k + 24, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 5, j + 1, k + 24, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 6, j + 1, k + 24, Blocks.wool, 7, 2);
		world.setBlock(i + 7, j + 1, k + 24, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 8, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 20, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 21, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 22, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 25, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 26, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 27, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 28, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 29, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 30, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 31, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 32, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 1, k + 24, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 1, k + 25, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 1, k + 25, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 2, j + 1, k + 25, Blocks.wool, 7, 2);
		world.setBlock(i + 3, j + 1, k + 25, Blocks.wool, 7, 2);
		world.setBlock(i + 4, j + 1, k + 25, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 5, j + 1, k + 25, Blocks.wool, 7, 2);
		world.setBlock(i + 6, j + 1, k + 25, Blocks.wool, 7, 2);
		world.setBlock(i + 7, j + 1, k + 25, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 8, j + 1, k + 25, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 9, j + 1, k + 25, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 10, j + 1, k + 25, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 11, j + 1, k + 25, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 12, j + 1, k + 25, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 1, k + 25, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 14, j + 1, k + 25, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 15, j + 1, k + 25, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 16, j + 1, k + 25, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 17, j + 1, k + 25, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 18, j + 1, k + 25, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 19, j + 1, k + 25, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 20, j + 1, k + 25, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 21, j + 1, k + 25, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 22, j + 1, k + 25, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 23, j + 1, k + 25, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 24, j + 1, k + 25, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 25, j + 1, k + 25, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 26, j + 1, k + 25, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 27, j + 1, k + 25, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 28, j + 1, k + 25, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 29, j + 1, k + 25, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 30, j + 1, k + 25, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 31, j + 1, k + 25, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 32, j + 1, k + 25, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 33, j + 1, k + 25, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 1, k + 26, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 1, k + 26, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 2, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 3, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 4, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 5, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 6, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 7, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 8, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 9, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 10, j + 1, k + 26, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 11, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 12, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 13, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 14, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 15, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 16, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 17, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 18, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 19, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 20, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 21, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 22, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 23, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 24, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 25, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 26, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 27, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 28, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 29, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 30, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 31, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 32, j + 1, k + 26, Blocks.wool, 7, 2);
		world.setBlock(i + 33, j + 1, k + 26, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 1, k + 27, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 1, k + 27, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 2, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 3, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 4, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 5, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 6, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 7, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 8, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 9, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 10, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 11, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 12, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 13, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 14, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 15, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 16, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 17, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 18, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 19, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 20, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 21, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 22, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 23, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 24, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 25, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 26, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 27, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 28, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 29, j + 1, k + 27, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 30, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 31, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 32, j + 1, k + 27, Blocks.wool, 7, 2);
		world.setBlock(i + 33, j + 1, k + 27, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 1, k + 28, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 1, k + 28, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 2, j + 1, k + 28, Blocks.wool, 7, 2);
		world.setBlock(i + 3, j + 1, k + 28, Blocks.wool, 7, 2);
		world.setBlock(i + 4, j + 1, k + 28, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 5, j + 1, k + 28, Blocks.wool, 7, 2);
		world.setBlock(i + 6, j + 1, k + 28, Blocks.wool, 7, 2);
		world.setBlock(i + 7, j + 1, k + 28, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 1, k + 28, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 9, j + 1, k + 28, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 10, j + 1, k + 28, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 11, j + 1, k + 28, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 12, j + 1, k + 28, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 13, j + 1, k + 28, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 14, j + 1, k + 28, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 1, k + 28, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 16, j + 1, k + 28, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 17, j + 1, k + 28, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 18, j + 1, k + 28, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 19, j + 1, k + 28, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 20, j + 1, k + 28, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 21, j + 1, k + 28, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 22, j + 1, k + 28, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 23, j + 1, k + 28, Blocks.wool, 7, 2);
		world.setBlock(i + 24, j + 1, k + 28, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 25, j + 1, k + 28, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 26, j + 1, k + 28, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 27, j + 1, k + 28, Blocks.wool, 7, 2);
		world.setBlock(i + 28, j + 1, k + 28, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 29, j + 1, k + 28, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 30, j + 1, k + 28, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 31, j + 1, k + 28, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 32, j + 1, k + 28, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 33, j + 1, k + 28, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 1, k + 29, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 1, k + 29, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 2, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 3, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 4, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 5, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 6, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 7, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 8, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 9, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 10, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 11, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 12, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 13, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 14, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 15, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 16, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 17, j + 1, k + 29, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 18, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 19, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 20, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 21, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 22, j + 1, k + 29, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 23, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 24, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 25, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 26, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 27, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 28, j + 1, k + 29, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 29, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 30, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 31, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 32, j + 1, k + 29, Blocks.wool, 7, 2);
		world.setBlock(i + 33, j + 1, k + 29, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 1, k + 30, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 1, k + 30, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 2, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 3, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 4, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 5, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 6, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 7, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 8, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 9, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 10, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 11, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 12, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 13, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 14, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 15, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 16, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 17, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 18, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 19, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 20, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 21, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 22, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 23, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 24, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 25, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 26, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 27, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 28, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 29, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 30, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 31, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 32, j + 1, k + 30, Blocks.wool, 7, 2);
		world.setBlock(i + 33, j + 1, k + 30, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 1, k + 31, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 1, k + 31, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 2, j + 1, k + 31, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 3, j + 1, k + 31, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 4, j + 1, k + 31, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 5, j + 1, k + 31, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 6, j + 1, k + 31, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 7, j + 1, k + 31, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 8, j + 1, k + 31, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 9, j + 1, k + 31, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 10, j + 1, k + 31, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 11, j + 1, k + 31, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 12, j + 1, k + 31, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 13, j + 1, k + 31, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 14, j + 1, k + 31, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 15, j + 1, k + 31, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 16, j + 1, k + 31, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 17, j + 1, k + 31, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 18, j + 1, k + 31, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 19, j + 1, k + 31, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 20, j + 1, k + 31, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 21, j + 1, k + 31, Blocks.air, 0, 2);
		world.setBlock(i + 22, j + 1, k + 31, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 1, k + 31, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 1, k + 31, Blocks.air, 0, 2);
		world.setBlock(i + 25, j + 1, k + 31, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 26, j + 1, k + 31, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 27, j + 1, k + 31, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 28, j + 1, k + 31, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 29, j + 1, k + 31, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 30, j + 1, k + 31, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 31, j + 1, k + 31, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 32, j + 1, k + 31, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 33, j + 1, k + 31, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 20, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 21, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 22, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 25, j + 1, k + 32, PlaceDeepslateBrickStairs, 3, 2);
		world.setBlock(i + 26, j + 1, k + 32, PlaceDeepslateBrickStairs, 3, 2);
		world.setBlock(i + 27, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 28, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 29, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 30, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 31, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 32, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 1, k + 32, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 20, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 21, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 22, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 25, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 26, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 27, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 28, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 29, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 30, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 31, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 32, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 1, k + 33, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 20, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 21, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 22, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 25, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 26, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 27, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 28, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 29, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 30, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 31, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 32, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 1, k + 34, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 2, k + 0, PlaceDeepslateTiles, 2, 2);
		world.setBlock(i + 5, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 20, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 21, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 22, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 25, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 26, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 27, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 28, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 29, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 30, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 31, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 32, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 2, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 2, k + 1, PlacePolishedDeepslate, 0, 2);
		world.setBlock(i + 2, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 2, k + 1, PlaceDeepslateTiles, 2, 2);
		world.setBlock(i + 5, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 2, k + 1, PlacePolishedDeepslate, 0, 2);
		world.setBlock(i + 8, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 20, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 21, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 22, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 25, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 26, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 27, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 28, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 29, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 30, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 31, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 32, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 2, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 2, k + 2, PlaceDeepslateTiles, 2, 2);
		world.setBlock(i + 5, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 20, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 21, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 22, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 25, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 26, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 27, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 28, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 29, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 30, j + 2, k + 2, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 31, j + 2, k + 2, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 32, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 2, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 2, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 2, k + 3, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 2, j + 2, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 2, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 2, k + 3, PlaceChiseledDeepslate, 4, 2);
		world.setBlock(i + 5, j + 2, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 2, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 2, k + 3, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 8, j + 2, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 2, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 2, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 2, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 2, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 2, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 2, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 2, k + 3, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 16, j + 2, k + 3, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 17, j + 2, k + 3, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 18, j + 2, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 2, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 20, j + 2, k + 3, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 21, j + 2, k + 3, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 22, j + 2, k + 3, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 23, j + 2, k + 3, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 24, j + 2, k + 3, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 25, j + 2, k + 3, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 26, j + 2, k + 3, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 27, j + 2, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 28, j + 2, k + 3, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 29, j + 2, k + 3, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 30, j + 2, k + 3, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 31, j + 2, k + 3, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 32, j + 2, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 2, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 2, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 2, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 2, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 2, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 2, k + 4, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 5, j + 2, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 2, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 2, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 2, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 2, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 2, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 2, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 2, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 2, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 2, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 2, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 2, k + 4, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 17, j + 2, k + 4, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 18, j + 2, k + 4, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 19, j + 2, k + 4, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 20, j + 2, k + 4, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 21, j + 2, k + 4, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 22, j + 2, k + 4, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 23, j + 2, k + 4, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 24, j + 2, k + 4, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 25, j + 2, k + 4, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 26, j + 2, k + 4, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 27, j + 2, k + 4, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 28, j + 2, k + 4, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 29, j + 2, k + 4, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 30, j + 2, k + 4, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 31, j + 2, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 32, j + 2, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 2, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 2, k + 5, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 5, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 2, k + 5, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 16, j + 2, k + 5, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 17, j + 2, k + 5, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 18, j + 2, k + 5, PlaceDeepslateTiles, 2, 2);
		world.setBlock(i + 19, j + 2, k + 5, PlaceDeepslateTiles, 2, 2);
		world.setBlock(i + 20, j + 2, k + 5, PlaceDeepslateTiles, 2, 2);
		world.setBlock(i + 21, j + 2, k + 5, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 22, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 25, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 26, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 27, j + 2, k + 5, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 28, j + 2, k + 5, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 29, j + 2, k + 5, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 30, j + 2, k + 5, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 31, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 32, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 2, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 2, k + 6, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 16, j + 2, k + 6, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 17, j + 2, k + 6, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 18, j + 2, k + 6, PlaceCrackedDeepslateTiles, 3, 2);
		world.setBlock(i + 19, j + 2, k + 6, PlaceDeepslateTiles, 2, 2);
		world.setBlock(i + 20, j + 2, k + 6, PlaceDeepslateTiles, 2, 2);
		world.setBlock(i + 21, j + 2, k + 6, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 22, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 25, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 26, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 27, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 28, j + 2, k + 6, PlaceCrackedDeepslateTiles, 3, 2);
		world.setBlock(i + 29, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 30, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 31, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 32, j + 2, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 2, k + 6, PlaceChiseledDeepslate, 4, 2);
		world.setBlock(i + 0, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 2, k + 7, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 16, j + 2, k + 7, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 17, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 20, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 21, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 22, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 25, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 26, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 27, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 28, j + 2, k + 7, PlaceCrackedDeepslateTiles, 3, 2);
		world.setBlock(i + 29, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 30, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 31, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 32, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 2, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 2, k + 8, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 16, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 20, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 21, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 22, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 25, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 26, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 27, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 28, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 29, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 30, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 31, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 32, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 2, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 2, k + 9, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 16, j + 2, k + 9, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 17, j + 2, k + 9, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 18, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 20, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 21, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 22, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 25, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 26, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 27, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 28, j + 2, k + 9, PlaceDeepslateTiles, 2, 2);
		world.setBlock(i + 29, j + 2, k + 9, PlaceCrackedDeepslateTiles, 3, 2);
		world.setBlock(i + 30, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 31, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 32, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 2, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 2, k + 10, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 16, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 20, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 21, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 22, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 25, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 26, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 27, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 28, j + 2, k + 10, PlaceDeepslateTiles, 2, 2);
		world.setBlock(i + 29, j + 2, k + 10, PlaceDeepslateTiles, 2, 2);
		world.setBlock(i + 30, j + 2, k + 10, NovaCraftBlocks.sculk_vein, 1, 2);
		world.setBlock(i + 31, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 32, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 2, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 2, k + 11, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 16, j + 2, k + 11, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 17, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 20, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 21, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 22, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 25, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 26, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 27, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 28, j + 2, k + 11, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 29, j + 2, k + 11, PlaceChiseledDeepslate, 4, 2);
		world.setBlock(i + 30, j + 2, k + 11, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 31, j + 2, k + 11, NovaCraftBlocks.sculk_vein, 1, 2);
		world.setBlock(i + 32, j + 2, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 2, k + 11, PlaceChiseledDeepslate, 4, 2);
		world.setBlock(i + 0, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 2, k + 12, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 16, j + 2, k + 12, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 17, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 20, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 21, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 22, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 25, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 26, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 27, j + 2, k + 12, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 28, j + 2, k + 12, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 29, j + 2, k + 12, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 30, j + 2, k + 12, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 31, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 32, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 2, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 2, k + 13, PlaceDeepslateBrickStairs, 6, 2);
		world.setBlock(i + 5, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 2, k + 13, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 16, j + 2, k + 13, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 17, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 20, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 21, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 22, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 2, k + 13, NovaCraftBlocks.sculk_vein, 2, 2);
		world.setBlock(i + 25, j + 2, k + 13, NovaCraftBlocks.sculk_vein, 2, 2);
		world.setBlock(i + 26, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 27, j + 2, k + 13, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 28, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 29, j + 2, k + 13, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 30, j + 2, k + 13, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 31, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 32, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 2, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 2, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 2, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 2, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 2, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 2, k + 14, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 5, j + 2, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 2, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 2, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 2, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 2, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 2, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 2, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 2, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 2, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 2, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 2, k + 14, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 16, j + 2, k + 14, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 17, j + 2, k + 14, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 18, j + 2, k + 14, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 19, j + 2, k + 14, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 20, j + 2, k + 14, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 21, j + 2, k + 14, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 22, j + 2, k + 14, NovaCraftBlocks.sculk_vein, 2, 2);
		world.setBlock(i + 23, j + 2, k + 14, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 24, j + 2, k + 14, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 25, j + 2, k + 14, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 26, j + 2, k + 14, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 27, j + 2, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 28, j + 2, k + 14, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 29, j + 2, k + 14, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 30, j + 2, k + 14, NovaCraftBlocks.sculk_vein, 5, 2);
		world.setBlock(i + 31, j + 2, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 32, j + 2, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 2, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 2, k + 15, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 2, k + 15, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 2, j + 2, k + 15, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 2, k + 15, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 2, k + 15, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 5, j + 2, k + 15, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 2, k + 15, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 2, k + 15, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 2, k + 15, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 2, k + 15, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 2, k + 15, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 2, k + 15, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 2, k + 15, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 2, k + 15, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 2, k + 15, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 2, k + 15, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 16, j + 2, k + 15, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 17, j + 2, k + 15, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 18, j + 2, k + 15, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 2, k + 15, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 20, j + 2, k + 15, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 21, j + 2, k + 15, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 22, j + 2, k + 15, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 23, j + 2, k + 15, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 24, j + 2, k + 15, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 25, j + 2, k + 15, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 26, j + 2, k + 15, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 27, j + 2, k + 15, PlaceCobbledDeepslate, 0, 2);
		world.setBlock(i + 28, j + 2, k + 15, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 29, j + 2, k + 15, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 30, j + 2, k + 15, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 31, j + 2, k + 15, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 32, j + 2, k + 15, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 2, k + 15, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 2, k + 16, NovaCraftBlocks.sculk_block, 0, 2);
		world.setBlock(i + 5, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 21, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 28, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 29, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 30, j + 2, k + 16, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 31, j + 2, k + 16, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 32, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 2, k + 16, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 2, k + 17, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 2, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 2, k + 17, PlaceChiseledDeepslate, 4, 2);
		world.setBlock(i + 5, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 2, k + 17, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 8, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 20, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 21, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 22, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 25, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 26, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 27, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 28, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 29, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 30, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 31, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 32, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 2, k + 17, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 2, k + 18, PlacePolishedDeepslate, 0, 2);
		world.setBlock(i + 2, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 2, k + 18, PlaceDeepslateTiles, 2, 2);
		world.setBlock(i + 5, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 2, k + 18, PlacePolishedDeepslate, 0, 2);
		world.setBlock(i + 8, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 20, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 21, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 22, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 23, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 24, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 25, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 26, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 27, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 28, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 29, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 30, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 31, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 32, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 33, j + 2, k + 18, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 2, k + 19, PlaceDeepslateTiles, 2, 2);
		world.setBlock(i + 5, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 20, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 21, j + 2, k + 19, Blocks.air, 0, 2);
		world.setBlock(i + 22, j + 2, k + 19, Blocks.air, 0, 2);
    	
    	return true;
    }

}
