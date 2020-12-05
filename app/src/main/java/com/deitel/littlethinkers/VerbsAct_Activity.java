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
import android.widget.EditText;
import android.widget.ImageView;

public class VerbsAct_Activity extends AppCompatActivity {

    EditText edtSwim, edtDrive, edtRead, edtTalk, edtRing, edtKick, edtStir, edtFly;
    Button btnDone, btnBack;

    String swim, drive, kick, read, stir, fly, ring, talk;

    ImageView imageHint;
    private SoundPool soundPool;
    private int hintSound;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbs_act_);

        edtSwim = findViewById(R.id.edtSwim);
        edtDrive = findViewById(R.id.edtDrive);
        edtFly = findViewById(R.id.edtFly);
        edtKick = findViewById(R.id.edtKick);
        edtRing = findViewById(R.id.edtRing);
        edtRead = findViewById(R.id.edtRead);
        edtStir = findViewById(R.id.edtStir);
        edtTalk = findViewById(R.id.edtTalk);


        btnDone = findViewById(R.id.btnDone);
        btnBack = findViewById(R.id.btnBack);
        imageHint = findViewById(R.id.imageHint);


        CheckAnswers();
        HelpButton();
        Back();

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

        hintSound = soundPool.load(this, R.raw.verbsworksheet,1);

        mediaPlayer = MediaPlayer.create(this,R.raw.verbsworksheet);
    }

    public void CheckAnswers(){
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                swim = edtSwim.getText().toString();
                drive = edtDrive.getText().toString();
                kick = edtKick.getText().toString();
                read = edtRead.getText().toString();
                stir = edtStir.getText().toString();
                fly = edtFly.getText().toString();
                ring = edtRing.getText().toString();
                talk = edtTalk.getText().toString();


                AlertDialog.Builder builder = new AlertDialog.Builder(VerbsAct_Activity.this);
                if(swim.equals("SWIM") && read.equals("READ") && stir.equals("STIR") &&
                        drive.equals("DRIVE") && ring.equals("RING") &&
                        talk.equals("TALK") && fly.equals("FLY") && kick.equals("KICK") ){

                    builder.setMessage("WELL DONE! You know your verbs");

                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent loginInt = new Intent(VerbsAct_Activity.this, VerbsActivity.class);
                            startActivity(loginInt);
                        }
                    });
                    builder.show();

                }else{

                    builder.setMessage("Oops! Try Again");

                }
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                builder.show();
            }
        });
    }

    public void HelpButton(){
        imageHint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(VerbsAct_Activity.this);

                builder.setTitle("HOW TO COMPLETE THE ACTIVITY");
                builder.setMessage("Use the words given in the box, to fill in the blanks.");

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

    // Move to Student page
    public void Back(){
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Change MainActivity to StudentHomeActivity
                Intent intLevel4 = new Intent(VerbsAct_Activity.this, VerbsActivity.class);
                startActivity(intLevel4);
            }
        });
    }

}