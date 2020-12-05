package com.deitel.littlethinkers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FrequencyThree extends AppCompatActivity {

    Button btnQuit, btnNextt, btnCar, btnTruck, btnBus, btnPlane, btnVan, btnTrain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frequency_three);

        btnQuit = (Button)findViewById(R.id.btnQuit);
        btnNextt = (Button)findViewById(R.id.btnNextt);
        btnCar = (Button)findViewById(R.id.btnCar);
        btnTruck = (Button)findViewById(R.id.btnTruck);
        btnTrain = (Button)findViewById(R.id.btnTrain);
        btnVan = (Button)findViewById(R.id.btnVan);
        btnBus = (Button)findViewById(R.id.btnBus);
        btnPlane = (Button)findViewById(R.id.btnPlane);

        back();
        car();
        truck();
        plane();
        train();
        van();
        bus();
        next();

    }

    public void back(){
        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(FrequencyThree.this, FrequencyGames.class);
                startActivity(loginInt);
            }
        });
    }

    public void next(){
        btnNextt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(FrequencyThree.this, FrequencyFour.class);
                startActivity(loginInt);
            }
        });
    }

    public void car(){
        btnCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FrequencyThree.this,"Good job!!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void truck(){
        btnTruck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FrequencyThree.this,"Good job!!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void plane(){
        btnPlane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FrequencyThree.this,"Good job!!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void bus(){
        btnBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FrequencyThree.this,"Good job!!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void van(){
        btnVan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FrequencyThree.this,"Good job!!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void train(){
        btnTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FrequencyThree.this,"Good job!!",Toast.LENGTH_SHORT).show();
            }
        });
    }
}