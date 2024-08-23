package net.thep2wking.oedldoedlconstruct.init;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.MobEffects;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.api.ModBlockFluidEffectBase;
import net.thep2wking.oedldoedlconstruct.content.block.BlockFluidBedrockium;
import net.thep2wking.oedldoedlconstruct.content.block.BlockFluidCloudium;
import net.thep2wking.oedldoedlconstruct.content.block.BlockFluidDrunkium;
import net.thep2wking.oedldoedlconstruct.content.block.BlockFluidElevatium;
import net.thep2wking.oedldoedlconstruct.content.block.BlockFluidSadistium;
import net.thep2wking.oedldoedlconstruct.content.block.BlockFluidSuperheatedLava;
import net.thep2wking.oedldoedlcore.api.fluid.ModBlockFluidBase;
import net.thep2wking.oedldoedlcore.init.ModPotions;

public class ModBlocks {
	public static final BlockFluidClassic MOLTEN_BASE = new ModBlockFluidBase(OedldoedlConstruct.MODID, "base", ModFluids.MOLTEN_BASE, Material.LAVA, MapColor.IRON);
	public static final BlockFluidClassic MOLTEN_OEDLDOEDL = new ModBlockFluidBase(OedldoedlConstruct.MODID, "oedldoedl", ModFluids.MOLTEN_OEDLDOEDL, 0xbf40bf, Material.LAVA, MapColor.YELLOW);
	public static final BlockFluidClassic MOLTEN_CATERIUM = new ModBlockFluidBase(OedldoedlConstruct.MODID, "caterium", ModFluids.MOLTEN_CATERIUM, Material.LAVA, MapColor.YELLOW);
	public static final BlockFluidClassic MOLTEN_BEDROCKIUM = new BlockFluidBedrockium(OedldoedlConstruct.MODID, "bedrockium", ModFluids.MOLTEN_BEDROCKIUM, Material.LAVA, MapColor.BLACK, MobEffects.SLOWNESS, MobEffects.HUNGER, true);
	public static final BlockFluidClassic MOLTEN_CLOUDIUM = new BlockFluidCloudium(OedldoedlConstruct.MODID, "cloudium", ModFluids.MOLTEN_CLOUDIUM, Material.LAVA, MapColor.SNOW, ModPotions.SLOW_FALLING, false);
	public static final BlockFluidClassic MOLTEN_ELEVATIUM = new BlockFluidElevatium(OedldoedlConstruct.MODID, "elevatium", ModFluids.MOLTEN_ELEVATIUM, Material.LAVA, MapColor.PURPLE, MobEffects.LEVITATION, true);
	public static final BlockFluidClassic MOLTEN_SADISTIUM = new BlockFluidSadistium(OedldoedlConstruct.MODID, "sadistium", ModFluids.MOLTEN_SADISTIUM, Material.LAVA, MapColor.BROWN, MobEffects.MINING_FATIGUE, MobEffects.WEAKNESS, MobEffects.GLOWING, true);
	public static final BlockFluidClassic MOLTEN_DRUNKIUM = new BlockFluidDrunkium(OedldoedlConstruct.MODID, "drunkium", ModFluids.MOLTEN_DRUNKIUM, Material.LAVA, MapColor.CYAN, MobEffects.BLINDNESS, MobEffects.SLOWNESS, MobEffects.NAUSEA, MobEffects.WITHER, true);
	public static final BlockFluidClassic MOLTEN_MONEY = new ModBlockFluidBase(OedldoedlConstruct.MODID, "money", ModFluids.MOLTEN_MONEY, Material.LAVA, MapColor.GREEN_STAINED_HARDENED_CLAY);
	public static final BlockFluidClassic MOLTEN_CHAOS = new ModBlockFluidBase(OedldoedlConstruct.MODID, "chaos", ModFluids.MOLTEN_CHAOS, Material.LAVA, MapColor.BLACK);

	public static final BlockFluidClassic MOLTEN_GREMORIUM = new ModBlockFluidEffectBase(OedldoedlConstruct.MODID, "gremorium", ModFluids.MOLTEN_GREMORIUM, Material.LAVA, MapColor.NETHERRACK, MobEffects.HASTE, false);
	public static final BlockFluidClassic MOLTEN_HIMEJIMARIUM = new ModBlockFluidEffectBase(OedldoedlConstruct.MODID, "himejimarium", ModFluids.MOLTEN_HIMEJIMARIUM, Material.LAVA, MapColor.BLUE_STAINED_HARDENED_CLAY, MobEffects.RESISTANCE, false);
	public static final BlockFluidClassic MOLTEN_TOUJOURIUM = new ModBlockFluidEffectBase(OedldoedlConstruct.MODID, "toujourium", ModFluids.MOLTEN_TOUJOURIUM, Material.LAVA, MapColor.SNOW, MobEffects.SPEED, false);
	public static final BlockFluidClassic MOLTEN_ARGENTORIUM = new ModBlockFluidEffectBase(OedldoedlConstruct.MODID, "argentorium", ModFluids.MOLTEN_ARGENTORIUM, Material.LAVA, MapColor.YELLOW, MobEffects.SATURATION, false);
	public static final BlockFluidClassic MOLTEN_QUARTARIUM = new ModBlockFluidEffectBase(OedldoedlConstruct.MODID, "quartarium", ModFluids.MOLTEN_QUARTARIUM, Material.LAVA, MapColor.BLUE, MobEffects.STRENGTH, false);
	public static final BlockFluidClassic MOLTEN_NAGATORIUM = new ModBlockFluidEffectBase(OedldoedlConstruct.MODID, "nagatorium", ModFluids.MOLTEN_NAGATORIUM, Material.LAVA, MapColor.PURPLE, MobEffects.UNLUCK, true);
	public static final BlockFluidClassic MOLTEN_SAKURAJIMARIUM = new ModBlockFluidEffectBase(OedldoedlConstruct.MODID, "sakurajimarium", ModFluids.MOLTEN_SAKURAJIMARIUM, Material.LAVA, MapColor.GRAY, MobEffects.JUMP_BOOST, false);
	public static final BlockFluidClassic MOLTEN_KITAGAWARIUM = new ModBlockFluidEffectBase(OedldoedlConstruct.MODID, "kitagawarium", ModFluids.MOLTEN_KITAGAWARIUM, Material.LAVA, MapColor.PINK, ModPotions.DOLPHIN_GRACE, false);

	public static final BlockFluidClassic SUPERHEATED_LAVA = new BlockFluidSuperheatedLava(OedldoedlConstruct.MODID, "superheated_lava", ModFluids.SUPERHEATED_LAVA, Material.LAVA, MapColor.ORANGE_STAINED_HARDENED_CLAY);
}