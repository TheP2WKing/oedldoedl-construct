package com.thep2wking.oedldoedl.construct.util.proxy;

import com.thep2wking.oedldoedl.construct.integration.tcon.book.OedldoedlBookTransformer;
import com.thep2wking.oedldoedl.construct.integration.tcon.tools.OedldoedlTinkerTools;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import slimeknights.mantle.client.book.repository.FileRepository;
import slimeknights.tconstruct.library.book.TinkerBook;

public class ClientProxy extends CommonProxy
{
	public void preInit(FMLPreInitializationEvent event) 
	{
		super.preInit(event);
		OedldoedlTinkerTools.initFluidModels();
        TinkerBook.INSTANCE.addTransformer(new OedldoedlBookTransformer());
        TinkerBook.INSTANCE.addRepository(new FileRepository("oedldoedlconstruct:tcon/book"));
	}

	public void Init(FMLInitializationEvent event) 
	{
		super.Init(event);
	}

	public void postInit(FMLPostInitializationEvent event) 
	{
		super.postInit(event);
	}
}