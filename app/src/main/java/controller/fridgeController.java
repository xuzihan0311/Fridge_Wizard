package controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.appathon.alex.fridge_wizard.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import static android.R.id.list;

/**
 * Created by bigjohnlin on 11/13/2016.
 */

public class fridgeController extends AppCompatActivity{

    Button addItem;
    Button generateRecipe;
    Button deleteItem;

    ListView list;
    ListAdapter adapter;
    String[] stringItems;
    String ingredient;

    static List<String> myItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fridge);

        addItem = (Button) findViewById(R.id.addItem);
        addItem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), addController.class); //From the add_items.xml Controller
                startActivityForResult(myIntent, 0);
            }
        });

        list = (ListView) findViewById(R.id.listViewitems);
        if (addController.isAdded) {
            myItems.add(addController.selectedItem);
        }
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, myItems);
        list.setAdapter(adapter);
        if (adapter != null) {
            stringItems = new String[adapter.getCount()];
            for (int a = 0; a < adapter.getCount(); a++) {
                System.out.println(adapter.getItem(a).toString());
                stringItems[a] = adapter.getItem(a).toString();
            }
        }

        //API key:f7731380165624ae4e30c6a107caec4c
        //Search with Ingredients call: http://food2fork.com/api/search
        //Get Recipe: http://food2fork.com/api/get
        generateRecipe = (Button) findViewById(R.id.generateRecipes);
        generateRecipe.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), instructionController.class); //From the instruction.xml Controller
                startActivityForResult(intent, 0);
                ingredient = generateIngredients(stringItems);
                String url_link = "https://spoonacular-recipe-food-nutrition-v1.p.mashape.com/recipes/findByIngredients?fillIngredients=false&"
                        +ingredient+"&limitLicense=false&number=4&ranking=1";
                try {
                    URL url = new URL(url_link);
                    HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
                    conn.setDoOutput(true);

                    BufferedReader bff =  new BufferedReader(new InputStreamReader(conn.getInputStream()));

                    String output = "";
                    StringBuilder response = new StringBuilder();

//                    while((output - bff.readLine()) != null) {
//
//                    }
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException p) {
                    p.printStackTrace();
                }
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
    private String generateIngredients(String[] ingre) {
        String i = "";
        for (int a = 0; a < ingre.length; a++) {
            if (a == ingre.length -1) {
                i += ingre[a];
            } else {
                i += ingre[a] + "%2C";
            }
        }
        return i;
    }
}
