package com.thep2wking.oedldoedl.construct.init;

import java.util.ArrayList;
import java.util.List;

import com.thep2wking.oedldoedl.construct.items.ItemInfinityModifier;
import com.thep2wking.oedldoedl.construct.items.ItemSadisticModifier;

import net.minecraft.item.Item;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final ItemSadisticModifier ITEM_SADISTIC_MODIFIER = new ItemSadisticModifier("sadistic_modifier");
	public static final ItemInfinityModifier ITEM_INFINITY_MODIFIER = new ItemInfinityModifier("infinity_modifier");
}