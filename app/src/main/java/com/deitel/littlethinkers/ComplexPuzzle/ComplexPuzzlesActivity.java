package com.deitel.littlethinkers.ComplexPuzzle;

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
import android.widget.ImageView;

import com.deitel.littlethinkers.ComplexPuzzle.ANTC.AlvinAndTheChipmunksPuzzle;
import com.deitel.littlethinkers.ComplexPuzzle.AdventureTime.AdventureTimePuzzle;
import com.deitel.littlethinkers.ComplexPuzzle.Simpsons.TheSimpsonsPuzzle;
import com.deitel.littlethinkers.ComplexPuzzle.TomAndJerry.TomAndJerryPuzzle;
import com.deitel.littlethinkers.R;

public class ComplexPuzzlesActivity extends AppCompatActivity {

    ImageView imgTJ, imgAdventureTime, imgANTC, imgSimpsons;

    ImageView imageHint;

    private SoundPool soundPool;
    private int hintSound;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complex_puzzles);

        imgTJ = findViewById(R.id.btnTJ);
        imgAdventureTime = findViewById(R.id.btnAD);
        imgSimpsons = findViewById(R.id.btnSimpsons);
        imgANTC = findViewById(R.id.btnChipmunks);

        imageHint = findViewById(R.id.imageHint);

        TomAndJerryPuzzle();
        AdventureTimePuzzle();
        ChipmunksPuzzle();
        SimpsonsPuzzle();

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

        hintSound = soundPool.load(this, R.raw.studenthome,1);

        mediaPlayer = MediaPlayer.create(this,R.raw.puzzlemenu);

        Hint();

    }

    private void Hint() {
        imageHint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ComplexPuzzlesActivity.this);

                builder.setMessage("Click on a picture to start the puzzle. Have fun!");

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


    // Method - redirects to the Adventure time puzzle
    public void AdventureTimePuzzle(){
        // When the user clicks on the text -- the login page will open
        imgAdventureTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TJ = new Intent(ComplexPuzzlesActivity.this, AdventureTimePuzzle.class);
                startActivity(TJ);
            }
        });
    }

    // Method - redirects to the chipmunks puzzle
    public void ChipmunksPuzzle(){

        // When the user clicks on the text -- the login page will open
        imgANTC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TJ = new Intent(ComplexPuzzlesActivity.this, AlvinAndTheChipmunksPuzzle.class);
                startActivity(TJ);
            }
        });
    }

    // Method - redirects to the Simpsons puzzle
    public void SimpsonsPuzzle(){

        // When the user clicks on the text -- the login page will open
        imgSimpsons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TJ = new Intent(ComplexPuzzlesActivity.this, TheSimpsonsPuzzle.class);
                startActivity(TJ);
            }
        });
    }

    // Method - redirects to the tom and jerry puzzle
    public void TomAndJerryPuzzle(){

        // When the user clicks on the text -- the login page will open
        imgTJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TJ = new Intent(ComplexPuzzlesActivity.this, TomAndJerryPuzzle.class);
                startActivity(TJ);
            }
        });
    }


}
