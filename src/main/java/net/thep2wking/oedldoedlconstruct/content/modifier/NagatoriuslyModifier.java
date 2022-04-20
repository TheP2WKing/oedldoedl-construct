package net.thep2wking.oedldoedlconstruct.content.modifier;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.registries.ForgeRegistries;
import net.thep2wking.oedldoedlconstruct.config.ConstructConfig;
import net.thep2wking.oedldoedlresources.OedldoedlResources;
import slimeknights.tconstruct.library.modifiers.Modifier;
import slimeknights.tconstruct.library.tools.context.ToolAttackContext;
import slimeknights.tconstruct.library.tools.context.ToolHarvestContext;
import slimeknights.tconstruct.library.tools.nbt.IModifierToolStack;

public class NagatoriuslyModifier extends Modifier 
{
    public NagatoriuslyModifier() 
    {
        super(0x650fc1);
    }

    @Override
    public int afterEntityHit(IModifierToolStack tool, int level, ToolAttackContext context, float damageDealt) 
    {
        LivingEntity target = context.getLivingTarget();
        if (target != null) 
        {
            World world = target.getEntityWorld();
            if (!target.isAlive() && !world.isRemote() && world.getRandom().nextFloat() < 0.05F * level && ConstructConfig.enable_shard_drop.get()) 
            {
                Item shard = ForgeRegistries.ITEMS.getValue(new ResourceLocation(OedldoedlResources.MODID, "nagatorium_shard"));
                ItemEntity item = new ItemEntity(world, target.getPosX() + 0.5, target.getPosY(), target.getPosZ() + 0.05, new ItemStack(shard));
                world.addEntity(item);
            }
        }
        return super.afterEntityHit(tool, level, context, damageDealt);
    }

    @Override
    public void afterBlockBreak(IModifierToolStack tool, int level, ToolHarvestContext context) 
    {
        ServerWorld world = context.getWorld();
        if (context.isEffective() && !world.isRemote() && world.getRandom().nextFloat() < 0.01F * level && ConstructConfig.enable_shard_drop.get()) 
        {
            Item shard = ForgeRegistries.ITEMS.getValue(new ResourceLocation(OedldoedlResources.MODID, "nagatorium_shard"));
            BlockPos pos = context.getPos();
            ItemEntity item = new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(shard));
            world.addEntity(item);
        }
    }
    
    @Override
    public void onInventoryTick(IModifierToolStack tool, int level, World world, LivingEntity holder, int itemSlot, boolean isSelected, boolean isCorrectSlot, ItemStack stack) 
    {
    	if(isSelected && isCorrectSlot && ConstructConfig.tinker_tools_effects_enabled.get() && ConstructConfig.effects_enabled.get()) 
    	{
    		holder.addPotionEffect(new EffectInstance(Effects.UNLUCK, 19, ConstructConfig.tinker_tools_base_amplifier.get() - 1, false, false));
    	}
    }
}