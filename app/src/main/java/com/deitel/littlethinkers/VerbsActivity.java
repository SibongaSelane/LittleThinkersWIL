package com.deitel.littlethinkers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.deitel.littlethinkers.VerbsNouns.NounsVerbsActivity;

public class VerbsActivity extends AppCompatActivity {

    Button btnLearnVerbs, btnVerbsAct, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbs);

        btnLearnVerbs = findViewById(R.id.btnLearningVerbs);
        btnVerbsAct = findViewById(R.id.btnVerbsActivity);
        btnBack = findViewById(R.id.btnBack);

        LearningVerbs();
        VerbsActivity();
        Back();

    }

    // Move to Learning verbs page
    public void LearningVerbs() {
        btnLearnVerbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intLevel4 = new Intent(VerbsActivity.this, LearningVerbsActivity.class);
                startActivity(intLevel4);
            }
        });
    }

    // Move to Verbs activity page
    public void VerbsActivity() {
        btnVerbsAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intLevel4 = new Intent(VerbsActivity.this, VerbsAct_Activity.class);
                startActivity(intLevel4);
            }
        });
    }

    // Move to Student page
    public void Back(){
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intLevel4 = new Intent(VerbsActivity.this, NounsVerbsActivity.class);
                startActivity(intLevel4);
            }
        });
    }
}