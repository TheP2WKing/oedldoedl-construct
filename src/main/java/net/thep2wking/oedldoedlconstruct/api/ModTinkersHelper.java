package net.thep2wking.oedldoedlconstruct.api;

import javax.annotation.Nullable;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import slimeknights.tconstruct.library.MaterialIntegration;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.BowMaterialStats;
import slimeknights.tconstruct.library.materials.ExtraMaterialStats;
import slimeknights.tconstruct.library.materials.HandleMaterialStats;
import slimeknights.tconstruct.library.materials.HeadMaterialStats;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.tools.TinkerTools;

/**
 * @author TheP2WKing
 */
public class ModTinkersHelper {
	public static void preInitMaterial(Material material, String name, boolean hasMolten) {
		MaterialIntegration integration;
		if (material.getFluid() != null)
			integration = new MaterialIntegration(material, material.getFluid(),
					name.substring(0, 1).toUpperCase() + name.substring(1));
		else
			integration = new MaterialIntegration(material);
		if (hasMolten)
			integration = integration.toolforge();
		TinkerRegistry.integrate(integration).preInit();
	}

	public static void initMaterial(Material material, @Nullable String fluid, String ore, String iconItem,
			boolean hasMolten) {
		material.addItem("nugget" + ore.substring(0, 1).toUpperCase() + ore.substring(1), 1, Material.VALUE_Nugget);
		material.addItem("ingot" + ore.substring(0, 1).toUpperCase() + ore.substring(1), 1, Material.VALUE_Ingot);
		material.addItem("block" + ore.substring(0, 1).toUpperCase() + ore.substring(1), 1, Material.VALUE_Block);
		material.setRepresentativeItem(iconItem);
		material.setCraftable(!hasMolten).setCastable(hasMolten);
		if (hasMolten) {
			material.setFluid(FluidRegistry.getFluid(fluid));
		}
	}

	public static void addMaterialStats(Material material, int durability, float attackDamage, float miningSpeed,
			float handleModifier, int miningLevel) {
		material.addStats(new HeadMaterialStats(durability, miningSpeed, attackDamage, miningLevel));
		material.addStats(new HandleMaterialStats(handleModifier, (int) (durability * 0.35)));
		material.addStats(new ExtraMaterialStats((int) ((durability * 0.15) / handleModifier)));
		material.addStats(new BowMaterialStats(handleModifier * 2, handleModifier * 2, attackDamage));
	}

	public static void initToolForge(RegistryEvent.Register<IRecipe> event, String ore) {
		IForgeRegistry<IRecipe> registry = event.getRegistry();
		TinkerTools.registerToolForgeBlock(registry, ore);
	}

	public static void addMetalMelting(String name, Fluid fluid) {
		TinkerRegistry.registerMelting("nugget" + name.substring(0, 1).toUpperCase() + name.substring(1), fluid,
				Material.VALUE_Nugget);
		TinkerRegistry.registerMelting("ingot" + name.substring(0, 1).toUpperCase() + name.substring(1), fluid,
				Material.VALUE_Ingot);
		TinkerRegistry.registerMelting("dust" + name.substring(0, 1).toUpperCase() + name.substring(1), fluid,
				Material.VALUE_Ingot);
		TinkerRegistry.registerMelting("block" + name.substring(0, 1).toUpperCase() + name.substring(1), fluid,
				Material.VALUE_Block);
		TinkerRegistry.registerMelting("ore" + name.substring(0, 1).toUpperCase() + name.substring(1), fluid,
				Material.VALUE_Ingot * 2);
	}

	public static void addNuggetCasting(ItemStack nugget, Fluid fluid) {
		TinkerRegistry.registerTableCasting(nugget, new ItemStack(Item.getByNameOrId("tconstruct:cast_custom"), 1, 1),
				fluid, Material.VALUE_Nugget);
	}

	public static void addIngotCasting(ItemStack ingot, Fluid fluid) {
		TinkerRegistry.registerTableCasting(ingot, new ItemStack(Item.getByNameOrId("tconstruct:cast_custom"), 1, 0),
				fluid, Material.VALUE_Ingot);
	}

	public static void addBlockCasting(ItemStack block, Fluid fluid) {
		TinkerRegistry.registerBasinCasting(block, ItemStack.EMPTY, fluid, Material.VALUE_Block);
	}

	public static void addMetalCasting(ItemStack nugget, ItemStack ingot, ItemStack block, Fluid fluid) {
		addNuggetCasting(nugget, fluid);
		addIngotCasting(ingot, fluid);
		addBlockCasting(block, fluid);
	}
}