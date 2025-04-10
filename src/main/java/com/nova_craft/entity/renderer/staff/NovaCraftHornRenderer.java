package com.nova_craft.entity.renderer.staff;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

public class NovaCraftHornRenderer implements IItemRenderer {

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		if (type == ItemRenderType.EQUIPPED) {
			GL11.glTranslatef(-0.02F, -0.075F, 0.2125F); // -0.02 0.2125
			GL11.glRotatef(10.0F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(30.0F, 1.0F, 0.0F, 0.0F);
		}

		return false;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {

		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

	}

}
