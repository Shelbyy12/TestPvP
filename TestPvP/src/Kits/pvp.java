package Kits;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class pvp 
{
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(sender instanceof Player)
		{
			Player player = (Player) sender;
			
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
		}
		return true;
	}

}
