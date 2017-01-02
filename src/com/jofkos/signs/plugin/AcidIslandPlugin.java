package com.jofkos.signs.plugin;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import com.jofkos.signs.utils.API;
import com.wasteofplastic.acidisland.ASkyBlockAPI;

public class AcidIslandPlugin extends API.APIPlugin {
	
	static {
		clazz = "com.wasteofplastic.acidisland.ASkyBlock";
	}
	
	@Override
	public boolean canBuild(Player player, Block block) {
		return ASkyBlockAPI.getInstance().locationIsOnIsland(player, block.getLocation());
	}

}
