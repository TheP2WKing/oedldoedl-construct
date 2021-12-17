package com.thep2wking.oedldoedl.construct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.thep2wking.oedldoedl.construct.config.constants.ModifiersConst;
import com.thep2wking.oedldoedl.construct.config.gui.ConstructConfig;
import com.thep2wking.oedldoedl.construct.integration.tcon.modifiers.ModifierInfinity;
import com.thep2wking.oedldoedl.construct.integration.tcon.modifiers.ModifierSadistic;
import com.thep2wking.oedldoedl.construct.util.handler.RegistryHandler;
import com.thep2wking.oedldoedl.construct.util.proxy.CommonProxy;
import com.thep2wking.oedldoedl.construct.util.recipes.ExtraCraftingRecipes;
import com.thep2wking.oedldoedl.construct.util.tabs.TabOedldoedlConstruct;
import com.thep2wking.oedldoedl.core.config.CoreConfig;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import slimeknights.tconstruct.library.modifiers.Modifier;

@Mod(modid = ReferenceConstruct.MODID, name = ReferenceConstruct.NAME, version = ReferenceConstruct.VERSION, dependencies = ReferenceConstruct.DEPENDENCIES, guiFactory = ReferenceConstruct.GUI_FACTORY)

public class OedldoedlConstruct
{
	public static final Logger logger = LogManager.getLogger(ReferenceConstruct.NAME);
	
	@SidedProxy(clientSide = ReferenceConstruct.CLIENT_PROXY_CLASS, serverSide = ReferenceConstruct.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static ConstructConfig config;
	
    public static Modifier modSadistic;
    public static Modifier modInfinity;
	
    @Instance
    public static OedldoedlConstruct instance;
    
    public static final CreativeTabs TAB = new TabOedldoedlConstruct("tab_oedldoedl_construct");
	
	@EventHandler
	public static void preInt(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
		if (CoreConfig.GENEREL.logging)
		{
			logger.info("Starting FML Pre-Initialization");
		}
		RegistryHandler.preInitRegistries(event);
		config = new ConstructConfig(event);
		MinecraftForge.EVENT_BUS.register(config);
		if (ModifiersConst.SADISTIC_MODIFIER)
		{
			modSadistic = new ModifierSadistic();
		}
		if (ModifiersConst.INFINITY_MODIFIER)
		{
			modInfinity = new ModifierInfinity();
		}
		ExtraCraftingRecipes.init();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		proxy.Init(event);
		if (CoreConfig.GENEREL.logging)
		{
			logger.info("Starting FML Initialization");
			System.out.println("Oedldoedl Core Mod is installed: "+Loader.isModLoaded("oedldoedlcore"));
			System.out.println("Mantle is installed: "+Loader.isModLoaded("mantle"));
			System.out.println("Tinkers Construct is installed: "+Loader.isModLoaded("tconstruct"));
		}
	}
		
	@EventHandler
	public static void postinit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
		if (CoreConfig.GENEREL.logging)
		{
			logger.info("Starting FML Post-Initialization");
		}
	}	
	
	@EventHandler
	public void loadComplete(FMLLoadCompleteEvent event) 
	{
		if (CoreConfig.GENEREL.logging)
		{
			logger.info(ReferenceConstruct.NAME+" "+ReferenceConstruct.VERSION+" loaded!");
		}
	}  
}