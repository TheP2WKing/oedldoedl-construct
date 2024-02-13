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

public class ModifierSadistic extends ModSingleModifierBase {
	public ModifierSadistic(String identifier, int color, String modifierItemOreDict) {
		super(identifier, color, modifierItemOreDict);
	}

	@Override
	public boolean canApplyTogether(IToolMod otherModifier) {
		return !otherModifier.getIdentifier().equals(ModModifier.HATER.getIdentifier())
				&& !otherModifier.getIdentifier().equals(ModModifier.LEVITATING.getIdentifier());
	}

	@Override
	public void onHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt,
			boolean wasCritical) {
		World world = player.getEntityWorld();
		if (target.isEntityAlive() && !world.isRemote
				&& ConstructConfig.CONTENT.MODIFIER.SADISTIC_MODIFIER_POTION_EFFECTS) {
			target.addPotionEffect(new PotionEffect(MobEffects.GLOWING,
					ConstructConfig.CONTENT.MODIFIER.SADISTIC_MODIFIER_POTION_DURATION, 0, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS,
					ConstructConfig.CONTENT.MODIFIER.SADISTIC_MODIFIER_POTION_DURATION, 0, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE,
					ConstructConfig.CONTENT.MODIFIER.SADISTIC_MODIFIER_POTION_DURATION, 3, false, false));
		}
		if (target.isEntityAlive() && !world.isRemote && player.isSneaking()
				&& ConstructConfig.CONTENT.MODIFIER.SADISTIC_MODIFIER_DOWN_TELEPORT) {
			target.setPosition(target.posX,
					target.posY - ConstructConfig.CONTENT.MODIFIER.SADISTIC_MODIFIER_BLOCKS_TELEPORTED_DOWN,
					target.posZ);
		}
	}
}