package net.thep2wking.oedldoedlconstruct.api;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;

/**
 * @author TheP2WKing
 */
public class ModSingleModifierEffectBase extends ModSingleModifierBase {
	public final Potion effect;
	public final Item drop;

	/**
	 * @author TheP2WKing
	 * @param identifier String
	 * @param color      int
	 * @param effect     {@link Potion}
	 * @param drop       {@link Item}
	 */
	public ModSingleModifierEffectBase(String identifier, int color, Potion effect, Item drop) {
		super(identifier, color);
		this.effect = effect;
		this.drop = drop;
	}

	/**
	 * @author TheP2WKing
	 * @param identifier          String
	 * @param color               int
	 * @param modifierItemOreDict String
	 * @param effect              {@link Potion}
	 * @param drop                {@link Item}
	 */
	public ModSingleModifierEffectBase(String identifier, int color, String modifierItemOreDict, Potion effect,
			Item drop) {
		super(identifier, color, modifierItemOreDict);
		this.effect = effect;
		this.drop = drop;
	}

	@Override
	public void onHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt,
			boolean wasCritical) {
		if (target != null) {
			World world = player.getEntityWorld();
			if (target.isEntityAlive() && !world.isRemote
					&& world.rand.nextFloat() <= ConstructConfig.PROPERTIES.MODIFIER.MODIFIER_SHARD_MOB_DROP_CHANCE) {
				EntityItem item = new EntityItem(world, target.posX + 0.5, target.posY, target.posZ + 0.05,
						new ItemStack(drop, 1, 0));
				world.spawnEntity(item);
			}
		}
	}

	@Override
	public void afterBlockBreak(ItemStack tool, World world, IBlockState state, BlockPos pos, EntityLivingBase player,
			boolean wasEffective) {
		if (wasEffective && !world.isRemote
				&& random.nextFloat() <= ConstructConfig.PROPERTIES.MODIFIER.MODIFIER_SHARD_BLOCK_DROP_CHANCE) {
			EntityItem item = new EntityItem(world, pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5,
					new ItemStack(drop, 1, 0));
			world.spawnEntity(item);
		}
	}

	@Override
	public void onUpdate(ItemStack tool, World world, Entity entity, int itemSlot, boolean isSelected) {
		if (entity.isEntityAlive() && isSelected && ConstructConfig.PROPERTIES.EFFECTS.TCONSTRUCT.TINKERS_TOOLS_EFFECTS
				&& ConstructConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED) {
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(effect, 19,
					ConstructConfig.PROPERTIES.EFFECTS.TCONSTRUCT.TINKERS_TOOLS_BASE_AMPLIFIER - 1, false, false));
		}
	}
}