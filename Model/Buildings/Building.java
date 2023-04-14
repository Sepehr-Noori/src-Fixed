package Model.Buildings;

import Model.Resources.Resource;

public abstract class Building {

    private String type;
    private int width,length;
    private int xCoordinate,yCoordinate;
    private int hitPoint;
    private int goldCost;
    private int workersNumber;
    private Resource resourceCost;
    private int resourceNumber;
    private int popularityEffect;

    public void takeDamage(int damage){

    }


}
