package com.thep2wking.oedldoedl.construct.integration.tcon.tools;

import com.thep2wking.oedldoedl.construct.ReferenceConstruct;
import com.thep2wking.oedldoedl.construct.blocks.BlockFluidBedrockium;
import com.thep2wking.oedldoedl.construct.blocks.BlockFluidChaos;
import com.thep2wking.oedldoedl.construct.blocks.BlockFluidOedldoedl;
import com.thep2wking.oedldoedl.construct.blocks.BlockFluidSadistium;
import com.thep2wking.oedldoedl.construct.config.constants.FluidsConst;
import com.thep2wking.oedldoedl.construct.config.constants.StatsConst;
import com.thep2wking.oedldoedl.construct.config.constants.ToolsConst;
import com.thep2wking.oedldoedl.construct.config.constants.TraitsConst;
import com.thep2wking.oedldoedl.construct.config.gui.ConstructConfig;
import com.thep2wking.oedldoedl.construct.fluids.FluidBedrockium;
import com.thep2wking.oedldoedl.construct.fluids.FluidChaos;
import com.thep2wking.oedldoedl.construct.fluids.FluidOedldoedl;
import com.thep2wking.oedldoedl.construct.fluids.FluidSadistium;
import com.thep2wking.oedldoedl.construct.integration.tcon.traits.TraitArgentoriusly;
import com.thep2wking.oedldoedl.construct.integration.tcon.traits.TraitGremoriusly;
import com.thep2wking.oedldoedl.construct.integration.tcon.traits.TraitHimejimariusly;
import com.thep2wking.oedldoedl.construct.integration.tcon.traits.TraitQuartariusly;
import com.thep2wking.oedldoedl.construct.integration.tcon.traits.TraitHater;
import com.thep2wking.oedldoedl.construct.integration.tcon.traits.TraitToujouriusly;
import com.thep2wking.oedldoedl.construct.util.handler.FluidRenderHandler;
import com.thep2wking.oedldoedl.resources.init.ItemInit;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidRegistry.FluidRegisterEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.fluid.FluidMolten;
import slimeknights.tconstruct.library.materials.BowMaterialStats;
import slimeknights.tconstruct.library.materials.ExtraMaterialStats;
import slimeknights.tconstruct.library.materials.HandleMaterialStats;
import slimeknights.tconstruct.library.materials.HeadMaterialStats;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.library.materials.MaterialTypes;
import slimeknights.tconstruct.library.utils.HarvestLevels;
import slimeknights.tconstruct.smeltery.block.BlockMolten;
import slimeknights.tconstruct.tools.TinkerTraits;

public class OedldoedlTinkerTools 
{
	public static Material base;
	public static Material oedldoedl;
	public static Material sadistium;
	public static Material bedrockium;
	public static Material gremorium;
	public static Material himejimarium;
	public static Material toujourium;
	public static Material argentorium;
	public static Material quartarium;
	public static Material chaos;

	public static FluidMolten moltenBase;
	public static FluidOedldoedl moltenOedldoedl;
	public static FluidSadistium moltenSadistium;
	public static FluidBedrockium moltenBedrockium;
	public static FluidMolten moltenGremorium;
	public static FluidMolten moltenHimejimarium;
	public static FluidMolten moltenToujourium;
	public static FluidMolten moltenArgentorium;
	public static FluidMolten moltenQuartarium;
	public static FluidChaos moltenChaos;

