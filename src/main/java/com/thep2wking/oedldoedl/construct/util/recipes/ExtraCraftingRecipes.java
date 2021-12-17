package com.thep2wking.oedldoedl.construct.util.recipes;

import com.thep2wking.oedldoedl.construct.ReferenceConstruct;
import com.thep2wking.oedldoedl.construct.config.constants.ModifiersConst;
import com.thep2wking.oedldoedl.construct.init.ItemInit;
import com.thep2wking.oedldoedl.resources.config.ResourcesConfig;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ExtraCraftingRecipes 
{
	public static void init()
	{
		//gear - modifier items
  		if (ModifiersConst.SADISTIC_MODIFIER && ResourcesConfig.RESOURCES.metals.sadistium.enabled && ResourcesConfig.RESOURCES.metals.oedldoedl.enabled)
  		{
  			GameRegistry.addShapedRecipe(new ResourceLocation(ReferenceConstruct.MODID+":sadistic_modifier"), new ResourceLocation("modifier"), new ItemStack(ItemInit.ITEM_SADISTIC_MODIFIER), new Object[] {"ABA", "BCB", "ABA", 'A', "dyePurple", 'B', "ingotOedldoedl", 'C', "blockSadistium"});

  		}
  		if (ModifiersConst.INFINITY_MODIFIER && ResourcesConfig.RESOURCES.metals.chaos.enabled && ResourcesConfig.RESOURCES.stars.infinityStar.enabled)
  		{
  			GameRegistry.addShapedRecipe(new ResourceLocation(ReferenceConstruct.MODID+":infinity_modifier"), new ResourceLocation("modifier"), new ItemStack(ItemInit.ITEM_INFINITY_MODIFIER), new Object[] {"ABA", "BCB", "ABA", 'A', "ingotInfinity", 'B', "ingotChaos", 'C', "infinityStar"});
  		}
	}
}