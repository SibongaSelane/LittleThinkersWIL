package com.deitel.littlethinkers;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class LearningNounsActivity extends AppCompatActivity {

    Button btnBack;

    private SoundPool soundPool;
    private int hintSound;

    MediaPlayer mediaPlayer;

    ImageView imageHint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_nouns);

        btnBack = findViewById(R.id.btnBack);
        imageHint = findViewById(R.id.imageHint);


        Back();
        HelpButton();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setMaxStreams(1)
                    .setAudioAttributes(audioAttributes)
                    .build();

        } else {
            soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        }

        hintSound = soundPool.load(this, R.raw.nouns,1);

        mediaPlayer = MediaPlayer.create(this,R.raw.nouns);
    }

    public void HelpButton(){
        imageHint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LearningNounsActivity.this);

                builder.setMessage("What is a noun?\n" +
                        "A noun is a word that names a person, a place, a thing or an idea.\n" +
                        "Here are some nouns");

                mediaPlayer.start();


                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.show();
            }
        });
    }


    // Move to Nouns page
    public void Back(){
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change MainActivity to StudentHomeActivity
                Intent intLevel4 = new Intent(LearningNounsActivity.this, NounsActivity.class);
                startActivity(intLevel4);
            }
        });
    }

}