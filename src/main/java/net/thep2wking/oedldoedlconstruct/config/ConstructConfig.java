package net.thep2wking.oedldoedlconstruct.config;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.IntValue;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class ConstructConfig
{ 
	//recipes
    public static BooleanValue enable_mod_recipes;
    
	//effects
    public static BooleanValue effects_enabled;
    
    public static BooleanValue fluid_effects_enabled;
    public static IntValue fluid_base_amplifier;
    public static IntValue fluid_base_duration;
    
    public static BooleanValue bucket_effects_enabled;
    public static IntValue bucket_base_amplifier;
    public static IntValue bucket_base_duration;
    
    public static BooleanValue tinker_tools_effects_enabled;
    public static IntValue tinker_tools_base_amplifier;
    
    //superheated lava
    public static BooleanValue lava_inactive;
    public static IntValue lava_fuel_duration;
    
    //modifier
    public static BooleanValue enable_infinity;
    public static BooleanValue enable_world_breaker;
    public static BooleanValue enable_hater;
    public static BooleanValue enable_sadistic;
    public static BooleanValue enable_shard_drop;
    public static BooleanValue enable_magician;
    
    //integration
    public static BooleanValue top_tooltips;

    public static void init() 
    {
        Pair<ConfigLoder, ForgeConfigSpec> construct_common_config = new ForgeConfigSpec.Builder().configure(ConfigLoder::new); 
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, construct_common_config.getRight());
    }

    public static class ConfigLoder
    {
        public ConfigLoder(ForgeConfigSpec.Builder builder) 
        {
            builder.push("Potion Effects");
            effects_enabled = builder.comment("Toggle all effects given by fluids and items. [Default: true]").define("all_potion_effects_enabled", true);

            builder.push("Fluids");
            fluid_effects_enabled = builder.comment("Toggle all fluid collision effects. [Default: true]").define("fluid_effects_enabled", true);
            fluid_base_amplifier = builder.comment("Set the base effect amplifier for fluid collision. [Default: 4]").defineInRange("fluid_base_amplifier", 4, 1, 255);
            fluid_base_duration = builder.comment("Set the base effect duration for fluid collision. [Default: 200]").defineInRange("fluid_base_duration", 200, 10, 72000);
            builder.pop();
            
            builder.push("Buckets");
            bucket_effects_enabled = builder.comment("Toggle all bucket effects. [Default: true]").define("bucket_effects_enabled", true);
            bucket_base_amplifier = builder.comment("Set the base effect amplifier for buckets. [Default: 2]").defineInRange("bucket_base_amplifier", 2, 1, 255);
            bucket_base_duration = builder.comment("Set the base effect duration for buckets. [Default: 100]").defineInRange("bucket_base_duration", 100, 10, 72000);
            builder.pop();
            
            builder.push("Tinker Tools");
            tinker_tools_effects_enabled = builder.comment("Toggle all fluid collision effects. [Default: true]").define("tinker_tools_effects_enabled", true);
            tinker_tools_base_amplifier = builder.comment("Set the base effect amplifier for fluid collision. [Default: 3]").defineInRange("tinker_tools_base_amplifier", 1, 1, 255);
            builder.pop();
            builder.pop();
            
            builder.push("Content");
            builder.push("Superheated Lava");
            lava_inactive = builder.comment("Toggle superheated lavas ability to destroy blocks. [Default: true]").define("inactive", true);
            lava_fuel_duration = builder.comment("Set the fuel duration for superheated lava (in ticks). [Default: 40000]").defineInRange("fuel_duration", 40000, 0, Integer.MAX_VALUE);
            builder.pop();
            
            builder.push("Modifier");
            enable_infinity = builder.comment("Toggle infinity modifier. [Default: true]").define("enable_infinity", true);
            enable_world_breaker = builder.comment("Toggle world breaker modifier. [Default: true]").define("enable_world_breaker", true);
            enable_hater = builder.comment("Toggle hater modifier. [Default: true]").define("enable_hater", true);
            enable_sadistic = builder.comment("Toggle sadistic modifier. [Default: true]").define("enable_sadistic", true);
            enable_shard_drop = builder.comment("Toggle shard drop modifiers. [Default: true]").define("enable_shard_drops", true);
            enable_magician = builder.comment("Toggle magician modifier. [Default: true]").define("enable_magician", true);
            builder.pop();
            builder.pop();
            
            builder.push("Integration");
            top_tooltips = builder.comment("Toggle TOP tooltips. [Default: true]").define("top_tooltips", true);
            builder.pop();
            
            enable_mod_recipes = builder.comment("Toggle all recipes from this mod. All recipes for items / blocks / liquids will be disabled. "
            		+ "This option is intended for use in a modpack with custom recipes so you do not have to remove them with Crafttweaker. "
            		+ "This can break certain recipes or other mechanics. [Default: true]").define("enable_mod_recipes", true);
        }
    }
}