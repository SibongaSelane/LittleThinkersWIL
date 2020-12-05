package com.deitel.littlethinkers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.deitel.littlethinkers.VerbsNouns.NounsVerbsActivity;

public class NounsActivity extends AppCompatActivity {

    Button btnLearnNouns, btnNounsAct, btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nouns);

        btnLearnNouns = findViewById(R.id.btnLearningNouns);
        btnNounsAct = findViewById(R.id.btnNounsActivity);
        btnBack = findViewById(R.id.btnBack);

        LearningNouns();
        NounsActivity();
        Back();
    }

    // Move to Learning nouns page
    public void LearningNouns() {
        btnLearnNouns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intLevel4 = new Intent(NounsActivity.this, LearningNounsActivity.class);
                startActivity(intLevel4);
            }
        });
    }

    // Move to nouns activity page
    public void NounsActivity() {
        btnNounsAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intLevel4 = new Intent(NounsActivity.this, NounsAct_Activity.class);
                startActivity(intLevel4);
            }
        });
    }

    // Move to Student page
    public void Back(){
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intLevel4 = new Intent(NounsActivity.this, NounsVerbsActivity.class);
                startActivity(intLevel4);
            }
        });
    }
}