package net.thep2wking.oedldoedlconstruct.registry;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;
import net.thep2wking.oedldoedlconstruct.init.ModFluids;
import net.thep2wking.oedldoedlconstruct.util.ModConstructRecipeHelper;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModNBTUtil;
import net.thep2wking.oedldoedlcore.util.ModRecipeHelper;
import net.thep2wking.oedldoedlresources.init.ModBlocks;
import net.thep2wking.oedldoedlresources.init.ModItems;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.shared.TinkerFluids;

public class ModRecipes {
	public static void registerOreDict() {
		if (ConstructConfig.RECIPES.DEFAULT_OREDICT) {
			ModLogger.registeredOreDictLogger(OedldoedlConstruct.MODID);

			ModRecipeHelper.addOreDict("infinitySymbol",
					net.thep2wking.oedldoedlconstruct.init.ModItems.INFINITY_SYMBOL, 0);
			ModRecipeHelper.addOreDict("furiousCocktail",
					net.thep2wking.oedldoedlconstruct.init.ModItems.FURIOUS_COCKTAIL, 0);
			ModRecipeHelper.addOreDict("remoteBreaker",
					net.thep2wking.oedldoedlconstruct.init.ModItems.REMOTE_BREAKER, 0);
			ModRecipeHelper.addOreDict("sadisticSoul",
					net.thep2wking.oedldoedlconstruct.init.ModItems.SADISTIC_SOUL, 0);
		}
	}

