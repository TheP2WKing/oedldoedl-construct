package net.thep2wking.oedldoedlconstruct.init;

import net.minecraft.init.MobEffects;
import net.thep2wking.oedldoedlconstruct.api.ModSingleModifierEffectBase;
import net.thep2wking.oedldoedlconstruct.content.modifier.ModifierHater;
import net.thep2wking.oedldoedlconstruct.content.modifier.ModifierInfinity;
import net.thep2wking.oedldoedlconstruct.content.modifier.ModifierLevitating;
import net.thep2wking.oedldoedlconstruct.content.modifier.ModifierRich;
import net.thep2wking.oedldoedlconstruct.content.modifier.ModifierSadistic;
import net.thep2wking.oedldoedlconstruct.content.modifier.ModifierSunburnt;
import net.thep2wking.oedldoedlconstruct.content.modifier.ModifierTimeshifter;
import net.thep2wking.oedldoedlconstruct.content.modifier.ModifierWorldBreaker;
import net.thep2wking.oedldoedlresources.init.ModItems;
import slimeknights.tconstruct.library.traits.AbstractTrait;

public class ModModifier {
	public static final AbstractTrait LEVITATING = new ModifierLevitating("levitating", 0xa673a6);
	public static final AbstractTrait TIMESHIFTER = new ModifierTimeshifter("timeshifter", 0xb5c7c5);
	public static final AbstractTrait SUNBURNT = new ModifierSunburnt("sunburnt", 0xfff4ca);

	public static final AbstractTrait SADISTIC = new ModifierSadistic("sadistic", 0x49372c, "sadisticSoul");
	public static final AbstractTrait HATER = new ModifierHater("hater", 0x380c70, "furiousCocktail");
	public static final AbstractTrait RICH = new ModifierRich("rich", 0xfdbf00, "ingotMoney");
	public static final AbstractTrait INFINITY = new ModifierInfinity("infinity", 0xff0000, "infinitySymbol");
	public static final AbstractTrait WORLD_BREAKER = new ModifierWorldBreaker("world_breaker", 0xc77e4f, "remoteBreaker");
	
	public static final AbstractTrait GREMORIUSLY = new ModSingleModifierEffectBase("gremoriusly", 0x990000, "gremoriumStar", MobEffects.HASTE, ModItems.GREMORIUM_SHARD);
	public static final AbstractTrait HIMEJIMARIUSLY = new ModSingleModifierEffectBase("himejimariusly", 0x232033, "himejimariumStar", MobEffects.RESISTANCE, ModItems.HIMEJIMARIUM_SHARD);
	public static final AbstractTrait TOUJOURIUSLY= new ModSingleModifierEffectBase("toujouriusly", 0xc0c0c0, "toujouriumStar", MobEffects.SPEED, ModItems.TOUJOURIUM_SHARD);
	public static final AbstractTrait ARGENTORIUSLY = new ModSingleModifierEffectBase("argentoriusly", 0xfbd985, "argentoriumStar", MobEffects.SATURATION, ModItems.ARGENTORIUM_SHARD);
	public static final AbstractTrait QUARTARIUSLY = new ModSingleModifierEffectBase("quartariusly", 0x0e5191, "quartariumStar", MobEffects.STRENGTH, ModItems.QUARTARIUM_SHARD);
	public static final AbstractTrait NAGATORIUSLY = new ModSingleModifierEffectBase("nagatoriusly", 0x650fc1, "nagatoriumStar", MobEffects.UNLUCK, ModItems.NAGATORIUM_SHARD);
	public static final AbstractTrait SAKURAJIMARIUSLY = new ModSingleModifierEffectBase("sakurajimariusly", 0x2a2929, "sakurajimariumStar", MobEffects.JUMP_BOOST, ModItems.SAKURAJIMARIUM_SHARD);
	public static final AbstractTrait KITAGAWARIUSLY = new ModSingleModifierEffectBase("kitagawariusly", 0x97173e, "kitagawariumStar", MobEffects.WATER_BREATHING, ModItems.KITAGAWARIUM_SHARD);
}