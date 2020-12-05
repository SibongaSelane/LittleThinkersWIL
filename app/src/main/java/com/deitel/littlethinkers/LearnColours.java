package com.deitel.littlethinkers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnColours extends AppCompatActivity {

    private Button btnLevel1, btnLevel2, btnLevel3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_colours);

        btnLevel1 = (Button)findViewById(R.id.btnLevel1);
        btnLevel2 = (Button)findViewById(R.id.btnLevel2);
        btnLevel3 = (Button)findViewById(R.id.btnLevel3);

        colours();
        primary();
        secondary();

    }

    public void colours(){
        btnLevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(LearnColours.this, LearnAllColours.class);
                startActivity(loginInt);
            }
        });
    }

    public void primary(){}
    public void secondary(){}

}