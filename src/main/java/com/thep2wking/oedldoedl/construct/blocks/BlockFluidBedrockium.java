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
		super(fluid, Material.LAVA);
	}
	
    @Override
    public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) 
    {
        super.onEntityCollidedWithBlock(worldIn, pos, state, entityIn);
        
        if (entityIn instanceof EntityLivingBase) 
        {
            ((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.HUNGER, 400, 9));
            ((EntityLivingBase) entityIn).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 200, 19));
        }
    }
}