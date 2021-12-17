package com.thep2wking.oedldoedl.construct.fluids;

import com.thep2wking.oedldoedl.core.init.RarityInit;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.ResourceLocation;
import slimeknights.tconstruct.library.fluid.FluidColored;

public class FluidOedldoedl extends FluidColored 
{
	public static ResourceLocation OEDLDOEDL_STILL = new ResourceLocation("oedldoedlconstruct:blocks/oedldoedl_still");
	public static ResourceLocation OEDLDOEDL_FLOW = new ResourceLocation("oedldoedlconstruct:blocks/oedldoedl_flow");

	public FluidOedldoedl(String fluidName, int color) 
	{
		this(fluidName, color, OEDLDOEDL_STILL, OEDLDOEDL_FLOW);
	}

	public FluidOedldoedl(String fluidName, int color, ResourceLocation still, ResourceLocation flow) 
	{
		super(fluidName, color, still, flow);
	    this.setDensity(10000);
	    this.setViscosity(10000);
	    this.setTemperature(20000);
	    this.setLuminosity(10);
	    this.setRarity(RarityInit.RED);
	}
}