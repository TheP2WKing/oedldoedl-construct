package net.thep2wking.oedldoedlconstruct.util.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;
import net.thep2wking.oedldoedlconstruct.util.ModTinkersBookTransformer;

public class ClientProxy extends CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}

	public void init(FMLInitializationEvent event) {
		super.init(event);
		if (ConstructConfig.CONTENT.TINKERS_BOOK_MODIFIER_ENTRIES) {
			ModTinkersBookTransformer.integrate();
		}
	}

	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}