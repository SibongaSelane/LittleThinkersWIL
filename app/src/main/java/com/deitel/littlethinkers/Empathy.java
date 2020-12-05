package com.deitel.littlethinkers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Empathy extends AppCompatActivity {

    Button btnOption2, btnOption1, btnOption3, btnOption4, btnNext;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empathy);

        btnOption1 = (Button)findViewById(R.id.btnOption1);
        btnOption2 = (Button)findViewById(R.id.btnOption2);
        btnOption3 = (Button)findViewById(R.id.btnOption3);
        btnOption4 = (Button)findViewById(R.id.btnOption4);
        btnNext = (Button)findViewById(R.id.btnNext);


        correct();
    }

    public void correct(){
        btnOption2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Empathy.this,"Incorrect!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void next(){
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(Empathy.this, EmpathyTwo.class);
                startActivity(loginInt);
            }
        });
    }

}