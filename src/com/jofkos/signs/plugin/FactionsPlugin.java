package com.jofkos.signs.plugin;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import com.jofkos.signs.utils.API;
import com.massivecraft.factions.engine.EngineMain;
import com.massivecraft.massivecore.ps.PS;

public class FactionsPlugin extends API.APIPlugin {
	
	static {
		clazz = "com.massivecraft.factions.Factions";
	}
		
	public FactionsPlugin() {
	}
	
	@Override
	public boolean canBuild(Player player, Block block) {
			return EngineMain.canPlayerBuildAt(player, PS.valueOf(block), true);
	}

}
