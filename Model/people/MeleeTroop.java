package Model.people;

import Model.people.Enums.MeleeTroops;

public class MeleeTroop extends Troops{
    private boolean canScaleWall;
    private boolean canDigKhandagh;

    public MeleeTroop(MeleeTroops meleeTroop) {

    }

    public boolean isCanScaleWall() {
        return canScaleWall;
    }

    public boolean isCanDigKhandagh() {
        return canDigKhandagh;
    }
}
