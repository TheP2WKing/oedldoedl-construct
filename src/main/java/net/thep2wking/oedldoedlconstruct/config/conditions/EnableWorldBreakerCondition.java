package net.thep2wking.oedldoedlconstruct.config.conditions;

import com.google.gson.JsonObject;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;

public class EnableWorldBreakerCondition implements ICondition
{ 
	private static final ResourceLocation ID = new ResourceLocation(OedldoedlConstruct.MODID, "enable_world_breaker");

	@Override
	public ResourceLocation getID() 
	{
		return ID;
	}

	@Override
	public boolean test() 
	{
		return ConstructConfig.enable_world_breaker.get();
	}

	public static class Serializer implements IConditionSerializer<EnableWorldBreakerCondition> 
	{
		public static final EnableWorldBreakerCondition.Serializer INSTANCE = new EnableWorldBreakerCondition.Serializer();

		public void write(JsonObject json, EnableWorldBreakerCondition value) 
		{

		}

		public EnableWorldBreakerCondition read(JsonObject json) 
		{
			return new EnableWorldBreakerCondition();
		}

		public ResourceLocation getID() 
		{
			return EnableWorldBreakerCondition.ID;
		}
	}
}