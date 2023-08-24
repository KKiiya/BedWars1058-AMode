package me.notlewx.gamemode;

import com.tomkeuper.bedwars.api.BedWars;
import me.notlewx.gamemode.listeners.ArenaListenerBW1058;
import me.notlewx.gamemode.listeners.ArenaListenerBW2023;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        if (!Bukkit.getPluginManager().isPluginEnabled("BedWars1058") && !Bukkit.getPluginManager().isPluginEnabled("BedWars2023") ) {
            getLogger().severe("BedWars1058 or BedWars2023  was not found. Disabling...");
            setEnabled(false);
            return;
        }
        if (Bukkit.getPluginManager().isPluginEnabled("BedWars1058")){
            System.out.println(ChatColor.translateAlternateColorCodes('&', "[BedWars1058-AdventureMode] &aBedWars1058 found... Hooking!"));
            System.out.println(ChatColor.translateAlternateColorCodes('&', "[BedWars1058-AdventureMode] &aRunning on" + "&b" + getServer().getVersion()));
            getServer().getPluginManager().registerEvents(new ArenaListenerBW1058(), this);
        } else if (Bukkit.getPluginManager().isPluginEnabled("BedWars2023")){
            System.out.println(ChatColor.translateAlternateColorCodes('&', "[BedWars1058-AdventureMode] &aBedWars2023 found... Hooking!"));
            System.out.println(ChatColor.translateAlternateColorCodes('&', "[BedWars1058-AdventureMode] &aRunning on" + "&b" + getServer().getVersion()));
            getServer().getPluginManager().registerEvents(new ArenaListenerBW2023(), this);
            Bukkit.getServicesManager().getRegistration(BedWars.class).getProvider().getAddonsUtil().registerAddon(new Addon());
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    
    public static Main getPlugins() {

       return Main.getPlugin(Main.class);

    }
}
