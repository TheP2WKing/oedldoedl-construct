package net.thep2wking.oedldoedlconstruct.api;

import net.minecraft.util.text.TextComponentTranslation;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import slimeknights.tconstruct.library.modifiers.ModifierAspect;
import slimeknights.tconstruct.library.modifiers.ModifierTrait;

/**
 * @author TheP2WKing
 */
public class ModSingleModifierBase extends ModifierTrait {
	/**
	 * @author TheP2WKing
	 * @param identifier String
	 * @param color      int
	 */
	public ModSingleModifierBase(String identifier, int color) {
		super(identifier, color);
		this.addAspects(new ModifierAspect.SingleAspect(this));
	}

	/**
	 * @author TheP2WKing
	 * @param identifier          String
	 * @param color               int
	 * @param modifierItemOreDict String
	 */
	public ModSingleModifierBase(String identifier, int color, String modifierItemOreDict) {
		super(identifier, color);
		this.addAspects(new ModifierAspect.SingleAspect(this));
		this.addItem(modifierItemOreDict);
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
}