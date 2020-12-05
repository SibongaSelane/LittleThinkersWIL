package com.deitel.littlethinkers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LifeSkillsHome extends AppCompatActivity {

    Button btnLearn,btnActivities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_skills_home);

        btnLearn = findViewById(R.id.btnLearn);
        btnActivities = findViewById(R.id.btnActivities);

        learn();
        activities();

    }

    public void learn(){
        btnLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(LifeSkillsHome.this, LearnLifeSkills.class);
                startActivity(loginInt);
            }
        });
    }

    public void activities(){
        btnActivities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(LifeSkillsHome.this, LifeActivities.class);
                startActivity(loginInt);
            }
        });
    }
}