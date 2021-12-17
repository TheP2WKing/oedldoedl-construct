package com.thep2wking.oedldoedl.construct.util.handler;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;

public class ResourceHandler 
{
	public static ResourceLocation getResource(String resource) 
	{
		String modid = Loader.instance().activeModContainer().getModId();
		return getResource(modid, resource);
	}
	
	public static ResourceLocation getResource(String modid, String resource) 
	{
		return new ResourceLocation(modid, resource);
	}
	
	public static ModelResourceLocation getModelResource(String resource) 
	{
		String modid = Loader.instance().activeModContainer().getModId();
		return new ModelResourceLocation(modid + ":" + resource);
	}
	
	public static ModelResourceLocation getModelResource(String resource, String variant)
	{
		String modid = Loader.instance().activeModContainer().getModId();
		return getModelResource(modid, resource, variant);
	}
	
	public static ModelResourceLocation getModelResource(String modid, String resource, String variant) 
	{
		return new ModelResourceLocation(getResource(modid, resource), variant);
	}
}