package com.deitel.littlethinkers.VerbsNouns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.deitel.littlethinkers.NounsActivity;
import com.deitel.littlethinkers.R;
import com.deitel.littlethinkers.StudentHomeActivity;
import com.deitel.littlethinkers.VerbsActivity;

public class NounsVerbsActivity extends AppCompatActivity {

    Button btnVerbs, btnNouns, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nouns_verbs);

        btnNouns = findViewById(R.id.btnNouns);
        btnVerbs = findViewById(R.id.btnVerbs);
        btnBack = findViewById(R.id.btnBack);

        Verbs();
        Nouns();
        Back();

    }

    // Move to Verbs page
    public void Verbs(){
        btnVerbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intLevel4 = new Intent(NounsVerbsActivity.this, VerbsActivity.class);
                startActivity(intLevel4);
            }
        });
    }

    // Move to Nouns page
    public void Nouns(){
        btnNouns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intLevel4 = new Intent(NounsVerbsActivity.this, NounsActivity.class);
                startActivity(intLevel4);
            }
        });
    }

    // Move to Student page
    public void Back(){
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intLevel4 = new Intent(NounsVerbsActivity.this, StudentHomeActivity.class);
                startActivity(intLevel4);
            }
        });
    }


}