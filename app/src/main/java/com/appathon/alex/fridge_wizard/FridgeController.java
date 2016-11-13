package com.appathon.alex.fridge_wizard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import static com.appathon.alex.fridge_wizard.R.layout.additems;

/**
 * Created by bigjohnlin on 11/13/2016.
 */

public class FridgeController extends AppCompatActivity{

    Button addItem;
    Button generateRecipe;
    Button deleteItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fridge);

        addItem = (Button) findViewById(R.id.addItem);
        addItem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), additems.class); //From the addItems.xml Controller
                startActivityForResult(myIntent, 0);
            }
        });

        generateRecipe = (Button) findViewById(R.id.generateRecipes);
        generateRecipe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), instructionController.class); //From the instruction.xml Controller
                startActivityForResult(intent, 0);
            }
        });

        deleteItem = (Button) findViewById(R.id.deleteItem);
        deleteItem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                deleteItem();
            }
        });
    }

    private void deleteItem() {
        //implement delete Item when clicked
    }
}
