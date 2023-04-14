package Model.Resources;

public enum AllResource {

    BOW("bow",Utils.BOW),
    CROSSBOW("crossbow",Utils.CROSSBOW),
    SPEAR("spear",Utils.SPEAR),
    PIKE("pike",Utils.PIKE),
    MACE("mace",Utils.MACE),
    SWORD("sword",Utils.SWORD),
    LEATHER_ARMOR("leather",Utils.LEATHER_ARMOR),
    METAL_ARMOR("metal",Utils.METAL_ARMOR),
    HOP("hop",Resource.HOP),
    ALE("ale",Resource.ALE),
    WHEAT("wheat",Resource.WHEAT),
    FLOUR("flour",Resource.FLOUR),
    IRON("iron",Resource.IRON),
    STONE("stone",Resource.STONE),
    PITCH("pitch",Resource.PITCH),
    WOOD("wood",Resource.WOOD),
    MEAT("meat",Food.MEAT),
    APPLE("apple",Food.APPLE),
    CHEESE("cheese",Food.CHEESE),
    BREAD("bread",Food.BREAD);

    private String name;

    AllResource(String name,Food food) {
        this.name = name;
    }
    AllResource(String name,Resource resource) {
        this.name = name;
    }
    AllResource(String name,Utils utils) {
        this.name = name;
    }
}