	public static void init()
	{
		//material - base
		if (ToolsConst.BASE_TOOLS)
		{
			base = new Material("oedldoedlconstruct.base", 0x9d9d9d);
			base.addItem(ItemInit.ITEM_INGOT_BASE, 1, Material.VALUE_Ingot);
			base.setRepresentativeItem("ingotBase");
			TinkerRegistry.addMaterialStats(base, new HeadMaterialStats(StatsConst.BASE_TOOLS_DURABILITY, 2.22F, 2.22F, HarvestLevels.IRON), 
			new HandleMaterialStats(2.22F, StatsConst.BASE_TOOLS_EXTRA_DURABILITY), new ExtraMaterialStats(StatsConst.BASE_TOOLS_EXTRA_DURABILITY), new BowMaterialStats(2.22F, 2.22F, 2.22F));
			base.setCastable(false).setCraftable(true);
			if (FluidsConst.BASE_FLUID)
			{
				moltenBase = new FluidMolten("base", 0x9d9d9d);
				FluidRegistry.registerFluid(moltenBase);
				ForgeRegistries.BLOCKS.register(new BlockMolten(moltenBase).setRegistryName(ReferenceConstruct.MODID+":"+"molten_base"));
				FluidRegistry.addBucketForFluid(moltenBase);
				base.setFluid(moltenBase);
				base.setCastable(true).setCraftable(false);
			}
		}
		
		//material - oedldoedl
		oedldoedl = new Material("oedldoedlconstruct.oedldoedl", 0xffffff);
		oedldoedl.addItem("ingotOedldoedl", 1, Material.VALUE_Ingot);
		oedldoedl.setRepresentativeItem(ItemInit.ITEM_OEDLDOEDL_INGOT);
		TinkerRegistry.addMaterialStats(oedldoedl, new HeadMaterialStats(0, 0F, 0F, ExtraHarvestLevels.L7), 
		new HandleMaterialStats(0F, 0), new ExtraMaterialStats(0), new BowMaterialStats(0F, 0F, 0F));			
		oedldoedl.setCastable(false).setCraftable(true);
		if (FluidsConst.OEDLDOEDL_FLUID)
		{
			moltenOedldoedl = new FluidOedldoedl("oedldoedl", 0xffffff);
			FluidRegistry.registerFluid(moltenOedldoedl);
			ForgeRegistries.BLOCKS.register(new BlockFluidOedldoedl(moltenOedldoedl).setRegistryName(ReferenceConstruct.MODID+":"+"molten_oedldoedl"));
			FluidRegistry.addBucketForFluid(moltenOedldoedl);
			oedldoedl.setFluid(moltenOedldoedl);
			oedldoedl.setCastable(true).setCraftable(false);
		}
		
		//material - bedrockium
		if (ToolsConst.BEDROCKIUM_TOOLS)
		{
			bedrockium = new Material("oedldoedlconstruct.bedrockium", 0x303030);
			bedrockium.addItem("ingotBedrockium", 1, Material.VALUE_Ingot);
			bedrockium.setRepresentativeItem(ItemInit.ITEM_BEDROCKIUM_INGOT);
			TinkerRegistry.addMaterialStats(bedrockium, new HeadMaterialStats(StatsConst.BEDROCKIUM_TOOLS_DURABILITY, 42.61F, 35.26F, ExtraHarvestLevels.L10), 
			new HandleMaterialStats(2.11F, StatsConst.BEDROCKIUM_TOOLS_EXTRA_DURABILITY), new ExtraMaterialStats(StatsConst.BEDROCKIUM_TOOLS_EXTRA_DURABILITY), new BowMaterialStats(2.11F, 18.91F, 21.31F));
			bedrockium.setCastable(false).setCraftable(true);
			if (FluidsConst.BEDROCKIUM_FLUID)
			{
				moltenBedrockium = new FluidBedrockium("bedrockium", 0x303030);
				FluidRegistry.registerFluid(moltenBedrockium);
				ForgeRegistries.BLOCKS.register(new BlockFluidBedrockium(moltenBedrockium).setRegistryName(ReferenceConstruct.MODID+":"+"molten_bedrockium"));
				FluidRegistry.addBucketForFluid(moltenBedrockium);
				bedrockium.setFluid(moltenBedrockium);
				bedrockium.setCastable(true).setCraftable(false);
			}
		}
		
		//material - sadistium
		if (ToolsConst.SADISTIUM_TOOLS)
		{
			sadistium = new Material("oedldoedlconstruct.sadistium", 0x675a3a);
			sadistium.addItem("ingotSadistium", 1, Material.VALUE_Ingot);
			sadistium.setRepresentativeItem(ItemInit.ITEM_SADISTIUM_INGOT);
			TinkerRegistry.addMaterialStats(sadistium, new HeadMaterialStats(StatsConst.SADISTIUM_TOOLS_DURABILITY, 0.01F, 0.01F, HarvestLevels.STONE), 
			new HandleMaterialStats(0.01F, StatsConst.SADISTIUM_TOOLS_EXTRA_DURABILITY), new ExtraMaterialStats(StatsConst.BASE_TOOLS_EXTRA_DURABILITY), new BowMaterialStats(0.01F, 0.01F, 0.01F));
			sadistium.setCastable(false).setCraftable(true);
			if (FluidsConst.SADISTIUM_FLUID)
			{
				moltenSadistium = new FluidSadistium("sadistium", 0x675a3a);
				FluidRegistry.registerFluid(moltenSadistium);
				ForgeRegistries.BLOCKS.register(new BlockFluidSadistium(moltenSadistium).setRegistryName(ReferenceConstruct.MODID+":"+"molten_sadistium"));
				FluidRegistry.addBucketForFluid(moltenSadistium);
				sadistium.setFluid(moltenSadistium);
				sadistium.setCastable(true).setCraftable(false);
			}
		}
		
		//material - gremorium
		if (ToolsConst.GREMORIUM_TOOLS)
		{
			gremorium = new Material("oedldoedlconstruct.gremorium", 0x990000);
			gremorium.addItem("ingotGremorium", 1, Material.VALUE_Ingot);
			gremorium.setRepresentativeItem(ItemInit.ITEM_GREMORIUM_INGOT);
			TinkerRegistry.addMaterialStats(gremorium, new HeadMaterialStats(StatsConst.GREMORIUM_TOOLS_DURABILITY, 40.00F, 30.00F, ExtraHarvestLevels.L6), 
			new HandleMaterialStats(1.50F, StatsConst.GREMORIUM_TOOLS_EXTRA_DURABILITY), new ExtraMaterialStats(StatsConst.GREMORIUM_TOOLS_EXTRA_DURABILITY), new BowMaterialStats(1.50F, 7.00F, 14.00f));
			gremorium.setCastable(false).setCraftable(true);
			if (FluidsConst.GREMORIUM_FLUID)
			{
				moltenGremorium = new FluidMolten("gremorium", 0x990000);
				FluidRegistry.registerFluid(moltenGremorium);
				ForgeRegistries.BLOCKS.register(new BlockMolten(moltenGremorium).setRegistryName(ReferenceConstruct.MODID+":"+"molten_gremorium"));
				FluidRegistry.addBucketForFluid(moltenGremorium);
				gremorium.setFluid(moltenGremorium);
				gremorium.setCastable(true).setCraftable(false);
			}
		}
		
		//material - himejimarium
		if (ToolsConst.HIMEJIMARIUM_TOOLS)
		{
			himejimarium = new Material("oedldoedlconstruct.himejimarium", 0x232033);
			himejimarium.addItem("ingotHimejimarium", 1, Material.VALUE_Ingot);
			himejimarium.setRepresentativeItem(ItemInit.ITEM_HIMEJIMARIUM_INGOT);
			TinkerRegistry.addMaterialStats(himejimarium, new HeadMaterialStats(StatsConst.HIMEJIMARIUM_TOOLS_DURABILITY, 35.00F, 25.00F, ExtraHarvestLevels.L6), 
			new HandleMaterialStats(1.50F, StatsConst.HIMEJIMARIUM_TOOLS_EXTRA_DURABILITY), new ExtraMaterialStats(StatsConst.HIMEJIMARIUM_TOOLS_EXTRA_DURABILITY), new BowMaterialStats(1.50F, 6.00F, 12.00f));
			himejimarium.setCastable(false).setCraftable(true);
			if (FluidsConst.HIMEJIMARIUM_FLUID)
			{
				moltenHimejimarium = new FluidMolten("himejimarium", 0x232033);
				FluidRegistry.registerFluid(moltenHimejimarium);
				ForgeRegistries.BLOCKS.register(new BlockMolten(moltenHimejimarium).setRegistryName(ReferenceConstruct.MODID+":"+"molten_himejimarium"));
				FluidRegistry.addBucketForFluid(moltenHimejimarium);
				himejimarium.setFluid(moltenHimejimarium);
				himejimarium.setCastable(true).setCraftable(false);
			}
		}
		
		//material - toujourium
		if (ToolsConst.TOUJOURIUM_TOOLS)
		{
			toujourium = new Material("oedldoedlconstruct.toujourium", 0xc0c0c0);
			toujourium.addItem("ingotToujourium", 1, Material.VALUE_Ingot);
			toujourium.setRepresentativeItem(ItemInit.ITEM_TOUJOURIUM_INGOT);
			TinkerRegistry.addMaterialStats(toujourium, new HeadMaterialStats(StatsConst.TOUJOURIUM_TOOLS_DURABILITY, 30.00F, 20.00F, ExtraHarvestLevels.L6), 
			new HandleMaterialStats(1.50F, StatsConst.TOUJOURIUM_TOOLS_EXTRA_DURABILITY), new ExtraMaterialStats(StatsConst.TOUJOURIUM_TOOLS_EXTRA_DURABILITY), new BowMaterialStats(1.50F, 5.00F, 10.00f));
			toujourium.setCastable(false).setCraftable(true);
			if (FluidsConst.TOUJOURIUM_FLUID)
			{
				moltenToujourium = new FluidMolten("toujourium", 0xc0c0c0);
				FluidRegistry.registerFluid(moltenToujourium);
				ForgeRegistries.BLOCKS.register(new BlockMolten(moltenToujourium).setRegistryName(ReferenceConstruct.MODID+":"+"molten_toujourium"));
				FluidRegistry.addBucketForFluid(moltenToujourium);
				toujourium.setFluid(moltenToujourium);
				toujourium.setCastable(true).setCraftable(false);
			}
		}
		
		//material - argentorium
		if (ToolsConst.ARGENTORIUM_TOOLS)
		{
			argentorium = new Material("oedldoedlconstruct.argentorium", 0xfbd985);
			argentorium.addItem("ingotArgentorium", 1, Material.VALUE_Ingot);
			argentorium.setRepresentativeItem(ItemInit.ITEM_ARGENTORIUM_INGOT);
			TinkerRegistry.addMaterialStats(argentorium, new HeadMaterialStats(StatsConst.ARGENTORIUM_TOOLS_DURABILITY, 25.00F, 15.00F, ExtraHarvestLevels.L6), 
			new HandleMaterialStats(1.50F, StatsConst.ARGENTORIUM_TOOLS_EXTRA_DURABILITY), new ExtraMaterialStats(StatsConst.ARGENTORIUM_TOOLS_EXTRA_DURABILITY), new BowMaterialStats(1.50F, 4.00F, 8.00f));
			argentorium.setCastable(false).setCraftable(true);
			if (FluidsConst.ARGENTORIUM_FLUID)
			{
				moltenArgentorium = new FluidMolten("argentorium", 0xfbd985);
				FluidRegistry.registerFluid(moltenArgentorium);
				ForgeRegistries.BLOCKS.register(new BlockMolten(moltenArgentorium).setRegistryName(ReferenceConstruct.MODID+":"+"molten_argentorium"));
				FluidRegistry.addBucketForFluid(moltenArgentorium);
				argentorium.setFluid(moltenArgentorium);
				argentorium.setCastable(true).setCraftable(false);
			}
		}
			
		//material - quartarium
		if (ToolsConst.QUARTARIUM_TOOLS)
		{
			quartarium = new Material("oedldoedlconstruct.quartarium", 0x0e5191);
			quartarium.addItem("ingotQuartarium", 1, Material.VALUE_Ingot);
			quartarium.setRepresentativeItem(ItemInit.ITEM_QUARTARIUM_INGOT);
			TinkerRegistry.addMaterialStats(quartarium, new HeadMaterialStats(StatsConst.QUARTARIUM_TOOLS_DURABILITY, 20.00F, 10.00F, ExtraHarvestLevels.L6), 
			new HandleMaterialStats(1.50F, StatsConst.QUARTARIUM_TOOLS_EXTRA_DURABILITY), new ExtraMaterialStats(StatsConst.QUARTARIUM_TOOLS_EXTRA_DURABILITY), new BowMaterialStats(1.50F, 3.00F, 6.00f));
			quartarium.setCastable(false).setCraftable(true);
			if (FluidsConst.QUARTARIUM_FLUID)
			{
				moltenQuartarium = new FluidMolten("quartarium", 0x0e5191);
				FluidRegistry.registerFluid(moltenQuartarium);
				ForgeRegistries.BLOCKS.register(new BlockMolten(moltenQuartarium).setRegistryName(ReferenceConstruct.MODID+":"+"molten_quartarium"));
				FluidRegistry.addBucketForFluid(moltenQuartarium);
				quartarium.setFluid(moltenQuartarium);
				quartarium.setCastable(true).setCraftable(false);
			}
		}
		
		//material - chaos
		if (ToolsConst.CHAOS_TOOLS)
		{
			chaos = new Material("oedldoedlconstruct.chaos", 0x0b0312);
			chaos.addItem("ingotChaos", 1, Material.VALUE_Ingot);
			chaos.setRepresentativeItem(ItemInit.ITEM_CHAOS_INGOT);
			TinkerRegistry.addMaterialStats(chaos, new HeadMaterialStats(StatsConst.CHAOS_TOOLS_DURABILITY, 99.99F, 99.99F, ExtraHarvestLevels.L10), 
			new HandleMaterialStats(99.99F, StatsConst.CHAOS_TOOLS_EXTRA_DURABILITY), new ExtraMaterialStats(StatsConst.CHAOS_TOOLS_EXTRA_DURABILITY), new BowMaterialStats(99.99F, 99.99F, 99.99F));
			chaos.setCastable(false).setCraftable(true);
			if (FluidsConst.CHAOS_FLUID)
			{
				moltenChaos = new FluidChaos("chaos", 0x0b0312);
				FluidRegistry.registerFluid(moltenChaos);
				ForgeRegistries.BLOCKS.register(new BlockFluidChaos(moltenChaos).setRegistryName(ReferenceConstruct.MODID+":"+"molten_chaos"));
				FluidRegistry.addBucketForFluid(moltenChaos);
				chaos.setFluid(moltenChaos);
				chaos.setCastable(true).setCraftable(false);
			}
		}
	
		//material - base
		if (ToolsConst.BASE_TOOLS && FluidsConst.BASE_FLUID)
		{
			TinkerRegistry.integrate(base, moltenBase, "Base").toolforge().preInit();
		}
		else if (ToolsConst.BASE_TOOLS)
		{
			TinkerRegistry.integrate(base, "Base").toolforge().preInit();
		}
		
		//material - oedldoedl
		if (FluidsConst.OEDLDOEDL_FLUID)
		{
			TinkerRegistry.integrate(moltenOedldoedl, "Oedldoedl").toolforge().preInit();
		}
		
		//material - bedrockium
		if (ToolsConst.BEDROCKIUM_TOOLS && FluidsConst.BEDROCKIUM_FLUID)
		{
			TinkerRegistry.integrate(bedrockium, moltenBedrockium, "Bedrockium").toolforge().preInit();
		}
		else if (ToolsConst.BEDROCKIUM_TOOLS)
		{
			TinkerRegistry.integrate(bedrockium, "Bedrockium").toolforge().preInit();
		}
		
		//material - sadistium
		if (ToolsConst.SADISTIUM_TOOLS && FluidsConst.SADISTIUM_FLUID)
		{
			TinkerRegistry.integrate(sadistium, moltenSadistium, "Sadistium").toolforge().preInit();
		}
		else if (ToolsConst.SADISTIUM_TOOLS)
		{
			TinkerRegistry.integrate(sadistium, "Sadistium").toolforge().preInit();
		}
		
		//material - gremorium
		if (ToolsConst.GREMORIUM_TOOLS && FluidsConst.GREMORIUM_FLUID)
		{
			TinkerRegistry.integrate(gremorium, moltenGremorium, "Gremorium").toolforge().preInit();
		}
		else if (ToolsConst.GREMORIUM_TOOLS)
		{
			TinkerRegistry.integrate(gremorium, "Gremorium").toolforge().preInit();
		}	
		
		//material - himejimarium
		if (ToolsConst.HIMEJIMARIUM_TOOLS && FluidsConst.HIMEJIMARIUM_FLUID)
		{
			TinkerRegistry.integrate(himejimarium, moltenHimejimarium, "Himejimarium").toolforge().preInit();
		}
		else if (ToolsConst.HIMEJIMARIUM_TOOLS)
		{
			TinkerRegistry.integrate(himejimarium, "Himejimarium").toolforge().preInit();
		}
		
		//material - toujourium
		if (ToolsConst.TOUJOURIUM_TOOLS && FluidsConst.TOUJOURIUM_FLUID)
		{
			TinkerRegistry.integrate(toujourium, moltenToujourium, "Toujourium").toolforge().preInit();
		}
		else if (ToolsConst.TOUJOURIUM_TOOLS)
		{
			TinkerRegistry.integrate(toujourium, "Toujourium").toolforge().preInit();
		}
		
		//material - argentorium
		if (ToolsConst.ARGENTORIUM_TOOLS && FluidsConst.ARGENTORIUM_FLUID)
		{
			TinkerRegistry.integrate(argentorium, moltenArgentorium, "Argentorium").toolforge().preInit();
		}
		else if (ToolsConst.ARGENTORIUM_TOOLS)
		{
			TinkerRegistry.integrate(argentorium, "Argentorium").toolforge().preInit();
		}
		
		//material - quartarium
		if (ToolsConst.QUARTARIUM_TOOLS && FluidsConst.QUARTARIUM_FLUID)
		{
			TinkerRegistry.integrate(quartarium, moltenQuartarium, "Quartarium").toolforge().preInit();	
		}
		else if (ToolsConst.QUARTARIUM_TOOLS)
		{
			TinkerRegistry.integrate(quartarium, "Quartarium").toolforge().preInit();
		}
		
		//material - chaos
		if (ToolsConst.CHAOS_TOOLS && FluidsConst.CHAOS_FLUID)
		{
			TinkerRegistry.integrate(chaos, moltenChaos, "Chaos").toolforge().preInit();
		}
		else if (ToolsConst.CHAOS_TOOLS)
		{
			TinkerRegistry.integrate(chaos, "Chaos").toolforge().preInit();
		}
	}

