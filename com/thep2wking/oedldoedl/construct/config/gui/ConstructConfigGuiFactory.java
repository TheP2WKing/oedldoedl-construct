package com.thep2wking.oedldoedl.construct.config.gui;

import java.util.Set;

import javax.annotation.Nullable;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;
import net.minecraftforge.fml.client.IModGuiFactory.RuntimeOptionCategoryElement;

public class ConstructConfigGuiFactory implements IModGuiFactory 
{
    @Override
    public void initialize(Minecraft minecraftInstance)
    {

    }

    @Override
    public boolean hasConfigGui() 
    {
        return true;
    }

    @Override
    public GuiScreen createConfigGui(GuiScreen parentScreen) 
    {
        return new ConstructConfigGui(parentScreen);
    }

    @Nullable
    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() 
    {
        return null;
    }
}