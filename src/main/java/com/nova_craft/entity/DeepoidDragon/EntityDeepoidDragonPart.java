package com.nova_craft.entity.DeepoidDragon;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;

public class EntityDeepoidDragonPart extends Entity
{
    /** The dragon entity this dragon part belongs to */
    public final GIEntityMultiPart entityDragonObj;
    public final String field_146032_b;
    //private static final String __OBFID = "CL_00001657";

    public EntityDeepoidDragonPart(GIEntityMultiPart p_i1697_1_, String p_i1697_2_, float p_i1697_3_, float p_i1697_4_)
    {
        super(p_i1697_1_.func_82194_d());
        this.setSize(p_i1697_3_, p_i1697_4_);
        this.entityDragonObj = p_i1697_1_;
        this.field_146032_b = p_i1697_2_;
    }

    protected void entityInit() {}

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    protected void readEntityFromNBT(NBTTagCompound p_70037_1_) {}

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    protected void writeEntityToNBT(NBTTagCompound p_70014_1_) {}

    /**
     * Returns true if other Entities should be prevented from moving through this Entity.
     */
    public boolean canBeCollidedWith()
    {
        return true;
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_)
    {
        return this.isEntityInvulnerable() ? false : this.entityDragonObj.aattackEntityFromPart(this, p_70097_1_, p_70097_2_);
    }

    /**
     * Returns true if Entity argument is equal to this Entity
     */
    public boolean isEntityEqual(Entity p_70028_1_)
    {
        return this == p_70028_1_ || this.entityDragonObj == p_70028_1_;
    }
}
