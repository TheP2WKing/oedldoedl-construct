package com.thep2wking.oedldoedl.construct.integration.tcon.traits;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.thep2wking.oedldoedl.resources.init.ItemInit;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import slimeknights.tconstruct.library.traits.AbstractTrait;

public class TraitGremoriusly extends AbstractTrait 
{

	private static AbstractTrait gremoriusly = new TraitGremoriusly();

	public TraitGremoriusly() 
	{
		super("gremoriusly", 0x990000);
	}

	@Override
	public String getLocalizedName() 
	{
		return new TextComponentTranslation("trait.oedldoedlconstruct.gremoriusly.name").func_150254_d();
	}

	@Override
	public String getLocalizedDesc() 
	{
		return new TextComponentTranslation("trait.oedldoedlconstruct.gremoriusly.tip").func_150254_d();
	}

	@Override
	public void afterHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt, boolean wasCritical, boolean wasHit) 
	{
		World world = target.func_130014_f_();
		if (!target.func_70089_S() && !world.field_72995_K) 
		{
			Random rand = world instanceof World ? ((World)world).field_73012_v : new Random();
			List<EntityItem> items = new ArrayList<>();
        	if (target instanceof EntityMob) 
        	{  	
        		items.add(drop(target, ItemInit.ITEM_GREMORIUM_NUGGET, MathHelper.func_76136_a(rand, 0, 2), MathHelper.func_76136_a(rand, 0, 2), MathHelper.func_76136_a(rand, 0, 2)));
        	}

			if (!items.isEmpty())
			{
				items.forEach(item -> world.func_72838_d(item));
			}
		}
	}

	public EntityItem drop(Entity entity, Item item, int meta, int amount, int chance) 
	{
		ItemStack stack = new ItemStack(item, chance, meta);
		if (stack.func_190916_E() > amount) 
		{
			stack.func_190920_e(amount);
		}
		
		EntityItem drop = new EntityItem(entity.func_130014_f_(), entity.field_70165_t, entity.field_70163_u, entity.field_70161_v, stack);
		
		return drop;
	}

	public static AbstractTrait getTrait() 
	{
		return gremoriusly;
	}
}