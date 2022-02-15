package net.thep2wking.oedldoedlconstruct.base;

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
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;
import net.thep2wking.oedldoedlcore.base.ModBucketItemBase;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import net.thep2wking.oedldoedlcore.util.TipLines;

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
	 * @param lines 			{@link TipLines}
	 * @param hasAnnotation  	boolean
	 * @param properties		{@link Properties}
	 */
	public ModBucketItemEffectBase(Supplier<? extends Fluid> supplier, Rarity rarity, boolean hasEffect, boolean fireImmunity, Effect effect, boolean isDebuff, 
	TipLines lines, boolean hasAnnotation, Properties properties) 
	{
		super(supplier, rarity, hasEffect, fireImmunity, lines, hasAnnotation, properties);
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
	
	public TextFormatting effectColor()
	{
		if(isDebuff)
		{
			return CoreConfig.effects_negative_formatting.get();
		}
		return CoreConfig.effects_positive_formatting.get();
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) 
    {
		if (Screen.hasShiftDown() && CoreConfig.information_tooltip.get())
		{   
			if(hasAnnotation)
			{
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".annotation").mergeStyle(CoreConfig.information_annotation_formatting.get()));
			}
			
			if(lines == TipLines.DISABLED)
			{
				//no tooltip
			}
			if(lines == TipLines.ONE)
			{
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip").mergeStyle(CoreConfig.information_formatting.get()));
			}
			if(lines == TipLines.TWO)
			{
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip2").mergeStyle(CoreConfig.information_formatting.get()));
			}
			if(lines == TipLines.THREE)
			{
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip2").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip3").mergeStyle(CoreConfig.information_formatting.get()));
			}
			if(lines == TipLines.FOUR)
			{
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip2").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip3").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip4").mergeStyle(CoreConfig.information_formatting.get()));
			}
			if(lines == TipLines.FIVE)
			{
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip2").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip3").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip4").mergeStyle(CoreConfig.information_formatting.get()));
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".tip5").mergeStyle(CoreConfig.information_formatting.get()));
			}
		}
		else if (CoreConfig.information_tooltip.get() && CoreConfig.information_tooltip_key.get() && !(lines == TipLines.DISABLED))
		{
			tooltip.add(new TranslationTextComponent("core.oedldoedl.info.key").mergeStyle(TextFormatting.GRAY));
		}
		
		if (Screen.hasControlDown() && CoreConfig.effects_tooltip.get() && ConstructConfig.bucket_effects_enabled.get() && ConstructConfig.effects_enabled.get())
		{
			tooltip.add(new TranslationTextComponent("core.oedldoedl.given.effects.tip").mergeStyle(CoreConfig.effects_annotation_formatting.get()));
			tooltip.add((new StringTextComponent("- ").mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC).appendSibling(new TranslationTextComponent(effect.getName())
					.mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC)
					.appendSibling(new StringTextComponent(" " + effectColor() + TextFormatting.ITALIC + "("+ ConstructConfig.bucket_base_amplifier.get() + ") (" 
					+ ConstructConfig.bucket_base_duration.get() / 20 + " sec)")).mergeStyle(TextFormatting.ITALIC))));
		}
		else if (CoreConfig.effects_tooltip.get() && CoreConfig.effects_tooltip_key.get() && ConstructConfig.bucket_effects_enabled.get() && ConstructConfig.effects_enabled.get() && !ConstructConfig.fluid_effects_enabled.get())
		{
			tooltip.add(new TranslationTextComponent("core.oedldoedl.effects.key").mergeStyle(TextFormatting.GRAY));
		}
		
		if (Screen.hasControlDown() && CoreConfig.effects_tooltip.get() && ConstructConfig.fluid_effects_enabled.get() && ConstructConfig.effects_enabled.get())
		{
			tooltip.add(new TranslationTextComponent("core.oedldoedl.fluid.effects.tip").mergeStyle(CoreConfig.effects_annotation_formatting.get()));
			tooltip.add((new StringTextComponent("- ").mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC).appendSibling(new TranslationTextComponent(effect.getName())
					.mergeStyle(CoreConfig.effects_formatting.get()).mergeStyle(TextFormatting.ITALIC)
					.appendSibling(new StringTextComponent(" " + effectColor() + TextFormatting.ITALIC + "("+ ConstructConfig.fluid_base_amplifier.get() + ") (" 
					+ ConstructConfig.fluid_base_duration.get() / 20 + " sec)")).mergeStyle(TextFormatting.ITALIC))));
		}
		else if (CoreConfig.effects_tooltip.get() && CoreConfig.effects_tooltip_key.get() && ConstructConfig.fluid_effects_enabled.get() && ConstructConfig.effects_enabled.get() && !ConstructConfig.bucket_effects_enabled.get())
		{
			tooltip.add(new TranslationTextComponent("core.oedldoedl.effects.key").mergeStyle(TextFormatting.GRAY));
		}
		
		if (!Screen.hasControlDown() && CoreConfig.effects_tooltip.get() && CoreConfig.effects_tooltip_key.get() && ConstructConfig.fluid_effects_enabled.get() && ConstructConfig.bucket_effects_enabled.get() && ConstructConfig.effects_enabled.get())
		{
			tooltip.add(new TranslationTextComponent("core.oedldoedl.effects.key").mergeStyle(TextFormatting.GRAY));
		}
    }
}