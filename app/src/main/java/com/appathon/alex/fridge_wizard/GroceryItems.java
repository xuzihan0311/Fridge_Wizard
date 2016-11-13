package com.appathon.alex.fridge_wizard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alex on 11/13/16.
 */

public class GroceryItems {

    private static boolean isInitialized = false;
    private static Map<String, ArrayList<String>> itemsByCategory = new HashMap<>();

    public static void initialize() {
        String[] dairyArr = {"Butter", "Cheese - Blue", "Cheese - Cheddar", "Cheese - Colby",
                "Cheese - Parmesan", "Cheese - Pepper Jack", "Cheese - Swiss", "Condensed Milk",
                "Eggs", "Milk"};
        itemsByCategory.put("Dairy, Eggs & Cheese", new ArrayList<>(Arrays.asList(dairyArr)));

        String[] fruitsArr = {"Apples", "Blackberries", "Blueberries", "Cantaloupes", "Cherries",
                "Grapes", "Limes", "Mangoes", "Oranges", "Pineapples", "Pomegranates",
                "Strawberries", "Watermelons"};
        itemsByCategory.put("Fruits", new ArrayList<>(Arrays.asList(fruitsArr)));

        String[] meatArr = {"Bacon", "Beef - Grounded", "Beef - Steak", "Chicken - Breasts",
                "Chicken - Thighs", "Chicken - Wings", "Clams", "Crabs", "Crawfish", "Ham", "Pork",
                "Salmon", "Sausages", "Shrimp", "Turkey"};
        itemsByCategory.put("Meat", new ArrayList<>(Arrays.asList(meatArr)));

        String[] vegesArr = {"Asparagus", "Bell Peppers", "Broccoli", "Carrots", "Cauliflower",
                "Celery", "Corn", "Green Beans", "Green Onions", "Lettuces", "Mushrooms", "Onions",
                "Peas", "Potatoes", "Radishes", "Snow Peas", "Spinach", "Sprouts", "Squash",
                "Sweet Potatoes", "Tomatoes", "Zucchini"};
        itemsByCategory.put("Vegetables", new ArrayList<>(Arrays.asList(vegesArr)));

        isInitialized = true;
    }

    public static Map<String, ArrayList<String>> getItemsByCategory() {
        if (!isInitialized) {
            initialize();
        }
        return itemsByCategory;
    }
}
