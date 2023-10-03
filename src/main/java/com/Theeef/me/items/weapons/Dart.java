package com.Theeef.me.items.weapons;

import com.Theeef.me.items.DamageType;
import com.Theeef.me.items.ItemRarity;
import com.google.common.collect.Lists;

public class Dart extends RangedWeapon {
    public Dart() {
        super(2.5, DamageType.PIERCING, ItemRarity.COMMON, Lists.newArrayList(WeaponProperty.FINESSE, WeaponProperty.RANGE, WeaponProperty.THROWN), new WeaponRange(20, 60), 0.25);
    }
}
