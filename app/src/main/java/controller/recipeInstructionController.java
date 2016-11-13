package controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.appathon.alex.fridge_wizard.R;

/**
 * Created by xingxing on 11/13/16.
 */

public class recipeInstructionController extends AppCompatActivity {

    Button backToRecipes;
    Button backToFridge;

    TextView recipeName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe_instruction);

        recipeName = (TextView) findViewById(R.id.recipeName);
//        recipeName.setText();

        backToRecipes = (Button) findViewById(R.id.goBackR);
        backToRecipes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), instructionController.class);
                startActivityForResult(myIntent, 0);
            }
        });

        backToFridge = (Button) findViewById(R.id.goBack);
        backToFridge.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), fridgeController.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
