package dev.leho.oneplayersleep;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.util.io.BukkitObjectInputStream;

public class EventListener implements Listener {
	
	private final OnePlayerSleep ops;
	
	public EventListener(OnePlayerSleep ops) {
		this.ops = ops;
	}
	
	@EventHandler
	public void onSleep(PlayerBedEnterEvent e) {
//		Bukkit.getWorld("Overworld").setFullTime(255);
        Player sleeper = (Player) e.getPlayer();
		e.getBed().getWorld().setFullTime(255);
		Bukkit.broadcastMessage(ChatColor.GREEN + sleeper.getDisplayName().toString() + ChatColor.RESET + " Has Slept. Setting The Time To Day!");
	}

}
