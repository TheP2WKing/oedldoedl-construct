package net.thep2wking.oedldoedlconstruct.init;

import net.minecraftforge.fluids.Fluid;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.content.fluid.FluidOedldoedl;
import net.thep2wking.oedldoedlcore.api.fluid.ModFluidBase;
import net.thep2wking.oedldoedlcore.util.ModFluidUtil;
import net.thep2wking.oedldoedlcore.util.ModRarities;

public class ModFluids {
	public static final Fluid MOLTEN_BASE = new ModFluidBase(OedldoedlConstruct.MODID, "base", ModFluidUtil.MOLTEN_STILL_BASE, ModFluidUtil.MOLTEN_FLOW_BASE, 0x9d9d9d, 800, 2000, 10000, 10, false, ModRarities.WHITE);
	public static final Fluid MOLTEN_OEDLDOEDL = new FluidOedldoedl(OedldoedlConstruct.MODID, "oedldoedl", FluidOedldoedl.OEDLDOEDL_STILL, FluidOedldoedl.OEDLDOEDL_FLOW, 1200, 2000, 10000, 10, false, ModRarities.LIGHT_PURPLE);
	public static final Fluid MOLTEN_BEDROCKIUM = new ModFluidBase(OedldoedlConstruct.MODID, "bedrockium", ModFluidUtil.MOLTEN_STILL_BASE, ModFluidUtil.MOLTEN_FLOW_BASE, 0x575757, 1000, 2000, 10000, 10, false, ModRarities.LIGHT_PURPLE);
	public static final Fluid MOLTEN_CLOUDIUM = new ModFluidBase(OedldoedlConstruct.MODID, "cloudium", ModFluidUtil.MOLTEN_STILL_BASE, ModFluidUtil.MOLTEN_FLOW_BASE, 0xf2f2f2, 1000, 2000, 10000, 10, false, ModRarities.LIGHT_PURPLE);
	public static final Fluid MOLTEN_ELEVATIUM = new ModFluidBase(OedldoedlConstruct.MODID, "elevatium", ModFluidUtil.MOLTEN_STILL_BASE, ModFluidUtil.MOLTEN_FLOW_BASE, 0xa673a6, 1000, 2000, 10000, 10, false, ModRarities.LIGHT_PURPLE);
	public static final Fluid MOLTEN_SADISTIUM = new ModFluidBase(OedldoedlConstruct.MODID, "sadistium", ModFluidUtil.MOLTEN_STILL_BASE, ModFluidUtil.MOLTEN_FLOW_BASE, 0x5b4538, 1000, 2000, 10000, 10, false, ModRarities.LIGHT_PURPLE);
	public static final Fluid MOLTEN_DRUNKIUM = new ModFluidBase(OedldoedlConstruct.MODID, "drunkium", ModFluidUtil.MOLTEN_STILL_BASE, ModFluidUtil.MOLTEN_FLOW_BASE, 0x5283ff, 1000, 2000, 10000, 10, false, ModRarities.LIGHT_PURPLE);
	public static final Fluid MOLTEN_MONEY = new ModFluidBase(OedldoedlConstruct.MODID, "money", ModFluidUtil.MOLTEN_STILL_BASE, ModFluidUtil.MOLTEN_FLOW_BASE, 0x599453, 1000, 2000, 10000, 10, false, ModRarities.GREEN);
	public static final Fluid MOLTEN_CHAOS = new ModFluidBase(OedldoedlConstruct.MODID, "chaos", ModFluidUtil.MOLTEN_STILL_BASE, ModFluidUtil.MOLTEN_FLOW_BASE, 0x0e0025, 1500, 2000, 10000, 10, false, ModRarities.BLACK);

	public static final Fluid MOLTEN_GREMORIUM = new ModFluidBase(OedldoedlConstruct.MODID, "gremorium", ModFluidUtil.MOLTEN_STILL_BASE, ModFluidUtil.MOLTEN_FLOW_BASE, 0x990000, 1200, 2000, 10000, 10, false, ModRarities.DARK_RED);
	public static final Fluid MOLTEN_HIMEJIMARIUM = new ModFluidBase(OedldoedlConstruct.MODID, "himejimarium", ModFluidUtil.MOLTEN_STILL_BASE, ModFluidUtil.MOLTEN_FLOW_BASE, 0x232033, 1200, 2000, 10000, 10, false, ModRarities.DARK_BLUE);
	public static final Fluid MOLTEN_TOUJOURIUM = new ModFluidBase(OedldoedlConstruct.MODID, "toujourium", ModFluidUtil.MOLTEN_STILL_BASE, ModFluidUtil.MOLTEN_FLOW_BASE, 0xc0c0c0, 1200, 2000, 10000, 10, false, ModRarities.GRAY);
	public static final Fluid MOLTEN_ARGENTORIUM = new ModFluidBase(OedldoedlConstruct.MODID, "argentorium", ModFluidUtil.MOLTEN_STILL_BASE, ModFluidUtil.MOLTEN_FLOW_BASE, 0xfbd985, 1200, 2000, 10000, 10, false, ModRarities.YELLOW);
	public static final Fluid MOLTEN_QUARTARIUM = new ModFluidBase(OedldoedlConstruct.MODID, "quartarium", ModFluidUtil.MOLTEN_STILL_BASE, ModFluidUtil.MOLTEN_FLOW_BASE, 0x0e5191, 1200, 2000, 10000, 10, false, ModRarities.BLUE);
	public static final Fluid MOLTEN_NAGATORIUM = new ModFluidBase(OedldoedlConstruct.MODID, "nagatorium", ModFluidUtil.MOLTEN_STILL_BASE, ModFluidUtil.MOLTEN_FLOW_BASE, 0x650fc1, 1200, 2000, 10000, 10, false, ModRarities.DARK_PURPLE);
	public static final Fluid MOLTEN_SAKURAJIMARIUM = new ModFluidBase(OedldoedlConstruct.MODID, "sakurajimarium", ModFluidUtil.MOLTEN_STILL_BASE, ModFluidUtil.MOLTEN_FLOW_BASE, 0x2a2929, 1200, 2000, 10000, 10, false, ModRarities.DARK_GRAY);
	public static final Fluid MOLTEN_KITAGAWARIUM = new ModFluidBase(OedldoedlConstruct.MODID, "kitagawarium", ModFluidUtil.MOLTEN_STILL_BASE, ModFluidUtil.MOLTEN_FLOW_BASE, 0x97173e, 1200, 2000, 10000, 10, false, ModRarities.LIGHT_PURPLE);
}