package com.Theeef.me.items.weapons;

import com.Theeef.me.items.DamageType;
import com.Theeef.me.items.ItemRarity;
import com.google.common.collect.Lists;

public class Sling extends RangedWeapon {
    public Sling() {
        super(2.5, DamageType.BLUDGEONING, ItemRarity.COMMON, Lists.newArrayList(WeaponProperty.RANGE, WeaponProperty.AMMUNITION), new WeaponRange(30, 120), 0);
    }
}
