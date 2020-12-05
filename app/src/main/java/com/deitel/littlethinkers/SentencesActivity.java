package com.deitel.littlethinkers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SentencesActivity extends AppCompatActivity {

    Button btnBack, btnStart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sentences);

        btnBack = findViewById(R.id.btnBack);
        btnStart = findViewById(R.id.btnStart);

        Back();
        Start();
    }

    // Move to student home page
    private void Back(){
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(SentencesActivity.this, StudentHomeActivity.class);
                startActivity(next);
            }
        });
    }

    // Move to creating sentences game
    private void Start(){
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(SentencesActivity.this, CreatingSentenceGame.class);
                startActivity(next);
            }
        });
    }
}