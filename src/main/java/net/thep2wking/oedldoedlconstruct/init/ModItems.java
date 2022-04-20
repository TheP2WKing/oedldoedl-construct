package net.thep2wking.oedldoedlconstruct.init;

import net.minecraft.item.Item;
import net.minecraft.potion.Effects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.api.ModBucketItemEffectBase;
import net.thep2wking.oedldoedlconstruct.content.item.SuperheatedLavaBucketItem;
import net.thep2wking.oedldoedlconstruct.util.ModItemGroups;
import net.thep2wking.oedldoedlcore.api.ModBucketItemBase;
import net.thep2wking.oedldoedlcore.api.ModItemBase;
import net.thep2wking.oedldoedlcore.util.ModRarities;

public class ModItems 
{
	//deferred register
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OedldoedlConstruct.MODID);
	
	//modifiers
    public static final RegistryObject<Item> INFINITY_SYMBOL = ITEMS.register("infinity_symbol",
            () -> new ModItemBase(ModRarities.RED, true, true, 1, 0, new Item.Properties().group(ModItemGroups.TAB_CONSTRUCT)));
    public static final RegistryObject<Item> FURIOUS_COCKTAIL = ITEMS.register("furious_cocktail",
            () -> new ModItemBase(ModRarities.LIGHT_PURPLE, true, false, 1, 0, new Item.Properties().group(ModItemGroups.TAB_CONSTRUCT)));
    public static final RegistryObject<Item> REMOTE_BREAKER = ITEMS.register("remote_breaker",
            () -> new ModItemBase(ModRarities.LIGHT_PURPLE, true, false, 1, 0, new Item.Properties().group(ModItemGroups.TAB_CONSTRUCT)));
    public static final RegistryObject<Item> SADISTIC_SOUL = ITEMS.register("sadistic_soul",
            () -> new ModItemBase(ModRarities.AQUA, false, false, 1, 0, new Item.Properties().group(ModItemGroups.TAB_CONSTRUCT)));
    
	//buckets
    public static final RegistryObject<Item> MOLTEN_BASE_BUCKET = ITEMS.register("molten_base_bucket",
            () -> new ModBucketItemBase(() -> ModFluids.MOLTEN_BASE_STILL.get(), ModRarities.WHITE, false, true, 1, 0, new Item.Properties().group(ModItemGroups.TAB_CONSTRUCT))); 
    public static final RegistryObject<Item> MOLTEN_MITHRIL_BUCKET = ITEMS.register("molten_mithril_bucket",
            () -> new ModBucketItemBase(() -> ModFluids.MOLTEN_MITHRIL_STILL.get(), ModRarities.AQUA, false, true, 1, 0, new Item.Properties().group(ModItemGroups.TAB_CONSTRUCT))); 
    public static final RegistryObject<Item> MOLTEN_OEDLDOEDL_BUCKET = ITEMS.register("molten_oedldoedl_bucket",
            () -> new ModBucketItemBase(() -> ModFluids.MOLTEN_OEDLDOEDL_STILL.get(), ModRarities.LIGHT_PURPLE, true, true, 1, 0, new Item.Properties().group(ModItemGroups.TAB_CONSTRUCT)));
    public static final RegistryObject<Item> MOLTEN_GREMORIUM_BUCKET = ITEMS.register("molten_gremorium_bucket",
            () -> new ModBucketItemEffectBase(() -> ModFluids.MOLTEN_GREMORIUM_STILL.get(), ModRarities.DARK_RED, false, true, Effects.HASTE, false, 1, 0, 
            		new Item.Properties().group(ModItemGroups.TAB_CONSTRUCT)));
    public static final RegistryObject<Item> MOLTEN_HIMEJIMARIUM_BUCKET = ITEMS.register("molten_himejimarium_bucket",
            () -> new ModBucketItemEffectBase(() -> ModFluids.MOLTEN_HIMEJIMARIUM_STILL.get(), ModRarities.DARK_BLUE, false, true, Effects.RESISTANCE, false, 1, 0, 
            		new Item.Properties().group(ModItemGroups.TAB_CONSTRUCT)));
    public static final RegistryObject<Item> MOLTEN_TOUJOURIUM_BUCKET = ITEMS.register("molten_toujourium_bucket",
            () -> new ModBucketItemEffectBase(() -> ModFluids.MOLTEN_TOUJOURIUM_STILL.get(), ModRarities.GRAY, false, true, Effects.SPEED, false, 1, 0, 
            		new Item.Properties().group(ModItemGroups.TAB_CONSTRUCT)));
    public static final RegistryObject<Item> MOLTEN_ARGENTORIUM_BUCKET = ITEMS.register("molten_argentorium_bucket",
            () -> new ModBucketItemEffectBase(() -> ModFluids.MOLTEN_ARGENTORIUM_STILL.get(), ModRarities.YELLOW, false, true, Effects.SATURATION, false, 1, 0, 
            		new Item.Properties().group(ModItemGroups.TAB_CONSTRUCT)));
    public static final RegistryObject<Item> MOLTEN_QUARTARIUM_BUCKET = ITEMS.register("molten_quartarium_bucket",
            () -> new ModBucketItemEffectBase(() -> ModFluids.MOLTEN_QUARTARIUM_STILL.get(), ModRarities.BLUE, false, true, Effects.STRENGTH, false, 1, 0, 
            		new Item.Properties().group(ModItemGroups.TAB_CONSTRUCT)));
    public static final RegistryObject<Item> MOLTEN_NAGATORIUM_BUCKET = ITEMS.register("molten_nagatorium_bucket",
            () -> new ModBucketItemEffectBase(() -> ModFluids.MOLTEN_NAGATORIUM_STILL.get(), ModRarities.DARK_PURPLE, false, true, Effects.UNLUCK, true, 1, 0, 
            		new Item.Properties().group(ModItemGroups.TAB_CONSTRUCT)));
    public static final RegistryObject<Item> MOLTEN_SAKURAJIMARIUM_BUCKET = ITEMS.register("molten_sakurajimarium_bucket",
            () -> new ModBucketItemEffectBase(() -> ModFluids.MOLTEN_SAKURAJIMARIUM_STILL.get(), ModRarities.DARK_GRAY, false, true, Effects.JUMP_BOOST, false, 1, 0, 
            		new Item.Properties().group(ModItemGroups.TAB_CONSTRUCT)));
    public static final RegistryObject<Item> MOLTEN_INFINITY_BUCKET = ITEMS.register("molten_infinity_bucket",
            () -> new ModBucketItemBase(() -> ModFluids.MOLTEN_INFINITY_STILL.get(), ModRarities.RED, false, true, 1, 0, new Item.Properties().group(ModItemGroups.TAB_CONSTRUCT)));
    public static final RegistryObject<Item> MOLTEN_CHAOS_BUCKET = ITEMS.register("molten_chaos_bucket",
            () -> new ModBucketItemBase(() -> ModFluids.MOLTEN_CHAOS_STILL.get(), ModRarities.BLACK, false, true, 1, 0, new Item.Properties().group(ModItemGroups.TAB_CONSTRUCT)));
    public static final RegistryObject<Item> SUPERHEATED_LAVA_BUCKET = ITEMS.register("superheated_lava_bucket",
            () -> new SuperheatedLavaBucketItem(() -> ModFluids.SUPERHEATED_LAVA_STILL.get(), ModRarities.LIGHT_PURPLE, true, true, 1, 1, 
            		new Item.Properties().group(ModItemGroups.TAB_CONSTRUCT)));
   
	public static void register(IEventBus eventBus)
	{
		ITEMS.register(eventBus);
		
		OedldoedlConstruct.LOGGER.info("Registerd Items for " + OedldoedlConstruct.MODID + "!");
	}
}