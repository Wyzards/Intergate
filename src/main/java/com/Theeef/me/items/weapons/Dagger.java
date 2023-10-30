package com.Theeef.me.items.weapons;

import com.Theeef.me.items.DamageType;
import com.Theeef.me.items.ItemRarity;
import com.Theeef.me.items.ItemUtil;
import com.google.common.collect.Lists;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import static net.kyori.adventure.text.Component.text;

public class Dagger extends RangedWeapon {

    private static final String description = "A simple metal dagger, about the length of your forearm, gleams with understated elegance. Its unadorned hilt and polished blade tell tales of countless adventures in the hands of those who favor its unassuming charm.";

    public Dagger() {
        super(2.5, DamageType.PIERCING, ItemRarity.COMMON, Lists.newArrayList(WeaponProperty.FINESSE, WeaponProperty.RANGE, WeaponProperty.THROWN, WeaponProperty.LIGHT), new WeaponRange(20, 60), 1);
    }

    public static ItemStack getItemStack() {
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.displayName(text("").toBuilder().build());

        meta.lore(ItemUtil.splitComponent(Component.text(Dagger.description, NamedTextColor.GRAY, TextDecoration.ITALIC), 30));
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);

        return item;
    }
}
