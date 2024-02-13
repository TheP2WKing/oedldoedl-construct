package net.thep2wking.oedldoedlconstruct.init;

import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.api.ModTinkersHelper;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.library.materials.MaterialTypes;
import slimeknights.tconstruct.library.utils.HarvestLevels;
import slimeknights.tconstruct.tools.TinkerTraits;

public class ModTinkersTools {
	public static Material BASE;
	public static Material BEDROCKIUM;
	public static Material CLOUDIUM;
	public static Material ELEVATIUM;
	public static Material SADISTIUM;
	public static Material DRUNKIUM;
	public static Material MONEY;
	public static Material CHAOS;

	public static Material GREMORIUM;
	public static Material HIMEJIMARIUM;
	public static Material TOUJOURIUM;
	public static Material ARGENTORIUM;
	public static Material QUARTARIUM;
	public static Material NAGATORIUM;
	public static Material SAKURAJIMARIUM;
	public static Material KITAGAWARIUM;

	public static void preInit() {
		BASE = new Material(OedldoedlConstruct.MODID + "." + "base", 0x9d9d9d);
		BASE.addTrait(TinkerTraits.lightweight);
		BASE.addTrait(TinkerTraits.magnetic2, MaterialTypes.HANDLE);
		BASE.addTrait(TinkerTraits.magnetic, MaterialTypes.EXTRA);
		ModTinkersHelper.preInitMaterial(BASE, "base", true);
		ModTinkersHelper.addMaterialStats(BASE, 320, 5.1f, 7.2f, 0.5f, HarvestLevels.DIAMOND);

		BEDROCKIUM = new Material(OedldoedlConstruct.MODID + "." + "bedrockium", 0x575757);
		BEDROCKIUM.addTrait(TinkerTraits.heavy);
		BEDROCKIUM.addTrait(TinkerTraits.momentum, MaterialTypes.HANDLE);
		BEDROCKIUM.addTrait(TinkerTraits.momentum, MaterialTypes.EXTRA);
		ModTinkersHelper.preInitMaterial(BEDROCKIUM, "bedrockium", true);
		ModTinkersHelper.addMaterialStats(BEDROCKIUM, 1340, 7.3f, 11.8f, 0.85f, HarvestLevels.COBALT);

		CLOUDIUM = new Material(OedldoedlConstruct.MODID + "." + "cloudium", 0xf2f2f2);
		CLOUDIUM.addTrait(TinkerTraits.squeaky);
		CLOUDIUM.addTrait(TinkerTraits.lightweight, MaterialTypes.HANDLE);
		CLOUDIUM.addTrait(TinkerTraits.lightweight, MaterialTypes.EXTRA);
		ModTinkersHelper.preInitMaterial(CLOUDIUM, "cloudium", true);
		ModTinkersHelper.addMaterialStats(CLOUDIUM, 650, 4.7f, 2.8f, 1.2f, HarvestLevels.DIAMOND);

		ELEVATIUM = new Material(OedldoedlConstruct.MODID + "." + "elevatium", 0xa673a6);
		ELEVATIUM.addTrait(ModModifier.LEVITATING);
		ELEVATIUM.addTrait(TinkerTraits.enderference, MaterialTypes.HANDLE);
		ELEVATIUM.addTrait(TinkerTraits.enderference, MaterialTypes.EXTRA);
		ModTinkersHelper.preInitMaterial(ELEVATIUM, "elevatium", true);
		ModTinkersHelper.addMaterialStats(ELEVATIUM, 720, 7.6f, 7.2f, 1.05f, HarvestLevels.OBSIDIAN);

		SADISTIUM = new Material(OedldoedlConstruct.MODID + "." + "sadistium", 0x5b4538);
		SADISTIUM.addTrait(ModModifier.SADISTIC);
		SADISTIUM.addTrait(TinkerTraits.crude, MaterialTypes.HANDLE);
		SADISTIUM.addTrait(TinkerTraits.crude, MaterialTypes.EXTRA);
		ModTinkersHelper.preInitMaterial(SADISTIUM, "sadistium", true);
		ModTinkersHelper.addMaterialStats(SADISTIUM, 680, 7.4f, 6.6f, 0.35f, HarvestLevels.COBALT);

		DRUNKIUM = new Material(OedldoedlConstruct.MODID + "." + "drunkium", 0x5283ff);
		DRUNKIUM.addTrait(ModModifier.SADISTIC);
		DRUNKIUM.addTrait(TinkerTraits.aquadynamic, MaterialTypes.HANDLE);
		DRUNKIUM.addTrait(TinkerTraits.aquadynamic, MaterialTypes.EXTRA);
		ModTinkersHelper.preInitMaterial(DRUNKIUM, "drunkium", true);
		ModTinkersHelper.addMaterialStats(DRUNKIUM, 960, 6.2f, 3.3f, 0.45f, HarvestLevels.OBSIDIAN);

		MONEY = new Material(OedldoedlConstruct.MODID + "." + "money", 0x599453);
		MONEY.addTrait(ModModifier.RICH);
		MONEY.addTrait(ModModifier.RICH, MaterialTypes.HANDLE);
		MONEY.addTrait(ModModifier.RICH, MaterialTypes.EXTRA);
		ModTinkersHelper.preInitMaterial(MONEY, "money", true);
		ModTinkersHelper.addMaterialStats(MONEY, 1100, 3.8f, 11.1f, 1.55f, HarvestLevels.OBSIDIAN);

		CHAOS = new Material(OedldoedlConstruct.MODID + "." + "chaos", 0x0e0025);
		CHAOS.addTrait(TinkerTraits.dense);
		CHAOS.addTrait(TinkerTraits.heavy);
		CHAOS.addTrait(ModModifier.WORLD_BREAKER);
		CHAOS.addTrait(TinkerTraits.duritos, MaterialTypes.HANDLE);
		CHAOS.addTrait(ModModifier.HATER, MaterialTypes.EXTRA);
		ModTinkersHelper.preInitMaterial(CHAOS, "chaos", true);
		ModTinkersHelper.addMaterialStats(CHAOS, 99999, 99.9f, 99.9f, 2.0f, HarvestLevels.COBALT + 6);

		GREMORIUM = new Material(OedldoedlConstruct.MODID + "." + "gremorium", 0x990000);
		GREMORIUM.addTrait(TinkerTraits.autosmelt);
		GREMORIUM.addTrait(ModModifier.GREMORIUSLY);
		GREMORIUM.addTrait(TinkerTraits.established, MaterialTypes.HANDLE);
		GREMORIUM.addTrait(TinkerTraits.established, MaterialTypes.EXTRA);
		ModTinkersHelper.preInitMaterial(GREMORIUM, "gremorium", true);
		ModTinkersHelper.addMaterialStats(GREMORIUM, 9958, 24.5f, 39.5f, 1.5f, HarvestLevels.COBALT + 2);

		HIMEJIMARIUM = new Material(OedldoedlConstruct.MODID + "." + "himejimarium", 0x232033);
		HIMEJIMARIUM.addTrait(TinkerTraits.duritos);
		HIMEJIMARIUM.addTrait(ModModifier.HIMEJIMARIUSLY);
		HIMEJIMARIUM.addTrait(TinkerTraits.poisonous, MaterialTypes.HANDLE);
		HIMEJIMARIUM.addTrait(TinkerTraits.poisonous, MaterialTypes.EXTRA);
		ModTinkersHelper.preInitMaterial(HIMEJIMARIUM, "himejimarium", true);
		ModTinkersHelper.addMaterialStats(HIMEJIMARIUM, 10260, 24.5f, 39.5f, 1.5f, HarvestLevels.COBALT + 2);

		TOUJOURIUM = new Material(OedldoedlConstruct.MODID + "." + "toujourium", 0xc0c0c0);
		TOUJOURIUM.addTrait(TinkerTraits.dense);
		TOUJOURIUM.addTrait(ModModifier.TOUJOURIUSLY);
		TOUJOURIUM.addTrait(TinkerTraits.momentum, MaterialTypes.HANDLE);
		TOUJOURIUM.addTrait(TinkerTraits.momentum, MaterialTypes.EXTRA);
		ModTinkersHelper.preInitMaterial(TOUJOURIUM, "toujourium", true);
		ModTinkersHelper.addMaterialStats(TOUJOURIUM, 6757, 24.5f, 39.5f, 1.5f, HarvestLevels.COBALT + 2);

		ARGENTORIUM = new Material(OedldoedlConstruct.MODID + "." + "argentorium", 0xfbd985);
		ARGENTORIUM.addTrait(TinkerTraits.holy);
		ARGENTORIUM.addTrait(ModModifier.ARGENTORIUSLY);
		ARGENTORIUM.addTrait(TinkerTraits.coldblooded, MaterialTypes.HANDLE);
		ARGENTORIUM.addTrait(TinkerTraits.coldblooded, MaterialTypes.EXTRA);
		ModTinkersHelper.preInitMaterial(ARGENTORIUM, "argentorium", true);
		ModTinkersHelper.addMaterialStats(ARGENTORIUM, 8355, 24.5f, 39.5f, 1.5f, HarvestLevels.COBALT + 2);

		QUARTARIUM = new Material(OedldoedlConstruct.MODID + "." + "quartarium", 0x0e5191);
		QUARTARIUM.addTrait(TinkerTraits.sharp);
		QUARTARIUM.addTrait(ModModifier.QUARTARIUSLY);
		QUARTARIUM.addTrait(TinkerTraits.insatiable, MaterialTypes.HANDLE);
		QUARTARIUM.addTrait(TinkerTraits.insatiable, MaterialTypes.EXTRA);
		ModTinkersHelper.preInitMaterial(QUARTARIUM, "quartarium", true);
		ModTinkersHelper.addMaterialStats(QUARTARIUM, 8758, 24.5f, 39.5f, 1.5f, HarvestLevels.COBALT + 2);

		NAGATORIUM = new Material(OedldoedlConstruct.MODID + "." + "nagatorium", 0x650fc1);
		NAGATORIUM.addTrait(TinkerTraits.alien);
		NAGATORIUM.addTrait(ModModifier.NAGATORIUSLY);
		NAGATORIUM.addTrait(ModModifier.SADISTIC, MaterialTypes.HANDLE);
		NAGATORIUM.addTrait(ModModifier.SADISTIC, MaterialTypes.EXTRA);
		ModTinkersHelper.preInitMaterial(NAGATORIUM, "nagatorium", true);
		ModTinkersHelper.addMaterialStats(NAGATORIUM, 7656, 24.5f, 39.5f, 1.5f, HarvestLevels.COBALT + 2);

		SAKURAJIMARIUM = new Material(OedldoedlConstruct.MODID + "." + "sakurajimarium", 0x2a2929);
		SAKURAJIMARIUM.addTrait(TinkerTraits.unnatural);
		SAKURAJIMARIUM.addTrait(ModModifier.SAKURAJIMARIUSLY);
		SAKURAJIMARIUM.addTrait(ModModifier.TIMESHIFTER, MaterialTypes.HANDLE);
		SAKURAJIMARIUM.addTrait(ModModifier.TIMESHIFTER, MaterialTypes.EXTRA);
		ModTinkersHelper.preInitMaterial(SAKURAJIMARIUM, "sakurajimarium", true);
		ModTinkersHelper.addMaterialStats(SAKURAJIMARIUM, 8054, 24.5f, 39.5f, 1.5f, HarvestLevels.COBALT + 2);

		KITAGAWARIUM = new Material(OedldoedlConstruct.MODID + "." + "kitagawarium", 0x97173e);
		KITAGAWARIUM.addTrait(TinkerTraits.aquadynamic);
		KITAGAWARIUM.addTrait(ModModifier.KITAGAWARIUSLY);
		KITAGAWARIUM.addTrait(ModModifier.SUNBURNT, MaterialTypes.HANDLE);
		KITAGAWARIUM.addTrait(ModModifier.SUNBURNT, MaterialTypes.EXTRA);
		ModTinkersHelper.preInitMaterial(KITAGAWARIUM, "kitagawarium", true);
		ModTinkersHelper.addMaterialStats(KITAGAWARIUM, 8658, 24.5f, 39.5f, 1.5f, HarvestLevels.COBALT + 2);
	}

