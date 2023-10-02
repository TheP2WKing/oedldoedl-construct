package net.thep2wking.oedldoedlconstruct.registry;

import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlcore.util.ModLogger;

public class ModRecipes {
	public static void registerOreDict() {
		ModLogger.registeredOreDictLogger(OedldoedlConstruct.MODID);
	}

	public static void registerRecipes() {
		ModLogger.registeredRecipesLogger(OedldoedlConstruct.MODID);
	}
}