package com.jannesoon.enhancedarmanents.util;

import com.jannesoon.enhancedarmanents.client.gui.GuiAbilitySelection;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	public static final int ABILITY_SELECTION = 0;
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{		
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if (ID == ABILITY_SELECTION)
			return new GuiAbilitySelection();
		
		return null;
	}
}