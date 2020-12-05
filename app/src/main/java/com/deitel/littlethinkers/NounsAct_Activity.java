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

public class NounsAct_Activity extends AppCompatActivity {

    EditText edtDog, edtMrsJ, edtPiano, edtZoo, edtBook, edtCat, edtGrandma;
    Button btnDone, btnBack;


    String dog, mrsJ, piano, zoo, book, cat, grandma;

    ImageView imageHint;
    private SoundPool soundPool;
    private int hintSound;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nouns_act_);

        edtDog = findViewById(R.id.edtDog);
        edtMrsJ = findViewById(R.id.edtMrsJ);
        edtPiano = findViewById(R.id.edtPiano);
        edtZoo = findViewById(R.id.edtZoo);
        edtBook = findViewById(R.id.edtBook);
        edtCat = findViewById(R.id.edtCat);
        edtGrandma = findViewById(R.id.edtGrandma);

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

                dog = edtDog.getText().toString();
                mrsJ = edtMrsJ.getText().toString();
                piano = edtPiano.getText().toString();
                zoo = edtZoo.getText().toString();
                book = edtBook.getText().toString();
                cat = edtCat.getText().toString();
                grandma = edtGrandma.getText().toString();


                AlertDialog.Builder builder = new AlertDialog.Builder(NounsAct_Activity.this);
                if(dog.equals("DOG") && mrsJ.equals("MRS.JONES") && piano.equals("PIANO") &&
                        zoo.equals("ZOO") && book.equals("BOOK") &&
                        cat.equals("CAT") && grandma.equals("GRANDMA")){

                    builder.setMessage("WELL DONE! You know your nouns");

                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent loginInt = new Intent(NounsAct_Activity.this, NounsActivity.class);
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
                AlertDialog.Builder builder = new AlertDialog.Builder(NounsAct_Activity.this);

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
                Intent intLevel4 = new Intent(NounsAct_Activity.this, NounsActivity.class);
                startActivity(intLevel4);
            }
        });
    }




}