package net.thep2wking.oedldoedlconstruct.config.conditions;

import com.google.gson.JsonObject;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;

public class EnableShardDropCondition implements ICondition
{ 
	private static final ResourceLocation ID = new ResourceLocation(OedldoedlConstruct.MODID, "enable_shard_drop");

	@Override
	public ResourceLocation getID() 
	{
		return ID;
	}

	@Override
	public boolean test() 
	{
		return ConstructConfig.enable_shard_drop.get();
	}

	public static class Serializer implements IConditionSerializer<EnableShardDropCondition> 
	{
		public static final EnableShardDropCondition.Serializer INSTANCE = new EnableShardDropCondition.Serializer();

		public void write(JsonObject json, EnableShardDropCondition value) 
		{

		}

		public EnableShardDropCondition read(JsonObject json) 
		{
			return new EnableShardDropCondition();
		}

		public ResourceLocation getID() 
		{
			return EnableShardDropCondition.ID;
		}
	}
}