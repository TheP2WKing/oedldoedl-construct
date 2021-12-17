package com.thep2wking.oedldoedl.construct.items;

import java.util.List;

import com.thep2wking.oedldoedl.construct.OedldoedlConstruct;
import com.thep2wking.oedldoedl.construct.ReferenceConstruct;
import com.thep2wking.oedldoedl.core.OedldoedlCore;
import com.thep2wking.oedldoedl.core.config.CoreConfig;
import com.thep2wking.oedldoedl.core.init.RarityInit;
import com.thep2wking.oedldoedl.core.util.interfaces.IHasModel;
import com.thep2wking.oedldoedl.core.util.tooltips.TooltipShiftInfo;
import com.thep2wking.oedldoedl.resources.init.ItemInit;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemInfinityModifier extends Item implements IHasModel
{
	public ItemInfinityModifier(String name)
	{
		setUnlocalizedName(ReferenceConstruct.MODID+":"+name);
		setRegistryName(ReferenceConstruct.MODID+":"+name);
		setCreativeTab(OedldoedlConstruct.TAB);
		setMaxStackSize(1);
		ItemInit.ITEMS.add(this);
	}

	@Override
	@SideOnly (Side.CLIENT)
	public void registerModels()
	{
		OedldoedlCore.proxy.registerItemRenderer(this, 0, "inventory");
	}

    @Override
    @SideOnly (Side.CLIENT)
    public EnumRarity getRarity(ItemStack stack)
    {
    	return RarityInit.LIGHT_PURPLE;
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World world, List<String> tooltip, ITooltipFlag advanced)
	{
  		if (CoreConfig.GENEREL.tooltips.itemInformation)
  		{
  			TooltipShiftInfo.addTooltipText(tooltip, new String[]
  			{
  				TextFormatting.GREEN+I18n.format("item.oedldoedl.infinity_modifier.tip"),
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.format("item.oedldoedl.infinity_modifier.tip2"),
  			});
  		}
	}
}