package net.thep2wking.oedldoedlconstruct.content.block;

import java.util.Random;
import java.util.function.Supplier;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;
import net.thep2wking.oedldoedlconstruct.util.ModDamageSources;
import net.thep2wking.oedldoedlcore.api.ModFlowingFluidBlockBase;

public class SuperheatedLavaFluidBlock extends ModFlowingFluidBlockBase
{
	public SuperheatedLavaFluidBlock(Supplier<? extends FlowingFluid> supplier, int lightLevel, Properties properties) 
	{
		super(supplier, lightLevel, properties);
	}

	@Override
	public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) 
	{
		if (entityIn instanceof LivingEntity)
		{
			if(!ConstructConfig.lava_inactive.get())
			{
				entityIn.attackEntityFrom(ModDamageSources.SUPERHEATED, 12f);
			}
		}
	}
	
	@Override
	public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving)
	{
		if(!ConstructConfig.lava_inactive.get())
		{
			super.onBlockAdded(state, worldIn, pos, oldState, isMoving);
			worldIn.setBlockState(pos.down(), Blocks.AIR.getDefaultState());
			worldIn.playSound(null, pos, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.2f, 1f);
			((ServerWorld) worldIn).spawnParticle(ParticleTypes.SMOKE, pos.getX(), pos.getY(), pos.getZ(), 10, 0.5d, 0.5d, 0.5d, 0);
		}
		else
		{
			super.onBlockAdded(state, worldIn, pos, oldState, isMoving);
		}
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) 
	{
		if (worldIn.isAirBlock(pos.up()) && worldIn.getGameTime() % 5 == 0) 
		{
			float xx = (float) pos.getX() + 0.5F;
			float zz = (float) pos.getZ() + 0.5F;
			float fixedOffset = 0.25F;
			float randomOffset = rand.nextFloat() * 0.6F - 0.3F;
			
			if(!ConstructConfig.lava_inactive.get())
			{
				worldIn.addParticle(ParticleTypes.LAVA, true, (double) (xx - fixedOffset), (double) pos.getY() + 0.8D, (double) (zz + randomOffset), 0.0D, 0.0D, 0.0D);
				worldIn.addParticle(ParticleTypes.LAVA, true, (double) (xx + fixedOffset), (double) pos.getY() + 0.8D, (double) (zz + randomOffset), 0.0D, 0.0D, 0.0D);
				worldIn.addParticle(ParticleTypes.LAVA, true, (double) (xx + randomOffset), (double) pos.getY() + 0.8D, (double) (zz - fixedOffset), 0.0D, 0.0D, 0.0D);
				worldIn.addParticle(ParticleTypes.LAVA, true, (double) (xx + randomOffset), (double) pos.getY() + 0.8D, (double) (zz + fixedOffset), 0.0D, 0.0D, 0.0D);
			}
		}
	}
}