package com.thep2wking.oedldoedl.construct.fluids;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.ResourceLocation;
import slimeknights.tconstruct.library.fluid.FluidColored;

public class FluidBedrockium extends FluidColored 
{
	public static ResourceLocation BEDROCKIUM_STILL = new ResourceLocation("oedldoedlconstruct:blocks/bedrockium_still");
	public static ResourceLocation BEDROCKIUM_FLOW = new ResourceLocation("oedldoedlconstruct:blocks/bedrockium_flow");

	public FluidBedrockium(String fluidName, int color) 
	{
		this(fluidName, color, BEDROCKIUM_STILL, BEDROCKIUM_FLOW);
	}

	public FluidBedrockium(String fluidName, int color, ResourceLocation still, ResourceLocation flow) 
	{
		super(fluidName, color, still, flow);
	    this.setDensity(4000);
	    this.setViscosity(10000);
	    this.setTemperature(5000);
	    this.setLuminosity(10);
	    this.setRarity(EnumRarity.EPIC);
	}
}