package net.thep2wking.oedldoedlconstruct.init;

import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.config.conditions.EnableHaterCondition;
import net.thep2wking.oedldoedlconstruct.config.conditions.EnableInfinityCondition;
import net.thep2wking.oedldoedlconstruct.config.conditions.EnableModRecipes;
import net.thep2wking.oedldoedlconstruct.config.conditions.EnableSadisticCondition;
import net.thep2wking.oedldoedlconstruct.config.conditions.EnableShardDropCondition;
import net.thep2wking.oedldoedlconstruct.config.conditions.EnableWorldBreakerCondition;

public class ModConditions 
{
	@SubscribeEvent
	public void onRegisterSerializers(RegistryEvent.Register<IRecipeSerializer<?>> event) 
	{
		CraftingHelper.register(EnableInfinityCondition.Serializer.INSTANCE);
		CraftingHelper.register(EnableWorldBreakerCondition.Serializer.INSTANCE);
		CraftingHelper.register(EnableHaterCondition.Serializer.INSTANCE);
		CraftingHelper.register(EnableSadisticCondition.Serializer.INSTANCE);
		CraftingHelper.register(EnableShardDropCondition.Serializer.INSTANCE);
		CraftingHelper.register(EnableModRecipes.Serializer.INSTANCE);
		
		OedldoedlConstruct.LOGGER.info("Registerd Serializers for " + OedldoedlConstruct.MODID + "!");
	}
}