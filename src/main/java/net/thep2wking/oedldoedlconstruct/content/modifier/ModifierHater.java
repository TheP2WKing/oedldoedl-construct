package net.thep2wking.oedldoedlconstruct.content.modifier;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.init.ModModifier;
import slimeknights.tconstruct.library.modifiers.IToolMod;
import slimeknights.tconstruct.library.modifiers.ModifierAspect;
import slimeknights.tconstruct.library.modifiers.ModifierTrait;

public class ModifierHater extends ModifierTrait {
	public ModifierHater() {
		super("hater", 0x380c70);
		this.addAspects(new ModifierAspect.SingleAspect(this));
		this.addItem("furiousCocktail");
	}

	@Override
	public boolean canApplyTogether(IToolMod otherModifier) {
		return !otherModifier.getIdentifier().equals(ModModifier.SADISTIC.getIdentifier())
				&& !otherModifier.getIdentifier().equals(ModModifier.LEVITATING.getIdentifier());
	}

	@Override
	public String getLocalizedName() {
		return new TextComponentTranslation("modifier." + OedldoedlConstruct.MODID + "." + this.identifier + ".name")
				.getFormattedText();
	}

	@Override
	public String getLocalizedDesc() {
		return new TextComponentTranslation("modifier." + OedldoedlConstruct.MODID + "." + this.identifier + ".desc")
				.getFormattedText();
	}

	@Override
	public void onHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt,
			boolean wasCritical) {
		World world = target.getEntityWorld();
		if (target.isEntityAlive() && !world.isRemote) {
			target.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 100, 0, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 60, 1, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 60, 3, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 60, 4, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 60, 0, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.POISON, 60, 4, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.WITHER, 60, 2, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 60, 2, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.UNLUCK, 60, 3, false, false));
			if (player.isSneaking()) {
				target.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 100, 100, false, false));
			}
		}
	}
}