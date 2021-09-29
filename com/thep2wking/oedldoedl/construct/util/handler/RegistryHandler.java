package com.thep2wking.oedldoedl.construct.util.handler;

import com.thep2wking.oedldoedl.construct.config.constants.FluidsConst;
import com.thep2wking.oedldoedl.construct.config.constants.ModifiersConst;
import com.thep2wking.oedldoedl.construct.init.BlockInit;
import com.thep2wking.oedldoedl.construct.init.ItemInit;
import com.thep2wking.oedldoedl.core.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler
{
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		
	}
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		if (ModifiersConst.SADISTIC_MODIFIER)
		{
			event.getRegistry().register(ItemInit.ITEM_SADISTIC_MODIFIER);
		}
		if (ModifiersConst.INFINITY_MODIFIER)
		{
			event.getRegistry().register(ItemInit.ITEM_INFINITY_MODIFIER);
		}
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Block block : BlockInit.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
		
		for(Item item : ItemInit.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
	}

	public static void preInitRegistries(FMLPreInitializationEvent event) 
	{
		
	}
	
	public static void InitRegistries(FMLInitializationEvent event) 
	{
		
	}
	
	public static void postInitRegistries(FMLPostInitializationEvent event) 
	{

	}
}