package Model.Buildings.Enums;

import Model.people.Units;

import java.util.ArrayList;

public enum TowerType {
    ;

    private int fireRange;
    private int defendRange;
    private int unitCapacity;
    private ArrayList<Units> units = new ArrayList<>();

    public int getFireRange() {
        return fireRange;
    }

    public int getDefendRange() {
        return defendRange;
    }

    public int getUnitCapacity() {
        return unitCapacity;
    }

    public ArrayList<Units> getUnits() {
        return units;
    }

    TowerType(int fireRange, int defendRange, int unitCapacity, ArrayList<Units> units) {
        this.fireRange = fireRange;
        this.defendRange = defendRange;
        this.unitCapacity = unitCapacity;
        this.units = units;
    }
}
