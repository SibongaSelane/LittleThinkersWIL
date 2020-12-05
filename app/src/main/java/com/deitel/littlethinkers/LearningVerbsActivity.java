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
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;

public class LearningVerbsActivity extends AppCompatActivity {

    LinearLayout kick, fly, ring, drive, stir, talk, swim, read;

    private SoundPool soundPool;
    private int hintSound;

    MediaPlayer mediaPlayer, mediaPlayer1, mediaPlayer2, mediaPlayer3, mediaPlayer4, mediaPlayer5, mediaPlayer6, mediaPlayer7, mediaPlayerHint;

    ImageView imageHint;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_verbs);

        kick = findViewById(R.id.txtKick);
        fly = findViewById(R.id.txtFly);
        ring = findViewById(R.id.txtRing);
        drive = findViewById(R.id.txtDrive);
        stir = findViewById(R.id.txtStir);
        talk = findViewById(R.id.txtTalk);
        swim = findViewById(R.id.txtSwim);
        read = findViewById(R.id.txtRead);

        imageHint = findViewById(R.id.imageHint);
        btnBack = findViewById(R.id.btnBack);



        ShowGif();

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

        hintSound = soundPool.load(this, R.raw.kick,1);

        mediaPlayer = MediaPlayer.create(this,R.raw.kick);
        mediaPlayer1 = MediaPlayer.create(this,R.raw.fly);
        mediaPlayer2 = MediaPlayer.create(this,R.raw.ring);
        mediaPlayer3 = MediaPlayer.create(this,R.raw.drive);
        mediaPlayer4 = MediaPlayer.create(this,R.raw.swim);
        mediaPlayer5 = MediaPlayer.create(this,R.raw.talk);
        mediaPlayer6 = MediaPlayer.create(this,R.raw.read);
        mediaPlayer7 = MediaPlayer.create(this,R.raw.stir);
        mediaPlayerHint = MediaPlayer.create(this,R.raw.verblearning);

        Kick();
        Fly();
        Ring();
        Drive();
        Swim();
        Talk();
        Read();
        Stir();
        HelpButton();
        Back();
    }

    public void ShowGif(){
        ImageView imageView = findViewById(R.id.imgKick);
        Glide.with(this).load(R.drawable.kick).into(imageView);

        ImageView imageView1 = findViewById(R.id.imgfly);
        Glide.with(this).load(R.drawable.flying).into(imageView1);

        ImageView imageView2 = findViewById(R.id.imgRing);
        Glide.with(this).load(R.drawable.ring).into(imageView2);

        ImageView imageView3 = findViewById(R.id.imgDrive);
        Glide.with(this).load(R.drawable.drive).into(imageView3);

        ImageView imageView4 = findViewById(R.id.imgStir);
        Glide.with(this).load(R.drawable.stir).into(imageView4);

        ImageView imageView5 = findViewById(R.id.imgTalk);
        Glide.with(this).load(R.drawable.talk).into(imageView5);

        ImageView imageView6 = findViewById(R.id.imgSwim);
        Glide.with(this).load(R.drawable.swim).into(imageView6);

        ImageView imageView7 = findViewById(R.id.imgRead);
        Glide.with(this).load(R.drawable.read).into(imageView7);
    }

    private void Kick() {
        kick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();

            }
        });
    }

    private void Fly() {
        fly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer1.start();

            }
        });
    }

    private void Drive() {
        drive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer3.start();

            }
        });
    }

    private void Stir() {
        stir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer7.start();

            }
        });
    }

    private void Read() {
        read.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer6.start();

            }
        });
    }

    private void Swim() {
        swim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer4.start();

            }
        });
    }

    private void Ring() {
        ring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer2.start();

            }
        });
    }

    private void Talk() {
        talk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer5.start();

            }
        });
    }

    public void HelpButton(){
        imageHint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LearningVerbsActivity.this);

                builder.setMessage("What is a verb?\n" +
                        "A verb is a word used to describe an action. Here are some verbs");

                mediaPlayerHint.start();


                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.show();
            }
        });
    }

    // Move to verbs page
    public void Back(){
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change MainActivity to StudentHomeActivity
                Intent intLevel4 = new Intent(LearningVerbsActivity.this, VerbsActivity.class);
                startActivity(intLevel4);
            }
        });
    }

}