package net.mrinspector.icommand;

import net.mrinspector.commands.CommandExt;
import net.mrinspector.listener.Events;
import net.mrinspector.tps.Lag;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class iCommand extends JavaPlugin implements Listener {

	public void onEnable() {
		
		// Enabling
		
		System.out.println("Loading plugin...");
		
		// Register events
			
		System.out.println("Registering events...");
		
		Bukkit.getPluginManager().registerEvents(new Events(this), this);
		
		// Register commands
		
		System.out.println("Registering commands...");
		
		loadExt();
		
		// Generate config
		
	    getConfig().options().copyDefaults(true);
	    saveDefaultConfig();
	    
	    System.out.println("Generating config...");

	    // Other
	    Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Lag(), 100L, 1L);
	    System.out.println("Other...");
	    
		// Loaded plugin
		
		System.out.println("sSecurity loaded in!");
		
	}
	
	public void loadExt(){
		setExecutor("extinguish", new CommandExt());
	}
	
	public void setExecutor(String command, CommandExecutor ce){
		Bukkit.getPluginCommand(command).setExecutor(ce);
		}
	}
