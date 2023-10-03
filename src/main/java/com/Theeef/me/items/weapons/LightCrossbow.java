package com.Theeef.me.items.weapons;

import com.Theeef.me.items.DamageType;
import com.Theeef.me.items.ItemRarity;
import com.google.common.collect.Lists;

public class LightCrossbow extends RangedWeapon {
    public LightCrossbow() {
        super(4.5, DamageType.PIERCING, ItemRarity.COMMON, Lists.newArrayList(WeaponProperty.AMMUNITION, WeaponProperty.RANGE, WeaponProperty.LOADING, WeaponProperty.TWO_HANDED), new WeaponRange(80, 320), 5);
    }
}
