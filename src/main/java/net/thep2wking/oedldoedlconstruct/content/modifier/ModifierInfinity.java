package net.thep2wking.oedldoedlconstruct.content.modifier;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.api.ModSingleModifierBase;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;

public class ModifierInfinity extends ModSingleModifierBase {
	public static final DamageSource DAMAGE_SOURCE = new DamageSource(OedldoedlConstruct.MODID + ".infinity");

	public ModifierInfinity(String identifier, int color, String modifierItemOreDict) {
		super(identifier, color, modifierItemOreDict);
	}

	@Override
	public void onHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt,
			boolean wasCritical) {
		if (target.isEntityAlive() && ConstructConfig.CONTENT.MODIFIER.INFINITY_MODIFIER_INFINITE_DAMAGE) {
			target.attackEntityFrom(DAMAGE_SOURCE, Integer.MAX_VALUE);
			target.setHealth(0);
		}
	}
}