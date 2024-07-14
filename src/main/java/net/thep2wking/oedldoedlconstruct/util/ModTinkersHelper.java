package net.thep2wking.oedldoedlconstruct.util;

import javax.annotation.Nullable;

import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import slimeknights.tconstruct.library.MaterialIntegration;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.ArrowShaftMaterialStats;
import slimeknights.tconstruct.library.materials.BowMaterialStats;
import slimeknights.tconstruct.library.materials.BowStringMaterialStats;
import slimeknights.tconstruct.library.materials.ExtraMaterialStats;
import slimeknights.tconstruct.library.materials.FletchingMaterialStats;
import slimeknights.tconstruct.library.materials.HandleMaterialStats;
import slimeknights.tconstruct.library.materials.HeadMaterialStats;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.library.materials.ProjectileMaterialStats;
import slimeknights.tconstruct.tools.TinkerTools;

/**
 * @author TheP2WKing
 */
public class ModTinkersHelper {
	public static void preInitMaterial(Material material, String name, boolean hasMolten) {
		MaterialIntegration integration;
		if (material.getFluid() != null && hasMolten) {
			integration = new MaterialIntegration(material, material.getFluid(),
					name.substring(0, 1).toUpperCase() + name.substring(1));
		} else {
			integration = new MaterialIntegration(material);
		}
		if (hasMolten) {
			integration = integration.toolforge();
		}
		TinkerRegistry.integrate(integration).preInit();
	}

	public static void initMaterial(Material material, @Nullable String fluid, @Nullable String ore, String iconItem,
			boolean hasMolten) {
		if (ore != null) {
			material.addItem("nugget" + ore.substring(0, 1).toUpperCase() + ore.substring(1), 1, Material.VALUE_Nugget);
			material.addItem("ingot" + ore.substring(0, 1).toUpperCase() + ore.substring(1), 1, Material.VALUE_Ingot);
			material.addItem("block" + ore.substring(0, 1).toUpperCase() + ore.substring(1), 1, Material.VALUE_Block);
			if (!hasMolten) {
				material.addItem(ore, 1, Material.VALUE_Ingot);
			}
		}
		material.setRepresentativeItem(iconItem);
		material.setCraftable(!hasMolten).setCastable(hasMolten);

		if (hasMolten && fluid != null) {
			material.setFluid(FluidRegistry.getFluid(fluid));
		}
	}

	public static void addMaterialStats(Material material, int durability, float attackDamage, float miningSpeed,
			float handleModifier, int miningLevel) {
		material.addStats(new HeadMaterialStats(durability, miningSpeed, attackDamage, miningLevel));
		material.addStats(new HandleMaterialStats(handleModifier, (int) (durability * 0.35)));
		material.addStats(new ExtraMaterialStats((int) ((durability * 0.15) / handleModifier)));
		material.addStats(new BowMaterialStats(handleModifier * 2, handleModifier * 2, attackDamage));
		material.addStats(new ProjectileMaterialStats());
	}

	public static void addSpecialMaterialStats(Material material, float modifier, int bonusAmmo, float accuracy) {
		material.addStats(new ArrowShaftMaterialStats(modifier, bonusAmmo));
		material.addStats(new FletchingMaterialStats(accuracy, modifier));
		material.addStats(new BowStringMaterialStats(modifier));
	}

	public static void initToolForge(RegistryEvent.Register<IRecipe> event, String ore) {
		IForgeRegistry<IRecipe> registry = event.getRegistry();
		TinkerTools.registerToolForgeBlock(registry, ore);
	}
}