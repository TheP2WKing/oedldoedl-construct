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
import net.thep2wking.oedldoedlconstruct.init.ModBlocks;
import net.thep2wking.oedldoedlconstruct.init.ModConditions;
import net.thep2wking.oedldoedlconstruct.init.ModFluids;
import net.thep2wking.oedldoedlconstruct.init.ModItems;
import net.thep2wking.oedldoedlconstruct.init.ModModifiers;
import net.thep2wking.oedldoedlconstruct.integration.TOPCompat;

@Mod(OedldoedlConstruct.MODID)
public class OedldoedlConstruct
{
	public static final String MODID = "oedldoedlconstruct";
	public static final String NAME = "Oedldoedl Construct";
	public static final String VERSION = "1.16.5-3.1.0";
	
	public static OedldoedlConstruct INSTANCE;
	
    public static final Logger LOGGER = LogManager.getLogger();

    public OedldoedlConstruct() 
    {
    	ConstructConfig.init();
    	
    	LOGGER.info("Registerd Config for " + MODID + "!");
    	
    	IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
    
    	ModBlocks.register(eventBus);
    	ModFluids.register(eventBus);
    	ModItems.register(eventBus);
    	
    	if (ModList.get().isLoaded("tconstruct"))
    	{
    		ModModifiers.register(eventBus);
    	}
    	
    	eventBus.register(new ModConditions());

    	eventBus.addListener(this::onCommonSetup);
    	eventBus.addListener(this::onClientSetup);
    	eventBus.addListener(this::onEnqueueSetup);
    	eventBus.addListener(this::onLoadComplete);
        
        MinecraftForge.EVENT_BUS.register(this);
    }

	private void onCommonSetup(final FMLCommonSetupEvent event)
    {			
    	LOGGER.info("Registerd Common Setup for " + MODID + "!");
    }

	private void onClientSetup(final FMLClientSetupEvent event) 
    {
		LOGGER.info("Registerd Client Setup for " + MODID + "!");
    }
	
	private void onEnqueueSetup(final InterModEnqueueEvent event)
	{
        if (ModList.get().isLoaded("theoneprobe"))
        {
            TOPCompat.register();
        }
        
		LOGGER.info("Registerd IMC Setup for " + MODID + "!");
	}
	
	private void onLoadComplete(final FMLLoadCompleteEvent event) 
	{
    	if (ModList.get().isLoaded("jei")) {LOGGER.info("Loaded JEI Compat for " + MODID + "!");}
    	if (ModList.get().isLoaded("theoneprobe")) {LOGGER.info("Loaded TOP Compat for " + MODID + "!");}
    	if (ModList.get().isLoaded("configured")) {LOGGER.info("Loaded Configured Compat for " + MODID + "!");}
    	if (ModList.get().isLoaded("tconstruct")) {LOGGER.info("Loaded Tinkers Compat for " + MODID + "!");}
    	
    	LOGGER.info(NAME + " " + VERSION + " successfully loaded!");
	}
}