package com.thep2wking.oedldoedl.construct.fluids;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import slimeknights.tconstruct.library.Util;

public class FluidChaos extends Fluid 
{
	 public static ResourceLocation ICON_LiquidStill = Util.getResource("blocks/fluids/liquid");
	 public static ResourceLocation ICON_LiquidFlowing = Util.getResource("blocks/fluids/liquid_flow");
	
	 public final int color;

	 public FluidChaos(String fluidName, int color) 
	 {
		 this(fluidName, color, ICON_LiquidStill, ICON_LiquidFlowing);
		 setViscosity(100);
		 setTemperature(9999);
		 setRarity(EnumRarity.EPIC);
	 }

	 public FluidChaos(String fluidName, int color, ResourceLocation still, ResourceLocation flowing) 
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
		 return s == null ? "" : I18n.func_74838_a(s + ".name");
	 }
}