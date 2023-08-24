package me.notlewx.gamemode;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class Addon extends com.tomkeuper.bedwars.api.addon.Addon {
    @Override
    public String getAuthor() {
        return Main.getPlugins().getDescription().getAuthors().get(0);
    }

    @Override
    public Plugin getPlugin() {
        return Main.getPlugins();
    }

    @Override
    public String getVersion() {
        return Main.getPlugins().getDescription().getVersion();
    }

    @Override
    public String getDescription() {
        return Main.getPlugins().getDescription().getDescription();
    }

    @Override
    public String getName() {
        return Main.getPlugins().getDescription().getName();
    }

    @Override
    public void load() {
        Bukkit.getPluginManager().enablePlugin(Main.getPlugins());
    }

    @Override
    public void unload() {
        Bukkit.getPluginManager().disablePlugin(Main.getPlugins());
    }
}
