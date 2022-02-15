package net.thep2wking.oedldoedlconstruct.integration.modifier;

import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;
import net.thep2wking.oedldoedlconstruct.util.ModDamageSources;
import slimeknights.tconstruct.library.modifiers.SingleUseModifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class InfinityModifier extends SingleUseModifier 
{
    public InfinityModifier() 
    {
        super(0xff0000);
    }

    @Override
    public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) 
    {
        LivingEntity target = context.getLivingTarget();
        World world = target.getEntityWorld();

        if (target.isAlive() && !world.isRemote() && ConstructConfig.enable_infinity.get())
        {
			target.attackEntityFrom(ModDamageSources.INFINITY, Integer.MAX_VALUE);
			target.setHealth(0);
        }
        return super.afterEntityHit(tool, level, context, damageDealt);
    }
}