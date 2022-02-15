package net.thep2wking.oedldoedlconstruct.init;

import net.minecraft.fluid.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.util.ModFluidBuilder;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import net.thep2wking.oedldoedlcore.util.ModFluidUtil;

public class ModFluids 
{
	//deferred register
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, OedldoedlConstruct.MODID);

    //fluids
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_BASE_STILL = FLUIDS.register("molten_base_still", 
    		() -> new ForgeFlowingFluid.Source(ModFluids.BASE_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_BASE_FLOW = FLUIDS.register("molten_base_flow", 
    		() -> new ForgeFlowingFluid.Flowing(ModFluids.BASE_PROPERTIES)); 
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_OEDLDOEDL_STILL = FLUIDS.register("molten_oedldoedl_still", 
    		() -> new ForgeFlowingFluid.Source(ModFluids.OEDLDOEDL_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_OEDLDOEDL_FLOW = FLUIDS.register("molten_oedldoedl_flow", 
    		() -> new ForgeFlowingFluid.Flowing(ModFluids.OEDLDOEDL_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_GREMORIUM_STILL = FLUIDS.register("molten_gremorium_still", 
    		() -> new ForgeFlowingFluid.Source(ModFluids.GREMORIUM_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_GREMORIUM_FLOW = FLUIDS.register("molten_gremorium_flow", 
    		() -> new ForgeFlowingFluid.Flowing(ModFluids.GREMORIUM_PROPERTIES));  
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_HIMEJIMARIUM_STILL = FLUIDS.register("molten_himejimarium_still", 
    		() -> new ForgeFlowingFluid.Source(ModFluids.HIMEJIMARIUM_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_HIMEJIMARIUM_FLOW = FLUIDS.register("molten_himejimarium_flow", 
    		() -> new ForgeFlowingFluid.Flowing(ModFluids.HIMEJIMARIUM_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_TOUJOURIUM_STILL = FLUIDS.register("molten_toujourium_still", 
    		() -> new ForgeFlowingFluid.Source(ModFluids.TOUJOURIUM_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_TOUJOURIUM_FLOW = FLUIDS.register("molten_toujourium_flow", 
    		() -> new ForgeFlowingFluid.Flowing(ModFluids.TOUJOURIUM_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_ARGENTORIUM_STILL = FLUIDS.register("molten_argentorium_still", 
    		() -> new ForgeFlowingFluid.Source(ModFluids.ARGENTORIUM_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_ARGENTORIUM_FLOW = FLUIDS.register("molten_argentorium_flow", 
    		() -> new ForgeFlowingFluid.Flowing(ModFluids.ARGENTORIUM_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_QUARTARIUM_STILL = FLUIDS.register("molten_quartarium_still", 
    		() -> new ForgeFlowingFluid.Source(ModFluids.QUARTARIUM_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_QUARTARIUN_FLOW = FLUIDS.register("molten_quartarium_flow", 
    		() -> new ForgeFlowingFluid.Flowing(ModFluids.QUARTARIUM_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_NAGATORIUM_STILL = FLUIDS.register("molten_nagatorium_still", 
    		() -> new ForgeFlowingFluid.Source(ModFluids.NAGATORIUM_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_NAGATORIUM_FLOW = FLUIDS.register("molten_nagatorium_flow", 
    		() -> new ForgeFlowingFluid.Flowing(ModFluids.NAGATORIUM_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_SAKURAJIMARIUM_STILL = FLUIDS.register("molten_sakurajimarium_still", 
    		() -> new ForgeFlowingFluid.Source(ModFluids.SAKURAJIMARIUM_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_SAKURAJIMARIUM_FLOW = FLUIDS.register("molten_sakurajimarium_flow", 
    		() -> new ForgeFlowingFluid.Flowing(ModFluids.SAKURAJIMARIUM_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_INFINITY_STILL = FLUIDS.register("molten_infinity_still", 
    		() -> new ForgeFlowingFluid.Source(ModFluids.INFINITY_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_INFINITY_FLOW = FLUIDS.register("molten_infinity_flow", 
    		() -> new ForgeFlowingFluid.Flowing(ModFluids.INFINITY_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_CHAOS_STILL = FLUIDS.register("molten_chaos_still", 
    		() -> new ForgeFlowingFluid.Source(ModFluids.CHAOS_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid> MOLTEN_CHAOS_FLOW = FLUIDS.register("molten_chaos_flow", 
    		() -> new ForgeFlowingFluid.Flowing(ModFluids.CHAOS_PROPERTIES));
    
    public static final RegistryObject<ForgeFlowingFluid> SUPERHEATED_LAVA_STILL = FLUIDS.register("superheated_lava_still", 
    		() -> new ForgeFlowingFluid.Source(ModFluids.SUPERHEATED_LAVA_PROPERTIES));
    public static final RegistryObject<ForgeFlowingFluid> SUPERHEATED_LAVA_FLOW = FLUIDS.register("superheated_lava_flow", 
    		() -> new ForgeFlowingFluid.Flowing(ModFluids.SUPERHEATED_LAVA_PROPERTIES));
    
    //fluid properties
    public static final ForgeFlowingFluid.Properties BASE_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_BASE_STILL.get(), () -> MOLTEN_BASE_FLOW.get(), ModFluidUtil.moltenFluidBuilder(0xff9c9c9c)).slopeFindDistance(2).levelDecreasePerBlock(2).tickRate(30)
    		.block(() -> ModBlocks.MOLTEN_BASE.get()).bucket(() -> ModItems.MOLTEN_BASE_BUCKET.get());
    public static final ForgeFlowingFluid.Properties OEDLDOEDL_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_OEDLDOEDL_STILL.get(), () -> MOLTEN_OEDLDOEDL_FLOW.get(), ModFluidBuilder.oedldoedl()).slopeFindDistance(2).levelDecreasePerBlock(2).tickRate(30)
    		.block(() -> ModBlocks.MOLTEN_OEDLDOEDL.get()).bucket(() -> ModItems.MOLTEN_OEDLDOEDL_BUCKET.get());
    public static final ForgeFlowingFluid.Properties GREMORIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_GREMORIUM_STILL.get(), () -> MOLTEN_GREMORIUM_FLOW.get(), ModFluidUtil.moltenFluidBuilder(0xff990000)).slopeFindDistance(2).levelDecreasePerBlock(2).tickRate(30)
    		.block(() -> ModBlocks.MOLTEN_GREMORIUM.get()).bucket(() -> ModItems.MOLTEN_GREMORIUM_BUCKET.get());
    public static final ForgeFlowingFluid.Properties HIMEJIMARIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_HIMEJIMARIUM_STILL.get(), () -> MOLTEN_HIMEJIMARIUM_FLOW.get(), ModFluidUtil.moltenFluidBuilder(0xff232033)).slopeFindDistance(2).levelDecreasePerBlock(2).tickRate(30)
    		.block(() -> ModBlocks.MOLTEN_HIMEJIMARIUM.get()).bucket(() -> ModItems.MOLTEN_HIMEJIMARIUM_BUCKET.get());
    public static final ForgeFlowingFluid.Properties TOUJOURIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_TOUJOURIUM_STILL.get(), () -> MOLTEN_TOUJOURIUM_FLOW.get(), ModFluidUtil.moltenFluidBuilder(0xffc9c4c4)).slopeFindDistance(2).levelDecreasePerBlock(2).tickRate(30)
    		.block(() -> ModBlocks.MOLTEN_TOUJOURIUM.get()).bucket(() -> ModItems.MOLTEN_TOUJOURIUM_BUCKET.get());
    public static final ForgeFlowingFluid.Properties ARGENTORIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_ARGENTORIUM_STILL.get(), () -> MOLTEN_ARGENTORIUM_FLOW.get(), ModFluidUtil.moltenFluidBuilder(0xfffbd985)).slopeFindDistance(2).levelDecreasePerBlock(2).tickRate(30)
    		.block(() -> ModBlocks.MOLTEN_ARGENTORIUM.get()).bucket(() -> ModItems.MOLTEN_ARGENTORIUM_BUCKET.get());
    public static final ForgeFlowingFluid.Properties QUARTARIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_QUARTARIUM_STILL.get(), () -> MOLTEN_QUARTARIUN_FLOW.get(), ModFluidUtil.moltenFluidBuilder(0xff0e5191)).slopeFindDistance(2).levelDecreasePerBlock(2).tickRate(30)
    		.block(() -> ModBlocks.MOLTEN_QUARTARIUM.get()).bucket(() -> ModItems.MOLTEN_QUARTARIUM_BUCKET.get());
    public static final ForgeFlowingFluid.Properties NAGATORIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_NAGATORIUM_STILL.get(), () -> MOLTEN_NAGATORIUM_FLOW.get(), ModFluidUtil.moltenFluidBuilder(0xff650fc1)).slopeFindDistance(2).levelDecreasePerBlock(2).tickRate(30)
    		.block(() -> ModBlocks.MOLTEN_NAGATORIUM.get()).bucket(() -> ModItems.MOLTEN_NAGATORIUM_BUCKET.get());
    public static final ForgeFlowingFluid.Properties SAKURAJIMARIUM_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_SAKURAJIMARIUM_STILL.get(), () -> MOLTEN_SAKURAJIMARIUM_FLOW.get(), ModFluidUtil.moltenFluidBuilder(0xff2a2929)).slopeFindDistance(2).levelDecreasePerBlock(2).tickRate(30)
    		.block(() -> ModBlocks.MOLTEN_SAKURAJIMARIUM.get()).bucket(() -> ModItems.MOLTEN_SAKURAJIMARIUM_BUCKET.get());
    public static final ForgeFlowingFluid.Properties INFINITY_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_INFINITY_STILL.get(), () -> MOLTEN_INFINITY_FLOW.get(), ModFluidUtil.moltenFluidBuilder(0xffc29ee5)).slopeFindDistance(2).levelDecreasePerBlock(2).tickRate(30)
    		.block(() -> ModBlocks.MOLTEN_INFINITY.get()).bucket(() -> ModItems.MOLTEN_INFINITY_BUCKET.get());
    public static final ForgeFlowingFluid.Properties CHAOS_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> MOLTEN_CHAOS_STILL.get(), () -> MOLTEN_CHAOS_FLOW.get(), ModFluidUtil.moltenFluidBuilder(0xff0e0025)).slopeFindDistance(2).levelDecreasePerBlock(2).tickRate(30)
    		.block(() -> ModBlocks.MOLTEN_CHAOS.get()).bucket(() -> ModItems.MOLTEN_CHAOS_BUCKET.get());
    
    public static final ForgeFlowingFluid.Properties SUPERHEATED_LAVA_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> SUPERHEATED_LAVA_STILL.get(), () -> SUPERHEATED_LAVA_FLOW.get(), ModFluidBuilder.superheatedLava()).slopeFindDistance(2).levelDecreasePerBlock(4).tickRate(2)
    		.block(() -> ModBlocks.SUPERHEATED_LAVA.get()).bucket(() -> ModItems.SUPERHEATED_LAVA_BUCKET.get());

    public static void register(IEventBus eventBus) 
    {
        FLUIDS.register(eventBus);
        
		if (CoreConfig.general_logging.get()) {OedldoedlConstruct.LOGGER.info("Registerd Fluids for " + OedldoedlConstruct.MODID + "!");}
    }

}