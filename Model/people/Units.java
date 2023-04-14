package Model.people;

import Model.people.Enums.AttackingModes;
import Model.people.Enums.Speed;

public abstract class Units {
    protected int hp;
    protected Speed speed;
    protected AttackingModes attackingMode = AttackingModes.STANDING;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSpeed() {
        return speed.getMoveInEachTurn();
    }

    public AttackingModes getAttackingMode() {
        return attackingMode;
    }

    public void setAttackingMode(AttackingModes attackingMode) {
        this.attackingMode = attackingMode;
    }
}
