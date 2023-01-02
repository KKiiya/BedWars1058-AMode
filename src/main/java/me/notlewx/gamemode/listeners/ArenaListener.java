package me.notlewx.gamemode.listeners;

import com.andrei1058.bedwars.api.events.player.PlayerJoinArenaEvent;
import me.notlewx.gamemode.Main;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ArenaListener implements Listener {
    private final Main main;
    public ArenaListener(Main main) {
        this.main = main;
    }
    @EventHandler
    public void onGameJoin(PlayerJoinArenaEvent e) {
        Player p = e.getPlayer();
        if (e.isSpectator()) {
            return;
        }
        Bukkit.getScheduler().runTaskLater(this.main, () -> p.setGameMode(GameMode.ADVENTURE), 0L);
    }
}
