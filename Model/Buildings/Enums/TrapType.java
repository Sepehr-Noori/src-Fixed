package Model.Buildings.Enums;

public enum TrapType {
    ;

    private int damage;
    private boolean isActive;

    public int getDamage() {
        return damage;
    }

    public boolean isActive() {
        return isActive;
    }

    TrapType(int damage, boolean isActive) {
        this.damage = damage;
        this.isActive = isActive;
    }
}
