package net.thep2wking.oedldoedlconstruct.util;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.init.ModBlocks;
import net.thep2wking.oedldoedlcore.util.ModFluidUtil;

public class ModFluidRendering {
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
    public static void registerFluidModels(ModelRegistryEvent event) {
		ModFluidUtil.addRenderForFluid(OedldoedlConstruct.MODID, "base", ModBlocks.MOLTEN_BASE);
		ModFluidUtil.addRenderForFluid(OedldoedlConstruct.MODID, "oedldoedl", ModBlocks.MOLTEN_OEDLDOEDL);
		ModFluidUtil.addRenderForFluid(OedldoedlConstruct.MODID, "bedrockium", ModBlocks.MOLTEN_BEDROCKIUM);
		ModFluidUtil.addRenderForFluid(OedldoedlConstruct.MODID, "cloudium", ModBlocks.MOLTEN_CLOUDIUM);
		ModFluidUtil.addRenderForFluid(OedldoedlConstruct.MODID, "elevatium", ModBlocks.MOLTEN_ELEVATIUM);
		ModFluidUtil.addRenderForFluid(OedldoedlConstruct.MODID, "sadistium", ModBlocks.MOLTEN_SADISTIUM);
		ModFluidUtil.addRenderForFluid(OedldoedlConstruct.MODID, "drunkium", ModBlocks.MOLTEN_DRUNKIUM);
		ModFluidUtil.addRenderForFluid(OedldoedlConstruct.MODID, "money", ModBlocks.MOLTEN_MONEY);
		ModFluidUtil.addRenderForFluid(OedldoedlConstruct.MODID, "chaos", ModBlocks.MOLTEN_CHAOS);

		ModFluidUtil.addRenderForFluid(OedldoedlConstruct.MODID, "gremorium", ModBlocks.MOLTEN_GREMORIUM);
		ModFluidUtil.addRenderForFluid(OedldoedlConstruct.MODID, "himejimarium", ModBlocks.MOLTEN_HIMEJIMARIUM);
		ModFluidUtil.addRenderForFluid(OedldoedlConstruct.MODID, "toujourium", ModBlocks.MOLTEN_TOUJOURIUM);
		ModFluidUtil.addRenderForFluid(OedldoedlConstruct.MODID, "argentorium", ModBlocks.MOLTEN_ARGENTORIUM);
		ModFluidUtil.addRenderForFluid(OedldoedlConstruct.MODID, "quartarium", ModBlocks.MOLTEN_QUARTARIUM);
		ModFluidUtil.addRenderForFluid(OedldoedlConstruct.MODID, "nagatorium", ModBlocks.MOLTEN_NAGATORIUM);
		ModFluidUtil.addRenderForFluid(OedldoedlConstruct.MODID, "sakurajimarium", ModBlocks.MOLTEN_SAKURAJIMARIUM);
		ModFluidUtil.addRenderForFluid(OedldoedlConstruct.MODID, "kitagawarium", ModBlocks.MOLTEN_KITAGAWARIUM);
    }
}