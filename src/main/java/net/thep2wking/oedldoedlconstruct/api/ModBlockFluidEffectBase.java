package net.thep2wking.oedldoedlconstruct.api;

import mcjty.theoneprobe.api.IProbeHitData;
import mcjty.theoneprobe.api.IProbeInfo;
import mcjty.theoneprobe.api.ProbeMode;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.Fluid;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;
import net.thep2wking.oedldoedlcore.api.fluid.ModBlockFluidBase;
import net.thep2wking.oedldoedlcore.integration.top.ITOPInfoProvider;
import net.thep2wking.oedldoedlcore.util.ModTooltips;
import net.thep2wking.oedldoedlcore.util.ModTopTooltips;

/**
 * @author TheP2WKing
 */
public class ModBlockFluidEffectBase extends ModBlockFluidBase implements ITOPInfoProvider {
	public final Potion effect;
	public final boolean isDebuff;

	/**
	 * @author TheP2WKing
	 * @param modid    String
	 * @param name     String
	 * @param material {@link Material}
	 * @param mapColor {@link MapColor}
	 * @param effect   {@link Potion}
	 * @param isDebuff boolean
	 */
	public ModBlockFluidEffectBase(String modid, String name, Fluid fluid, Material material, MapColor mapColor,
			Potion effect, boolean isDebuff) {
		super(modid, name, fluid, material, mapColor);
		this.effect = effect;
		this.isDebuff = isDebuff;
	}

	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		super.onEntityCollidedWithBlock(worldIn, pos, state, entityIn);
		if (entityIn instanceof EntityLivingBase && ConstructConfig.PROPERTIES.EFFECTS.FLUIDS.FLUID_EFFECTS
				&& ConstructConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED) {
			((EntityLivingBase) entityIn).addPotionEffect(
					new PotionEffect(effect, ConstructConfig.PROPERTIES.EFFECTS.FLUIDS.FLUID_BASE_DURATION,
							ConstructConfig.PROPERTIES.EFFECTS.FLUIDS.FLUID_BASE_AMPLIFIER - 1, false, false));
		}
	}

	@Override
	public void addProbeInfo(ProbeMode mode, IProbeInfo probeInfo, EntityPlayer player, World world,
			IBlockState blockState, IProbeHitData data) {
		if (player.isSneaking() && ConstructConfig.PROPERTIES.EFFECTS.FLUIDS.FLUID_EFFECTS
				&& ConstructConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED) {
			ModTopTooltips.addEffectHeader(mode, probeInfo, player, world, blockState, data,
					ModTooltips.EFFECT_FLUID);
			ModTopTooltips.addPotionEffect(mode, probeInfo, player, world, blockState, data, effect.getName(),
					isDebuff, ConstructConfig.PROPERTIES.EFFECTS.FLUIDS.FLUID_BASE_AMPLIFIER,
					ConstructConfig.PROPERTIES.EFFECTS.FLUIDS.FLUID_BASE_DURATION);
		} else if (ConstructConfig.PROPERTIES.EFFECTS.FLUIDS.FLUID_EFFECTS
				&& ConstructConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED) {
			ModTopTooltips.addKey(mode, probeInfo, player, world, blockState, data, ModTopTooltips.TOP_EFFECTS);
		}
	}
}