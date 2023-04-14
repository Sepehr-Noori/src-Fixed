package Model.Buildings.Enums;

import Model.Resources.Resource;
import Model.people.Engineer;

import java.util.ArrayList;

public enum GateHouseType {

    SMALL(8,0),LARGE(10,0);

    private int capacity;
    private int range;
    private int size;
    private int hitPoint;
    private int goldCost;
    private Resource resourceCostType;
    private int resourceCostNumber;
    private int workersNumber;
    private boolean isActive;
    public ArrayList<Model.people.Engineer> Engineer;

    GateHouseType(int capacity, int range) {
        this.capacity = capacity;
        this.range = range;
    }

    public int getRange() {
        return range;
    }


    public int getCapacity() {
        return capacity;
    }
}
