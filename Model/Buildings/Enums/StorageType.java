package Model.Buildings.Enums;

import Model.Resources.AllResource;

public enum StorageType {
    ;

    private AllResource resource;
    private int capacity,filledCapacity;

    StorageType(AllResource resource, int capacity, int filledCapacity) {
        this.resource = resource;
        this.capacity = capacity;
        this.filledCapacity = filledCapacity;
    }

    public AllResource getResource() {
        return resource;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFilledCapacity() {
        return filledCapacity;
    }
}
