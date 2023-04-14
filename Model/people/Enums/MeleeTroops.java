package Model.people.Enums;

public enum MeleeTroops {
    SPEARMAN(Hp.VERY_LOW, Speed.MEDIUM, WeaponType.SPEAR, ArmorType.NONE, Damage.MEDIUM, false, false, false, true, true);

    private final Hp hp;
    private final Speed speed;
    private final WeaponType weaponType;
    private final ArmorType armorType;
    private final Damage damage;
    private final boolean hasHorse;
    private final boolean isArab;
    private final boolean hasFiringWeapon;
    private final boolean canScaleWall;
    private final boolean canDigKhandagh;

    MeleeTroops(Hp hp, Speed speed, WeaponType weaponType, ArmorType armorType, Damage damage, boolean hasHorse,
                boolean isArab, boolean hasFiringWeapon, boolean canScaleWall, boolean canDigKhandagh) {
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
    }

    public int getHp() {
        return hp.getHp();
    }

    public Speed getSpeed() {
        return speed;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    public int getDamage() {
        return damage.getDamage();
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

    public boolean isCanScaleWall() {
        return canScaleWall;
    }

    public boolean isCanDigKhandagh() {
        return canDigKhandagh;
    }
}
