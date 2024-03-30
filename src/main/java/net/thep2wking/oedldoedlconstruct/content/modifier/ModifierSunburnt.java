package net.thep2wking.oedldoedlconstruct.content.modifier;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlconstruct.api.ModSingleModifierBase;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;

public class ModifierSunburnt extends ModSingleModifierBase {
	public ModifierSunburnt(String identifier, int color) {
		super(identifier, color);
	}

	@Override
	public void onHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt,
			boolean wasCritical) {
		World world = player.getEntityWorld();
		if (target.isEntityAlive() && !world.isRemote) {
			target.setFire((int) ConstructConfig.CONTENT.MODIFIER.SUNBURNT_MODIFIER_FIRE_DURATION / 20);
		}
	}

	@Override
	public void onUpdate(ItemStack tool, World world, Entity entity, int itemSlot, boolean isSelected) {
		if (entity.isEntityAlive() && isSelected
				&& ConstructConfig.CONTENT.MODIFIER.SUNBURNT_MODIFIER_NEARBY_MOBS_CATCH_FIRE) {
			EntityPlayer player = (EntityPlayer) entity;
			double radius = ConstructConfig.CONTENT.MODIFIER.SUNBURNT_MODIFIER_RADIUS;
			AxisAlignedBB area = player.getEntityBoundingBox().grow(radius);
			List<Entity> entities = world.getEntitiesWithinAABBExcludingEntity(player, area);
			for (Entity entityAround : entities) {
				if (entityAround.isEntityAlive() && !player.isSneaking() && entityAround instanceof IMob) {
					if (world.isDaytime()) {
						entityAround
								.setFire((int) ConstructConfig.CONTENT.MODIFIER.SUNBURNT_MODIFIER_FIRE_DURATION / 20);
					}
				}
			}
		}
	}
}