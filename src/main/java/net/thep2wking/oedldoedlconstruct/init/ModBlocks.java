package net.thep2wking.oedldoedlconstruct.init;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.potion.Effects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.base.ModFlowingFluidBlockEffectBase;
import net.thep2wking.oedldoedlconstruct.content.block.SuperheatedLavaFluidBlock;
import net.thep2wking.oedldoedlcore.base.ModFlowingFluidBlockBase;
import net.thep2wking.oedldoedlcore.config.CoreConfig;

public class ModBlocks 
{
	//deferred register
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, OedldoedlConstruct.MODID);
	
    //fluidblocks
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_BASE = BLOCKS.register("molten_base",
            () -> new ModFlowingFluidBlockBase(() -> ModFluids.MOLTEN_BASE_STILL.get(), 15, AbstractBlock.Properties.create(Material.LAVA, MaterialColor.WOOL)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_OEDLDOEDL = BLOCKS.register("molten_oedldoedl",
            () -> new ModFlowingFluidBlockBase(() -> ModFluids.MOLTEN_OEDLDOEDL_STILL.get(), 15, AbstractBlock.Properties.create(Material.LAVA, MaterialColor.YELLOW)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_GREMORIUM = BLOCKS.register("molten_gremorium",
            () -> new ModFlowingFluidBlockEffectBase(() -> ModFluids.MOLTEN_GREMORIUM_STILL.get(), Effects.HASTE, false, 15, AbstractBlock.Properties.create(Material.LAVA, MaterialColor.NETHERRACK)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_HIMEJIMARIUM = BLOCKS.register("molten_himejimarium",
            () -> new ModFlowingFluidBlockEffectBase(() -> ModFluids.MOLTEN_HIMEJIMARIUM_STILL.get(), Effects.RESISTANCE, false, 15, AbstractBlock.Properties.create(Material.LAVA, MaterialColor.BLUE_TERRACOTTA)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_TOUJOURIUM = BLOCKS.register("molten_toujourium",
            () -> new ModFlowingFluidBlockEffectBase(() -> ModFluids.MOLTEN_TOUJOURIUM_STILL.get(), Effects.SPEED, false, 15, AbstractBlock.Properties.create(Material.LAVA, MaterialColor.SNOW)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_ARGENTORIUM = BLOCKS.register("molten_argentorium",
            () -> new ModFlowingFluidBlockEffectBase(() -> ModFluids.MOLTEN_ARGENTORIUM_STILL.get(), Effects.SATURATION, false, 15, AbstractBlock.Properties.create(Material.LAVA, MaterialColor.YELLOW)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_QUARTARIUM = BLOCKS.register("molten_quartarium",
            () -> new ModFlowingFluidBlockEffectBase(() -> ModFluids.MOLTEN_QUARTARIUM_STILL.get(), Effects.STRENGTH, false, 15, AbstractBlock.Properties.create(Material.LAVA, MaterialColor.BLUE)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_NAGATORIUM = BLOCKS.register("molten_nagatorium",
            () -> new ModFlowingFluidBlockEffectBase(() -> ModFluids.MOLTEN_NAGATORIUM_STILL.get(), Effects.MINING_FATIGUE, true, 15, AbstractBlock.Properties.create(Material.LAVA, MaterialColor.PURPLE)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_SAKURAJIMARIUM = BLOCKS.register("molten_sakurajimarium",
            () -> new ModFlowingFluidBlockEffectBase(() -> ModFluids.MOLTEN_SAKURAJIMARIUM_STILL.get(), Effects.JUMP_BOOST, false, 15, AbstractBlock.Properties.create(Material.LAVA, MaterialColor.GRAY)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_INFINITY = BLOCKS.register("molten_infinity",
            () -> new ModFlowingFluidBlockBase(() -> ModFluids.MOLTEN_INFINITY_STILL.get(), 15, AbstractBlock.Properties.create(Material.LAVA, MaterialColor.MAGENTA)));
    public static final RegistryObject<FlowingFluidBlock> MOLTEN_CHAOS = BLOCKS.register("molten_chaos",
            () -> new ModFlowingFluidBlockBase(() -> ModFluids.MOLTEN_CHAOS_STILL.get(), 15, AbstractBlock.Properties.create(Material.LAVA, MaterialColor.BLACK)));

    public static final RegistryObject<FlowingFluidBlock> SUPERHEATED_LAVA = BLOCKS.register("superheated_lava",
            () -> new SuperheatedLavaFluidBlock(() -> ModFluids.SUPERHEATED_LAVA_STILL.get(), 15, AbstractBlock.Properties.create(Material.LAVA, MaterialColor.RED)));
	
	public static void register(IEventBus enevtBus)
	{
		BLOCKS.register(enevtBus);
	
		if (CoreConfig.general_logging.get()) {OedldoedlConstruct.LOGGER.info("Registerd Blocks for " + OedldoedlConstruct.MODID + "!");}
	}
}