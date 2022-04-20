package net.thep2wking.oedldoedlconstruct.util;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;

public class ModFluidBuilder 
{
	//fluid textures
    public static final ResourceLocation LAVA_STILL = new ResourceLocation(OedldoedlConstruct.MODID, "block/lava_still");
    public static final ResourceLocation LAVA_FLOW = new ResourceLocation(OedldoedlConstruct.MODID, "block/lava_flow");
    
    public static final ResourceLocation OEDLDOEDL_STILL = new ResourceLocation(OedldoedlConstruct.MODID, "block/oedldoedl_still");
    public static final ResourceLocation OEDLDOEDL_FLOW = new ResourceLocation(OedldoedlConstruct.MODID, "block/oedldoedl_flow");
    
    //fluid builder  
    public static FluidAttributes.Builder superheatedLava() 
    {
        return FluidAttributes.builder(LAVA_STILL, LAVA_FLOW)
                .density(100000).viscosity(100000).luminosity(15).temperature(100000)
                .sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA);
    }
    
    public static FluidAttributes.Builder oedldoedl() 
    {
        return FluidAttributes.builder(OEDLDOEDL_STILL, OEDLDOEDL_FLOW)
                .density(2000).viscosity(10000).luminosity(15).temperature(1000)
                .sound(SoundEvents.ITEM_BUCKET_FILL_LAVA, SoundEvents.ITEM_BUCKET_EMPTY_LAVA);
    }
}