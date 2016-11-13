package controller;

import android.os.Bundle;
import android.support.annotation.XmlRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.appathon.alex.fridge_wizard.R;

/**
 * Created by xingxing on 11/13/16.
 */

public class addController extends AppCompatActivity {
    private TextView addItem;
    private TextView category;
    private Spinner categorySpinner;
    private TextView item;
    private Spinner itemSpinner;
    private Button addButton;
    private Button cancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.additems);
    }

}
