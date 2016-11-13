package controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.appathon.alex.fridge_wizard.R;

/**
 * Created by xingxing on 11/13/16.
 */

public class instructionController extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instruction);

        ImageView image1 = (ImageView) findViewById(R.id.recipe1);
        ImageView image2 = (ImageView) findViewById(R.id.recipe2);
        ImageView image3 = (ImageView) findViewById(R.id.recipe3);
        ImageView image4 = (ImageView) findViewById(R.id.recipe4);
        image1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), recipe_InstructionController.class);
                startActivityForResult(myIntent, 0);
            }

        });
        image2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), recipe_InstructionController.class);
                startActivityForResult(myIntent, 0);
            }

        });
        image3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), recipe_InstructionController.class);
                startActivityForResult(myIntent, 0);
            }

        });
        image4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), recipe_InstructionController.class);
                startActivityForResult(myIntent, 0);
            }

        });
        EditText name1 = (EditText) findViewById(R.id.recipeName1);
        EditText name2 = (EditText) findViewById(R.id.recipeName2);
        EditText name3 = (EditText) findViewById(R.id.recipeName3);
        EditText name4 = (EditText) findViewById(R.id.recipeName4);

    }


}
