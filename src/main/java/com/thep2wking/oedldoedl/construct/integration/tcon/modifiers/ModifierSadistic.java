package com.thep2wking.oedldoedl.construct.integration.tcon.modifiers;

import com.thep2wking.oedldoedl.construct.config.constants.ModifiersConst;
import com.thep2wking.oedldoedl.construct.init.ItemInit;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.MinecraftForge;
import slimeknights.tconstruct.library.modifiers.ModifierAspect;
import slimeknights.tconstruct.library.modifiers.ModifierTrait;

public class ModifierSadistic extends ModifierTrait 
{
	public ModifierSadistic() 
	{
		super("sadistic", 0x711999);
		this.addAspects(new ModifierAspect.SingleAspect(this));
		if (ModifiersConst.SADISTIC_MODIFIER)
		{
			this.addItem(new ItemStack(ItemInit.ITEM_SADISTIC_MODIFIER, 1, 0), 1, 1);
		}
	    MinecraftForge.EVENT_BUS.register(this);
	}
	  
	@Override
	public String getLocalizedName() 
	{
		 return new TextComponentTranslation("modifier.oedldoedlconstruct.sadistic.name").getFormattedText();
	}

	@Override
	public String getLocalizedDesc() 
	{
		return new TextComponentTranslation("modifier.oedldoedlconstruct.sadistic.tip").getFormattedText();
	}

	@Override
	public void afterHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt, boolean wasCritical, boolean wasHit) 
	{
		if(wasHit && target.isEntityAlive()) 
		{
			target.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 100, 100, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.GLOWING, 100, 0, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 60, 1, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 60, 3, false, false));
		}
	}
}