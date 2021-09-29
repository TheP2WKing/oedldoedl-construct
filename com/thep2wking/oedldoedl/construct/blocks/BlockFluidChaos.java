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

public class BlockFluidChaos extends BlockTinkerFluid 
{
	public BlockFluidChaos(Fluid fluid)
	{
		super(fluid, Material.field_151586_h);
	}
	
    @Override
    public void func_180634_a(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) 
    {
        super.func_180634_a(worldIn, pos, state, entityIn);
        
        if (entityIn instanceof EntityLivingBase) 
        {
            ((EntityLivingBase) entityIn).func_70690_d(new PotionEffect(MobEffects.field_76440_q, 400, 3));
            ((EntityLivingBase) entityIn).func_70690_d(new PotionEffect(MobEffects.field_76431_k, 400, 3));
            ((EntityLivingBase) entityIn).func_70690_d(new PotionEffect(MobEffects.field_76438_s, 200, 3));
            ((EntityLivingBase) entityIn).func_70690_d(new PotionEffect(MobEffects.field_76433_i, 200, 3));
            ((EntityLivingBase) entityIn).func_70690_d(new PotionEffect(MobEffects.field_76419_f, 400, 3));
            ((EntityLivingBase) entityIn).func_70690_d(new PotionEffect(MobEffects.field_76436_u, 200, 3));
            ((EntityLivingBase) entityIn).func_70690_d(new PotionEffect(MobEffects.field_76421_d, 400, 3));
            ((EntityLivingBase) entityIn).func_70690_d(new PotionEffect(MobEffects.field_189112_A, 400, 3));
            ((EntityLivingBase) entityIn).func_70690_d(new PotionEffect(MobEffects.field_76437_t, 400, 3));
            ((EntityLivingBase) entityIn).func_70690_d(new PotionEffect(MobEffects.field_82731_v, 200, 3));
        }
    }
}