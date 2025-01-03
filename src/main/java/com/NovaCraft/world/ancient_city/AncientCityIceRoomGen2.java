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

public class AncientCityIceRoomGen2 extends WorldGenerator
{
	public AncientCityIceRoomGen2() {

	}
	
	private static final Block cobbled_deepslate = OtherModBlocks.cobbled_deepslate;
	private static final Block deepslate = OtherModBlocks.deepslate;
	private static final Block sculk_block = NovaCraftBlocks.sculk_block;
	private static final Block soul_lantern = OtherModBlocks.soul_lantern; //1
	private static final Block SoulLantern = OtherModBlocks.SoulLantern;
	private static final Block soul_sand = Blocks.netherrack;
	private static final Block blue_ice = OtherModBlocks.blue_ice;
	private static final Block basalt_nether = OtherModBlocks.Basalt; //netherlicious
	private static final Block basalt_et = OtherModBlocks.basalt; //et futurum requiem
	private static final Block iron_trapdoor = OtherModBlocks.iron_trapdoor;
	
	private static final Block polished_deepslate = OtherModBlocks.polished_deepslate;
	private static final Block deepslate_brick_slab = OtherModBlocks.deepslate_brick_slab;
	private static final Block deepslate_tile_stairs = OtherModBlocks.deepslate_tile_stairs;
	private static final Block deepslate_brick_stairs = OtherModBlocks.deepslate_brick_stairs;
	private static final Block polished_deepslate_stairs = OtherModBlocks.polished_deepslate_stairs;
	private static final Block deepslate_wall = OtherModBlocks.deepslate_wall;
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
	private Block PlaceBlueIce;
	private Block PlaceIronTrapdoor;
	private Block PlaceBasalt;
	
	private Block PlaceDeepslateBrickSlab;
	private Block PlaceDeepslateTileStairs;
	private Block PlaceDeepslateBrickStairs;
	private Block PlacePolishedDeepslateStairs;
	private Block PlaceDeepslateWall;
	
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
	
