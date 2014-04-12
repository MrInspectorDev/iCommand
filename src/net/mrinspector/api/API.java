package net.mrinspector.api;

/*
 * API made by RicByte.com
 * 
 * All rights reserved.
 * 
 * By using this API you agree to the terms below:
 * 
 * RicByte is not responsible if your plugin breaks, you're using this API at your own risk.
 * 
 * I, <YOURNAME>, AGREE TO THE TERMS ABOVE, AND I CAN'T HOLD RICBYTE RESPONSIBLE IF SOMETHING
 * HAPPENS WITH THE PLUGIN AND IT IS BROKEN.
 */

/**
 * API broke your plugin?
 * 
 * Impossible! All methods have been tested before being released to the public at least
 * 5 times, it's probably just with your plugin, however if you are 100% sure, please contact
 * us by going to our website: ricbyte.com and clicking Support.
 */

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;

public class API {
	
	/**
	* Broadcast a message with this method: API.debugBroadcast("your debug message here");
	* @param msg
	*/
	public static void debugBroadcast(String msg) {
		Bukkit.broadcastMessage(msg);
	}
	
	/**
	 * Send a message to the console with this method: API.debugConsole("your debug message here");
	 * @param msg
	 */
	public static void debugConsole(String msg) {
		Bukkit.broadcastMessage(msg);
	}
	
	/**
	 * Get a players UUID with this method: API.getUUID(player);
	 * @param player
	 */
	public static void getUUID(Player player) {
		player.getPlayer().getUniqueId().toString();
	}
	
	/**
	 * Unfinished method.
	 * @param location
	 */
	public static void getSpawnLocation(Location location) {
		// TODO: Create spawn
	}
	
	/**
	 * Test method, do not use.
	 * @param player
	 */
	public static void getPlayer(Player player) {
		player.getPlayer();
	}
	
	/**
	* Kill the player with this method: API.killerPlayer(player);
	* @param player
	*/
	public static void killPlayer(Player player) {
		player.setHealth(0.0);
	}
	
	/**
	* Get the player's health with this method (does not require bukkit in your build path): API.getHealth(player);
	* @param player
	*/
	public static void getHealth(Player player) {
		((Damageable) player).getHealth();
	}
	
	/**
	* Method is unfinished.
	* @param location
	*/
	public static void setSpawnLocation(Location location) {
		// TODO: Create spawn
	}
	
	/**
	 * Throw egg method, throw eggs at people.
	 * @param player
	 */
	@SuppressWarnings("deprecation")
	public static void throwEgg(Player player) {
		player.throwEgg();
	}
	
	/**
	 * Shoot arrow method, shoot arrows at people.
	 * @param player
	 */
	@SuppressWarnings("deprecation")
	public static void shootArrow(Player player) {
		player.shootArrow();
	}
	
	/**
	 * Throw snowball method, throw snowballs at people.
	 * @param player
	 */
	@SuppressWarnings("deprecation")
	public static void throwSnowball(Player player) {
		player.throwSnowball();
	}
	
	/**
	 * Method is unfinished.
	 * @param player
	 */
	public static void ban(Player player) {
		player.setBanned(true);
	}
	
	/**
	 * Method is unfinished.
	 * @param player
	 */
	public static void offlineBan(Player player) {
		// TODO: create method
	}
	
	/**
	 * Mehod is unfinished.
	 * @param player
	 */
	public static void UUIDBan(Player player) {
		// TODO: Create method
	}
	
	/**
	 * Kick all players within the server.
	 * @param player
	 */
	public static void kickAll(Player player) {
		for(Player p : Bukkit.getOnlinePlayers()) {
			player.kickPlayer(p.getName());
		}
	}
	
	/**
	 * Ban all players within the server.
	 * @param player
	 */
	public static void banAll(Player player) {
		for(Player p : Bukkit.getOnlinePlayers()) {
			p.setBanned(true);
		}
	}
	
	/**
	 * Get the player's IP.
	 * @param player
	 */
	public static void getIP(Player player) {
		
	}
	
	/**
	 * Add a player a permission.
	 * @param perm
	 */
	public static void addPermission(String perm) {
		
	}
	
	/**
	 * Remove a player's permission.
	 * @param perm
	 */
	public static void removePermission(String perm) {
		
	}
	
	@SuppressWarnings("deprecation")
	public static void updateInventory(Player player) {
		player.updateInventory();
	}
	
	public static void getMaxHealth(Player player) {
		((Damageable) player).getMaxHealth();
	}
	
	@SuppressWarnings("deprecation")
	public static void setMaxHealth(Player player, int integer) {
		((Damageable) player).setMaxHealth(integer);
	}
	
	@SuppressWarnings("deprecation")
	public static void setHealth(Player player, int integer) {
		((Damageable) player).setHealth(integer);
	}
		
}
