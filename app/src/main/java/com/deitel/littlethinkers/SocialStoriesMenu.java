package com.deitel.littlethinkers;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

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

public class SocialStoriesMenu extends AppCompatActivity {

    Button btnHitting, btnAngry, btnDirections, btnPlaying, btnBack;

    ImageView imageHint;
    private SoundPool soundPool;
    private int hintSound;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_stories_menu);
        btnAngry = findViewById(R.id.btnAngry);
        btnHitting = findViewById(R.id.btnHitting);
        btnPlaying = findViewById(R.id.btnPlay);
        btnDirections = findViewById(R.id.btnCS);
        btnBack = findViewById(R.id.btnBack);

        imageHint = findViewById(R.id.imageHint);


        Back();
        PlayingWithOthers();
        HittingOthers();
        Directions();
        Angry();

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

        hintSound = soundPool.load(this, R.raw.welcomesocial,1);

        mediaPlayer = MediaPlayer.create(this,R.raw.welcomesocial);

    }

    public void HelpButton(){
        imageHint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(SocialStoriesMenu.this);

                builder.setMessage("Hi!\n" +
                        "Welcome to social stories\n" +
                        "You may proceed to click on any of the butttons");

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

    // Move to student home page
    private void Back(){
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change to student
                Intent next = new Intent(SocialStoriesMenu.this, StudentHomeActivity.class);
                startActivity(next);
            }
        });
    }

    // Move to creating social story
    private void HittingOthers(){
        btnHitting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(SocialStoriesMenu.this, HittingOthersStory.class);
                startActivity(next);
            }
        });
    }

    // Move to creating social story
    private void Directions(){
        btnDirections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(SocialStoriesMenu.this, DirectionsStory.class);
                startActivity(next);
            }
        });
    }

    // Move to creating social story
    private void PlayingWithOthers(){
        btnPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(SocialStoriesMenu.this, PlayingWithOthersStory.class);
                startActivity(next);
            }
        });
    }

    // Move to creating social story
    private void Angry(){
        btnAngry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(SocialStoriesMenu.this, AngryStory.class);
                startActivity(next);
            }
        });
    }


}