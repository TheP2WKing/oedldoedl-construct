package com.thep2wking.oedldoedl.construct.integration.tcon.modifier;

import com.thep2wking.oedldoedl.construct.config.constants.FluidsConst;
import com.thep2wking.oedldoedl.construct.config.constants.ModifiersConst;
import com.thep2wking.oedldoedl.construct.init.ItemInit;

import morph.avaritia.util.DamageSourceInfinitySword;
import morph.avaritia.util.TextUtils;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.common.MinecraftForge;
import slimeknights.tconstruct.library.modifiers.ModifierAspect;
import slimeknights.tconstruct.library.modifiers.ModifierTrait;

public class ModifierInfinity extends ModifierTrait 
{
	public ModifierInfinity() 
	{
		super("infinity", 0xff0000);
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
		return new TextComponentTranslation(TextUtils.makeFabulous(I18n.func_135052_a("modifier.oedldoedlconstruct.infinity.name"))).func_150254_d();
	}

	@Override
	public String getLocalizedDesc() 
	{
		return new TextComponentTranslation("modifier.oedldoedlconstruct.infinity.tip").func_150254_d();
	}

	@Override
	public void afterHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt, boolean wasCritical, boolean wasHit) 
	{
		if(wasHit && target.func_70089_S()) 
		{	
			target.func_70097_a(new DamageSourceInfinitySword(player).func_76348_h(), 4.0F);
			target.func_110142_aN().func_94547_a(new DamageSourceInfinitySword(player), target.func_110143_aJ(), target.func_110143_aJ());
			target.func_70606_j(0);
			target.func_70645_a(new EntityDamageSource("infinity", player));
		}
	}
}