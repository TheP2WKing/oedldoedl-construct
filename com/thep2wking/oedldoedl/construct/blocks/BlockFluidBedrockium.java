package com.thep2wking.oedldoedl.construct.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fluids.Fluid;
import slimeknights.tconstruct.smeltery.block.BlockTinkerFluid;

public class BlockFluidBedrockium extends BlockTinkerFluid 
{
	public BlockFluidBedrockium(Fluid fluid)
	{
		super(fluid, Material.field_151587_i);
	}
	
    @Override
    public void func_180634_a(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) 
    {
        super.func_180634_a(worldIn, pos, state, entityIn);
        
        if (entityIn instanceof EntityLivingBase) 
        {
            ((EntityLivingBase) entityIn).func_70690_d(new PotionEffect(MobEffects.field_76438_s, 400, 9));
            ((EntityLivingBase) entityIn).func_70690_d(new PotionEffect(MobEffects.field_76421_d, 200, 19));
        }
    }
}