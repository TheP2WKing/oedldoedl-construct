package com.thep2wking.oedldoedl.construct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.thep2wking.oedldoedl.construct.config.constants.FluidsConst;
import com.thep2wking.oedldoedl.construct.config.constants.ModifiersConst;
import com.thep2wking.oedldoedl.construct.config.constants.ToolsConst;
import com.thep2wking.oedldoedl.construct.config.gui.ConstructConfig;
import com.thep2wking.oedldoedl.construct.integration.tcon.modifier.ModifierInfinity;
import com.thep2wking.oedldoedl.construct.integration.tcon.modifier.ModifierSadistic;
import com.thep2wking.oedldoedl.construct.integration.tcon.tools.OedldoedlTinkerTools;
import com.thep2wking.oedldoedl.construct.util.handler.RegistryHandler;
import com.thep2wking.oedldoedl.construct.util.proxy.CommonProxy;
import com.thep2wking.oedldoedl.construct.util.tabs.TabOedldoedlConstruct;
import com.thep2wking.oedldoedl.resources.init.BlockInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;
import slimeknights.tconstruct.library.TinkerRegistry;
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
		logger.info("Starting FML Pre-Initialization");
		RegistryHandler.preInitRegistries(event);
		config = new ConstructConfig(event);
		MinecraftForge.EVENT_BUS.register(config);
		OedldoedlTinkerTools.init();
		OedldoedlTinkerTools.initTraits();
		OedldoedlTinkerTools.initFluidModels();
		if (ModifiersConst.SADISTIC_MODIFIER)
		{
			modSadistic = new ModifierSadistic();
		}
		if (ModifiersConst.INFINITY_MODIFIER)
		{
			modInfinity = new ModifierInfinity();
		}
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		proxy.Init(event);
		logger.info("Starting FML Initialization");
		System.out.println("Oedldoedl Core Mod is installed: "+Loader.isModLoaded("oedldoedlcore"));
		System.out.println("Mantle is installed: "+Loader.isModLoaded("mantle"));
		System.out.println("Tinkers Construct is installed: "+Loader.isModLoaded("tconstruct"));
		
		if (FluidsConst.GREMORIUM_FLUID && ToolsConst.GREMORIUM_TOOLS)
		{
			TinkerRegistry.registerMelting(new ItemStack(BlockInit.BLOCK_GREMORIUM_GEM_ORE), OedldoedlTinkerTools.moltenGremorium, 288);
		}
		if (FluidsConst.HIMEJIMARIUM_FLUID && ToolsConst.HIMEJIMARIUM_TOOLS)
		{
			TinkerRegistry.registerMelting(new ItemStack(BlockInit.BLOCK_HIMEJIMARIUM_GEM_ORE), OedldoedlTinkerTools.moltenHimejimarium, 288);
		}
		if (FluidsConst.TOUJOURIUM_FLUID && ToolsConst.TOUJOURIUM_TOOLS)
		{
			TinkerRegistry.registerMelting(new ItemStack(BlockInit.BLOCK_TOUJOURIUM_GEM_ORE), OedldoedlTinkerTools.moltenToujourium, 288);
		}
		if (FluidsConst.ARGENTORIUM_FLUID && ToolsConst.ARGENTORIUM_TOOLS)
		{
			TinkerRegistry.registerMelting(new ItemStack(BlockInit.BLOCK_ARGENTORIUM_GEM_ORE), OedldoedlTinkerTools.moltenArgentorium, 288);
		}
		if (FluidsConst.QUARTARIUM_FLUID && ToolsConst.QUARTARIUM_TOOLS)
		{
			TinkerRegistry.registerMelting(new ItemStack(BlockInit.BLOCK_QUARTARIUM_GEM_ORE), OedldoedlTinkerTools.moltenQuartarium, 288);
		}
		//move this to resource part
		OreDictionary.registerOre("blockBase", BlockInit.BLOCK_INGOT_BASE);
	}
		
	@EventHandler
	public static void postinit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
		logger.info("Starting FML Post-Initialization");
	}	
	
	@EventHandler
	public void loadComplete(FMLLoadCompleteEvent event) 
	{
		logger.info(ReferenceConstruct.NAME+" "+ReferenceConstruct.VERSION+" loaded!");
	}  
}