package PvP;

import org.bukkit.Color;
import org.bukkit.plugin.java.JavaPlugin;

import Kits.pvp;

public class Pvpmain extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		getLogger().info(Color.RED + "PvP has been enabled!");
		
		this.getCommand("pvp").setExecutor(new pvp());
	}
	
	@Override
	public void onDisable()
	{
		getLogger().info(Color.RED + "PvP has been disabled!");
	}

}
