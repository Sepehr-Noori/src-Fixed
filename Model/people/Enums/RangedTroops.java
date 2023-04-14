package Model.people.Enums;

public enum RangedTroops {
    ARCHER(Hp.LOW, Speed.HIGH, WeaponType.BOW, ArmorType.NONE, Damage.LOW, false, false, false, 5, 0.5);

    private final Hp hp;
    private final Speed speed;
    private final WeaponType weaponType;
    private final ArmorType armorType;
    private final Damage damage;
    private final boolean hasHorse;
    private final boolean isArab;
    private final boolean hasFiringWeapon;
    private final int range;
    private final double damageRatioOnArmor;

    RangedTroops(Hp hp, Speed speed, WeaponType weaponType, ArmorType armorType, Damage damage, boolean hasHorse,
                 boolean isArab, boolean hasFiringWeapon, int range, double damageRatioOnArmor) {
        this.hp = hp;
        this.speed = speed;
        this.weaponType = weaponType;
        this.armorType = armorType;
        this.damage = damage;
        this.hasHorse = hasHorse;
        this.isArab = isArab;
        this.hasFiringWeapon = hasFiringWeapon;
        this.range = range;
        this.damageRatioOnArmor = damageRatioOnArmor;
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

    public boolean hasHorse() {
        return hasHorse;
    }

    public boolean isArab() {
        return isArab;
    }

    public boolean hasFiringWeapon() {
        return hasFiringWeapon;
    }

    public int getRange() {
        return range;
    }

    public double getDamageRatioOnArmor() {
        return damageRatioOnArmor;
    }
}