	private Block determineIfBlueIceExists(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableBlueIceInAncientCity == true && (existingBlock == null || existingBlock != blue_ice)) {
            return Blocks.packed_ice;
        } else {
            return blue_ice;
        }
    }
	
	private Block determineIfIronTrapdoorExists(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableIronTrapdoorInAncientCity == true && (existingBlock == null || existingBlock != iron_trapdoor)) {
            return Blocks.trapdoor;
        } else {
            return iron_trapdoor;
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
	
	private Block determineIfDeepslateWallExists(World world, int x, int y, int z) {
        Block existingBlock = world.getBlock(x, y, z);

        if (Configs.disableDeepslateBricksInAncientCity == true && (existingBlock == null || existingBlock != deepslate_wall)) {
            return NovaCraftBlocks.cobbled_grimstone_wall;
        } else {
            return deepslate_wall;
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
    
    public boolean generate(final World world, final Random random, final int i, final int j, final int k) {
    	PlaceDeepslateBricks = determineIfDeepslateBricksExists(world, i + 5, j + 7, k + 5);
    	PlaceCrackedDeepslateBricks = determineIfCrackedDeepslateBricksExists(world, i + 16, j + 7, k + 3);
    	
    	PlaceDeepslateBrickStairs = determineIfDeepslateBrickStairsExists(world, i + 5, j + 8, k + 6);
    	
    	world.setBlock(i + 19, j + 7, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 7, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 7, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 7, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 7, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 7, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 7, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 7, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 7, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 7, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 7, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 7, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 7, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 7, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 7, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 7, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 7, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 7, k + 3, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 17, j + 7, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 7, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 7, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 7, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 7, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 7, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 7, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 7, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 7, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 7, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 7, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 7, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 7, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 7, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 7, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 7, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 7, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 7, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 7, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 7, k + 4, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 17, j + 7, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 7, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 7, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 7, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 7, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 7, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 7, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 7, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 7, k + 5, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 6, j + 7, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 7, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 7, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 7, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 7, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 7, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 7, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 7, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 7, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 7, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 7, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 7, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 7, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 7, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 7, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 7, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 7, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 7, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 7, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 7, k + 6, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 6, j + 7, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 7, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 7, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 7, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 7, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 7, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 7, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 7, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 7, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 7, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 7, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 7, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 7, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 7, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 7, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 7, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 7, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 7, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 7, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 7, k + 7, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 6, j + 7, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 7, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 7, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 7, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 7, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 7, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 7, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 7, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 7, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 7, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 7, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 7, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 7, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 7, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 7, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 7, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 7, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 7, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 7, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 7, k + 8, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 6, j + 7, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 7, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 7, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 7, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 7, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 7, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 7, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 7, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 7, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 7, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 7, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 7, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 7, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 7, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 7, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 7, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 7, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 7, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 7, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 7, k + 9, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 6, j + 7, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 7, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 7, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 7, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 7, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 7, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 7, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 7, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 7, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 7, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 7, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 7, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 7, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 7, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 7, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 7, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 7, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 7, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 7, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 7, k + 10, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 6, j + 7, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 7, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 7, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 7, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 7, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 7, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 7, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 7, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 7, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 7, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 7, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 7, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 7, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 7, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 7, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 7, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 7, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 7, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 7, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 7, k + 11, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 6, j + 7, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 7, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 7, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 7, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 7, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 7, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 7, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 7, k + 11, NovaCraftBlocks.sculk_vein, 2, 2);
		world.setBlock(i + 14, j + 7, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 7, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 7, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 7, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 7, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 7, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 7, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 7, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 7, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 7, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 7, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 7, k + 12, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 6, j + 7, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 7, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 7, k + 12, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 9, j + 7, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 7, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 7, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 7, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 7, k + 12, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 14, j + 7, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 7, k + 12, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 16, j + 7, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 7, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 7, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 7, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 7, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 7, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 7, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 7, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 7, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 7, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 7, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 7, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 7, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 7, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 7, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 7, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 7, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 7, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 7, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 7, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 7, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 7, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 7, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 7, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 7, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 7, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 7, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 7, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 7, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 7, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 7, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 7, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 7, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 7, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 7, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 7, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 7, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 7, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 7, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 7, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 7, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 7, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 7, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 7, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 8, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 8, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 8, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 8, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 8, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 8, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 8, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 8, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 8, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 8, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 8, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 8, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 8, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 8, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 8, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 8, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 8, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 8, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 8, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 8, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 8, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 8, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 8, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 8, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 8, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 8, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 8, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 8, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 8, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 8, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 8, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 8, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 8, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 8, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 8, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 8, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 8, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 8, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 8, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 8, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 8, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 8, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 8, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 8, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 8, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 8, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 8, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 8, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 8, k + 2, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 9, j + 8, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 8, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 8, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 8, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 8, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 8, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 8, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 8, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 8, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 8, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 8, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 8, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 8, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 8, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 8, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 8, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 8, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 8, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 8, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 8, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 8, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 8, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 8, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 8, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 8, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 8, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 8, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 8, k + 3, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 17, j + 8, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 8, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 8, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 8, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 8, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 8, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 8, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 8, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 8, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 8, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 8, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 8, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 8, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 8, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 8, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 8, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 8, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 8, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 8, k + 4, NovaCraftBlocks.sculk_vein, 4, 2);
		world.setBlock(i + 16, j + 8, k + 4, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 17, j + 8, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 8, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 8, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 8, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 8, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 8, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 8, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 8, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 8, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 8, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 8, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 8, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 8, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 8, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 8, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 8, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 8, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 8, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 8, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 8, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 8, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 8, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 8, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 8, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 8, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 8, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 8, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 8, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 8, k + 6, PlaceDeepslateBrickStairs, 2, 2);
		world.setBlock(i + 6, j + 8, k + 6, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 7, j + 8, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 8, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 8, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 8, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 8, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 8, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 8, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 8, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 8, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 8, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 8, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 8, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 8, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 8, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 8, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 8, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 8, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 8, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 8, k + 7, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 6, j + 8, k + 7, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 7, j + 8, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 8, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 8, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 8, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 8, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 8, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 8, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 8, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 8, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 8, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 8, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 8, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 8, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 8, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 8, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 8, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 8, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 8, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 8, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 8, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 8, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 8, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 8, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 8, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 8, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 8, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 8, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 8, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 8, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 8, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 8, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 8, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 8, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 8, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 8, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 8, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 8, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 8, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 8, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 8, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 8, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 8, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 8, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 8, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 8, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 8, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 8, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 8, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 8, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 8, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 8, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 8, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 8, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 8, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 8, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 8, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 8, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 8, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 8, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 8, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 8, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 8, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 8, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 8, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 8, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 8, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 8, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 8, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 8, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 8, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 8, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 8, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 8, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 8, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 8, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 8, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 8, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 8, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 8, k + 11, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 6, j + 8, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 8, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 8, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 8, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 8, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 8, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 8, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 8, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 8, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 8, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 8, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 8, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 8, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 8, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 8, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 8, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 8, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 8, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 8, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 8, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 8, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 8, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 8, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 8, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 8, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 8, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 8, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 8, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 8, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 8, k + 12, PlaceDeepslateBricks, 0, 2);
		world.setBlock(i + 16, j + 8, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 8, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 8, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 8, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 8, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 8, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 8, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 8, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 8, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 8, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 8, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 8, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 8, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 8, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 8, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 8, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 8, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 8, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 8, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 8, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 8, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 8, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 8, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 8, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 8, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 8, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 8, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 8, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 8, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 8, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 8, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 8, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 8, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 8, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 8, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 8, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 8, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 8, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 8, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 8, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 8, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 8, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 8, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 8, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 9, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 9, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 9, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 9, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 9, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 9, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 9, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 9, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 9, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 9, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 9, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 9, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 9, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 9, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 9, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 9, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 9, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 9, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 9, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 9, k + 0, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 9, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 9, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 9, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 9, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 9, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 9, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 9, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 9, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 9, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 9, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 9, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 9, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 9, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 9, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 9, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 9, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 9, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 9, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 9, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 9, k + 1, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 9, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 9, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 9, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 9, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 9, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 9, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 9, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 9, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 9, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 9, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 9, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 9, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 9, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 9, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 9, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 9, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 9, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 9, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 9, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 9, k + 2, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 9, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 9, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 9, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 9, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 9, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 9, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 9, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 9, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 9, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 9, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 9, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 9, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 9, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 9, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 9, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 9, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 9, k + 3, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 17, j + 9, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 9, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 9, k + 3, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 9, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 9, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 9, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 9, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 9, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 9, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 9, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 9, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 9, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 9, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 9, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 9, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 9, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 9, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 9, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 9, k + 4, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 16, j + 9, k + 4, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 17, j + 9, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 9, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 9, k + 4, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 9, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 9, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 9, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 9, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 9, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 9, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 9, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 9, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 9, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 9, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 9, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 9, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 9, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 9, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 9, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 9, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 9, k + 5, PlaceCrackedDeepslateBricks, 1, 2);
		world.setBlock(i + 17, j + 9, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 9, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 9, k + 5, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 9, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 9, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 9, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 9, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 9, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 9, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 9, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 9, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 9, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 9, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 9, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 9, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 9, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 9, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 9, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 9, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 9, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 9, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 9, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 9, k + 6, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 9, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 9, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 9, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 9, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 9, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 9, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 9, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 9, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 9, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 9, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 9, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 9, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 9, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 9, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 9, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 9, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 9, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 9, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 9, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 9, k + 7, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 9, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 9, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 9, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 9, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 9, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 9, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 9, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 9, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 9, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 9, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 9, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 9, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 9, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 9, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 9, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 9, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 9, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 9, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 9, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 9, k + 8, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 9, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 9, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 9, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 9, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 9, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 9, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 9, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 9, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 9, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 9, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 9, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 9, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 9, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 9, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 9, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 9, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 9, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 9, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 9, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 9, k + 9, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 9, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 9, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 9, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 9, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 9, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 9, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 9, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 9, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 9, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 9, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 9, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 9, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 9, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 9, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 9, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 9, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 9, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 9, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 9, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 9, k + 10, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 9, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 9, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 9, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 9, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 9, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 9, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 9, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 9, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 9, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 9, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 9, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 9, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 9, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 9, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 9, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 9, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 9, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 9, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 9, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 9, k + 11, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 9, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 9, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 9, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 9, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 9, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 9, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 9, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 9, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 9, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 9, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 9, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 9, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 9, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 9, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 9, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 9, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 9, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 9, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 9, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 9, k + 12, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 9, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 9, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 9, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 9, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 9, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 9, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 9, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 9, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 9, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 9, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 9, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 9, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 9, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 9, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 9, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 9, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 9, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 9, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 9, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 9, k + 13, Blocks.air, 0, 2);
		world.setBlock(i + 0, j + 9, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 1, j + 9, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 2, j + 9, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 3, j + 9, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 4, j + 9, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 5, j + 9, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 6, j + 9, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 7, j + 9, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 8, j + 9, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 9, j + 9, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 10, j + 9, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 11, j + 9, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 12, j + 9, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 13, j + 9, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 14, j + 9, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 15, j + 9, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 16, j + 9, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 17, j + 9, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 18, j + 9, k + 14, Blocks.air, 0, 2);
		world.setBlock(i + 19, j + 9, k + 14, Blocks.air, 0, 2);
    	
    	return true;
    }

}
