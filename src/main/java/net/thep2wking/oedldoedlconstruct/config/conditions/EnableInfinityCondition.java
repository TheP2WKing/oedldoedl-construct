package net.thep2wking.oedldoedlconstruct.config.conditions;

import com.google.gson.JsonObject;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;

public class EnableInfinityCondition implements ICondition
{ 
	private static final ResourceLocation ID = new ResourceLocation(OedldoedlConstruct.MODID, "enable_infinity");

	@Override
	public ResourceLocation getID() 
	{
		return ID;
	}

	@Override
	public boolean test() 
	{
		return ConstructConfig.enable_infinity.get();
	}

	public static class Serializer implements IConditionSerializer<EnableInfinityCondition> 
	{
		public static final EnableInfinityCondition.Serializer INSTANCE = new EnableInfinityCondition.Serializer();

		public void write(JsonObject json, EnableInfinityCondition value) 
		{

		}

		public EnableInfinityCondition read(JsonObject json) 
		{
			return new EnableInfinityCondition();
		}

		public ResourceLocation getID() 
		{
			return EnableInfinityCondition.ID;
		}
	}
}