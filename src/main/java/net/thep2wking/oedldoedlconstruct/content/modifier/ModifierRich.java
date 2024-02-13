package net.thep2wking.oedldoedlconstruct.content.modifier;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlresources.init.ModSounds;
import slimeknights.tconstruct.library.modifiers.ModifierAspect;
import slimeknights.tconstruct.library.modifiers.ModifierTrait;

public class ModifierRich extends ModifierTrait {
	public ModifierRich() {
		super("rich", 0xfdbf00);
		this.addAspects(new ModifierAspect.SingleAspect(this));
		this.addItem("ingotMoney");
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
			world.playSound(null, target.getPosition(), ModSounds.MONEY, SoundCategory.AMBIENT, 0.5f, 1.0f);
		}
	}
}