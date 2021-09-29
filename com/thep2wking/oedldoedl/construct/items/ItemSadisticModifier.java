package com.thep2wking.oedldoedl.construct.items;

import java.util.List;

import com.thep2wking.oedldoedl.construct.OedldoedlConstruct;
import com.thep2wking.oedldoedl.construct.ReferenceConstruct;
import com.thep2wking.oedldoedl.core.OedldoedlCore;
import com.thep2wking.oedldoedl.core.config.constants.CoreConst;
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

public class ItemSadisticModifier extends Item implements IHasModel
{
	public ItemSadisticModifier(String name)
	{
		func_77655_b(ReferenceConstruct.MODID+":"+name);
		setRegistryName(ReferenceConstruct.MODID+":"+name);
		func_77637_a(OedldoedlConstruct.TAB);
		func_77625_d(1);
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
    public EnumRarity func_77613_e(ItemStack stack)
    {
    	return RarityInit.AQUA;
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void func_77624_a(ItemStack stack, World world, List<String> tooltip, ITooltipFlag advanced)
	{
  		if (CoreConst.ITEM_INFORMATION)
  		{
  			TooltipShiftInfo.addTooltipText(tooltip, new String[]
  			{
  				TextFormatting.GREEN+I18n.func_135052_a("item.oedldoedl.sadistic_modifier.tip"),
  				TextFormatting.WHITE+""+TextFormatting.ITALIC+I18n.func_135052_a("item.oedldoedl.sadistic_modifier.tip2"),
  			});
  		}
	}
}