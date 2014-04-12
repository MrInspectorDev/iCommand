package net.mrinspector.api;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;

public class API {
	
	/*
	Broadcast a message with this method: API.debugBroadcast("your debug message here");
	*/
	public static void debugBroadcast(String msg) {
		Bukkit.broadcastMessage(msg);
	}
	
	/*
	Send a message to the console with this method: API.debugConsole("your debug message here");
	*/
	public static void debugConsole(String msg) {
		Bukkit.broadcastMessage(msg);
	}
	
	/*
	Get a players UUID with this method: API.getUUID(player);
	*/
	public static void getUUID(Player player) {
		player.getPlayer().getUniqueId().toString();
	}
	
	/*
	Method is unfinished.
	*/
	public static void getSpawnLocation(Location location) {
		// TODO: Create spawn
	}
	
	/*
	Kill the player with this method: API.killerPlayer(player);
	*/
	public static void killPlayer(Player player) {
		player.setHealth(0.0);
	}
	
	/*
	Get the player's health with this method (does not require bukkit in your build path): API.getHealth(player);
	*/
	public static void getHealth(Player player) {
		((Damageable) player).getHealth();
	}
	
	/*
	Method is unfinished.
	*/
	public static void setSpawnLocation(Location location) {
		// TODO: Create spawn
	}
		
}
