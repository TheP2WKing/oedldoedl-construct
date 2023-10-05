package net.thep2wking.oedldoedlconstruct.content.tconstruct.modifier;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.text.TextComponentTranslation;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import slimeknights.tconstruct.library.modifiers.ModifierAspect;
import slimeknights.tconstruct.library.modifiers.ModifierTrait;

public class ModifierInfinity extends ModifierTrait {
	public static final DamageSource DAMAGE_SOURCE = new DamageSource(OedldoedlConstruct.MODID + ".infinity");
	
	public ModifierInfinity() {
		super("infinity", 0xff0000);
		this.addAspects(new ModifierAspect.SingleAspect(this));
		this.addItem("infinitySymbol");
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
		if (target.isEntityAlive()) {
			target.attackEntityFrom(DAMAGE_SOURCE, Integer.MAX_VALUE);
			target.setHealth(0);
		}
	}
}