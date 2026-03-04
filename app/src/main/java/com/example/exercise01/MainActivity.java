package com.example.exercise01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("ID: 23100754");
        }

        Button myButton = findViewById(R.id.btnChangeName);
        final TextView myText = findViewById(R.id.tvDepartment);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myText.setText("Ms. Ceniza-Canillo");
            }
        });
    }
}