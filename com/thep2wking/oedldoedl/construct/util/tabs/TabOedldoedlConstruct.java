package com.thep2wking.oedldoedl.construct.util.tabs;

import com.thep2wking.oedldoedl.construct.OedldoedlConstruct;
import com.thep2wking.oedldoedl.construct.ReferenceConstruct;
import com.thep2wking.oedldoedl.construct.init.BlockInit;
import com.thep2wking.oedldoedl.construct.integration.tcon.tools.OedldoedlTinkerTools;
import com.thep2wking.oedldoedl.core.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.ForgeModContainer;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.UniversalBucket;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import slimeknights.tconstruct.library.events.TinkerEvent;
import slimeknights.tconstruct.library.events.TinkerToolEvent;
import slimeknights.tconstruct.tools.TinkerMaterials;
import slimeknights.tconstruct.tools.TinkerTools;

public class TabOedldoedlConstruct extends CreativeTabs
{
	public TabOedldoedlConstruct(String label)
	{
		super("tab_oedldoedl_construct");
		func_78025_a("oedldoedl_base.png");
	}
	
	public ItemStack func_78016_d()
	{
		return new ItemStack(ItemInit.ITEM_ICON_CONSTRUCT);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void func_78018_a(NonNullList<ItemStack> itemList)
	{
		super.func_78018_a(itemList);
	    
		for (Fluid bucketFluid : FluidRegistry.getBucketFluids())
		{
			if (bucketFluid.getBlock() != null && bucketFluid.getBlock().getRegistryName().func_110624_b().equals(ReferenceConstruct.MODID))
			{
				ItemStack itemstack = UniversalBucket.getFilledBucket(ForgeModContainer.getInstance().universalBucket, bucketFluid);
				itemList.add(itemstack);
			}
		}
	}
}