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
		@Config.Name("Hater Modifier Levitation Effect")
		public boolean HATER_MODIFIER_LEVITATION_EFFECT = true;

		@Config.Name("Hater Modifier Potion Effects")
		public boolean HATER_MODIFIER_POTION_EFFECTS = true;

		@Config.Name("Hater Modifier Potion Duration")
		@Config.RangeInt(min = 10, max = 72000)
		public int HATER_MODIFIER_POTION_DURATION = 80;

		@Config.Name("Infinity Modifier Infinite Damage")
		public boolean INFINITY_MODIFIER_INFINITE_DAMAGE = true;

		@Config.Name("Levitating Modifier Levitation Effects")
		public boolean LEVITATING_MODIFIER_LEVITATION_EFFECT = true;

		@Config.Name("Levitating Modifier Levitation Duration")
		@Config.RangeInt(min = 10, max = 72000)
		public int LEVITATING_MODIFIER_LEVITATION_DURATION = 100;

		@Config.Name("Rich Modifier Sound")
		public boolean RICH_MODIFIER_SOUND = true;

		@Config.Name("Sadistic Modifier Potion Effects")
		public boolean SADISTIC_MODIFIER_POTION_EFFECTS = true;

		@Config.Name("Sadistic Modifier Potion Duration")
		@Config.RangeInt(min = 10, max = 72000)
		public int SADISTIC_MODIFIER_POTION_DURATION = 60;

		@Config.Name("Sadistic Modifier Down Teleport")
		public boolean SADISTIC_MODIFIER_DOWN_TELEPORT = true;

		@Config.Name("Sadistic Modifier Blocks Teleported Down")
		@Config.RangeInt(min = 0, max = 100)
		public int SADISTIC_MODIFIER_BLOCKS_TELEPORTED_DOWN = 3;

		@Config.Name("Sunburnt Modifier Exinguish Fire")
		public boolean SUNBURNT_MODIFIER_EXTINGUISH_FIRE = true;

		@Config.Name("Sunburnt Modifier Fire Duration")
		@Config.RangeInt(min = 0, max = 72000)
		public int SUNBURNT_MODIFIER_FIRE_DURATION = 100;

		@Config.Name("Timeshifter Modifier Change Time")
		public boolean TIMESHIFTER_MODIFIER_CHANGE_TIME = true;

		@Config.Name("Timeshifter Modifier Skipped Time")
		@Config.RangeInt(min = 0, max = 24000)
		public int TIMESHIFTER_MODIFIER_SKIPPED_TIME = 500;

		@Config.Name("Timeshifter Modifier Mob Hit Chance")
		@Config.RangeDouble(min = 0, max = 1)
		public double TIMESHIFTER_MODIFIER_MOB_HIT_CHANCE = 0.5;

		@Config.Name("Timeshifter Modifier Block Mine Chance")
		@Config.RangeDouble(min = 0, max = 1)
		public double TIMESHIFTER_MODIFIER_BLOCK_MINE_CHANCE = 0.1;

		@Config.Name("World Breaker Modifier Breaks Unbreakable")
		public boolean WORLD_BREAKER_MODIFIER_BREAKS_UNBREAKABLE = true;
	}
}