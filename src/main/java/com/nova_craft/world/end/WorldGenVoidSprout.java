package com.nova_craft.world.end;

import java.util.Random;

import com.nova_craftBlocks.NovaCraftBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.util.ForgeDirection;

public class WorldGenVoidSprout extends WorldGenerator
{
    private Block field_150552_a;
    private int field_150551_b;
    //private static final String __OBFID = "CL_00000410";

    public WorldGenVoidSprout(Block p_i45452_1_)
    {
        this.field_150552_a = p_i45452_1_;

    }

    public void func_150550_a(Block p_150550_1_, int p_150550_2_)
    {
        this.field_150552_a = p_150550_1_;
        this.field_150551_b = p_150550_2_;
    }


    private Block Grass;

    private int GroupSize;

    public WorldGenVoidSprout(Block block, int size)
    {
        this.Grass = block;

        this.GroupSize = size;
    }

    public boolean generate(World world, Random random, int x, int y, int z)
    {
    	for (int l = 0; l < this.GroupSize; ++l)
        {
    		int i1 = x + random.nextInt(8) - random.nextInt(8);
            int j1 = y + random.nextInt(3) - random.nextInt(3);
            int k1 = z + random.nextInt(8) - random.nextInt(8);

            if (world.isAirBlock(i1, j1, k1) && world.getBlock(i1, j1 -1, k1).isSideSolid(world, i1, j1-1, k1, ForgeDirection.getOrientation(1))) {
            	world.setBlock(i1, j1, k1, this.Grass, 1, 2); //7
            }

        }

        return true;
    }
}

