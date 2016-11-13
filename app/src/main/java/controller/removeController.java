package controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.appathon.alex.fridge_wizard.R;

import android.widget.AdapterView.OnItemSelectedListener;

import static com.appathon.alex.fridge_wizard.R.id.itemSpinner;

/**
 * Created by Alex on 11/13/16.
 */

public class removeController extends AppCompatActivity implements OnItemSelectedListener {

    Button removeButton;
    Button cancelButton;

    static String removedItem;
    static boolean isRemoved = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        isRemoved = false;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.remove_item);

        Spinner spinnerItem = (Spinner) findViewById(itemSpinner);
        ArrayAdapter<String> itemAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, fridgeController.myItems);
        itemAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerItem.setAdapter(itemAdapter);
        spinnerItem.setOnItemSelectedListener(this);

        removeButton = (Button) findViewById(R.id.removeButton);
        removeButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    isRemoved = true;

                    Intent myIntent = new Intent(view.getContext(), fridgeController.class);
                    startActivityForResult(myIntent, 0);
                }
        });

        cancelButton = (Button) findViewById(R.id.cancelButton);
        cancelButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                isRemoved = false;
                    Intent myIntent = new Intent(view.getContext(), fridgeController.class);
                    startActivityForResult(myIntent, 0);
                }
        });
    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        removedItem = (String) parent.getItemAtPosition(pos);
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}
