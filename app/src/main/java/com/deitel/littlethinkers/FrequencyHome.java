package com.deitel.littlethinkers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrequencyHome extends AppCompatActivity {

    Button btnLearn, btnActivities;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frequency_home);

        btnLearn = findViewById(R.id.btnLearn);
        btnActivities = findViewById(R.id.btnActivities);

        learnNumbers();
        Activities();

    }
    public void learnNumbers(){
        btnLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(FrequencyHome.this, LearningWords.class);
                startActivity(loginInt);
            }
        });
    }

    public void Activities(){
        btnActivities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(FrequencyHome.this, FrequencyOne.class);
                startActivity(loginInt);
            }
        });
    }
}