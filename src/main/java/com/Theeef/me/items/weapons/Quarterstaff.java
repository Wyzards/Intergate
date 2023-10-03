package com.Theeef.me.items.weapons;

import com.Theeef.me.items.DamageType;
import com.Theeef.me.items.ItemRarity;
import com.google.common.collect.Lists;

public class Quarterstaff extends Weapon {
    public Quarterstaff() {
        super(3.5, DamageType.BLUDGEONING, ItemRarity.COMMON, Lists.newArrayList(WeaponProperty.VERSATILE), 4);
    }
}
