package com.deitel.littlethinkers;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearnLifeSkills extends AppCompatActivity {

    Button btnProblem, btnInterpersonal, btnCritical, btnEmpathy, btnStress, btnSelf, btnControl, btnCreative, btnDecision, btnEffective;


    private SoundPool soundPool;
    private int s15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_life_skills);

        btnProblem = (Button)findViewById(R.id.btnProblem);
        btnInterpersonal = (Button)findViewById(R.id.btnInterpersonal);
        btnCritical = (Button)findViewById(R.id.btnCritical);
        btnEmpathy = (Button)findViewById(R.id.btnEmpathy);
        btnStress = (Button)findViewById(R.id.btnStress);
        btnSelf = (Button)findViewById(R.id.btnSelf);
        btnControl = (Button)findViewById(R.id.btnControl);
        btnCreative = (Button)findViewById(R.id.btnCreative);
        btnDecision = (Button)findViewById(R.id.btnDecision);
        btnEffective = (Button)findViewById(R.id.btnEffective);


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

        s15 = soundPool.load(this, R.raw.fifteen,1);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.problem);
        final MediaPlayer mediaPlayer1 = MediaPlayer.create(this,R.raw.interpersonal);
        final MediaPlayer mediaPlayer2= MediaPlayer.create(this,R.raw.critical);
        final MediaPlayer mediaPlayer3 = MediaPlayer.create(this,R.raw.effective);
        final MediaPlayer mediaPlayer4 = MediaPlayer.create(this,R.raw.decision);
        final MediaPlayer mediaPlayer5 = MediaPlayer.create(this,R.raw.creative);
        final MediaPlayer mediaPlayer6 = MediaPlayer.create(this,R.raw.emotionalcontrol);
        final MediaPlayer mediaPlayer7 = MediaPlayer.create(this,R.raw.stress);
        final MediaPlayer mediaPlayer8 = MediaPlayer.create(this,R.raw.self);
        final MediaPlayer mediaPlayer9 = MediaPlayer.create(this,R.raw.making);


       // mediaPlayer.start();

        btnProblem = (Button)findViewById(R.id.btnProblem);

        btnProblem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });

        btnInterpersonal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();

            }
        });


        btnCritical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();

            }
        });

        btnEmpathy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer9.start();

            }
        });

        btnStress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();

            }
        });

        btnSelf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer8.start();

            }
        });

        btnControl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();

            }
        });

        btnCreative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();

            }
        });

        btnDecision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();

            }
        });

        btnEffective.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();

            }
        });
    }


}