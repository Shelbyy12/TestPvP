package PvP;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class soup implements Listener
{
	@EventHandler
	public void OnSoup(PlayerInteractEvent event)
	{
		Action action = event.getAction();
		if(action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK))
		{
			Player player = event.getPlayer();
			if(player.getItemInHand().getType().equals(Material.MUSHROOM_SOUP))
			{
				if(player.getHealth() < 20)
				{
					ItemStack bowl = new ItemStack(Material.BOWL);
					player.setItemInHand(bowl);
					double health = player.getHealth();
					player.setHealth(Math.min(health + 7, 20));			
				}
			}
		}
	}
	
	@EventHandler
	public void onHungerDeplete(FoodLevelChangeEvent event)
	{
		Player player = (Player)event.getEntity();
		player.setFoodLevel(20);
		event.setCancelled(true);
	}
	
	public static void giveSoup(Player player, int soup)
	{
		for(int i = 0; i < soup; i++)
		{
			ItemStack soups = new ItemStack(Material.MUSHROOM_SOUP);
			ItemMeta soupsm = soups.getItemMeta();
			String soupname = ChatColor.RED + "Soup";
			soupsm.setDisplayName(soupname);
			soups.setItemMeta(soupsm);
			player.getInventory().addItem(soups);
		}
	}

}
