package net.thep2wking.oedldoedlconstruct.api;

import java.util.List;
import java.util.function.Supplier;

import javax.annotation.Nullable;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;
import net.thep2wking.oedldoedlcore.api.ModBucketItemBase;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import net.thep2wking.oedldoedlcore.util.ModTooltips;
import net.thep2wking.oedldoedlresources.config.ResourcesConfig;

public class ModBucketItemEffectBase extends ModBucketItemBase
{
	public Effect effect;
	public boolean isDebuff;
	
	/**
	 * @author TheP2WKing
	 * @param supplier			{@link Supplier}
	 * @param rarity			{@link Rarity}
	 * @param hasEffect			boolean
	 * @param fireImmunity		boolean
	 * @param effect			{@link Effects}
	 * @param isDebuff			boolean
	 * @param tooltipLines		int
	 * @param annotationLines	int
	 * @param properties		{@link Properties}
	 */
	public ModBucketItemEffectBase(Supplier<? extends Fluid> supplier, Rarity rarity, boolean hasEffect, boolean fireImmunity, Effect effect, boolean isDebuff, 
	int tooltipLines, int annotationLines, Properties properties)
	{
		super(supplier, rarity, hasEffect, fireImmunity, tooltipLines, annotationLines, properties);
		this.effect = effect;
		this.isDebuff = isDebuff;
	}
	
	@Override
	public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundNBT nbt) 
	{
		if (this.getClass() == ModBucketItemEffectBase.class)
			return new FluidBucketWrapper(stack);
		else
			return super.initCapabilities(stack, nbt);
	}
	
	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int ambient, boolean particles) 
	{
		if (ConstructConfig.bucket_effects_enabled.get() && ConstructConfig.effects_enabled.get())
		{
			((LivingEntity) entityIn).addPotionEffect(new EffectInstance(effect, ConstructConfig.bucket_base_duration.get(), ConstructConfig.bucket_base_amplifier.get() - 1, false, false));
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
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) 
    {
		if(ModTooltips.showAnnotationTip())
		{
		    for (int i = 1; i <= annotationLines; ++i)
		    {
				ModTooltips.addAnnotation(tooltip, this.getTranslationKey(), i);
		    }
		}
		if (ModTooltips.showInfoTip())
		{   
		    for (int i = 1; i <= tooltipLines; ++i) 
		    {
				ModTooltips.addInformation(tooltip, this.getTranslationKey(), i);
		    }
		}
		else if (ModTooltips.showInfoTipKey() && !(tooltipLines == 0))
		{
			ModTooltips.addKey(tooltip, ModTooltips.KEY_INFO);
		}
		
		if (ModTooltips.showEffectTip() && ConstructConfig.bucket_effects_enabled.get() && ConstructConfig.effects_enabled.get())
		{
			ModTooltips.addEffectHeader(tooltip, ModTooltips.EFFECTS_GIVEN);
			ModTooltips.addPotionEffect(tooltip, effect.getName(), effectColor(), ConstructConfig.bucket_base_amplifier.get(), ConstructConfig.bucket_base_duration.get());
		}
		else if (ModTooltips.showEffectTipKey() && ConstructConfig.bucket_effects_enabled.get() && ConstructConfig.effects_enabled.get() && !ConstructConfig.fluid_effects_enabled.get())
		{
			ModTooltips.addKey(tooltip, ModTooltips.KEY_EFFECTS);
		}
		
		if (ModTooltips.showEffectTip() && ConstructConfig.fluid_effects_enabled.get() && ResourcesConfig.effects_enabled.get())
		{
			ModTooltips.addEffectHeader(tooltip, ModTooltips.EFFECTS_FLUID);
			ModTooltips.addPotionEffect(tooltip, effect.getName(), effectColor(), ConstructConfig.fluid_base_amplifier.get(), ConstructConfig.fluid_base_duration.get());
		}
		else if (ModTooltips.showEffectTipKey() && ConstructConfig.fluid_effects_enabled.get() && ConstructConfig.effects_enabled.get() && !ConstructConfig.bucket_effects_enabled.get())
		{
			ModTooltips.addKey(tooltip, ModTooltips.KEY_EFFECTS);
		}
		
		if (!Screen.hasControlDown() && CoreConfig.effects_tooltip.get() && CoreConfig.effects_tooltip_key.get() && ConstructConfig.fluid_effects_enabled.get() && ConstructConfig.bucket_effects_enabled.get() && ConstructConfig.effects_enabled.get())
		{
			ModTooltips.addKey(tooltip, ModTooltips.KEY_EFFECTS);
		}
    }
}