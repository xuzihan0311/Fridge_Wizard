package controller;

import android.os.Bundle;
import android.support.annotation.XmlRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.appathon.alex.fridge_wizard.R;
import android.widget.AdapterView.OnItemSelectedListener;

/**
 * Created by xingxing on 11/13/16.
 */

public class addController extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.additems);
        Spinner spinnerCatagory = (Spinner) findViewById(R.id.categorySpinner);
        spinnerCatagory.setOnItemSelectedListener((OnItemSelectedListener) this);
    }

}
