package net.mrinspector.api;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;

public class API {
	
	public static void debugBroadcast(String msg) {
		Bukkit.broadcastMessage(msg);
	}
	
	public static void debugConsole(String msg) {
		Bukkit.broadcastMessage(msg);
	}
	
	public static void getUUID(Player player) {
		player.getPlayer().getUniqueId().toString();
	}
	
	public static void getSpawnLocation(Location location) {
		// TODO: Create spawn
	}
	
	public static void killPlayer(Player player) {
		player.setHealth(0.0);
	}
	
	public static void getHealth(Player player) {
		((Damageable) player).getHealth();
	}
	
	public static void setSpawnLocation(Location location) {
		// TODO: Create spawn
	}
		
}
