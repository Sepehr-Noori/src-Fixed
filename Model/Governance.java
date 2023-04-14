package Model;

import Model.Resources.Resource;

import java.util.HashMap;

public class Governance {
    private final HashMap<Resource, Integer> resource = new HashMap<>();
    private User owner;
    private int gold;
    private int popularity;
    private int taxRate;
    private int foodRate;
    private int taxFactor;
    private int fearFactor;
    private int foodFactor;
    private int religiousFactor;
    //popularity = taxFactor + fearFactor + foodFactor + religiousFactor
}