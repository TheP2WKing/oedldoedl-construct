package net.thep2wking.oedldoedlconstruct.content.modifier;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;
import net.thep2wking.oedldoedlresources.init.ModItems;
import slimeknights.tconstruct.library.modifiers.ModifierAspect;
import slimeknights.tconstruct.library.modifiers.ModifierTrait;

public class ModifierToujouriusly extends ModifierTrait {
	public ModifierToujouriusly() {
		super("toujouriusly", 0xc0c0c0);
		this.addAspects(new ModifierAspect.SingleAspect(this));
		this.addItem("toujouriumStar");
	}

	@Override
	public String getLocalizedName() {
		return new TextComponentTranslation("modifier." + OedldoedlConstruct.MODID + "." + this.identifier + ".name")
				.getFormattedText();
	}

	@Override
	public String getLocalizedDesc() {
		return new TextComponentTranslation("modifier." + OedldoedlConstruct.MODID + "." + this.identifier + ".desc")
				.getFormattedText();
	}

	@Override
	public void onHit(ItemStack tool, EntityLivingBase player, EntityLivingBase target, float damageDealt,
			boolean wasCritical) {
		if (target != null) {
			World world = target.getEntityWorld();
			if (target.isEntityAlive() && !world.isRemote && world.rand.nextFloat() < 0.1F) {
				EntityItem item = new EntityItem(world, target.posX + 0.5, target.posY, target.posZ + 0.05,
						new ItemStack(ModItems.TOUJOURIUM_SHARD, 1, 0));
				world.spawnEntity(item);
			}
		}
	}

	@Override
	public void afterBlockBreak(ItemStack tool, World world, IBlockState state, BlockPos pos, EntityLivingBase player,
			boolean wasEffective) {
		if (wasEffective && !world.isRemote && random.nextFloat() < 0.02F) {
			EntityItem item = new EntityItem(world, pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5,
					new ItemStack(ModItems.TOUJOURIUM_SHARD, 1, 0));
			world.spawnEntity(item);
		}
	}

	@Override
	public void onUpdate(ItemStack tool, World world, Entity entity, int itemSlot, boolean isSelected) {
		if (entity.isEntityAlive() && isSelected && ConstructConfig.PROPERTIES.EFFECTS.TCONSTRUCT.TINKERS_TOOLS_EFFECTS
				&& ConstructConfig.PROPERTIES.EFFECTS.EFFECTS_EBALED) {
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, 19,
					ConstructConfig.PROPERTIES.EFFECTS.TCONSTRUCT.TINKERS_TOOLS_BASE_AMPLIFIER - 1, false, false));
		}
	}
}