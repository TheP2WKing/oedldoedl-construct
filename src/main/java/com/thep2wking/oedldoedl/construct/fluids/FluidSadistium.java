package com.thep2wking.oedldoedl.construct.fluids;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

public class FluidSadistium extends Fluid 
{
	 public static ResourceLocation SADISTIUM_STILL = new ResourceLocation("oedldoedlconstruct:blocks/sadistium_still");
	 public static ResourceLocation SADISTIUM_FLOW = new ResourceLocation("oedldoedlconstruct:blocks/sadistium_flow");
	
	 public final int color; 

	 public FluidSadistium(String fluidName, int color) 
	 {
		 this(fluidName, color, SADISTIUM_STILL, SADISTIUM_FLOW);
		 setViscosity(400);
		 setTemperature(400);
		 setRarity(EnumRarity.EPIC);
	 }

	 public FluidSadistium(String fluidName, int color, ResourceLocation still, ResourceLocation flowing) 
	 {
		 super(fluidName, still, flowing);
		 if(((color >> 24) & 0xFF) == 0) 
		 {
			 color |= 0xFF << 24;
		 }
		 this.color = color;
	 }

	 @Override
	 public int getColor() 
	 {
		 return color;
	 }

	 @Override
	 public String getLocalizedName(FluidStack stack)
	 {
		 String s = this.getUnlocalizedName();
		 return s == null ? "" : I18n.translateToLocal(s + ".name");
	 }
}