package Model.Buildings;

import Model.Resources.Resource;

import java.util.ArrayList;

public abstract class Building {

    private int size;
    private int hitPoint;
    private int goldCost;
    private Resource resourceCostType;
    private int resourceCostNumber;
    private int workersNumber;
    private boolean isActive;


    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    private int popularityEffect;

    public int getSize() {
        return size;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public int getGoldCost() {
        return goldCost;
    }

    public Resource getResourceCostType() {
        return resourceCostType;
    }

    public int getResourceCostNumber() {
        return resourceCostNumber;
    }

    public int getWorkersNumber() {
        return workersNumber;
    }

    public int getPopularityEffect() {
        return popularityEffect;
    }
}
