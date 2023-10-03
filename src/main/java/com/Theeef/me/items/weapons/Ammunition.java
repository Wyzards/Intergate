package com.Theeef.me.items.weapons;

import com.Theeef.me.items.ItemRarity;

public abstract class Ammunition {

    private AmmunitionType type;
    private double weight;
    private ItemRarity rarity;

    public Ammunition(AmmunitionType type, ItemRarity rarity, double weight) {
        this.type = type;
        this.rarity = rarity;
        this.weight = weight;
    }

    public AmmunitionType getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public ItemRarity getRarity() {
        return rarity;
    }
}
