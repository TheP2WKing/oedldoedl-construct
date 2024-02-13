package net.thep2wking.oedldoedlconstruct.config.categories;

import net.minecraftforge.common.config.Config;

public class Content {
	@Config.Name("Enable Custom Tool Forges")
	public boolean CUSTOM_TOOL_FORGES = true;

	@Config.Name("Enable Tinkers Book Modifier Entries")
	public boolean TINKERS_BOOK_MODIFIER_ENTRIES = true;

	@Config.Name("modifier")
	public final Modifier MODIFIER = new Modifier();

	public static class Modifier {

	}
}