package controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Spinner;

import com.appathon.alex.fridge_wizard.R;
import android.widget.AdapterView.OnItemSelectedListener;

/**
 * Created by xingxing on 11/13/16.
 */

public class addController extends AppCompatActivity {

    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_items);
        Spinner spinnerCatagory = (Spinner) findViewById(R.id.categorySpinner);
        spinnerCatagory.setOnItemSelectedListener((OnItemSelectedListener) this);
    }

}
