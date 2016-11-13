package controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import com.appathon.alex.fridge_wizard.R;
import android.widget.AdapterView.OnItemSelectedListener;

import static android.R.id.list;
import static com.appathon.alex.fridge_wizard.R.id.categorySpinner;
import static com.appathon.alex.fridge_wizard.R.id.itemSpinner;

/**
 * Created by xingxing on 11/13/16.
 */

public class addController extends AppCompatActivity implements OnItemSelectedListener {

    Button addButton;
    Button cancelButton;

    private static String selectedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_items);

        Spinner spinnerCategory = (Spinner) findViewById(categorySpinner);
        ArrayAdapter<CharSequence> categoryAdapter = ArrayAdapter.createFromResource(this,
                R.array.categories_array, android.R.layout.simple_spinner_item);
        categoryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCategory.setAdapter(categoryAdapter);
        spinnerCategory.setOnItemSelectedListener(this);

        Spinner spinnerItem = (Spinner) findViewById(itemSpinner);
        spinnerItem.setOnItemSelectedListener(this);

        addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent myIntent = new Intent(view.getContext(), fridgeController.class);
                startActivityForResult(myIntent, 0);
            }
        });

        cancelButton = (Button) findViewById(R.id.cancel);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), fridgeController.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        selectedItem = (String) parent.getItemAtPosition(pos);
        if ("Dairy, Eggs, Cheese".equals(selectedItem) || "Fruits".equals(selectedItem)
                || "Meat".equals(selectedItem) || "Vegetables".equals(selectedItem)) {
            Spinner spinnerItem = (Spinner) findViewById(itemSpinner);
            ArrayAdapter<CharSequence> itemAdapter;
            String category = (String) parent.getItemAtPosition(pos);
            switch (category) {
                case "Dairy, Eggs, Cheese":
                    itemAdapter = ArrayAdapter.createFromResource(this, R.array.dairy_array,
                            android.R.layout.simple_spinner_item);
                    break;
                case "Fruits":
                    itemAdapter = ArrayAdapter.createFromResource(this, R.array.fruits_array,
                            android.R.layout.simple_spinner_item);
                    break;
                case "Meat":
                    itemAdapter = ArrayAdapter.createFromResource(this, R.array.meat_array,
                            android.R.layout.simple_spinner_item);
                    break;
                case "Vegetables":
                    itemAdapter = ArrayAdapter.createFromResource(this, R.array.veges_array,
                            android.R.layout.simple_spinner_item);
                    break;
                default:
                    itemAdapter = ArrayAdapter.createFromResource(this, R.array.categories_array,
                            android.R.layout.simple_spinner_item);
                    break;
            }
            itemAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerItem.setAdapter(itemAdapter);
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }

}
