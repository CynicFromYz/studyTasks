package com.waiqin365.firstdemo.testjava8;

/**
 * @author cynic
 * @version 1.0
 * @createTime 2020/4/7 20:22
 */
public class Dish {
    String name;
    boolean isVegetable;
    int weight;
    Type type;

    public Dish(String name, boolean isVegetable, int weight, Type type) {
        this.name = name;
        this.isVegetable = isVegetable;
        this.weight = weight;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVegetable() {
        return isVegetable;
    }

    public void setVegetable(boolean vegetable) {
        isVegetable = vegetable;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
