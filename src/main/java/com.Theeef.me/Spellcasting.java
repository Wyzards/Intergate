package com.Theeef.me;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;

import java.util.UUID;

public class Spellcasting {

    public static ItemStack spellBookTest() {
        ItemStack item = new ItemStack(Material.WRITTEN_BOOK, 1);
        BookMeta meta = (BookMeta) item.getItemMeta();

        UUID id = UUID.fromString("8eec77e7-b5ae-48f1-a20e-eab4ee54a781");

        meta.setTitle("TEST");
        meta.setAuthor("Theeef");
        item.setItemMeta(meta);

        return item;
    }

}
