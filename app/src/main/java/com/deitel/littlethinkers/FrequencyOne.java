package com.deitel.littlethinkers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrequencyOne extends AppCompatActivity {

    Button btnBackk, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frequency_one);

        btnBackk = (Button)findViewById(R.id.btnBackk);
        btnNext = (Button)findViewById(R.id.btnNext);

        btnBackk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(FrequencyOne.this, FrequencyGames.class);
                startActivity(loginInt);
            }
        });

        next();



    }

    public void next(){
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // if(edtBird.text=!"bird"){
                    Intent loginInt = new Intent(FrequencyOne.this, FrequencyTwo.class);
                    startActivity(loginInt);
             //   }

            }
        });
    }


}