	public static void initTraits() 
	{
		//material - base
		if (ToolsConst.BASE_TOOLS)
		{
			base.addTrait(TinkerTraits.crude2, MaterialTypes.HEAD);
			base.addTrait(TinkerTraits.crude2);
			base.addTrait(TinkerTraits.cheap, MaterialTypes.HEAD);
			base.addTrait(TinkerTraits.cheap);
		}
		
		//material - bedrockium
		if (ToolsConst.BEDROCKIUM_TOOLS)
		{
			bedrockium.addTrait(TinkerTraits.heavy, MaterialTypes.HEAD);
			bedrockium.addTrait(TinkerTraits.heavy);
			bedrockium.addTrait(TinkerTraits.momentum, MaterialTypes.HEAD);
			bedrockium.addTrait(TinkerTraits.momentum);
		}
		
		//material - sadistium
		if (ToolsConst.SADISTIUM_TOOLS)
		{
			sadistium.addTrait(TinkerTraits.breakable, MaterialTypes.HEAD);
			sadistium.addTrait(TinkerTraits.breakable);
			if (TraitsConst.HATER_TRAIT)
			{
				sadistium.addTrait(TraitHater.getTrait(), MaterialTypes.HEAD);
				sadistium.addTrait(TraitHater.getTrait());
			}
		}
		
		//material - gremorium
		if (ToolsConst.GREMORIUM_TOOLS)
		{
			gremorium.addTrait(TinkerTraits.autosmelt, MaterialTypes.HEAD);
			gremorium.addTrait(TinkerTraits.autosmelt);
			gremorium.addTrait(TinkerTraits.established, MaterialTypes.HEAD);
			gremorium.addTrait(TinkerTraits.established);
			if (TraitsConst.GREMORIUSLY_TRAIT)
			{
				gremorium.addTrait(TraitGremoriusly.getTrait(), MaterialTypes.HEAD);
				gremorium.addTrait(TraitGremoriusly.getTrait(), MaterialTypes.BOW);
				gremorium.addTrait(TraitGremoriusly.getTrait());
			}
		}
		
		//material - himejimarium
		if (ToolsConst.HIMEJIMARIUM_TOOLS)
		{
			himejimarium.addTrait(TinkerTraits.poisonous, MaterialTypes.HEAD);
			himejimarium.addTrait(TinkerTraits.poisonous);
			himejimarium.addTrait(TinkerTraits.duritos, MaterialTypes.HEAD);	
			himejimarium.addTrait(TinkerTraits.duritos);
			if (TraitsConst.HIMEJIMARIUSLY_TRAIT)
			{
				himejimarium.addTrait(TraitHimejimariusly.getTrait(), MaterialTypes.HEAD);
				himejimarium.addTrait(TraitHimejimariusly.getTrait(), MaterialTypes.BOW);
				himejimarium.addTrait(TraitHimejimariusly.getTrait());
			}
		}
		
		//material - toujourium
		if (ToolsConst.TOUJOURIUM_TOOLS)
		{
			toujourium.addTrait(TinkerTraits.dense, MaterialTypes.HEAD);
			toujourium.addTrait(TinkerTraits.dense);
			toujourium.addTrait(TinkerTraits.momentum, MaterialTypes.HEAD);
			toujourium.addTrait(TinkerTraits.momentum);
			if (TraitsConst.TOUJOURIUSLY_TRAIT)
			{
				toujourium.addTrait(TraitToujouriusly.getTrait(), MaterialTypes.HEAD);
				toujourium.addTrait(TraitToujouriusly.getTrait(), MaterialTypes.BOW);
				toujourium.addTrait(TraitToujouriusly.getTrait());
			}
		}
		
		//material - argentorium
		if (ToolsConst.ARGENTORIUM_TOOLS)
		{
			argentorium.addTrait(TinkerTraits.coldblooded, MaterialTypes.HEAD);
			argentorium.addTrait(TinkerTraits.coldblooded);
			argentorium.addTrait(TinkerTraits.holy, MaterialTypes.HEAD);		
			argentorium.addTrait(TinkerTraits.holy);
			if (TraitsConst.ARGENTORIUSLY_TRAIT)
			{
				argentorium.addTrait(TraitArgentoriusly.getTrait(), MaterialTypes.HEAD);
				argentorium.addTrait(TraitArgentoriusly.getTrait(), MaterialTypes.BOW);
				argentorium.addTrait(TraitArgentoriusly.getTrait());
			}
		}
		
		//material - quartarium
		if (ToolsConst.QUARTARIUM_TOOLS)
		{
			quartarium.addTrait(TinkerTraits.sharp, MaterialTypes.HEAD);
			quartarium.addTrait(TinkerTraits.sharp);
			quartarium.addTrait(TinkerTraits.insatiable, MaterialTypes.HEAD);
			quartarium.addTrait(TinkerTraits.insatiable);
			if (TraitsConst.QUARTARIUSLY_TRAIT)
			{
				quartarium.addTrait(TraitQuartariusly.getTrait(), MaterialTypes.HEAD);
				quartarium.addTrait(TraitQuartariusly.getTrait(), MaterialTypes.BOW);
				quartarium.addTrait(TraitQuartariusly.getTrait());
			}
		}
		
		//material - chaos
		if (ToolsConst.CHAOS_TOOLS)
		{
			chaos.addTrait(TinkerTraits.autosmelt, MaterialTypes.HEAD);
			chaos.addTrait(TinkerTraits.autosmelt);
			chaos.addTrait(TinkerTraits.coldblooded, MaterialTypes.HEAD);
			chaos.addTrait(TinkerTraits.coldblooded);
			chaos.addTrait(TinkerTraits.magnetic2, MaterialTypes.HEAD);
			chaos.addTrait(TinkerTraits.magnetic2);
			chaos.addTrait(TinkerTraits.shocking, MaterialTypes.HEAD);
			chaos.addTrait(TinkerTraits.shocking);
			chaos.addTrait(TinkerTraits.poisonous, MaterialTypes.HEAD);
			chaos.addTrait(TinkerTraits.poisonous);
			chaos.addTrait(TinkerTraits.stonebound, MaterialTypes.HEAD);
			chaos.addTrait(TinkerTraits.stonebound);
			chaos.addTrait(TinkerTraits.unnatural, MaterialTypes.HEAD);
			chaos.addTrait(TinkerTraits.unnatural);
			chaos.addTrait(TinkerTraits.writable2, MaterialTypes.HEAD);
			chaos.addTrait(TinkerTraits.writable2);
		}
	}
	
