package net.thep2wking.oedldoedlconstruct.config.categories;

import net.minecraftforge.common.config.Config;

public class Properties {
	@Config.Name("effects")
	public final Effects EFFECTS = new Effects();

	public static class Effects {
		@Config.Name("Potion Effects Enabled")
		public boolean EFFECTS_EBALED = true;

		@Config.Name("fluids")
		public final Fluids FLUIDS = new Fluids();

		@Config.Name("tconstruct")
		public final TConstruct TCONSTRUCT = new TConstruct();
	}

	public static class Fluids {
		@Config.Name("Fluid Effects Enabled")
		public boolean FLUID_EFFECTS = true;

		@Config.Name("Fluid Base Amplifier")
		@Config.RangeInt(min = 1, max = 255)
		public int FLUID_BASE_AMPLIFIER = 3;

		@Config.Name("Fluid Base Duration")
		@Config.RangeInt(min = 10, max = 72000)
		public int FLUID_BASE_DURATION = 200;
	}

	public static class TConstruct {
		@Config.Name("Tinkers Tools Effects Enabled")
		public boolean TINKERS_TOOLS_EFFECTS = true;

		@Config.Name("Tinkers Tools Base Amplifier")
		@Config.RangeInt(min = 1, max = 255)
		public int TINKERS_TOOLS_BASE_AMPLIFIER = 2;
	}

	@Config.Name("modifier")
	public final Modifier MODIFIER = new Modifier();

	public static class Modifier {
		@Config.Name("Modifier Shard Mob Drop Chance")
		@Config.RangeDouble(min = 0, max = 1)
		public double MODIFIER_SHARD_MOB_DROP_CHANCE = 0.1;

		@Config.Name("Modifier Shard Block Drop Chance")
		@Config.RangeDouble(min = 0, max = 1)
		public double MODIFIER_SHARD_BLOCK_DROP_CHANCE = 0.02;
	}
}