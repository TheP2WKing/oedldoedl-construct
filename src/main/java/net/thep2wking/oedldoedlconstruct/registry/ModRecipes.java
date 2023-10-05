package net.thep2wking.oedldoedlconstruct.registry;

import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.init.ModItems;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModRecipeHelper;

public class ModRecipes {
	public static void registerOreDict() {
		ModLogger.registeredOreDictLogger(OedldoedlConstruct.MODID);

		ModRecipeHelper.addOreDict("infinitySymbol", ModItems.INFINITY_SYMBOL, 0);
		ModRecipeHelper.addOreDict("furiousCocktail", ModItems.FURIOUS_COCKTAIL, 0);
		ModRecipeHelper.addOreDict("remoteBreaker", ModItems.REMOTE_BREAKER, 0);
		ModRecipeHelper.addOreDict("sadisticSoul", ModItems.SADISTIC_SOUL, 0);
	}

	public static void registerRecipes() {
		ModLogger.registeredRecipesLogger(OedldoedlConstruct.MODID);
	}
}