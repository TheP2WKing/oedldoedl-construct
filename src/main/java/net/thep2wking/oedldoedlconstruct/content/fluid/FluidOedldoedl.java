package net.thep2wking.oedldoedlconstruct.content.fluid;

import net.minecraft.item.EnumRarity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;

public class FluidOedldoedl extends Fluid {
	public final String modid;
	public final int temperature;
	public final int density;
	public final int viscosity;
	public final int luminosity;
	public final boolean isGaseous;
	public final EnumRarity rarity;

	public static final ResourceLocation OEDLDOEDL_STILL = new ResourceLocation(OedldoedlConstruct.MODID,
			"blocks/oedldoedl_still");
	public static final ResourceLocation OEDLDOEDL_FLOW = new ResourceLocation(OedldoedlConstruct.MODID,
			"blocks/oedldoedl_flow");

	public FluidOedldoedl(String modid, String name, ResourceLocation still, ResourceLocation flow, int temperature,
			int density, int viscosity, int luminosity, boolean isGaseous, EnumRarity rarity) {
		super(name, still, flow);
		this.modid = modid;
		this.temperature = temperature;
		this.density = density;
		this.viscosity = viscosity;
		this.luminosity = luminosity;
		this.isGaseous = isGaseous;
		this.rarity = rarity;
		setUnlocalizedName(this.modid + "." + name);
		setColor(this.color);
		setTemperature(this.temperature);
		setDensity(this.density);
		setViscosity(this.viscosity);
		setLuminosity(this.luminosity);
	}

	@Override
	public boolean isGaseous(FluidStack stack) {
		return isGaseous;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity() {
		return rarity;
	}
}