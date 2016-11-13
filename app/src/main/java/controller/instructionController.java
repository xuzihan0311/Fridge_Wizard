package controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

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
        TextView name1 = (TextView) findViewById(R.id.recipeName1);
        TextView name2 = (TextView) findViewById(R.id.recipeName2);
        TextView name3 = (TextView) findViewById(R.id.recipeName3);
        TextView name4 = (TextView) findViewById(R.id.recipeName4);
        name1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), recipe_InstructionController.class);
                startActivityForResult(myIntent, 0);
            }

        });
        name2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), recipe_InstructionController.class);
                startActivityForResult(myIntent, 0);
            }

        });
        name3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), recipe_InstructionController.class);
                startActivityForResult(myIntent, 0);
            }

        });
        name4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), recipe_InstructionController.class);
                startActivityForResult(myIntent, 0);
            }

        });

    }


}
