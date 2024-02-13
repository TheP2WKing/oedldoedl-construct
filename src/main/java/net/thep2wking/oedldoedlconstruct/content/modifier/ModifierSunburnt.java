package net.thep2wking.oedldoedlconstruct.content.modifier;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
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
				&& ConstructConfig.CONTENT.MODIFIER.SUNBURNT_MODIFIER_EXTINGUISH_FIRE) {
			((EntityLivingBase) entity).extinguish();
		}
	}
}