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
		return new TextComponentTranslation("trait.oedldoedlconstruct.hater.name").func_150254_d();
	}

	@Override
	public String getLocalizedDesc() 
	{
		return new TextComponentTranslation("trait.oedldoedlconstruct.hater.tip").func_150254_d();
	}

	@Override
	public void afterHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt, boolean wasCritical, boolean wasHit) 
	{
		if(wasHit && target.func_70089_S()) 
		{
			target.func_70690_d(new PotionEffect(MobEffects.field_188424_y, 100, 80));
			target.func_70690_d(new PotionEffect(MobEffects.field_76440_q, 1, 80));
			target.func_70690_d(new PotionEffect(MobEffects.field_76438_s, 3, 80));
			target.func_70690_d(new PotionEffect(MobEffects.field_76419_f, 3, 80));
			target.func_70690_d(new PotionEffect(MobEffects.field_76431_k, 3, 80));
			target.func_70690_d(new PotionEffect(MobEffects.field_76436_u, 5, 80));
			target.func_70690_d(new PotionEffect(MobEffects.field_76437_t, 3, 80));
			target.func_70690_d(new PotionEffect(MobEffects.field_188423_x, 0, 200));
		}
	}

	public static AbstractTrait getTrait() 
	{
		return hater;
	}
}