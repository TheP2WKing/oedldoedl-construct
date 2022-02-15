package net.thep2wking.oedldoedlconstruct.config.conditions;

import com.google.gson.JsonObject;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;

public class EnableHaterCondition implements ICondition
{ 
	private static final ResourceLocation ID = new ResourceLocation(OedldoedlConstruct.MODID, "enable_hater");

	@Override
	public ResourceLocation getID() 
	{
		return ID;
	}

	@Override
	public boolean test() 
	{
		return ConstructConfig.enable_hater.get();
	}

	public static class Serializer implements IConditionSerializer<EnableHaterCondition> 
	{
		public static final EnableHaterCondition.Serializer INSTANCE = new EnableHaterCondition.Serializer();

		public void write(JsonObject json, EnableHaterCondition value) 
		{

		}

		public EnableHaterCondition read(JsonObject json) 
		{
			return new EnableHaterCondition();
		}

		public ResourceLocation getID() 
		{
			return EnableHaterCondition.ID;
		}
	}
}