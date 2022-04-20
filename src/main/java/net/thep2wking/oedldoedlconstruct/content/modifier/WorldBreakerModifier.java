package net.thep2wking.oedldoedlconstruct.content.modifier;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;
import slimeknights.tconstruct.library.modifiers.SingleUseModifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class WorldBreakerModifier extends SingleUseModifier 
{
    public WorldBreakerModifier() 
    {
        super(0xffc29ee5);
    }

	@Override
	public ActionResultType afterBlockUse(IModifierToolStack tool, int level, ItemUseContext context) 
	{
		World world = context.getWorld();
		BlockPos pos = context.getPos();
		BlockState state = world.getBlockState(pos);
		Block block = state.getBlock();
		if (state.getBlockHardness(world, pos) <= -1 && ConstructConfig.enable_world_breaker.get())
		{
			if(!world.isRemote)
			{
				world.destroyBlock(context.getPos(), false);
				world.removeBlock(context.getPos(), false);
				if(!context.getPlayer().isCreative())
				{
					world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(block.getBlock().asItem())));
				}
			}
			return ActionResultType.SUCCESS;
		}
		return ActionResultType.FAIL;
	}
}