package com.deitel.littlethinkers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AngryStory extends AppCompatActivity {
    Button btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angry_story);
        btnBack = findViewById(R.id.btnBack);

        Back();
    }

    // Move to social stories page
    private void Back(){
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change to student
                Intent next = new Intent(AngryStory.this, SocialStoriesMenu.class);
                startActivity(next);
            }
        });
    }

}