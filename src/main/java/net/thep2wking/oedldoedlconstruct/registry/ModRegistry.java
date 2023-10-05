package net.thep2wking.oedldoedlconstruct.registry;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.init.ModBlocks;
import net.thep2wking.oedldoedlconstruct.init.ModFluids;
import net.thep2wking.oedldoedlconstruct.init.ModItems;
import net.thep2wking.oedldoedlcore.util.ModLogger;
import net.thep2wking.oedldoedlcore.util.ModRegistryHelper;

@Mod.EventBusSubscriber
public class ModRegistry {
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		ModLogger.registeredBlocksLogger(OedldoedlConstruct.MODID);

		ModRegistryHelper.registerBlock(event, ModBlocks.MOLTEN_BASE);
		ModRegistryHelper.registerBlock(event, ModBlocks.MOLTEN_OEDLDOEDL);
		ModRegistryHelper.registerBlock(event, ModBlocks.MOLTEN_BEDROCKIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.MOLTEN_CLOUDIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.MOLTEN_ELEVATIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.MOLTEN_SADISTIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.MOLTEN_DRUNKIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.MOLTEN_MONEY);
		ModRegistryHelper.registerBlock(event, ModBlocks.MOLTEN_CHAOS);

		ModRegistryHelper.registerBlock(event, ModBlocks.MOLTEN_GREMORIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.MOLTEN_HIMEJIMARIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.MOLTEN_TOUJOURIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.MOLTEN_ARGENTORIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.MOLTEN_QUARTARIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.MOLTEN_NAGATORIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.MOLTEN_SAKURAJIMARIUM);
		ModRegistryHelper.registerBlock(event, ModBlocks.MOLTEN_KITAGAWARIUM);
	}

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		ModLogger.registeredItemsLogger(OedldoedlConstruct.MODID);

		ModRegistryHelper.registerItem(event, ModItems.INFINITY_SYMBOL);
		ModRegistryHelper.registerItem(event, ModItems.FURIOUS_COCKTAIL);
		ModRegistryHelper.registerItem(event, ModItems.REMOTE_BREAKER);
		ModRegistryHelper.registerItem(event, ModItems.SADISTIC_SOUL);
	}

	@SubscribeEvent
	public static void onSoundEventRegister(RegistryEvent.Register<SoundEvent> event) {
		ModLogger.registeredSoundEventsLogger(OedldoedlConstruct.MODID);
	}

	public static void registerFluids(FMLPreInitializationEvent event) {
		ModLogger.registeredFluidsLogger(OedldoedlConstruct.MODID);

		ModRegistryHelper.registerFluid(ModFluids.MOLTEN_BASE);
		ModRegistryHelper.registerFluid(ModFluids.MOLTEN_OEDLDOEDL);
		ModRegistryHelper.registerFluid(ModFluids.MOLTEN_BEDROCKIUM);
		ModRegistryHelper.registerFluid(ModFluids.MOLTEN_CLOUDIUM);
		ModRegistryHelper.registerFluid(ModFluids.MOLTEN_ELEVATIUM);
		ModRegistryHelper.registerFluid(ModFluids.MOLTEN_SADISTIUM);
		ModRegistryHelper.registerFluid(ModFluids.MOLTEN_DRUNKIUM);
		ModRegistryHelper.registerFluid(ModFluids.MOLTEN_MONEY);
		ModRegistryHelper.registerFluid(ModFluids.MOLTEN_CHAOS);

		ModRegistryHelper.registerFluid(ModFluids.MOLTEN_GREMORIUM);
		ModRegistryHelper.registerFluid(ModFluids.MOLTEN_HIMEJIMARIUM);
		ModRegistryHelper.registerFluid(ModFluids.MOLTEN_TOUJOURIUM);
		ModRegistryHelper.registerFluid(ModFluids.MOLTEN_ARGENTORIUM);
		ModRegistryHelper.registerFluid(ModFluids.MOLTEN_QUARTARIUM);
		ModRegistryHelper.registerFluid(ModFluids.MOLTEN_NAGATORIUM);
		ModRegistryHelper.registerFluid(ModFluids.MOLTEN_SAKURAJIMARIUM);
		ModRegistryHelper.registerFluid(ModFluids.MOLTEN_KITAGAWARIUM);
	}
}