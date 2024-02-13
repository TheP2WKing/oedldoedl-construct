package net.thep2wking.oedldoedlconstruct.content.modifier;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlconstruct.api.ModSingleModifierBase;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;

public class ModifierLevitating extends ModSingleModifierBase {
	public ModifierLevitating(String identifier, int color) {
		super(identifier, color);
	}

	@Override
	public void onHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt,
			boolean wasCritical) {
		World world = player.getEntityWorld();
		if (target.isEntityAlive() && !world.isRemote && player.isSneaking()
				&& ConstructConfig.CONTENT.MODIFIER.LEVITATING_MODIFIER_LEVITATION_EFFECT) {
			target.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 60, 24, false, false));
		}
	}
}