package net.thep2wking.oedldoedlconstruct.integration;

import javax.annotation.Nullable;

import com.google.common.base.Function;

import mcjty.theoneprobe.api.CompoundText;
import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.IProbeInfoProvider;
import mcjty.theoneprobe.api.ITheOneProbe;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.InterModComms;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import net.thep2wking.oedldoedlcore.util.ModTOPTooltips;

public class TOPCompat implements Function<ITheOneProbe, Void> 
{
    public static ITheOneProbe probe;

    public static void register()
    {
        InterModComms.sendTo("theoneprobe", "GetTheOneProbe", TOPCompat::new);
    }

    @Nullable
    @Override
    public Void apply(ITheOneProbe theOneProbe)
    {
        probe = theOneProbe;
        probe.registerProvider(new IProbeInfoProvider() 
        {
            @Override
            public String getID() 
            {
                return OedldoedlConstruct.MODID;
            }

            @Override
            public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, PlayerEntity player, World world, BlockState blockState, IProbeHitData data) 
            {
                if (blockState.getBlock() instanceof TOPInfoProvider) 
                {
                    if (player.isSneaking() && ConstructConfig.top_tooltips.get() && ConstructConfig.fluid_effects_enabled.get() && ConstructConfig.effects_enabled.get()) 
                    {
	                    TOPInfoProvider provider = (TOPInfoProvider) blockState.getBlock();
	                    provider.addProbeInfo(mode, probeInfo, player, world, blockState, data);
                    }
                    else if (ConstructConfig.top_tooltips.get() && CoreConfig.effects_tooltip_key.get() && ConstructConfig.fluid_effects_enabled.get() && ConstructConfig.effects_enabled.get())
                    {
                        probeInfo.text(CompoundText.create().label(TextFormatting.GRAY + ModTOPTooltips.TOP_EFFECTS));
                    }
                }
            }
        });
		return null;
    }
}
         