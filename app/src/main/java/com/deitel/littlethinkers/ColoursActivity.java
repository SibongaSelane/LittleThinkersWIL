package com.deitel.littlethinkers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ColoursActivity extends AppCompatActivity {

Button btnLearnColours, btnActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colours);
        // btnLearnNumbers = findViewById(R.id.btnLearnNumbers);
        btnLearnColours =findViewById(R.id.btnLearnColours);
        btnActivity =findViewById(R.id.btnActivity);

        learnColours();
        Activity();

    }

    public void learnColours(){
        btnLearnColours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(ColoursActivity.this, LearnColours.class);
                startActivity(loginInt);
            }
        });
    }

    public void Activity(){
        btnActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(ColoursActivity.this, Colours.class);
                startActivity(loginInt);
            }
        });
    }

}