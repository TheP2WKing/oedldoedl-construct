package net.thep2wking.oedldoedlconstruct.api;

import java.util.function.Supplier;

import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;
import net.thep2wking.oedldoedlconstruct.integration.TOPInfoProvider;
import net.thep2wking.oedldoedlcore.api.ModFlowingFluidBlockBase;
import net.thep2wking.oedldoedlcore.util.ModTOPTooltips;
import net.thep2wking.oedldoedlcore.util.ModTooltips;

public class ModFlowingFluidBlockEffectBase extends ModFlowingFluidBlockBase implements TOPInfoProvider
{
	public Effect effect;
	public boolean isDebuff;
	
	/**
	 * @author TheP2WKing
	 * @param supplier			{@link Supplier}
	 * @param effect			{@link Effects}
	 * @param isDebuff			boolean
	 * @param lightLevel		int
	 * @param properties		{@link Properties}
	 */
	public ModFlowingFluidBlockEffectBase(Supplier<? extends FlowingFluid> supplier, Effect effect, boolean isDebuff, int lightLevel, Properties properties) 
	{
		super(supplier, lightLevel, properties);
		this.effect = effect;
		this.isDebuff = isDebuff;
	}
	
	public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) 
	{
		if (entityIn instanceof LivingEntity && ConstructConfig.fluid_effects_enabled.get() && ConstructConfig.effects_enabled.get()) 
		{
			((LivingEntity) entityIn).addPotionEffect(new EffectInstance(effect, ConstructConfig.fluid_base_duration.get(), ConstructConfig.fluid_base_amplifier.get() - 1, false, false));
		}
	}
	
	public boolean effectColor()
	{
		if(isDebuff)
		{
			return true;
		}
		return false;
	}
	
	@Override
	public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, PlayerEntity player, World world, BlockState blockState, IProbeHitData data) 
	{
		ModTOPTooltips.addEffectHeader(mode, probeInfo, player, world, blockState, data, ModTooltips.EFFECTS_FLUID);
		ModTOPTooltips.addPotionEffect(mode, probeInfo, player, world, blockState, data, effect.getName(), effectColor(), ConstructConfig.fluid_base_amplifier.get(), ConstructConfig.fluid_base_duration.get());
	}
}