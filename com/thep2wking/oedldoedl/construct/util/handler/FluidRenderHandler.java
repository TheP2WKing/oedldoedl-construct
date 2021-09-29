package com.thep2wking.oedldoedl.construct.util.handler;

import com.thep2wking.oedldoedl.construct.ReferenceConstruct;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.Fluid;

public class FluidRenderHandler 
{
	public static void mapFluidState(Fluid fluid) 
	{
		Block block = fluid.getBlock();
		Item item = Item.func_150898_a(block);
		FluidStateMapper mapper = new FluidStateMapper(fluid);
		
		if (item != null) 
		{
			ModelLoader.registerItemVariants(item);
			ModelLoader.setCustomMeshDefinition(item, mapper);
		}
		ModelLoader.setCustomStateMapper(block, mapper);
	}

	static class FluidStateMapper extends StateMapperBase implements ItemMeshDefinition 
	{
		public final ModelResourceLocation location;

		public FluidStateMapper(Fluid fluid) 
		{
			this.location = ResourceHelper.getModelResource(ReferenceConstruct.MODID, "oedldoedl_fluids", fluid.getName());
		}

		@Override
		protected ModelResourceLocation func_178132_a(IBlockState state) 
		{
			return this.location;
		}

		@Override
		public ModelResourceLocation func_178113_a(ItemStack stack)
		{
			return this.location;
		}
	}
}