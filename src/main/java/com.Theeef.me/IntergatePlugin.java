package com.Theeef.me;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class IntergatePlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onLoad() {
        Bukkit.getOnlinePlayers().forEach(player -> player.sendMessage(Component.text("Intergate loaded ", NamedTextColor.GREEN).toBuilder().build()));
    }

    public TextComponent s(String string) {
        return Component.text(string, NamedTextColor.GRAY);
    }

    @EventHandler
    public void playerChatEvent(AsyncPlayerChatEvent event) {
        event.getPlayer().getInventory().addItem(Spellcasting.spellBookTest());
    }

}