	@SideOnly(Side.CLIENT)
	public static void initFluidModels() 
	{
		//material - base
		if (FluidsConst.BASE_FLUID && ToolsConst.BASE_TOOLS)
		{
			FluidRenderHandler.mapFluidState(moltenBase);
		}
		
		//material - oedldoedl
		if (FluidsConst.OEDLDOEDL_FLUID)
		{
			FluidRenderHandler.mapFluidState(moltenOedldoedl);
		}
		
		//material - sadistium
		if (FluidsConst.SADISTIUM_FLUID && ToolsConst.SADISTIUM_TOOLS)
		{
			FluidRenderHandler.mapFluidState(moltenSadistium);
		}
		
		//material - bedrockium
		if (FluidsConst.BEDROCKIUM_FLUID && ToolsConst.BEDROCKIUM_TOOLS)
		{
			FluidRenderHandler.mapFluidState(moltenBedrockium);
		}
		
		//material - gremorium
		if (FluidsConst.GREMORIUM_FLUID && ToolsConst.GREMORIUM_TOOLS)
		{
			FluidRenderHandler.mapFluidState(moltenGremorium);
		}
		
		//material - himejimarium
		if (FluidsConst.HIMEJIMARIUM_FLUID && ToolsConst.HIMEJIMARIUM_TOOLS)
		{
			FluidRenderHandler.mapFluidState(moltenHimejimarium);
		}
		
		//material - toujourium
		if (FluidsConst.TOUJOURIUM_FLUID && ToolsConst.TOUJOURIUM_TOOLS)
		{
			FluidRenderHandler.mapFluidState(moltenToujourium);
		}
		
		//material - argentorium
		if (FluidsConst.ARGENTORIUM_FLUID && ToolsConst.ARGENTORIUM_TOOLS)
		{
			FluidRenderHandler.mapFluidState(moltenArgentorium);
		}
		
		//material - quartarium
		if (FluidsConst.QUARTARIUM_FLUID && ToolsConst.QUARTARIUM_TOOLS)
		{
			FluidRenderHandler.mapFluidState(moltenQuartarium);
		}
		
		//material - chaos
		if (FluidsConst.CHAOS_FLUID && ToolsConst.CHAOS_TOOLS)
		{
			FluidRenderHandler.mapFluidState(moltenChaos);
		}
	}
}