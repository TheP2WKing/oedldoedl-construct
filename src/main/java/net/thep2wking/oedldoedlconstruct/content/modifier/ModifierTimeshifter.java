package net.thep2wking.oedldoedlconstruct.content.modifier;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlconstruct.api.ModSingleModifierBase;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;

public class ModifierTimeshifter extends ModSingleModifierBase {
	public ModifierTimeshifter(String identifier, int color) {
		super(identifier, color);
	}

	@Override
	public void onHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt,
			boolean wasCritical) {
		World world = player.getEntityWorld();
		if (target.isEntityAlive() && !world.isRemote
				&& world.rand.nextFloat() <= ConstructConfig.CONTENT.MODIFIER.TIMESHIFTER_MODIFIER_MOB_HIT_CHANCE
				&& ConstructConfig.CONTENT.MODIFIER.TIMESHIFTER_MODIFIER_CHANGE_TIME) {
			world.setWorldTime(
					world.getWorldTime() + ConstructConfig.CONTENT.MODIFIER.TIMESHIFTER_MODIFIER_SKIPPED_TIME);
		}
	}

	@Override
	public void afterBlockBreak(ItemStack tool, World world, IBlockState state, BlockPos pos, EntityLivingBase player,
			boolean wasEffective) {
		if (wasEffective && !world.isRemote
				&& world.rand.nextFloat() <= ConstructConfig.CONTENT.MODIFIER.TIMESHIFTER_MODIFIER_BLOCK_MINE_CHANCE
				&& ConstructConfig.CONTENT.MODIFIER.TIMESHIFTER_MODIFIER_CHANGE_TIME) {
			world.setWorldTime(
					world.getWorldTime() + ConstructConfig.CONTENT.MODIFIER.TIMESHIFTER_MODIFIER_SKIPPED_TIME);
		}
	}
}