package PvP;

import org.bukkit.Color;
import org.bukkit.plugin.java.JavaPlugin;

public class Pvpmain extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		getLogger().info(Color.RED + "PvP has been enabled!");
	}
	
	@Override
	public void onDisable()
	{
		getLogger().info(Color.RED + "PvP has been disabled!");
	}

}