	public static void init() {
		ModTinkersHelper.initMaterial(BASE, "base", "base", "ingotBase", true);
		ModTinkersHelper.initMaterial(BEDROCKIUM, "bedrockium", "bedrockium", "ingotBedrockium", true);
		ModTinkersHelper.initMaterial(CLOUDIUM, "cloudium", "cloudium", "ingotCloudium", true);
		ModTinkersHelper.initMaterial(ELEVATIUM, "elevatium", "elevatium", "ingotElevatium", true);
		ModTinkersHelper.initMaterial(SADISTIUM, "sadistium", "sadistium", "ingotSadistium", true);
		ModTinkersHelper.initMaterial(DRUNKIUM, "drunkium", "drunkium", "ingotDrunkium", true);
		ModTinkersHelper.initMaterial(MONEY, "money", "money", "ingotMoney", true);
		ModTinkersHelper.initMaterial(CHAOS, "chaos", "chaos", "ingotChaos", true);

		ModTinkersHelper.initMaterial(GREMORIUM, "gremorium", "gremorium", "ingotGremorium", true);
		ModTinkersHelper.initMaterial(HIMEJIMARIUM, "himejimarium", "himejimarium", "ingotHimejimarium", true);
		ModTinkersHelper.initMaterial(TOUJOURIUM, "toujourium", "toujourium", "ingotToujourium", true);
		ModTinkersHelper.initMaterial(ARGENTORIUM, "argentorium", "argentorium", "ingotArgentorium", true);
		ModTinkersHelper.initMaterial(QUARTARIUM, "quartarium", "quartarium", "ingotQuartarium", true);
		ModTinkersHelper.initMaterial(NAGATORIUM, "nagatorium", "nagatorium", "ingotNagatorium", true);
		ModTinkersHelper.initMaterial(SAKURAJIMARIUM, "sakurajimarium", "sakurajimarium", "ingotSakurajimarium", true);
		ModTinkersHelper.initMaterial(KITAGAWARIUM, "kitagawarium", "kitagawarium", "ingotKitagawarium", true);
	}
}