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

public class TraitToujouriusly extends AbstractTrait 
{

	private static AbstractTrait toujouriusly = new TraitToujouriusly();

	public TraitToujouriusly() 
	{
		super("toujouriusly", 0xc0c0c0);
	}

	@Override
	public String getLocalizedName() 
	{
		return new TextComponentTranslation("trait.oedldoedlconstruct.toujouriusly.name").getFormattedText();
	}

	@Override
	public String getLocalizedDesc() 
	{
		return new TextComponentTranslation("trait.oedldoedlconstruct.toujouriusly.tip").getFormattedText();
	}

	@Override
	public void afterHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt, boolean wasCritical, boolean wasHit) 
	{
		World world = target.getEntityWorld();
		if (!target.isEntityAlive() && !world.isRemote) 
		{
			Random rand = world instanceof World ? ((World)world).rand : new Random();
			List<EntityItem> items = new ArrayList<>();
        	if (target instanceof EntityMob) 
        	{  	
        		items.add(drop(target, ItemInit.ITEM_TOUJOURIUM_NUGGET, MathHelper.getInt(rand, 0, 2), MathHelper.getInt(rand, 0, 2), MathHelper.getInt(rand, 0, 2)));
        	}

			if (!items.isEmpty())
			{
				items.forEach(item -> world.spawnEntity(item));
			}
		}
	}

	public EntityItem drop(Entity entity, Item item, int meta, int amount, int chance) 
	{
		ItemStack stack = new ItemStack(item, chance, meta);
		if (stack.getCount() > amount) 
		{
			stack.setCount(amount);
		}
		
		EntityItem drop = new EntityItem(entity.getEntityWorld(), entity.posX, entity.posY, entity.posZ, stack);
		
		return drop;
	}

	public static AbstractTrait getTrait() 
	{
		return toujouriusly;
	}
}