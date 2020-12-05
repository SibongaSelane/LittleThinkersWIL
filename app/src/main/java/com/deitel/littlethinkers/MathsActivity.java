package com.deitel.littlethinkers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MathsActivity extends AppCompatActivity {

    Button btnMaths, btnMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths);
        btnMaths = findViewById(R.id.btnMathsB);
        btnMenu = findViewById(R.id.btnMenu);

        btnMaths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intLevel4 = new Intent(MathsActivity.this, MathActivityGOne.class);
                startActivity(intLevel4);            }
        });
    }
}