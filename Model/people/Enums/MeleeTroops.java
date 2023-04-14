package Model.people.Enums;

import Model.Resources.Resource;

public enum MeleeTroops {
    SPEARMAN(Hp.VERY_LOW, Speed.MEDIUM, Resource.SPEAR, Resource.NONE_ARMOR, Damage.MEDIUM, false, false, false, true, true, 8);

    private final Hp hp;
    private final Speed speed;
    private final Resource weaponType;
    private final Resource armorType;
    private final Damage damage;
    private final boolean hasHorse;
    private final boolean isArab;
    private final boolean hasFiringWeapon;
    private final boolean canScaleWall;
    private final boolean canDigKhandagh;
    private final int cost;

    MeleeTroops(Hp hp, Speed speed, Resource weaponType, Resource armorType, Damage damage, boolean hasHorse,
                boolean isArab, boolean hasFiringWeapon, boolean canScaleWall, boolean canDigKhandagh, int cost) {
        this.hp = hp;
        this.speed = speed;
        this.weaponType = weaponType;
        this.armorType = armorType;
        this.damage = damage;
        this.hasHorse = hasHorse;
        this.isArab = isArab;
        this.hasFiringWeapon = hasFiringWeapon;
        this.canScaleWall = canScaleWall;
        this.canDigKhandagh = canDigKhandagh;
        this.cost = cost;
    }

    public int getHp() {
        return hp.getHp();
    }

    public Speed getSpeed() {
        return speed;
    }

    public Resource getWeaponType() {
        return weaponType;
    }

    public Resource getArmorType() {
        return armorType;
    }

    public int getDamage() {
        return damage.getDamage();
    }

    public boolean hasHorse() {
        return hasHorse;
    }

    public boolean isArab() {
        return isArab;
    }

    public boolean hasFiringWeapon() {
        return hasFiringWeapon;
    }

    public boolean canScaleWall() {
        return canScaleWall;
    }

    public boolean canDigKhandagh() {
        return canDigKhandagh;
    }

    public int getCost() {
        return cost;
    }
}
