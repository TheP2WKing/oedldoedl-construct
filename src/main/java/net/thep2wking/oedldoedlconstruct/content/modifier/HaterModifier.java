package net.thep2wking.oedldoedlconstruct.content.modifier;

import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;
import slimeknights.tconstruct.library.modifiers.SingleUseModifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class HaterModifier extends SingleUseModifier 
{
    public HaterModifier() 
    {
        super(0x380c70);
    }

    @Override
    public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) 
    {
        LivingEntity target = context.getLivingTarget();
        World world = target.getEntityWorld();

        if (target.isAlive() && !world.isRemote() && ConstructConfig.enable_hater.get())
        {
			target.addPotionEffect(new EffectInstance(Effects.LEVITATION, 100, 100, false, false));
			target.addPotionEffect(new EffectInstance(Effects.GLOWING, 100, 0, false, false));
			target.addPotionEffect(new EffectInstance(Effects.BLINDNESS, 60, 1, false, false));
			target.addPotionEffect(new EffectInstance(Effects.HUNGER, 60, 3, false, false));
			target.addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, 60, 4, false, false));
			target.addPotionEffect(new EffectInstance(Effects.NAUSEA, 60, 3, false, false));
			target.addPotionEffect(new EffectInstance(Effects.POISON, 60, 4, false, false));
			target.addPotionEffect(new EffectInstance(Effects.WITHER, 60, 2, false, false));
			target.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 60, 2, false, false));
			target.addPotionEffect(new EffectInstance(Effects.UNLUCK, 60, 3, false, false));
			target.addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, 60, 0, false, false));
        }
        return super.afterEntityHit(tool, level, context, damageDealt);
    }
}