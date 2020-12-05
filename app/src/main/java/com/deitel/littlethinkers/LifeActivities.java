package com.deitel.littlethinkers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LifeActivities extends AppCompatActivity {

    Button btnEmpathy, btnQuiz, btnEmotion, btnDecision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_activities);

        btnEmpathy = (Button)findViewById(R.id.btnEmpathy);
        btnQuiz = (Button)findViewById(R.id.btnQuiz);
        btnEmotion = (Button)findViewById(R.id.btnEmotion);
        btnDecision = (Button)findViewById(R.id.btnDecision);


        empathy();

    }

    public void empathy(){
        btnEmpathy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(LifeActivities.this, Empathy.class);
                startActivity(loginInt);
            }
        });
    }

}