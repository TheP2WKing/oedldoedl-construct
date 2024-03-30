package net.thep2wking.oedldoedlconstruct.util;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.materials.Material;

public class ModConstructRecipeHelper {
	public static void addNuggetMelting(String name, Fluid fluid) {
		TinkerRegistry.registerMelting("nugget" + name.substring(0, 1).toUpperCase() + name.substring(1), fluid,
				Material.VALUE_Nugget);
	}

	public static void addIngotMelting(String name, Fluid fluid) {
		TinkerRegistry.registerMelting("ingot" + name.substring(0, 1).toUpperCase() + name.substring(1), fluid,
				Material.VALUE_Ingot);
	}

	public static void addDustMelting(String name, Fluid fluid) {
		TinkerRegistry.registerMelting("dust" + name.substring(0, 1).toUpperCase() + name.substring(1), fluid,
				Material.VALUE_Ingot);
	}

	public static void addBlockMelting(String name, Fluid fluid) {
		TinkerRegistry.registerMelting("block" + name.substring(0, 1).toUpperCase() + name.substring(1), fluid,
				Material.VALUE_Block);
	}

	public static void addOreMelting(String name, Fluid fluid) {
		TinkerRegistry.registerMelting("ore" + name.substring(0, 1).toUpperCase() + name.substring(1), fluid,
				Material.VALUE_Ingot * 2);
	}

	public static void addCustomMelting(String ore, Fluid fluid, int value) {
		TinkerRegistry.registerMelting(ore, fluid, value);
	}

	public static void addMetalMelting(String name, Fluid fluid) {
		addNuggetMelting(name, fluid);
		addIngotMelting(name, fluid);
		addDustMelting(name, fluid);
		addBlockMelting(name, fluid);
		addOreMelting(name, fluid);
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

	public static void addCustomtCasting(ItemStack stack, String cast, int meta, Fluid fluid, int value) {
		TinkerRegistry.registerTableCasting(stack, new ItemStack(Item.getByNameOrId(cast), 1, meta), fluid, value);
	}

	public static void addCustomtCasting(ItemStack stack, Fluid fluid, int value) {
		TinkerRegistry.registerTableCasting(stack, ItemStack.EMPTY, fluid, value);
	}

	public static void addMetalCasting(ItemStack nugget, ItemStack ingot, ItemStack block, Fluid fluid) {
		addNuggetCasting(nugget, fluid);
		addIngotCasting(ingot, fluid);
		addBlockCasting(block, fluid);
	}

	public static void addSmelteryFuel(Fluid fluid, int temperature) {
		TinkerRegistry.registerSmelteryFuel(new FluidStack(fluid, Fluid.BUCKET_VOLUME), temperature);
	}

	public static void addAlloying(FluidStack output, FluidStack... input) {
		TinkerRegistry.registerAlloy(output, input);
	}
}