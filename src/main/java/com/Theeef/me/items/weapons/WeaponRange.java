package com.Theeef.me.items.weapons;

public class WeaponRange {

    private int shortRange;
    private int longRange;

    public WeaponRange(int shortRange, int longRange) {
        this.shortRange = shortRange;
        this.longRange = longRange;
    }

    public int getShortRange() {
        return this.shortRange;
    }

    public int getLongRange() {
        return this.longRange;
    }

}
