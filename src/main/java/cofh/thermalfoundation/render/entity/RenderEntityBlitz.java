package cofh.thermalfoundation.render.entity;

import cofh.core.util.helpers.HolidayHelper;
import cofh.thermalfoundation.entity.monster.EntityBlitz;
import cofh.thermalfoundation.render.model.ModelElemental;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly (Side.CLIENT)
public class RenderEntityBlitz extends RenderLiving<EntityBlitz> {

	private static ResourceLocation texture;
	private static ResourceLocation textureXmas;

	static {
		texture = new ResourceLocation("thermalfoundation:textures/entity/" + "blitz.png");
		textureXmas = new ResourceLocation("thermalfoundation:textures/entity/" + "blitz_xmas.png");
	}

	public RenderEntityBlitz(RenderManager manager) {

		super(manager, ModelElemental.INSTANCE, 0.5F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityBlitz par1Entity) {

		return HolidayHelper.isChristmas(5, 3) ? textureXmas : texture;
	}

	@Override
	public void doRender(EntityBlitz entity, double x, double y, double z, float entityYaw, float partialTicks) {

		doRenderBlitz(entity, x, y, z, entityYaw, partialTicks);
	}

	private void doRenderBlitz(EntityBlitz entity, double x, double y, double z, float entityYaw, float partialTicks) {

		super.doRender(entity, x, y, z, entityYaw, partialTicks);
	}

}
