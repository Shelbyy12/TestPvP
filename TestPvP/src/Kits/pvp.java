package Kits;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import PvP.soup;

public class pvp 
  implements CommandExecutor 
{
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(sender instanceof Player)
		{
			Player player = (Player) sender;
			player.getInventory().clear();
			
			ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
			ItemStack head = new ItemStack(Material.IRON_HELMET);
			ItemStack chest = new ItemStack(Material.IRON_CHESTPLATE);
			ItemStack legs = new ItemStack(Material.IRON_LEGGINGS);
			ItemStack boot = new ItemStack(Material.IRON_BOOTS);
			
			player.getInventory().addItem(sword);
			player.getInventory().setHelmet(head);
			player.getInventory().setChestplate(chest);
			player.getInventory().setLeggings(legs);
			player.getInventory().setBoots(boot);	
			soup.giveSoup(player, 35);
		}
		return true;
	}

}
