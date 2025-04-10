package com.nova_craft.entity;

import com.nova_craft.NovaCraft;
import com.nova_craft.Items.NovaCraftItems;
import com.nova_craftBlocks.NovaCraftBlocks;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntitySculkHunger extends EntityMob
{
	public EntitySculkHunger(final World p_i1745_1_) {
		super(p_i1745_1_);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
		this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
		addRandomArmor();
		setSize(0.6F, 1.8F);
		this.experienceValue = 5;
	}

	@Override
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();

		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(3.85D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50.0D);
		this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.20D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(60D);
		this.setHealth(25);
	}

	@Override
	protected void addRandomArmor()
	{
		this.setCurrentItemOrArmor(0, new ItemStack(NovaCraftItems.sculked_blade));
	}

	@Override
	public boolean attackEntityAsMob(final Entity entity) {
		final boolean flag = super.attackEntityAsMob(entity);
		if (flag) {
			final int i = this.worldObj.difficultySetting.getDifficultyId();
			if (this.getHeldItem() == null && this.isBurning() && this.rand.nextFloat() < i * 0.3f) {
				entity.setFire(0 * i);
			}
		}

		this.addPotionEffect(new PotionEffect(Potion.regeneration.id, 60, 1));
        int rand = (int)(1 + Math.random() * 3);
		switch (rand)
        {
            case 1:
            	((EntityLivingBase) entity).addPotionEffect(new PotionEffect(Potion.poison.id, 100, 1));
                break;
            case 2:
            	((EntityLivingBase) entity).addPotionEffect(new PotionEffect(Potion.wither.id, 100, 0));
            	break;
            case 3:
            	((EntityLivingBase) entity).addPotionEffect(new PotionEffect(Potion.harm.id, 1, 0));
        }


		return flag;
	}

	public void onLivingUpdate()
	{
		if (this.worldObj.isDaytime() && !this.worldObj.isRemote && this.worldObj.provider.dimensionId != 1 && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ))) {
            this.damageEntity(DamageSource.drown, 2.0f);
            this.setFire(4);
        }
		super.onLivingUpdate();
	}

	 protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
	    {
	        int j;
	        int k;
	        {
	            j = this.rand.nextInt(1 + p_70628_2_);

	            for (k = 0; k < j; ++k)
	            {
	                this.dropItem(NovaCraftItems.sculk_flesh, 1);
	            }
	        }

	        j = this.rand.nextInt(1 + p_70628_2_);

	        for (k = 0; k < j; ++k)
	        {
	        	this.dropItem(Item.getItemFromBlock(NovaCraftBlocks.sculk_block), 1);
	        }

	    }

	 protected void dropRareDrop(int p_70600_1_)
	    {
	     this.dropItem(NovaCraftItems.sculk_dweller_heart, 1);
	    }

	public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }

	/**
     * Returns the sound this mob makes while it's alive.
     */
	@Override
    protected String getLivingSound()
    {
        return "nova_craft:sculk_abomination.living";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
	@Override
    protected String getHurtSound()
    {
        return "nova_craft:warden_altar.shriek";
    }

    /**
     * Returns the sound this mob makes on death.
     */
	@Override
    protected String getDeathSound()
    {
        return "nova_craft:sculk_abomination.death";
    }

	public boolean getCanSpawnHere() {
        final int i = MathHelper.floor_double(this.posX);
        final int j = MathHelper.floor_double(this.boundingBox.minY);
        final int k = MathHelper.floor_double(this.posZ);
        final boolean canSpawn = this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes((Entity)this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox);
        return (this.worldObj.getBlock(i, j - 1, k) == NovaCraftBlocks.nullstone_bricks || this.worldObj.getBlock(i, j - 1, k) == NovaCraftBlocks.grimstone_bricks || this.worldObj.getBlock(i, j - 1, k) == NovaCraftBlocks.sculk_bricks || this.worldObj.getBlock(i, j - 1, k) == NovaCraftBlocks.sculk_block || this.worldObj.getBlock(i, j - 1, k) == NovaCraftBlocks.sculk_stone || this.worldObj.getBlock(i, j - 1, k) == NovaCraftBlocks.sculk_grimstone || this.worldObj.getBlock(i, j - 1, k) == NovaCraftBlocks.sculk_deepslate || this.worldObj.getBlock(i, j - 1, k) == NovaCraftBlocks.sculk_nullstone || this.worldObj.getBlock(i, j - 1, k) == NovaCraftBlocks.sculk_endstone || this.worldObj.getBlock(i, j - 1, k) == NovaCraftBlocks.inked_sculk_block  || this.worldObj.getBlock(i, j - 1, k) == Blocks.end_stone || this.worldObj.getBlock(i, j - 1, k) == NovaCraftBlocks.sculk_tentacle_1 || this.worldObj.getBlock(i, j - 1, k) == NovaCraftBlocks.sculk_tentacle_2 || this.worldObj.getBlock(i, j - 1, k) == NovaCraftBlocks.nullstone) && this.worldObj.getBlockLightValue(i, j, k) < 8 && canSpawn;



    }

}
