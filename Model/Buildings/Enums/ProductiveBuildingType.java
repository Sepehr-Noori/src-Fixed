package Model.Buildings.Enums;

import Model.Resources.Resource;

public enum ProductiveBuildingType {
    ;

    private Resource producedResource;
    private Resource requiredResource;
    private int productionRate;

    ProductiveBuildingType(Resource producedResource, Resource requiredResource, int productionRate) {
        this.producedResource = producedResource;
        this.requiredResource = requiredResource;
        this.productionRate = productionRate;
    }

    ProductiveBuildingType(Resource producedResource, int productionRate) {
        this.producedResource = producedResource;
        this.productionRate = productionRate;
    }

    public Resource getProducedResource() {
        return producedResource;
    }

    public Resource getRequiredResource() {
        return requiredResource;
    }

    public int getProductionRate() {
        return productionRate;
    }
}
