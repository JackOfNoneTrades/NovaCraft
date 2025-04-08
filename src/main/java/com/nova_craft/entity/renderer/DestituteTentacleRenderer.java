package com.nova_craft.entity.renderer;

import org.lwjgl.opengl.GL11;

import com.nova_craft.entity.EntityDestituteTentacle;
import com.nova_craft.entity.models.DestituteTentacleModel;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class DestituteTentacleRenderer extends RenderLiving {

    public static final ResourceLocation TEXTURE = new ResourceLocation("nova_craft", "textures/entity/destitute_tentacle/destitute_tentacle.png");

    public DestituteTentacleModel mode;

    public DestituteTentacleRenderer() {
        super(new DestituteTentacleModel(), 0.3F);
        this.mode = ((DestituteTentacleModel) this.mainModel);
    }

    @Override
    protected void preRenderCallback(EntityLivingBase entity, float f) {
    	EntityDestituteTentacle plant = (EntityDestituteTentacle) entity;

        GL11.glScalef(1.1F, 1.1F, 1.1F);

    }

    protected ResourceLocation getEntityTexture(final Entity entity) {
        return DestituteTentacleRenderer.TEXTURE;
    }

}
