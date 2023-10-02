package net.thep2wking.oedldoedlconstruct.config;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.config.categories.Content;
import net.thep2wking.oedldoedlconstruct.config.categories.Properties;
import net.thep2wking.oedldoedlconstruct.config.categories.Recipes;
import net.thep2wking.oedldoedlcore.util.ModReferences;

@Config(modid = OedldoedlConstruct.MODID, name = ModReferences.BASE_MODID + "/"
        + OedldoedlConstruct.MODID, category = OedldoedlConstruct.MODID)
public class ConstructConfig {
    @Config.Name("content")
    public static final Content CONTENT = new Content();

    @Config.Name("properties")
    public static final Properties PROPERTIES = new Properties();

    @Config.Name("recipes")
    public static final Recipes RECIPES = new Recipes();
    
    @Mod.EventBusSubscriber
    public static class ConfigHolder {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(OedldoedlConstruct.MODID)) {
                ConfigManager.sync(OedldoedlConstruct.MODID, Config.Type.INSTANCE);
            }
        }
    }
}