package com.andresm.bdd.loyalty_program;

import java.util.HashMap;
import java.util.Map;

public class DrinkCatalog {

    private Map<String,String> drinkCategories = new HashMap<>();

    public void addDrink(String drink, String category) {
        drinkCategories.put(drink,category);
    }

    public String getCategoryOf(String drink) {
        return drinkCategories.get(drink);
    }
}
