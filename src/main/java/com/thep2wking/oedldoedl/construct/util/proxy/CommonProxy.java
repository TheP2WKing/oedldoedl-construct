package com.thep2wking.oedldoedl.construct.util.proxy;

import com.thep2wking.oedldoedl.construct.integration.tcon.tools.OedldoedlTinkerTools;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy 
{
	public void preInit(FMLPreInitializationEvent event) 
	{
		OedldoedlTinkerTools.init();

	}

	public void Init(FMLInitializationEvent event) 
	{
		OedldoedlTinkerTools.initTraits();
	}

	public void postInit(FMLPostInitializationEvent event) 
	{

	}
}