package com.example.flowz.myapplication10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void NextActivity(View view) {

        EditText TypedText = (EditText) findViewById(R.id.writtenText);

        String wordsWritten = TypedText.getText().toString();

        if (wordsWritten.length() == 0) {
            TypedText.setError("YOU MUST WRITE HERE");
        } else {
            Intent openNextActivity = new Intent(MainActivity.this, baconActivity.class);
            openNextActivity.putExtra("name", wordsWritten);
            startActivity(openNextActivity);
        }
    }
}
