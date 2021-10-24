package dev.leho.oneplayersleep;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class OnePlayerSleep extends JavaPlugin {
	
	@Override
	public void onEnable() {
	    Bukkit.getServer().getPluginManager().registerEvents(new EventListener(this), this);
		System.out.println("One Player Sleep Started!");
	}
	
	@Override
	public void onDisable() {
		System.out.println("One Player Sleep Stopped!");
	}

}
