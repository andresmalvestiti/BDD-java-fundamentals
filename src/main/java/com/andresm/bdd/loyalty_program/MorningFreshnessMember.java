package com.andresm.bdd.loyalty_program;

public class MorningFreshnessMember {

    private String name;
    private SuperSmoothieSchema superSmoothieSchema;
    private int points;

    public MorningFreshnessMember(String name, SuperSmoothieSchema superSmoothieSchema) {
        this.name = name;
        this.superSmoothieSchema = superSmoothieSchema;
    }

    public void orders(Integer amount, String drink) {
        points += superSmoothieSchema.getPointsFor(drink) * amount;
    }

    public int getPoints() {
        return points;
    }
}
