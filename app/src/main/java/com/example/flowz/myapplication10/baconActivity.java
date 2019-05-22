package com.example.flowz.myapplication10;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class baconActivity extends AppCompatActivity {
    TextView textView;

    String [] cars = {"Benz","Honda","Peugot","Nissan", "Range Rover", "BMW", "Ford"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);

         textView = (TextView) findViewById(R.id.textView1);
        AutoCompleteTextView myAuto = (AutoCompleteTextView)findViewById(R.id.Auto1);

       textView.setText("Text Inputs: \nBenz, Honda, Peugot, Nissan, Range Rover, BMW, Ford");

        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(baconActivity.this, android.R.layout.simple_list_item_1, cars);

        myAuto.setAdapter(myadapter);

    }
}
