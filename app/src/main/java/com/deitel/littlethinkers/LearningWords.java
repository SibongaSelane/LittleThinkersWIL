package com.deitel.littlethinkers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearningWords extends AppCompatActivity {

    Button btnTransportation, btnInsects, btnAnimals, btnFruit, btnVegetables;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_words);

        btnTransportation = (Button)findViewById(R.id.btnTransportation);
        btnInsects = (Button)findViewById(R.id.btnInsects);
        btnAnimals = (Button)findViewById(R.id.btnAnimals);
        btnFruit = (Button)findViewById(R.id.btnFruit);
        btnVegetables = (Button)findViewById(R.id.btnVegetables);

        transportation();
        insects();
        animals();
        fruit();
        vegetables();
    }

    public void transportation(){
        btnTransportation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(LearningWords.this, Transportation.class);
                startActivity(loginInt);
            }
        });
    }

    public void insects(){
        btnInsects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(LearningWords.this, Insects.class);
                startActivity(loginInt);
            }
        });
    }

    public void animals(){
    btnAnimals.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent loginInt = new Intent(LearningWords.this, Animals.class);
            startActivity(loginInt);
        }
    });
    }

    public void fruit(){
        btnFruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(LearningWords.this, Fruit.class);
                startActivity(loginInt);
            }
        });
    }

    public void vegetables(){
        btnVegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(LearningWords.this, Vegetables.class);
                startActivity(loginInt);
            }
        });
    }

}