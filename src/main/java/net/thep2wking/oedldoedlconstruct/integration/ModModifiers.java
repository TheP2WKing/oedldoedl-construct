package net.thep2wking.oedldoedlconstruct.integration;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.integration.modifier.ArgentoriuslyModifier;
import net.thep2wking.oedldoedlconstruct.integration.modifier.HaterModifier;
import net.thep2wking.oedldoedlconstruct.integration.modifier.GremoriuslyModifier;
import net.thep2wking.oedldoedlconstruct.integration.modifier.HimejimariuslyModifier;
import net.thep2wking.oedldoedlconstruct.integration.modifier.InfinityModifier;
import net.thep2wking.oedldoedlconstruct.integration.modifier.NagatoriuslyModifier;
import net.thep2wking.oedldoedlconstruct.integration.modifier.QuartariuslyModifier;
import net.thep2wking.oedldoedlconstruct.integration.modifier.SadisticModifier;
import net.thep2wking.oedldoedlconstruct.integration.modifier.SakurajimariuslyModifier;
import net.thep2wking.oedldoedlconstruct.integration.modifier.ToujouriuslyModifier;
import net.thep2wking.oedldoedlconstruct.integration.modifier.WorldBreakerModifier;
import net.thep2wking.oedldoedlcore.config.CoreConfig;
import slimeknights.tconstruct.library.modifiers.Modifier;

public class ModModifiers 
{
	//deferred register
    public static final DeferredRegister<Modifier> MODIFIERS = DeferredRegister.create(Modifier.class, OedldoedlConstruct.MODID);
    
	//modifier
    public static final RegistryObject<Modifier> GREMORIUSLY = MODIFIERS.register("gremoriusly", GremoriuslyModifier::new);
    public static final RegistryObject<Modifier> HIMEJIMARIUSLY = MODIFIERS.register("himejimariusly", HimejimariuslyModifier::new);
    public static final RegistryObject<Modifier> TOUJOURIUSLY = MODIFIERS.register("toujouriusly", ToujouriuslyModifier::new);
    public static final RegistryObject<Modifier> ARGENTORIUSLY = MODIFIERS.register("argentoriusly", ArgentoriuslyModifier::new);
    public static final RegistryObject<Modifier> QUARTARIUSLY = MODIFIERS.register("quartariusly", QuartariuslyModifier::new);
    public static final RegistryObject<Modifier> NAGATORIUSLY = MODIFIERS.register("nagatoriusly", NagatoriuslyModifier::new);
    public static final RegistryObject<Modifier> SAKURAJIMARIUSLY = MODIFIERS.register("sakurajimariusly", SakurajimariuslyModifier::new);
    
    public static final RegistryObject<Modifier> WORLD_BREAKER = MODIFIERS.register("world_breaker", WorldBreakerModifier::new);
    public static final RegistryObject<Modifier> HATER = MODIFIERS.register("hater", HaterModifier::new);
    public static final RegistryObject<Modifier> INFINITY = MODIFIERS.register("infinity", InfinityModifier::new);
    public static final RegistryObject<Modifier> SADISTIC = MODIFIERS.register("sadistic", SadisticModifier::new);
    
    public static void register(IEventBus eventBus) 
    {
    	MODIFIERS.register(eventBus);
        
		if (CoreConfig.general_logging.get()) {OedldoedlConstruct.LOGGER.info("Registerd Modifiers for " + OedldoedlConstruct.MODID + "!");}
    }
}