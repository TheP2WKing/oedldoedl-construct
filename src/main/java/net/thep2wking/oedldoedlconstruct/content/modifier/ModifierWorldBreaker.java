package net.thep2wking.oedldoedlconstruct.content.modifier;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import slimeknights.tconstruct.library.modifiers.ModifierAspect;
import slimeknights.tconstruct.library.modifiers.ModifierTrait;
import slimeknights.tconstruct.library.utils.TagUtil;
import slimeknights.tconstruct.library.utils.TinkerUtil;
import slimeknights.tconstruct.library.utils.ToolHelper;

public class ModifierWorldBreaker extends ModifierTrait {
	public ModifierWorldBreaker() {
		super("world_breaker", 0xc29ee5);
		this.addAspects(new ModifierAspect.SingleAspect(this));
		this.addItem("remoteBreaker");
		MinecraftForge.EVENT_BUS.register(this);
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
	public void beforeBlockBreak(ItemStack tool, BreakEvent event) {
		World world = event.getWorld();
		BlockPos pos = event.getPos();
		IBlockState state = world.getBlockState(pos);
		Block block = state.getBlock();
		if (state.getBlockHardness(world, pos) <= -1) {
			if (!world.isRemote) {
				world.destroyBlock(pos, false);
				world.setBlockToAir(pos);
				if (!event.getPlayer().isCreative()) {
					world.spawnEntity(new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(),
							new ItemStack(block)));
				}
			}
		}
	}

	@SubscribeEvent
	public void onLeftClick(PlayerInteractEvent.LeftClickBlock event) {
		World world = event.getWorld();
		BlockPos pos = event.getPos();
		IBlockState state = world.getBlockState(pos);
		Block block = state.getBlock();
		EntityPlayer player = event.getEntityPlayer();
		ItemStack tool = player.getHeldItemMainhand();
		if ((TinkerUtil.hasModifier(TagUtil.getTagSafe(tool), this.getIdentifier())
				|| TinkerUtil.hasTrait(TagUtil.getTagSafe(tool), this.getIdentifier()))
				&& ToolHelper.getCurrentDurability(tool) >= 1) {
			if (state.getBlockHardness(world, pos) <= -1 && !world.isRemote) {
				if (!player.isCreative()) {
					world.destroyBlock(pos, false);
					world.setBlockToAir(pos);
					world.spawnEntity(new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(block)));
					ToolHelper.damageTool(tool, 1, player);
				}
			}
		}
	}
}