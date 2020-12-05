package com.deitel.littlethinkers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrequencyGames extends AppCompatActivity {

    Button btnActivity1, btnActivity2, btnActivity3, btnActivity4, btnActivity5, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frequency_games);

        btnActivity1 = (Button)findViewById(R.id.btnActivity1);
        btnActivity2 = (Button)findViewById(R.id.btnActivity2);
        btnActivity3 = (Button)findViewById(R.id.btnActivity3);
        btnActivity4 = (Button)findViewById(R.id.btnActivity4);
        btnActivity5 = (Button)findViewById(R.id.btnActivity5);
        btnBack = (Button)findViewById(R.id.btnBack);

        activityOne();
        activityTwo();
        activityThree();
        activityFour();
        //activityFive();
        back();


    }

    public void activityOne(){
        btnActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(FrequencyGames.this, FrequencyOne.class);
                startActivity(loginInt);
            }
        });
    }

    public void activityTwo(){
        btnActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(FrequencyGames.this, FrequencyTwo.class);
                startActivity(loginInt);
            }
        });
    }

    public void activityThree(){
        btnActivity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(FrequencyGames.this, FrequencyThree.class);
                startActivity(loginInt);
            }
        });
    }

    public void activityFour(){
        btnActivity4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(FrequencyGames.this, FrequencyFour.class);
                startActivity(loginInt);
            }
        });
    }

    public void activityFive(){
        btnActivity5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(FrequencyGames.this, FrequencyFive.class);
                startActivity(loginInt);
            }
        });
    }
    public void back(){
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(FrequencyGames.this, FrequencyHome.class);
                startActivity(loginInt);
            }
        });
    }

}