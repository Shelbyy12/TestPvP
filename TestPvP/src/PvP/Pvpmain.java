package PvP;

import org.bukkit.Color;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import Kits.pvp;

public class Pvpmain extends JavaPlugin implements Listener
{
	@Override
	public void onEnable()
	{
		getLogger().info(Color.RED + "PvP has been enabled!");
		
		this.getCommand("pvp").setExecutor(new pvp());
		
		getServer().getPluginManager().registerEvents(new soup(), this);
		
		
	}
	
	@Override
	public void onDisable()
	{
		getLogger().info(Color.RED + "PvP has been disabled!");
	}

}
