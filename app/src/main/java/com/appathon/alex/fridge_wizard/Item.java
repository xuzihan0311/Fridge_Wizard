package com.appathon.alex.fridge_wizard;

/**
 * Created by xingxing on 11/13/16.
 */

// Items the user has in
// the fridge like apple, kale and so on
public class Item {

    private String name;
    
    public Item(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name;
    }
}
