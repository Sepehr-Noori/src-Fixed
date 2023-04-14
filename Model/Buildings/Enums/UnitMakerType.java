package Model.Buildings.Enums;

import Model.Resources.Utils;
import Model.people.Units;

public enum UnitMakerType {
    ;

    private int unitCost;
    private Utils unitUtilType;
    private int unitUtilNumber;
    private Units MadeUnit;

    UnitMakerType(int unitCost, Utils unitUtilType, int unitUtilNumber, Units madeUnit) {
        this.unitCost = unitCost;
        this.unitUtilType = unitUtilType;
        this.unitUtilNumber = unitUtilNumber;
        MadeUnit = madeUnit;
    }

    public int getUnitCost() {
        return unitCost;
    }

    public Utils getUnitUtilType() {
        return unitUtilType;
    }

    public int getUnitUtilNumber() {
        return unitUtilNumber;
    }

    public Units getMadeUnit() {
        return MadeUnit;
    }
}
