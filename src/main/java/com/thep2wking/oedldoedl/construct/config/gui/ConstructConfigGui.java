package com.thep2wking.oedldoedl.construct.config.gui;

import java.util.ArrayList;
import java.util.List;

import com.thep2wking.oedldoedl.construct.OedldoedlConstruct;
import com.thep2wking.oedldoedl.construct.ReferenceConstruct;
import com.thep2wking.oedldoedl.construct.config.constants.FluidsConst;
import com.thep2wking.oedldoedl.construct.config.constants.ModifiersConst;
import com.thep2wking.oedldoedl.construct.config.constants.StatsConst;
import com.thep2wking.oedldoedl.construct.config.constants.ToolsConst;
import com.thep2wking.oedldoedl.construct.config.constants.TraitsConst;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.DummyConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

public class ConstructConfigGui extends GuiConfig 
{
    public ConstructConfigGui(GuiScreen parent) 
    {
        super(parent, getConfigElements(), ReferenceConstruct.MODID, true, true, I18n.format("config.oedldoedl.construct.title.name"));
    }

    private static List<IConfigElement> getConfigElements() 
    {
        List<IConfigElement> configElements = new ArrayList<IConfigElement>();

        ConstructConfig config = OedldoedlConstruct.config;
        if (config != null) 
        {    
            ConfigCategory categoryFluids = config.getConfig().getCategory(FluidsConst.CATEGORY_FLUIDS);
            configElements.add(new ConfigElement(categoryFluids));
            
            ConfigCategory categoryTools = config.getConfig().getCategory(ToolsConst.CATEGORY_TOOLS);
            configElements.add(new ConfigElement(categoryTools));
            
            ConfigCategory categoryStats = config.getConfig().getCategory(StatsConst.CATEGORY_STATS);
            configElements.add(new ConfigElement(categoryStats));  
            
            ConfigCategory categoryTraits = config.getConfig().getCategory(TraitsConst.CATEGORY_TRAITS);
            configElements.add(new ConfigElement(categoryTraits));  
        
            ConfigCategory categoryModifier = config.getConfig().getCategory(ModifiersConst.CATEGORY_MODIFIERS);
            configElements.add(new ConfigElement(categoryModifier));
        }
        return configElements;
    }
}