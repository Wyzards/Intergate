package com.Theeef.me;

import com.Theeef.me.items.weapons.Dagger;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class IntergatePlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        Bukkit.getConsoleSender().sendMessage(Component.text(NamedTextColor.GREEN + "Intergate is online"));
    }

    @Override
    public void onLoad() {
        Bukkit.getOnlinePlayers().forEach(player -> player.sendMessage(Component.text("Intergate version " + 1).toBuilder().build()));
    }

    @EventHandler
    public void playerJoin(AsyncPlayerChatEvent event) {
        event.getPlayer().getInventory().addItem(Dagger.getItemStack());

        TextComponent text = Component.text("RED ITALICS", NamedTextColor.RED).decoration(TextDecoration.ITALIC, true).append(Component.text(" AQUA NONITALICS", NamedTextColor.AQUA).decoration(TextDecoration.ITALIC, false));
        event.getPlayer().sendMessage(text);
        event.getPlayer().sendMessage(text.color().toString());
        event.getPlayer().sendMessage(text.decorations().toString());
    }

}
