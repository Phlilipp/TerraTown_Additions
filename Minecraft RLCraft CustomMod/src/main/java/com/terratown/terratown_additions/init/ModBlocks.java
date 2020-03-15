package com.terratown.terratown_additions.init;

import java.util.ArrayList;
import java.util.List;

import com.terratown.terratown_additions.blocks.BlockBase;
import com.terratown.terratown_additions.blocks.Fishglass;
import com.terratown.terratown_additions.blocks.SugarcaneBlock;
import com.terratown.terratown_additions.blocks.SugarcaneBlockDeco;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//List of blocks with name and type of block
	public static final Block SUGARCANE_BLOCK = new SugarcaneBlock("sugarcane_block", Material.GRASS, SoundType.PLANT);
	public static final Block FISHGLASS = new Fishglass("fishglass", Material.GLASS, SoundType.GLASS);
	
	//decorative blocks
	public static final Block SUGARCANE_BLOCK_DECO = new SugarcaneBlockDeco("sugarcane_block_deco", Material.GRASS, SoundType.PLANT);
	
}
