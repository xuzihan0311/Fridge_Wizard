package com.appathon.alex.fridge_wizard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Fridge {
    private List<GroceryItems> itemList;

    public Fridge() {
        itemList = new ArrayList<GroceryItems>();
    }

    public void addItem(GroceryItems item) {
        itemList.add(item);
    }

    public List<GroceryItems> getItemList() {
        return itemList;
    }
}