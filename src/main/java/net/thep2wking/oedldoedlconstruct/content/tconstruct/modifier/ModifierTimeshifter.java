package net.thep2wking.oedldoedlconstruct.content.tconstruct.modifier;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import slimeknights.tconstruct.library.modifiers.ModifierAspect;
import slimeknights.tconstruct.library.modifiers.ModifierTrait;

public class ModifierTimeshifter extends ModifierTrait {
	public ModifierTimeshifter() {
		super("timeshifter", 0xb5c7c5);
		this.addAspects(new ModifierAspect.SingleAspect(this));
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
			if (target.isEntityAlive() && !world.isRemote && world.rand.nextFloat() < 0.75F && player.isSneaking()) {
				world.setWorldTime(world.getWorldTime() + 1000);
			}
		}
	}

	@Override
	public void afterBlockBreak(ItemStack tool, World world, IBlockState state, BlockPos pos, EntityLivingBase player,
			boolean wasEffective) {
		if (wasEffective && !world.isRemote && random.nextFloat() < 0.1F && player.isSneaking()) {
			world.setWorldTime(world.getWorldTime() + 1000);
		}
	}
}