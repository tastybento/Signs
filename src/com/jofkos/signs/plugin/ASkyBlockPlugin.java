package com.jofkos.signs.plugin;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import com.jofkos.signs.utils.API;
import com.wasteofplastic.askyblock.ASkyBlockAPI;

public class ASkyBlockPlugin extends API.APIPlugin {
	
	static {
		clazz = "com.wasteofplastic.askyblock.ASkyBlock";
	}
	
	@Override
	public boolean canBuild(Player player, Block block) {
		return ASkyBlockAPI.getInstance().locationIsOnIsland(player, block.getLocation());
	}

}
