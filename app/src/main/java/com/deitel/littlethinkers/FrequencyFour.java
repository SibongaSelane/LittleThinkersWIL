package com.deitel.littlethinkers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrequencyFour extends AppCompatActivity {

    Button btnQuit, btnNextt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frequency_four);


        btnQuit = (Button)findViewById(R.id.btnQuit);
        btnNextt = (Button)findViewById(R.id.btnNextt);

        back();
        next();

    }
    public void back(){
        btnQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(FrequencyFour.this, FrequencyHome.class);
                startActivity(loginInt);
            }
        });
    }
    public void next(){
        btnNextt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(FrequencyFour.this, FrequencyFive.class);
                startActivity(loginInt);
            }
        });
    }
}