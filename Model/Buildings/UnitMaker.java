package Model.Buildings;

import Model.Buildings.Building;

public class UnitMaker extends Building {

    private int engineerCost;
    private int ladderManCost;

    public void setEngineerCost(int engineerCost) {
        this.engineerCost = engineerCost;
    }

    public void setLadderManCost(int ladderManCost) {
        this.ladderManCost = ladderManCost;
    }

    public void setMilitaryUnitCost(int militaryUnitCost) {
        this.militaryUnitCost = militaryUnitCost;
    }

    public int getEngineerCost() {
        return engineerCost;
    }

    public int getLadderManCost() {
        return ladderManCost;
    }

    public int getMilitaryUnitCost() {
        return militaryUnitCost;
    }

    private int militaryUnitCost;

    public void makeEngineer(){

    }

    public void makeLadderMan(){

    }

    public void makeMilitaryUnit(){

    }

}
