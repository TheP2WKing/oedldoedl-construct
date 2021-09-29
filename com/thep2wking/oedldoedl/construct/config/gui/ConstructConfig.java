package com.thep2wking.oedldoedl.construct.config.gui;

import java.io.File;

import com.thep2wking.oedldoedl.construct.ReferenceConstruct;
import com.thep2wking.oedldoedl.construct.config.constants.FluidsConst;
import com.thep2wking.oedldoedl.construct.config.constants.ModifiersConst;
import com.thep2wking.oedldoedl.construct.config.constants.StatsConst;
import com.thep2wking.oedldoedl.construct.config.constants.ToolsConst;
import com.thep2wking.oedldoedl.construct.config.constants.TraitsConst;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ConstructConfig
{
	public static Configuration config;
	
    public ConstructConfig(FMLPreInitializationEvent event)
    {
        final File configFile = new File(event.getModConfigurationDirectory(), ReferenceConstruct.MODID+".cfg");
        config = new Configuration(configFile, "v1.0.0");

        load();
        sync();
    }

	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if (event.getModID().equals(ReferenceConstruct.MODID))
			ConstructConfig.sync();
	}

	public static void sync()
	{    	    
	    //category - fluids
	    config.getCategory(FluidsConst.CATEGORY_FLUIDS).setComment(FluidsConst.CATEGORY_FLUIDS_COMMENT);
	    FluidsConst.BASE_FLUID = config.getBoolean(FluidsConst.BASE_FLUID_NAME, FluidsConst.CATEGORY_FLUIDS, true, FluidsConst.BASE_FLUID_COMMENT);
	    FluidsConst.OEDLDOEDL_FLUID = config.getBoolean(FluidsConst.OEDLDOEDL_FLUID_NAME, FluidsConst.CATEGORY_FLUIDS, true, FluidsConst.OEDLDOEDL_FLUID_COMMENT);
	    FluidsConst.BEDROCKIUM_FLUID = config.getBoolean(FluidsConst.BEDROCKIUM_FLUID_NAME, FluidsConst.CATEGORY_FLUIDS, true, FluidsConst.BEDROCKIUM_FLUID_COMMENT);
	    FluidsConst.SADISTIUM_FLUID = config.getBoolean(FluidsConst.SADISTIUM_FLUID_NAME, FluidsConst.CATEGORY_FLUIDS, true, FluidsConst.SADISTIUM_FLUID_COMMENT);	        
	    FluidsConst.GREMORIUM_FLUID = config.getBoolean(FluidsConst.GREMORIUM_FLUID_NAME, FluidsConst.CATEGORY_FLUIDS, true, FluidsConst.GREMORIUM_FLUID_COMMENT);
	    FluidsConst.HIMEJIMARIUM_FLUID = config.getBoolean(FluidsConst.HIMEJIMARIUM_FLUID_NAME, FluidsConst.CATEGORY_FLUIDS, true, FluidsConst.HIMEJIMARIUM_FLUID_COMMENT);
	    FluidsConst.TOUJOURIUM_FLUID = config.getBoolean(FluidsConst.TOUJOURIUM_FLUID_NAME, FluidsConst.CATEGORY_FLUIDS, true, FluidsConst.TOUJOURIUM_FLUID_COMMENT);
	    FluidsConst.ARGENTORIUM_FLUID = config.getBoolean(FluidsConst.ARGENTORIUM_FLUID_NAME, FluidsConst.CATEGORY_FLUIDS, true, FluidsConst.ARGENTORIUM_FLUID_COMMENT);
	    FluidsConst.QUARTARIUM_FLUID = config.getBoolean(FluidsConst.QUARTARIUM_FLUID_NAME, FluidsConst.CATEGORY_FLUIDS, true, FluidsConst.QUARTARIUM_FLUID_COMMENT);
	    FluidsConst.CHAOS_FLUID = config.getBoolean(FluidsConst.CHAOS_FLUID_NAME, FluidsConst.CATEGORY_FLUIDS, true, FluidsConst.CHAOS_FLUID_COMMENT);
	    
		//category - tools
	    config.getCategory(ToolsConst.CATEGORY_TOOLS).setComment(ToolsConst.CATEGORY_TOOLS_COMMENT);
	    ToolsConst.BASE_TOOLS = config.getBoolean(ToolsConst.BASE_TOOLS_NAME, ToolsConst.CATEGORY_TOOLS, true, ToolsConst.BASE_TOOLS_COMMENT);
	    ToolsConst.BEDROCKIUM_TOOLS = config.getBoolean(ToolsConst.BEDROCKIUM_TOOLS_NAME, ToolsConst.CATEGORY_TOOLS, true, ToolsConst.BEDROCKIUM_TOOLS_COMMENT);
	    ToolsConst.SADISTIUM_TOOLS = config.getBoolean(ToolsConst.SADISTIUM_TOOLS_NAME, ToolsConst.CATEGORY_TOOLS, true, ToolsConst.SADISTIUM_TOOLS_COMMENT);	        
	    ToolsConst.GREMORIUM_TOOLS = config.getBoolean(ToolsConst.GREMORIUM_TOOLS_NAME, ToolsConst.CATEGORY_TOOLS, true, ToolsConst.GREMORIUM_TOOLS_COMMENT);
	    ToolsConst.HIMEJIMARIUM_TOOLS = config.getBoolean(ToolsConst.HIMEJIMARIUM_TOOLS_NAME, ToolsConst.CATEGORY_TOOLS, true, ToolsConst.HIMEJIMARIUM_TOOLS_COMMENT);
	    ToolsConst.TOUJOURIUM_TOOLS = config.getBoolean(ToolsConst.TOUJOURIUM_TOOLS_NAME, ToolsConst.CATEGORY_TOOLS, true, ToolsConst.TOUJOURIUM_TOOLS_COMMENT);
	    ToolsConst.ARGENTORIUM_TOOLS = config.getBoolean(ToolsConst.ARGENTORIUM_TOOLS_NAME, ToolsConst.CATEGORY_TOOLS, true, ToolsConst.ARGENTORIUM_TOOLS_COMMENT);
	    ToolsConst.QUARTARIUM_TOOLS = config.getBoolean(ToolsConst.QUARTARIUM_TOOLS_NAME, ToolsConst.CATEGORY_TOOLS, true, ToolsConst.QUARTARIUM_TOOLS_COMMENT);
	    ToolsConst.CHAOS_TOOLS = config.getBoolean(ToolsConst.CHAOS_TOOLS_NAME, ToolsConst.CATEGORY_TOOLS, true, ToolsConst.CHAOS_TOOLS_COMMENT);
	    
		//category - stats
	    config.getCategory(StatsConst.CATEGORY_STATS).setComment(StatsConst.CATEGORY_STATS_COMMENT);
	    StatsConst.BASE_TOOLS_DURABILITY = config.getInt(StatsConst.BASE_TOOLS_DURABILITY_NAME, StatsConst.CATEGORY_STATS, 222, Integer.MIN_VALUE, Integer.MAX_VALUE, StatsConst.BASE_TOOLS_DURABILITY_COMMENT);
	    StatsConst.BASE_TOOLS_EXTRA_DURABILITY = config.getInt(StatsConst.BASE_TOOLS_EXTRA_DURABILITY_NAME, StatsConst.CATEGORY_STATS, 222, Integer.MIN_VALUE, Integer.MAX_VALUE, StatsConst.BASE_TOOLS_EXTRA_DURABILITY_COMMENT);
	    StatsConst.BEDROCKIUM_TOOLS_DURABILITY = config.getInt(StatsConst.BEDROCKIUM_TOOLS_DURABILITY_NAME, StatsConst.CATEGORY_STATS, 45825, Integer.MIN_VALUE, Integer.MAX_VALUE, StatsConst.BEDROCKIUM_TOOLS_DURABILITY_COMMENT);
	    StatsConst.BEDROCKIUM_TOOLS_EXTRA_DURABILITY = config.getInt(StatsConst.BEDROCKIUM_TOOLS_EXTRA_DURABILITY_NAME, StatsConst.CATEGORY_STATS, 11889, Integer.MIN_VALUE, Integer.MAX_VALUE, StatsConst.BEDROCKIUM_TOOLS_EXTRA_DURABILITY_COMMENT);
	    StatsConst.SADISTIUM_TOOLS_DURABILITY = config.getInt(StatsConst.SADISTIUM_TOOLS_DURABILITY_NAME, StatsConst.CATEGORY_STATS, 1, Integer.MIN_VALUE, Integer.MAX_VALUE, StatsConst.SADISTIUM_TOOLS_DURABILITY_COMMENT);
	    StatsConst.SADISTIUM_TOOLS_EXTRA_DURABILITY = config.getInt(StatsConst.SADISTIUM_TOOLS_EXTRA_DURABILITY_NAME, StatsConst.CATEGORY_STATS, 1, Integer.MIN_VALUE, Integer.MAX_VALUE, StatsConst.SADISTIUM_TOOLS_EXTRA_DURABILITY_COMMENT);
        StatsConst.GREMORIUM_TOOLS_DURABILITY = config.getInt(StatsConst.GREMORIUM_TOOLS_DURABILITY_NAME, StatsConst.CATEGORY_STATS, 9958, Integer.MIN_VALUE, Integer.MAX_VALUE, StatsConst.GREMORIUM_TOOLS_DURABILITY_COMMENT);
	    StatsConst.GREMORIUM_TOOLS_EXTRA_DURABILITY = config.getInt(StatsConst.GREMORIUM_TOOLS_EXTRA_DURABILITY_NAME, StatsConst.CATEGORY_STATS, 1720, Integer.MIN_VALUE, Integer.MAX_VALUE, StatsConst.GREMORIUM_TOOLS_EXTRA_DURABILITY_COMMENT);
        StatsConst.HIMEJIMARIUM_TOOLS_DURABILITY = config.getInt(StatsConst.HIMEJIMARIUM_TOOLS_DURABILITY_NAME, StatsConst.CATEGORY_STATS, 10260, Integer.MIN_VALUE, Integer.MAX_VALUE, StatsConst.HIMEJIMARIUM_TOOLS_DURABILITY_COMMENT);
	    StatsConst.HIMEJIMARIUM_TOOLS_EXTRA_DURABILITY = config.getInt(StatsConst.HIMEJIMARIUM_TOOLS_EXTRA_DURABILITY_NAME, StatsConst.CATEGORY_STATS, 1680, Integer.MIN_VALUE, Integer.MAX_VALUE, StatsConst.HIMEJIMARIUM_TOOLS_EXTRA_DURABILITY_COMMENT);
        StatsConst.TOUJOURIUM_TOOLS_DURABILITY = config.getInt(StatsConst.TOUJOURIUM_TOOLS_DURABILITY_NAME, StatsConst.CATEGORY_STATS, 6757, Integer.MIN_VALUE, Integer.MAX_VALUE, StatsConst.TOUJOURIUM_TOOLS_DURABILITY_COMMENT);
	    StatsConst.TOUJOURIUM_TOOLS_EXTRA_DURABILITY = config.getInt(StatsConst.TOUJOURIUM_TOOLS_EXTRA_DURABILITY_NAME, StatsConst.CATEGORY_STATS, 1380, Integer.MIN_VALUE, Integer.MAX_VALUE, StatsConst.TOUJOURIUM_TOOLS_EXTRA_DURABILITY_COMMENT);
        StatsConst.ARGENTORIUM_TOOLS_DURABILITY = config.getInt(StatsConst.ARGENTORIUM_TOOLS_DURABILITY_NAME, StatsConst.CATEGORY_STATS, 8355, Integer.MIN_VALUE, Integer.MAX_VALUE, StatsConst.ARGENTORIUM_TOOLS_DURABILITY_COMMENT);
	    StatsConst.ARGENTORIUM_TOOLS_EXTRA_DURABILITY = config.getInt(StatsConst.ARGENTORIUM_TOOLS_EXTRA_DURABILITY_NAME, StatsConst.CATEGORY_STATS, 1550, Integer.MIN_VALUE, Integer.MAX_VALUE, StatsConst.ARGENTORIUM_TOOLS_EXTRA_DURABILITY_COMMENT);
        StatsConst.QUARTARIUM_TOOLS_DURABILITY = config.getInt(StatsConst.QUARTARIUM_TOOLS_DURABILITY_NAME, StatsConst.CATEGORY_STATS, 8758, Integer.MIN_VALUE, Integer.MAX_VALUE, StatsConst.QUARTARIUM_TOOLS_DURABILITY_COMMENT);
	    StatsConst.QUARTARIUM_TOOLS_EXTRA_DURABILITY = config.getInt(StatsConst.QUARTARIUM_TOOLS_EXTRA_DURABILITY_NAME, StatsConst.CATEGORY_STATS, 1660, Integer.MIN_VALUE, Integer.MAX_VALUE, StatsConst.QUARTARIUM_TOOLS_EXTRA_DURABILITY_COMMENT);
        StatsConst.CHAOS_TOOLS_DURABILITY = config.getInt(StatsConst.CHAOS_TOOLS_DURABILITY_NAME, StatsConst.CATEGORY_STATS, 999999, Integer.MIN_VALUE, Integer.MAX_VALUE, StatsConst.CHAOS_TOOLS_DURABILITY_COMMENT);
	    StatsConst.CHAOS_TOOLS_EXTRA_DURABILITY = config.getInt(StatsConst.CHAOS_TOOLS_EXTRA_DURABILITY_NAME, StatsConst.CATEGORY_STATS, 99999, Integer.MIN_VALUE, Integer.MAX_VALUE, StatsConst.CHAOS_TOOLS_EXTRA_DURABILITY_COMMENT);
	    
	    //category - traits
	    config.getCategory(TraitsConst.CATEGORY_TRAITS).setComment(TraitsConst.CATEGORY_TRAITS_COMMENT);
	    TraitsConst.HATER_TRAIT = config.getBoolean(TraitsConst.HATER_TRAIT_NAME, TraitsConst.CATEGORY_TRAITS, true, TraitsConst.HATER_TRAIT_COMMENT);
	    TraitsConst.GREMORIUSLY_TRAIT = config.getBoolean(TraitsConst.GREMORIUSLY_TRAIT_NAME, TraitsConst.CATEGORY_TRAITS, true, TraitsConst.GREMORIUSLY_TRAIT_COMMENT);
	    TraitsConst.HIMEJIMARIUSLY_TRAIT = config.getBoolean(TraitsConst.HIMEJIMARIUSLY_TRAIT_NAME, TraitsConst.CATEGORY_TRAITS, true, TraitsConst.HIMEJIMARIUSLY_TRAIT_COMMENT);
	    TraitsConst.TOUJOURIUSLY_TRAIT = config.getBoolean(TraitsConst.TOUJOURIUSLY_TRAIT_NAME, TraitsConst.CATEGORY_TRAITS, true, TraitsConst.TOUJOURIUSLY_TRAIT_COMMENT);
	    TraitsConst.ARGENTORIUSLY_TRAIT = config.getBoolean(TraitsConst.ARGENTORIUSLY_TRAIT_NAME, TraitsConst.CATEGORY_TRAITS, true, TraitsConst.ARGENTORIUSLY_TRAIT_COMMENT);
	    TraitsConst.QUARTARIUSLY_TRAIT = config.getBoolean(TraitsConst.QUARTARIUSLY_TRAIT_NAME, TraitsConst.CATEGORY_TRAITS, true, TraitsConst.QUARTARIUSLY_TRAIT_COMMENT);
	    
	    //category - modifiers
	    config.getCategory(ModifiersConst.CATEGORY_MODIFIERS).setComment(ModifiersConst.CATEGORY_MODIFIERS_COMMENT);
	    ModifiersConst.SADISTIC_MODIFIER = config.getBoolean(ModifiersConst.SADISTIC_MODIFIER_NAME, ModifiersConst.CATEGORY_MODIFIERS, true, ModifiersConst.SADISTIC_MODIFIER_COMMENT);
	    ModifiersConst.INFINITY_MODIFIER = config.getBoolean(ModifiersConst.INFINITY_MODIFIER_NAME, ModifiersConst.CATEGORY_MODIFIERS, true, ModifiersConst.INFINITY_MODIFIER_COMMENT);
	    
	    if (config.hasChanged())
			save();
	}
	
	public static void save()
	{
		config.save();
	}

	public static void load()
	{
		config.load();
	}

	public static Configuration getConfig() 
	{
		return config;
	}
}