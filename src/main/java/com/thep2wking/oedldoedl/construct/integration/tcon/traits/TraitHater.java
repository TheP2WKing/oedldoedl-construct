package com.thep2wking.oedldoedl.construct.integration.tcon.traits;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.thep2wking.oedldoedl.resources.init.ItemInit;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import slimeknights.tconstruct.library.traits.AbstractTrait;

public class TraitHater extends AbstractTrait 
{

	private static AbstractTrait hater = new TraitHater();

	public TraitHater() 
	{
		super("hater", 0x380c70);
	}

	@Override
	public String getLocalizedName() 
	{
		return new TextComponentTranslation("trait.oedldoedlconstruct.hater.name").getFormattedText();
	}

	@Override
	public String getLocalizedDesc() 
	{
		return new TextComponentTranslation("trait.oedldoedlconstruct.hater.tip").getFormattedText();
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
			target.addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 60, 4, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 60, 3, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.POISON, 60, 4, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.WITHER, 60, 2, false, false));
			target.addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 60, 2, false, false));
		}
	}

	public static AbstractTrait getTrait() 
	{
		return hater;
	}
}