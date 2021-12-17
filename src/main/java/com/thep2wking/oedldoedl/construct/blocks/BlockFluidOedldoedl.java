package com.thep2wking.oedldoedl.construct.blocks;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import slimeknights.tconstruct.smeltery.block.BlockTinkerFluid;

public class BlockFluidOedldoedl extends BlockTinkerFluid 
{
	public BlockFluidOedldoedl(Fluid fluid)
	{
		super(fluid, Material.LAVA);
	}
}