package Model.Buildings.Enums;

import Model.Resources.Resource;
import Model.people.Engineer;

import java.lang.ref.PhantomReference;
import java.util.ArrayList;

public enum ChurchType {

    CHAPEL(false,0),CATHEDRAL(true,5);
    private boolean isGeneral;
    private int makeMonkCost;
    private int size;
    private int hitPoint;
    private int goldCost;
    private Resource resourceCostType;
    private int resourceCostNumber;
    private int workersNumber;
    private boolean isActive;
    public ArrayList<Model.people.Engineer> Engineer;

    ChurchType(boolean isGeneral, int makeMonkCost) {
        this.isGeneral = isGeneral;
        this.makeMonkCost = makeMonkCost;
    }

    public boolean isGeneral() {
        return isGeneral;
    }

    public int getMakeMonkCost() {
        return makeMonkCost;
    }
}
