package Model.people;

import Model.Resources.Resource;

public abstract class Troops extends Units {
    protected Resource weaponType;
    protected Resource armorType;
    protected int damage;
    protected boolean hasHorse;
    protected boolean isArab;
    protected boolean hasFiringWeapon;

    public Resource getWeaponType() {
        return weaponType;
    }

    public Resource getArmorType() {
        return armorType;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isHasHorse() {
        return hasHorse;
    }

    public boolean isArab() {
        return isArab;
    }

    public boolean isHasFiringWeapon() {
        return hasFiringWeapon;
    }
}
