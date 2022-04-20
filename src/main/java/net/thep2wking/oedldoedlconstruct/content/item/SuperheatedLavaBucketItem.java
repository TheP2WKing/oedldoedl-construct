package net.thep2wking.oedldoedlconstruct.content.item;

import java.util.List;
import java.util.function.Supplier;

import javax.annotation.Nullable;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;
import net.thep2wking.oedldoedlcore.api.ModBucketItemBase;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import net.thep2wking.oedldoedlcore.util.ModTooltips;

public class SuperheatedLavaBucketItem extends ModBucketItemBase
{
	public SuperheatedLavaBucketItem(Supplier<? extends Fluid> supplier, Rarity rarity, boolean hasEffect, boolean fireImmunity, int tooltipLines, int annotationLines, Properties properties) 
	{
		super(supplier, rarity, hasEffect, fireImmunity, tooltipLines, annotationLines, properties);
	}

	@Override
	public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundNBT nbt) 
	{
		if (this.getClass() == SuperheatedLavaBucketItem.class)
			return new FluidBucketWrapper(stack);
		else
			return super.initCapabilities(stack, nbt);
	}
	
	@Override
	public int getBurnTime(ItemStack itemStack, IRecipeType<?> recipeType) 
	{
		return ConstructConfig.lava_fuel_duration.get();
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean hasEffect(ItemStack stack) 
	{
		if(CoreConfig.enchantment_effects.get() && !ConstructConfig.lava_inactive.get())
		{
			return hasEffect || stack.isEnchanted();
		}
		return stack.isEnchanted();
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) 
    {
		if(ModTooltips.showAnnotationTip())
		{
			if(ConstructConfig.lava_inactive.get())
			{
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".annotation1").mergeStyle(CoreConfig.information_annotation_formatting.get()));
			}
			else
			{
				tooltip.add(new TranslationTextComponent(this.getTranslationKey()+".annotation2").mergeStyle(CoreConfig.information_annotation_formatting.get()));
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
    }
}