package net.thep2wking.oedldoedlconstruct.content.modifier;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;
import slimeknights.tconstruct.library.modifiers.SingleUseModifier;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class MagicianModifier extends SingleUseModifier 
{
    public MagicianModifier() 
    {
        super(0x528db3);
    }
    
    @Override
    public ActionResultType onToolUse(IModifierToolStack tool, int level, World world, PlayerEntity player, Hand hand) 
    {
    	if (!world.isRemote() && ConstructConfig.enable_magician.get())
    	{
	    	player.clearActivePotions();
			return ActionResultType.SUCCESS;
    	}
    	return ActionResultType.FAIL;
    }
}