package com.thep2wking.oedldoedl.construct.integration.tcon.tools;

import java.util.Map;

import com.google.common.collect.Maps;

import net.minecraft.util.text.translation.I18n;
import slimeknights.tconstruct.library.Util;

public class ExtraHarvestLevels
{
	public static final int L5 = 5;
	public static final int L6 = 6;
	public static final int L7 = 7;
	public static final int L8 = 8;
	public static final int L9 = 9;
	public static final int L10 = 10;

	private ExtraHarvestLevels() 
	{
	  
	}

	public static final Map<Integer, String> harvestLevelNames = Maps.newHashMap();

	public static String getHarvestLevelName(int num) 
	{
		return harvestLevelNames.containsKey(num) ? harvestLevelNames.get(num) : String.valueOf(num);
	}

	public static void init() 
	{
	    harvestLevelNames.put(L5, Util.translate("ui.mininglevel.l5"));
	    harvestLevelNames.put(L6, Util.translate("ui.mininglevel.l6"));
	    harvestLevelNames.put(L7, Util.translate("ui.mininglevel.l7"));
	    harvestLevelNames.put(L8, Util.translate("ui.mininglevel.l8"));
	    harvestLevelNames.put(L9, Util.translate("ui.mininglevel.l9"));
	    harvestLevelNames.put(L10, Util.translate("ui.mininglevel.l10"));

	    String base = "gui.mining";
	    int i = 0;
	    while(I18n.canTranslate(String.format("%s%d", base, i))) 
	    {
	    	harvestLevelNames.put(i, I18n.translateToLocal(String.format("%s%d", base, i)));
	    	i++;
	    }

	    base = "ui.mininglevel.";
	    i = 0;
	    while(I18n.canTranslate(String.format("%s%d", base, i)))
	    {
	    	harvestLevelNames.put(i, I18n.translateToLocal(String.format("%s%d", base, i)));
	    	i++;
	    }
	}
}