	public static void registerRecipes() {
		if (ConstructConfig.RECIPES.DEFAULT_RECIPES) {
			ModLogger.registeredRecipesLogger(OedldoedlConstruct.MODID);

			ModRecipeHelper.addShapedRecipe(OedldoedlConstruct.MODID, "infinity_symbol",
					new ItemStack(net.thep2wking.oedldoedlconstruct.init.ModItems.INFINITY_SYMBOL, 1, 0), "ABA", "BCB",
					"ABA", 'A', "oedldoedlStar", 'B', "ingotChaos", 'C', "catalystChaos");
			ModRecipeHelper.addShapedRecipe(OedldoedlConstruct.MODID, "furious_cocktail",
					new ItemStack(net.thep2wking.oedldoedlconstruct.init.ModItems.FURIOUS_COCKTAIL, 1, 0), "ABC", "DEF",
					"GHI", 'A', "dustBlaze", 'B', new ItemStack(Items.DRAGON_BREATH, 1, 0), 'C', "magmaCream", 'D',
					ModNBTUtil.addPotion("minecraft:long_slowness"), 'E', "listAllwater", 'F',
					ModNBTUtil.addPotion("minecraft:long_weakness"), 'G', "cropNetherWart", 'H',
					ModNBTUtil.addPotion("minecraft:strong_poison"), 'I', "ghastTear");
			ModRecipeHelper.addShapedRecipe(OedldoedlConstruct.MODID, "remote_breaker",
					new ItemStack(net.thep2wking.oedldoedlconstruct.init.ModItems.REMOTE_BREAKER, 1, 0), "ABA", "CDE",
					"FFF", 'A', "dyeOrange", 'B', "torchRedstone", 'C', "dyeRed", 'D',
					new ItemStack(Items.DIAMOND_PICKAXE, 1, 0), 'E', "dyeGreen", 'F', "ingotBedrockium");
			ModRecipeHelper.addShapedRecipe(OedldoedlConstruct.MODID, "sadistic_soul",
					new ItemStack(net.thep2wking.oedldoedlconstruct.init.ModItems.SADISTIC_SOUL, 1, 0), "ABA", "BCB",
					"ABA", 'A', "ingotSadistium", 'B', "soulsand", 'C', new ItemStack(Items.SKULL, 1, 1));
		}

		if (ConstructConfig.RECIPES.MELTING_AND_CASTING_CONVERSION_RECIPES) {
			ModLogger.LOGGER.info("Registered melting and casting recipes for " + OedldoedlConstruct.MODID);

			ModConstructRecipeHelper.addMetalMelting("base", ModFluids.MOLTEN_BASE);
			ModConstructRecipeHelper.addMetalMelting("oedldoedl", ModFluids.MOLTEN_OEDLDOEDL);
			ModConstructRecipeHelper.addMetalMelting("caterium", ModFluids.MOLTEN_CATERIUM);
			ModConstructRecipeHelper.addMetalMelting("bedrockium", ModFluids.MOLTEN_BEDROCKIUM);
			ModConstructRecipeHelper.addMetalMelting("cloudium", ModFluids.MOLTEN_CLOUDIUM);
			ModConstructRecipeHelper.addMetalMelting("elevatium", ModFluids.MOLTEN_ELEVATIUM);
			ModConstructRecipeHelper.addMetalMelting("sadistium", ModFluids.MOLTEN_SADISTIUM);
			ModConstructRecipeHelper.addMetalMelting("drunkium", ModFluids.MOLTEN_DRUNKIUM);
			ModConstructRecipeHelper.addMetalMelting("money", ModFluids.MOLTEN_MONEY);
			ModConstructRecipeHelper.addMetalMelting("chaos", ModFluids.MOLTEN_CHAOS);

			ModConstructRecipeHelper.addMetalMelting("gremorium", ModFluids.MOLTEN_GREMORIUM);
			ModConstructRecipeHelper.addMetalMelting("himejimarium", ModFluids.MOLTEN_HIMEJIMARIUM);
			ModConstructRecipeHelper.addMetalMelting("toujourium", ModFluids.MOLTEN_TOUJOURIUM);
			ModConstructRecipeHelper.addMetalMelting("argentorium", ModFluids.MOLTEN_ARGENTORIUM);
			ModConstructRecipeHelper.addMetalMelting("quartarium", ModFluids.MOLTEN_QUARTARIUM);
			ModConstructRecipeHelper.addMetalMelting("nagatorium", ModFluids.MOLTEN_NAGATORIUM);
			ModConstructRecipeHelper.addMetalMelting("sakurajimarium", ModFluids.MOLTEN_SAKURAJIMARIUM);
			ModConstructRecipeHelper.addMetalMelting("kitagawarium", ModFluids.MOLTEN_KITAGAWARIUM);
			
			ModConstructRecipeHelper.addCustomMelting("nuggetObsidian", TinkerFluids.obsidian, 32);
			ModConstructRecipeHelper.addCustomtCasting(new ItemStack(ModItems.OBSIDIAN_NUGGET, 1, 0),
					"tconstruct:cast_custom", 1, TinkerFluids.obsidian, 32);
			ModConstructRecipeHelper.addCustomtCasting(new ItemStack(ModItems.EMERALD_NUGGET, 1, 0),
					"tconstruct:cast_custom", 1, TinkerFluids.emerald, 74);

			ModConstructRecipeHelper.addMetalCasting(new ItemStack(ModItems.BASE_NUGGET, 1, 0),
					new ItemStack(ModItems.BASE_INGOT, 1, 0), new ItemStack(ModBlocks.BASE, 1, 0),
					ModFluids.MOLTEN_BASE);
			ModConstructRecipeHelper.addMetalCasting(new ItemStack(ModItems.OEDLDOEDL_NUGGET, 1, 0),
					new ItemStack(ModItems.OEDLDOEDL_INGOT, 1, 0), new ItemStack(ModBlocks.OEDLDOEDL, 1, 0),
					ModFluids.MOLTEN_OEDLDOEDL);
			ModConstructRecipeHelper.addMetalCasting(new ItemStack(ModItems.CATERIUM_NUGGET, 1, 0),
					new ItemStack(ModItems.CATERIUM_INGOT, 1, 0), new ItemStack(ModBlocks.CATERIUM, 1, 0),
					ModFluids.MOLTEN_CATERIUM);
			ModConstructRecipeHelper.addMetalCasting(new ItemStack(ModItems.BEDROCKIUM_NUGGET, 1, 0),
					new ItemStack(ModItems.BEDROCKIUM_INGOT, 1, 0), new ItemStack(ModBlocks.BEDROCKIUM, 1, 0),
					ModFluids.MOLTEN_BEDROCKIUM);
			ModConstructRecipeHelper.addMetalCasting(new ItemStack(ModItems.CLOUDIUM_NUGGET, 1, 0),
					new ItemStack(ModItems.CLOUDIUM_INGOT, 1, 0), new ItemStack(ModBlocks.CLOUDIUM, 1, 0),
					ModFluids.MOLTEN_CLOUDIUM);
			ModConstructRecipeHelper.addMetalCasting(new ItemStack(ModItems.ELEVATIUM_NUGGET, 1, 0),
					new ItemStack(ModItems.ELEVATIUM_INGOT, 1, 0), new ItemStack(ModBlocks.ELEVATIUM, 1, 0),
					ModFluids.MOLTEN_ELEVATIUM);
			ModConstructRecipeHelper.addMetalCasting(new ItemStack(ModItems.SADISTIUM_NUGGET, 1, 0),
					new ItemStack(ModItems.SADISTIUM_INGOT, 1, 0), new ItemStack(ModBlocks.SADISTIUM, 1, 0),
					ModFluids.MOLTEN_SADISTIUM);
			ModConstructRecipeHelper.addMetalCasting(new ItemStack(ModItems.DRUNKIUM_NUGGET, 1, 0),
					new ItemStack(ModItems.DRUNKIUM_INGOT, 1, 0), new ItemStack(ModBlocks.DRUNKIUM, 1, 0),
					ModFluids.MOLTEN_DRUNKIUM);
			ModConstructRecipeHelper.addMetalCasting(new ItemStack(ModItems.MONEY_NUGGET, 1, 0),
					new ItemStack(ModItems.MONEY_INGOT, 1, 0), new ItemStack(ModBlocks.MONEY, 1, 0),
					ModFluids.MOLTEN_MONEY);

			ModConstructRecipeHelper.addMetalCasting(new ItemStack(ModItems.GREMORIUM_NUGGET, 1, 0),
					new ItemStack(ModItems.GREMORIUM_INGOT, 1, 0), new ItemStack(ModBlocks.GREMORIUM, 1, 0),
					ModFluids.MOLTEN_GREMORIUM);
			ModConstructRecipeHelper.addMetalCasting(new ItemStack(ModItems.HIMEJIMARIUM_NUGGET, 1, 0),
					new ItemStack(ModItems.HIMEJIMARIUM_INGOT, 1, 0), new ItemStack(ModBlocks.HIMEJIMARIUM, 1, 0),
					ModFluids.MOLTEN_HIMEJIMARIUM);
			ModConstructRecipeHelper.addMetalCasting(new ItemStack(ModItems.TOUJOURIUM_NUGGET, 1, 0),
					new ItemStack(ModItems.TOUJOURIUM_INGOT, 1, 0), new ItemStack(ModBlocks.TOUJOURIUM, 1, 0),
					ModFluids.MOLTEN_TOUJOURIUM);
			ModConstructRecipeHelper.addMetalCasting(new ItemStack(ModItems.ARGENTORIUM_NUGGET, 1, 0),
					new ItemStack(ModItems.ARGENTORIUM_INGOT, 1, 0), new ItemStack(ModBlocks.ARGENTORIUM, 1, 0),
					ModFluids.MOLTEN_ARGENTORIUM);
			ModConstructRecipeHelper.addMetalCasting(new ItemStack(ModItems.QUARTARIUM_NUGGET, 1, 0),
					new ItemStack(ModItems.QUARTARIUM_INGOT, 1, 0), new ItemStack(ModBlocks.QUARTARIUM, 1, 0),
					ModFluids.MOLTEN_QUARTARIUM);
			ModConstructRecipeHelper.addMetalCasting(new ItemStack(ModItems.NAGATORIUM_NUGGET, 1, 0),
					new ItemStack(ModItems.NAGATORIUM_INGOT, 1, 0), new ItemStack(ModBlocks.NAGATORIUM, 1, 0),
					ModFluids.MOLTEN_NAGATORIUM);
			ModConstructRecipeHelper.addMetalCasting(new ItemStack(ModItems.SAKURAJIMARIUM_NUGGET, 1, 0),
					new ItemStack(ModItems.SAKURAJIMARIUM_INGOT, 1, 0), new ItemStack(ModBlocks.SAKURAJIMARIUM, 1, 0),
					ModFluids.MOLTEN_SAKURAJIMARIUM);
			ModConstructRecipeHelper.addMetalCasting(new ItemStack(ModItems.KITAGAWARIUM_NUGGET, 1, 0),
					new ItemStack(ModItems.KITAGAWARIUM_INGOT, 1, 0), new ItemStack(ModBlocks.KITAGAWARIUM, 1, 0),
					ModFluids.MOLTEN_KITAGAWARIUM);
			ModConstructRecipeHelper.addIngotCasting(new ItemStack(ModItems.CHAOS_INGOT, 1, 0), ModFluids.MOLTEN_CHAOS);
		}

		if (ConstructConfig.RECIPES.MELTING_AND_CASTING_CONVERSION_RECIPES) {
			ModLogger.LOGGER.info("Registered tinkers recipes" + OedldoedlConstruct.MODID);

			ModConstructRecipeHelper.addSmelteryFuel(ModFluids.SUPERHEATED_LAVA, 2000);

			ModConstructRecipeHelper.addAlloying(new FluidStack(ModFluids.SUPERHEATED_LAVA, 250),
					new FluidStack(FluidRegistry.LAVA, 1000),
					new FluidStack(ModFluids.MOLTEN_OEDLDOEDL, Material.VALUE_Ingot * 2));
		}
	}
}