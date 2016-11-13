package controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.appathon.alex.fridge_wizard.R;

import org.w3c.dom.Text;

/**
 * Created by xingxing on 11/13/16.
 */

public class instructionController extends AppCompatActivity {
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;

    TextView name1;
    TextView name2;
    TextView name3;
    TextView name4;

    String[] img_url = new String[4];

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instruction);

        image1 = (ImageView) findViewById(R.id.recipe1);
        image2 = (ImageView) findViewById(R.id.recipe2);
        image3 = (ImageView) findViewById(R.id.recipe3);
        image4 = (ImageView) findViewById(R.id.recipe4);

        image1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), recipeInstructionController.class);
                startActivityForResult(myIntent, 0);
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), recipeInstructionController.class);
                startActivityForResult(myIntent, 0);
            }

        });
        image3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), recipeInstructionController.class);
                startActivityForResult(myIntent, 0);
            }

        });
        image4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), recipeInstructionController.class);
                startActivityForResult(myIntent, 0);
            }

        });
        name1 = (TextView) findViewById(R.id.recipeName1);
        name2 = (TextView) findViewById(R.id.recipeName2);
        name3 = (TextView) findViewById(R.id.recipeName3);
        name4 = (TextView) findViewById(R.id.recipeName4);
        name1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), recipeInstructionController.class);
                startActivityForResult(myIntent, 0);
            }

        });
        name2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), recipeInstructionController.class);
                startActivityForResult(myIntent, 0);
            }

        });
        name3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), recipeInstructionController.class);
                startActivityForResult(myIntent, 0);
            }

        });
        name4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), recipeInstructionController.class);
                startActivityForResult(myIntent, 0);
            }

        });

    }
    public void setImageURL(String[] urls) {
        urls = img_url;
    }

}
