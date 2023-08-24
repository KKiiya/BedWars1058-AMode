package me.notlewx.gamemode.listeners;

import com.tomkeuper.bedwars.api.events.player.PlayerJoinArenaEvent;
import me.notlewx.gamemode.Main;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ArenaListenerBW2023 implements Listener {
    @EventHandler
    public void onGameJoin(PlayerJoinArenaEvent e) {
        Player p = e.getPlayer();
        if (e.isSpectator()) {
            return;
        }
        Bukkit.getScheduler().runTaskLater(Main.getPlugins(), () -> p.setGameMode(GameMode.ADVENTURE), 0L);
    }
}
