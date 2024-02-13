package net.thep2wking.oedldoedlconstruct.content.modifier;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlconstruct.api.ModSingleModifierBase;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;
import net.thep2wking.oedldoedlconstruct.init.ModModifier;
import slimeknights.tconstruct.library.modifiers.IToolMod;

public class ModifierHater extends ModSingleModifierBase {
	public ModifierHater(String identifier, int color, String modifierItemOreDict) {
		super(identifier, color, modifierItemOreDict);
	}

	@Override
	public boolean canApplyTogether(IToolMod otherModifier) {
		return !otherModifier.getIdentifier().equals(ModModifier.SADISTIC.getIdentifier())
				&& !otherModifier.getIdentifier().equals(ModModifier.LEVITATING.getIdentifier());
	}

	@Override
	public void onHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt,
			boolean wasCritical) {
		World world = player.getEntityWorld();
		if (target.isEntityAlive() && !world.isRemote
				&& ConstructConfig.CONTENT.MODIFIER.HATER_MODIFIER_POTION_EFFECTS) {
			target.addPotionEffect(new PotionEffect(MobEffects.GLOWING,
					ConstructConfig.CONTENT.MODIFIER.HATER_MODIFIER_POTION_DURATION, 0, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS,
					ConstructConfig.CONTENT.MODIFIER.HATER_MODIFIER_POTION_DURATION, 1, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.HUNGER,
					ConstructConfig.CONTENT.MODIFIER.HATER_MODIFIER_POTION_DURATION, 3, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE,
					ConstructConfig.CONTENT.MODIFIER.HATER_MODIFIER_POTION_DURATION, 4, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.NAUSEA,
					ConstructConfig.CONTENT.MODIFIER.HATER_MODIFIER_POTION_DURATION, 0, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.POISON,
					ConstructConfig.CONTENT.MODIFIER.HATER_MODIFIER_POTION_DURATION, 4, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.WITHER,
					ConstructConfig.CONTENT.MODIFIER.HATER_MODIFIER_POTION_DURATION, 2, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS,
					ConstructConfig.CONTENT.MODIFIER.HATER_MODIFIER_POTION_DURATION, 2, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.UNLUCK,
					ConstructConfig.CONTENT.MODIFIER.HATER_MODIFIER_POTION_DURATION, 3, false, false));
		}
		if (target.isEntityAlive() && !world.isRemote && player.isSneaking()
				&& ConstructConfig.CONTENT.MODIFIER.HATER_MODIFIER_LEVITATION_EFFECT) {
			target.addPotionEffect(new PotionEffect(MobEffects.LEVITATION,
					ConstructConfig.CONTENT.MODIFIER.HATER_MODIFIER_POTION_DURATION, 99, false, false));
		}
	}
}