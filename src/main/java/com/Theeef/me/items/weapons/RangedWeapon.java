package com.Theeef.me.items.weapons;

import com.Theeef.me.items.DamageType;
import com.Theeef.me.items.ItemRarity;

import java.util.List;

public abstract class RangedWeapon extends Weapon {
    private final WeaponRange weaponRange;

    public RangedWeapon(double damage, DamageType damageType, ItemRarity rarity, List<WeaponProperty> properties, WeaponRange weaponRange, double weight) {
        super(damage, damageType, rarity, properties, weight);

        this.weaponRange = weaponRange;
    }

    public WeaponRange getWeaponRange() {
        return this.weaponRange;
    }

}
