package net.thep2wking.oedldoedlconstruct.content.modifier;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;
import slimeknights.tconstruct.library.modifiers.SingleUseModifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class SadisticModifier extends SingleUseModifier 
{
    public SadisticModifier() 
    {
        super(0x49372c);
    }

    @Override
    public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) 
    {
        LivingEntity target = context.getLivingTarget();
        World world = target.getEntityWorld();

        if (target.isAlive() && !world.isRemote() && ConstructConfig.enable_sadistic.get())
        {
			target.addPotionEffect(new EffectInstance(Effects.GLOWING, 100, 0, false, false));
			target.addPotionEffect(new EffectInstance(Effects.BLINDNESS, 100, 0, false, false));
			target.addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, 60, 3, false, false));
			target.setPosition(target.getPosX(), target.getPosY() - 3, target.getPosZ());
        }
        return super.afterEntityHit(tool, level, context, damageDealt);
    }
}