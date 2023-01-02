package me.notlewx.gamemode;

import me.notlewx.gamemode.listeners.ArenaListener;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        if (Bukkit.getPluginManager().getPlugin("BedWars1058") == null) {
            getLogger().severe("BedWars1058 was not found. Disabling...");
            Bukkit.getPluginManager().disablePlugin(this);
            return;
        }
        else {
            System.out.println(ChatColor.translateAlternateColorCodes('&', "[BedWars1058-AdventureMode] &aBedWars1058 found... Hooking!"));
        }
        getServer().getPluginManager().registerEvents(new ArenaListener(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
