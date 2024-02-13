package net.thep2wking.oedldoedlconstruct.content.modifier;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlconstruct.api.ModSingleModifierBase;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;
import net.thep2wking.oedldoedlresources.init.ModSounds;

public class ModifierRich extends ModSingleModifierBase {
	public ModifierRich(String identifier, int color, String modifierItemOreDict) {
		super(identifier, color, modifierItemOreDict);
	}

	@Override
	public void onHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt,
			boolean wasCritical) {
		World world = player.getEntityWorld();
		if (target.isEntityAlive() && !world.isRemote && ConstructConfig.CONTENT.MODIFIER.RICH_MODIFIER_SOUND) {
			world.playSound(null, target.getPosition(), ModSounds.MONEY, SoundCategory.AMBIENT, 0.5f, 1.0f);
		}
	}
}