package net.thep2wking.oedldoedlconstruct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;
import net.thep2wking.oedldoedlconstruct.init.ConditionInit;
import net.thep2wking.oedldoedlconstruct.init.ModBlocks;
import net.thep2wking.oedldoedlconstruct.init.ModFluids;
import net.thep2wking.oedldoedlconstruct.init.ModItems;
import net.thep2wking.oedldoedlconstruct.integration.ModModifiers;
import net.thep2wking.oedldoedlconstruct.integration.TOPCompat;
import net.thep2wking.oedldoedlcore.config.CoreConfig;

@Mod(OedldoedlConstruct.MODID)
public class OedldoedlConstruct
{
	public static final String MODID = "oedldoedlconstruct";
	public static final String NAME = "Oedldoedl Construct";
	public static final String VERSION = "1.16.5-3.0.0";
	
	public static OedldoedlConstruct INSTANCE;
	
    public static final Logger LOGGER = LogManager.getLogger();

    public OedldoedlConstruct() 
    {
    	ConstructConfig.init();
    	
    	if (CoreConfig.general_logging.get()) {LOGGER.info("Registerd Config for" + MODID + "!");}
    	
    	IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    
    	ModBlocks.register(eventBus);
    	ModFluids.register(eventBus);
    	ModItems.register(eventBus);
    	
    	if (ModList.get().isLoaded("tconstruct"))
    	{
    		ModModifiers.register(eventBus);
    	}
    	
    	eventBus.register(new ConditionInit());

    	eventBus.addListener(this::onCommonSetup);
    	eventBus.addListener(this::onClientSetup);
    	eventBus.addListener(this::enqueue);
    	eventBus.addListener(this::onLoadComplete);
        
        MinecraftForge.EVENT_BUS.register(this);
    }

	private void onCommonSetup(final FMLCommonSetupEvent event)
    {			
    	if (CoreConfig.general_logging.get()) {LOGGER.info("Registerd Common Setup for" + MODID + "!");}
    }

	private void onClientSetup(final FMLClientSetupEvent event) 
    {
		if (CoreConfig.general_logging.get()) {LOGGER.info("Registerd Client Setup for" + MODID + "!");}
    }
	
	private void enqueue(final InterModEnqueueEvent event)
	{
        if (ModList.get().isLoaded("theoneprobe"))
        {
            TOPCompat.register();
        }
        
		if (CoreConfig.general_logging.get()) {LOGGER.info("Registerd IMC Setup for" + MODID + "!");}
	}
	
	private void onLoadComplete(final FMLLoadCompleteEvent event) 
	{
    	if (CoreConfig.integrations_logging.get() && ModList.get().isLoaded("jei")) {LOGGER.info("Loaded JEI Compat for" + MODID + "!");}
    	if (CoreConfig.integrations_logging.get() && ModList.get().isLoaded("theoneprobe")) {LOGGER.info("Loaded TOP Compat for" + MODID + "!");}
    	if (CoreConfig.integrations_logging.get() && ModList.get().isLoaded("configured")) {LOGGER.info("Loaded Configured Compat for" + MODID + "!");}
    	if (CoreConfig.integrations_logging.get() && ModList.get().isLoaded("tconstruct")) {LOGGER.info("Loaded Tinkers Compat for" + MODID + "!");}
    	
    	if (CoreConfig.general_logging.get()) {LOGGER.info(NAME + " " + VERSION + " successfully loaded!");}
	}
}