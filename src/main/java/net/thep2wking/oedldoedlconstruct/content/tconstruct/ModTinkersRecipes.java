package net.thep2wking.oedldoedlconstruct.content.tconstruct;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.oedldoedlconstruct.api.ModTinkersHelper;
import net.thep2wking.oedldoedlconstruct.init.ModFluids;
import net.thep2wking.oedldoedlresources.init.ModBlocks;
import net.thep2wking.oedldoedlresources.init.ModItems;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.Material;

@Mod.EventBusSubscriber
public class ModTinkersRecipes {
	public static void registerRecipes() {
		ModTinkersHelper.addMetalMelting("base", ModFluids.MOLTEN_BASE);
		ModTinkersHelper.addMetalMelting("oedldoedl", ModFluids.MOLTEN_OEDLDOEDL);
		ModTinkersHelper.addMetalMelting("bedrockium", ModFluids.MOLTEN_BEDROCKIUM);
		ModTinkersHelper.addMetalMelting("cloudium", ModFluids.MOLTEN_CLOUDIUM);
		ModTinkersHelper.addMetalMelting("elevatium", ModFluids.MOLTEN_ELEVATIUM);
		ModTinkersHelper.addMetalMelting("sadistium", ModFluids.MOLTEN_SADISTIUM);
		ModTinkersHelper.addMetalMelting("drunkium", ModFluids.MOLTEN_DRUNKIUM);
		ModTinkersHelper.addMetalMelting("money", ModFluids.MOLTEN_MONEY);
		ModTinkersHelper.addMetalMelting("chaos", ModFluids.MOLTEN_CHAOS);

		ModTinkersHelper.addMetalMelting("gremorium", ModFluids.MOLTEN_GREMORIUM);
		ModTinkersHelper.addMetalMelting("himejimarium", ModFluids.MOLTEN_HIMEJIMARIUM);
		ModTinkersHelper.addMetalMelting("toujourium", ModFluids.MOLTEN_TOUJOURIUM);
		ModTinkersHelper.addMetalMelting("argentorium", ModFluids.MOLTEN_ARGENTORIUM);
		ModTinkersHelper.addMetalMelting("quartarium", ModFluids.MOLTEN_QUARTARIUM);
		ModTinkersHelper.addMetalMelting("nagatorium", ModFluids.MOLTEN_NAGATORIUM);
		ModTinkersHelper.addMetalMelting("sakurajimarium", ModFluids.MOLTEN_SAKURAJIMARIUM);
		ModTinkersHelper.addMetalMelting("kitagawarium", ModFluids.MOLTEN_KITAGAWARIUM);

		ModTinkersHelper.addMetalCasting(new ItemStack(ModItems.BASE_NUGGET, 1, 0),
				new ItemStack(ModItems.BASE_INGOT, 1, 0), new ItemStack(ModBlocks.BASE, 1, 0), ModFluids.MOLTEN_BASE);
		ModTinkersHelper.addMetalCasting(new ItemStack(ModItems.OEDLDOEDL_NUGGET, 1, 0),
				new ItemStack(ModItems.OEDLDOEDL_INGOT, 1, 0), new ItemStack(ModBlocks.OEDLDOEDL, 1, 0),
				ModFluids.MOLTEN_OEDLDOEDL);
		ModTinkersHelper.addMetalCasting(new ItemStack(ModItems.BEDROCKIUM_NUGGET, 1, 0),
				new ItemStack(ModItems.BEDROCKIUM_INGOT, 1, 0), new ItemStack(ModBlocks.BEDROCKIUM, 1, 0),
				ModFluids.MOLTEN_BEDROCKIUM);
		ModTinkersHelper.addMetalCasting(new ItemStack(ModItems.CLOUDIUM_NUGGET, 1, 0),
				new ItemStack(ModItems.CLOUDIUM_INGOT, 1, 0), new ItemStack(ModBlocks.CLOUDIUM, 1, 0),
				ModFluids.MOLTEN_CLOUDIUM);
		ModTinkersHelper.addMetalCasting(new ItemStack(ModItems.ELEVATIUM_NUGGET, 1, 0),
				new ItemStack(ModItems.ELEVATIUM_INGOT, 1, 0), new ItemStack(ModBlocks.ELEVATIUM, 1, 0),
				ModFluids.MOLTEN_ELEVATIUM);
		ModTinkersHelper.addMetalCasting(new ItemStack(ModItems.SADISTIUM_NUGGET, 1, 0),
				new ItemStack(ModItems.SADISTIUM_INGOT, 1, 0), new ItemStack(ModBlocks.SADISTIUM, 1, 0),
				ModFluids.MOLTEN_SADISTIUM);
		ModTinkersHelper.addMetalCasting(new ItemStack(ModItems.DRUNKIUM_NUGGET, 1, 0),
				new ItemStack(ModItems.DRUNKIUM_INGOT, 1, 0), new ItemStack(ModBlocks.DRUNKIUM, 1, 0),
				ModFluids.MOLTEN_DRUNKIUM);
		ModTinkersHelper.addMetalCasting(new ItemStack(ModItems.MONEY_NUGGET, 1, 0),
				new ItemStack(ModItems.MONEY_INGOT, 1, 0), new ItemStack(ModBlocks.MONEY, 1, 0),
				ModFluids.MOLTEN_MONEY);

		ModTinkersHelper.addMetalCasting(new ItemStack(ModItems.GREMORIUM_NUGGET, 1, 0),
				new ItemStack(ModItems.GREMORIUM_INGOT, 1, 0), new ItemStack(ModBlocks.GREMORIUM, 1, 0),
				ModFluids.MOLTEN_GREMORIUM);
		ModTinkersHelper.addMetalCasting(new ItemStack(ModItems.HIMEJIMARIUM_NUGGET, 1, 0),
				new ItemStack(ModItems.HIMEJIMARIUM_INGOT, 1, 0), new ItemStack(ModBlocks.HIMEJIMARIUM, 1, 0),
				ModFluids.MOLTEN_HIMEJIMARIUM);
		ModTinkersHelper.addMetalCasting(new ItemStack(ModItems.TOUJOURIUM_NUGGET, 1, 0),
				new ItemStack(ModItems.TOUJOURIUM_INGOT, 1, 0), new ItemStack(ModBlocks.TOUJOURIUM, 1, 0),
				ModFluids.MOLTEN_TOUJOURIUM);
		ModTinkersHelper.addMetalCasting(new ItemStack(ModItems.ARGENTORIUM_NUGGET, 1, 0),
				new ItemStack(ModItems.ARGENTORIUM_INGOT, 1, 0), new ItemStack(ModBlocks.ARGENTORIUM, 1, 0),
				ModFluids.MOLTEN_ARGENTORIUM);
		ModTinkersHelper.addMetalCasting(new ItemStack(ModItems.QUARTARIUM_NUGGET, 1, 0),
				new ItemStack(ModItems.QUARTARIUM_INGOT, 1, 0), new ItemStack(ModBlocks.QUARTARIUM, 1, 0),
				ModFluids.MOLTEN_QUARTARIUM);
		ModTinkersHelper.addMetalCasting(new ItemStack(ModItems.NAGATORIUM_NUGGET, 1, 0),
				new ItemStack(ModItems.NAGATORIUM_INGOT, 1, 0), new ItemStack(ModBlocks.NAGATORIUM, 1, 0),
				ModFluids.MOLTEN_NAGATORIUM);
		ModTinkersHelper.addMetalCasting(new ItemStack(ModItems.SAKURAJIMARIUM_NUGGET, 1, 0),
				new ItemStack(ModItems.SAKURAJIMARIUM_INGOT, 1, 0), new ItemStack(ModBlocks.SAKURAJIMARIUM, 1, 0),
				ModFluids.MOLTEN_SAKURAJIMARIUM);
		ModTinkersHelper.addMetalCasting(new ItemStack(ModItems.KITAGAWARIUM_NUGGET, 1, 0),
				new ItemStack(ModItems.KITAGAWARIUM_INGOT, 1, 0), new ItemStack(ModBlocks.KITAGAWARIUM, 1, 0),
				ModFluids.MOLTEN_KITAGAWARIUM);
		TinkerRegistry.registerTableCasting(new ItemStack(ModItems.CHAOS_INGOT, 1, 0),
				new ItemStack(Item.getByNameOrId("tconstruct:cast_custom"), 1, 0), ModFluids.MOLTEN_CHAOS,
				Material.VALUE_Ingot);
	}

	@SubscribeEvent
	public static void registerToolForges(RegistryEvent.Register<IRecipe> event) {
		ModTinkersHelper.initToolForge(event, "blockBase");
		ModTinkersHelper.initToolForge(event, "blockOedldoedl");
		ModTinkersHelper.initToolForge(event, "blockBedrockium");
		ModTinkersHelper.initToolForge(event, "blockCloudium");
		ModTinkersHelper.initToolForge(event, "blockElevatium");
		ModTinkersHelper.initToolForge(event, "blockSadistium");
		ModTinkersHelper.initToolForge(event, "blockDrunkium");
		ModTinkersHelper.initToolForge(event, "blockMoney");

		ModTinkersHelper.initToolForge(event, "blockGremorium");
		ModTinkersHelper.initToolForge(event, "blockHimejimarium");
		ModTinkersHelper.initToolForge(event, "blockToujourium");
		ModTinkersHelper.initToolForge(event, "blockArgentorium");
		ModTinkersHelper.initToolForge(event, "blockQuartarium");
		ModTinkersHelper.initToolForge(event, "blockNagatorium");
		ModTinkersHelper.initToolForge(event, "blockSakurajimarium");
		ModTinkersHelper.initToolForge(event, "blockKitagawarium");
	}
}