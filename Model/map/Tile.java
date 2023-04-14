package Model.map;

import Model.Buildings.Building;
import Model.people.Units;

import java.util.ArrayList;

public class Tile {
    private Texture texture = Texture.SAND;
    private Building building;
    private ArrayList<Units> units = new ArrayList<>();
    private AllResource resource;

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public ArrayList<Units> getUnits() {
        return units;
    }

    public void setUnits(ArrayList<Units> units) {
        this.units = units;
    }

    public AllResource getResource() {
        return resource;
    }

    public void setResource(AllResource resource) {
        this.resource = resource;
    }
}
