package com.thep2wking.oedldoedl.construct.integration.tcon.modifiers;

import com.thep2wking.oedldoedl.construct.config.constants.ModifiersConst;
import com.thep2wking.oedldoedl.construct.init.ItemInit;

import morph.avaritia.util.DamageSourceInfinitySword;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.MinecraftForge;
import slimeknights.tconstruct.library.modifiers.ModifierAspect;
import slimeknights.tconstruct.library.modifiers.ModifierTrait;

public class ModifierInfinity extends ModifierTrait 
{
	public ModifierInfinity() 
	{
		super("infinity", 0x73f3ff);
		this.addAspects(new ModifierAspect.SingleAspect(this));
		if (ModifiersConst.INFINITY_MODIFIER)
		{
			this.addItem(new ItemStack(ItemInit.ITEM_INFINITY_MODIFIER, 1, 0), 1, 1);
		}
	    MinecraftForge.EVENT_BUS.register(this);
	}
	  
	@Override
	public String getLocalizedName() 
	{
		return new TextComponentTranslation("modifier.oedldoedlconstruct.infinity.name").getFormattedText();
	}

	@Override
	public String getLocalizedDesc() 
	{
		return new TextComponentTranslation("modifier.oedldoedlconstruct.infinity.tip").getFormattedText();
	}

	@Override
	public void afterHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt, boolean wasCritical, boolean wasHit) 
	{
		if(wasHit && target.isEntityAlive()) 
		{	
			target.attackEntityFrom(new DamageSourceInfinitySword(player).setDamageBypassesArmor(), 4.0F);
			target.getCombatTracker().trackDamage(new DamageSourceInfinitySword(player), target.getHealth(), target.getHealth());
			target.setHealth(0);
			target.onDeath(new EntityDamageSource("infinity", player));
		}
	}
}