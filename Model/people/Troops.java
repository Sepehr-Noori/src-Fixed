package Model.people;

import Model.people.Enums.ArmorType;
import Model.people.Enums.WeaponType;

public abstract class Troops extends Units {
    protected WeaponType weaponType;
    protected ArmorType armorType;
    protected int damage;
    protected boolean hasHorse;
    protected boolean isArab;
    protected boolean hasFiringWeapon;

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public ArmorType getArmorType() {
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
