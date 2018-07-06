package com.wolfythebestyt.furnituremod.init;

import java.util.ArrayList;
import java.util.List;

import com.wolfythebestyt.furnituremod.blocks.BlockBase;
import com.wolfythebestyt.furnituremod.blocks.BirthdayCakeBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block BIRTHDAY_CAKE_BLOCK = new BlockBase("birthday_cake_block", Material.CAKE);
	
}
