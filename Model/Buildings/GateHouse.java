package Model.Buildings;

import Model.Buildings.Enums.GateHouseType;

public class GateHouse extends Building{

    private int capacity,filledCapacity;

    public GateHouse(GateHouseType gateHouseType) {

    }

    public int getCapacity() {
        return capacity;
    }

    public int getFilledCapacity() {
        return filledCapacity;
    }

    public void setFilledCapacity(int filledCapacity) {
        this.filledCapacity = filledCapacity;
    }
}
