package net.thep2wking.oedldoedlconstruct.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.Tags.IOptionalNamedTag;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;

public class ModTags 
{
	public static class BLocks
	{
		@SuppressWarnings("unused")
		private static Tags.IOptionalNamedTag<Block> createTag(String name)
		{
			return BlockTags.createOptional(new ResourceLocation(OedldoedlConstruct.MODID, name));
		}
		
		@SuppressWarnings("unused")
		private static Tags.IOptionalNamedTag<Block> createForgeTag(String name)
		{
			return BlockTags.createOptional(new ResourceLocation("forge", name));
		}
	}
	
	public static class Items
	{
		@SuppressWarnings("unused")
		private static IOptionalNamedTag<Item> createTag(String name)
		{
			return ItemTags.createOptional(new ResourceLocation(OedldoedlConstruct.MODID, name));
		}

		@SuppressWarnings("unused")
		private static IOptionalNamedTag<Item> createForgeTag(String name)
		{
			return ItemTags.createOptional(new ResourceLocation("forge", name));
		}
	}
}