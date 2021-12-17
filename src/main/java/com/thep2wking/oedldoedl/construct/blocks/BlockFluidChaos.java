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
		super(fluid, Material.WATER);
	}
	
    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) 
    {
        super.onEntityCollidedWithBlock(worldIn, pos, state, entityIn);
        
        if (entityIn instanceof EntityLivingBase) 
        {
            ((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, 400, 3));
            ((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 400, 3));
            ((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.HUNGER, 200, 3));
            ((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.INSTANT_DAMAGE, 200, 3));
            ((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 400, 3));
            ((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.POISON, 200, 3));
            ((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 400, 3));
            ((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.UNLUCK, 400, 3));
            ((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.WEAKNESS, 400, 3));
            ((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.WITHER, 200, 3));
        }
    }
}