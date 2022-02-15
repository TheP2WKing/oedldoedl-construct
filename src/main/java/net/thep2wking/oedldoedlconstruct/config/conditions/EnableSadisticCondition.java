package net.thep2wking.oedldoedlconstruct.config.conditions;

import com.google.gson.JsonObject;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;

public class EnableSadisticCondition implements ICondition
{ 
	private static final ResourceLocation ID = new ResourceLocation(OedldoedlConstruct.MODID, "enable_sadistic");

	@Override
	public ResourceLocation getID() 
	{
		return ID;
	}

	@Override
	public boolean test() 
	{
		return ConstructConfig.enable_sadistic.get();
	}

	public static class Serializer implements IConditionSerializer<EnableSadisticCondition> 
	{
		public static final EnableSadisticCondition.Serializer INSTANCE = new EnableSadisticCondition.Serializer();

		public void write(JsonObject json, EnableSadisticCondition value) 
		{

		}

		public EnableSadisticCondition read(JsonObject json) 
		{
			return new EnableSadisticCondition();
		}

		public ResourceLocation getID() 
		{
			return EnableSadisticCondition.ID;
		}
	}
}