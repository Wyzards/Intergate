package com.Theeef.me.items.weapons;

import com.Theeef.me.items.DamageType;
import com.Theeef.me.items.ItemRarity;

import java.util.List;

public abstract class Weapon {

    private final double damage;
    private final DamageType damageType;
    private final ItemRarity rarity;
    private final List<WeaponProperty> properties;
    private final double weight;

    public Weapon(double damage, DamageType damageType, ItemRarity rarity, List<WeaponProperty> properties, double weight) {
        this.damage = damage;
        this.damageType = damageType;
        this.rarity = rarity;
        this.properties = properties;
        this.weight = weight;
    }

    public double getDamage() {
        return this.damage;
    }

    public DamageType getDamageType() {
        return this.damageType;
    }

    public ItemRarity getRarity() {
        return this.rarity;
    }

    public List<WeaponProperty> getProperties() {
        return this.properties;
    }

    public double getWeight() {
        return this.weight;
    }

}
