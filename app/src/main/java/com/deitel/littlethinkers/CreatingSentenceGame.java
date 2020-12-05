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
import android.widget.EditText;
import android.widget.ImageView;

public class CreatingSentenceGame extends AppCompatActivity {

    EditText ansMomKitchen, ansMango, ansToys, ansDadPasta, andEarth, ansCat, ansGuitar, ansFam, ansDadDrive;
    Button btnDone, btnBack;

    String answer1, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9;

    ImageView hint;
    private SoundPool soundPool;
    private int hintSound;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creating_sentence_game);
        ansMomKitchen = findViewById(R.id.ansMomKitchen);
        ansMango = findViewById(R.id.ansMango);
        ansToys = findViewById(R.id.ansToys);
        ansDadPasta = findViewById(R.id.dadPasta);
        andEarth = findViewById(R.id.andEarth);
        ansCat = findViewById(R.id.ansCat);
        ansGuitar = findViewById(R.id.ansGuitar);
        ansFam = findViewById(R.id.ansFam);
        ansDadDrive = findViewById(R.id.ansDadDrive);

        btnDone = findViewById(R.id.btnDone);
        btnBack = findViewById(R.id.btnBack);
        hint = findViewById(R.id.imageHint);


        checkAnswers();
        Back();
        Hint();

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

        hintSound = soundPool.load(this, R.raw.creatingsentences,1);

        mediaPlayer = MediaPlayer.create(this,R.raw.creatingsentences);
    }

    public void checkAnswers() {
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                answer1 = ansMomKitchen.getText().toString();
                answer2 = ansMango.getText().toString();
                answer3 = ansToys.getText().toString();
                answer4 = andEarth.getText().toString();
                answer5 = ansCat.getText().toString();
                answer6 = ansDadPasta.getText().toString();
                answer7 = ansGuitar.getText().toString();
                answer8 = ansFam.getText().toString();
                answer9 = ansDadDrive.getText().toString();


                AlertDialog.Builder builder = new AlertDialog.Builder(CreatingSentenceGame.this);
                if (answer1.equals("My mother is in the kitchen") && answer2.equals("These mangoes are juicy") &&
                        answer3.equals("Please put away your toys") && answer4.equals("Earth is a planet") &&
                        answer5.equals("The cat is black") && answer6.equals("Father cooks delicious pasta every evening") &&
                        answer7.equals("John plays the guitar very well") && answer8.equals("I love my family") &&
                        answer9.equals("Dad drives us to school everyday")) {

                    builder.setMessage("WELL DONE!");


                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent loginInt = new Intent(CreatingSentenceGame.this, SentencesActivity.class);
                            startActivity(loginInt);
                        }
                    });
                    builder.show();

                } else {

                    builder.setMessage("Oops! Try Again");
                    ansDadDrive.setText("");
                    ansFam.setText("");
                    ansGuitar.setText("");
                    ansDadPasta.setText("");
                    ansCat.setText("");
                    andEarth.setText("");
                    ansToys.setText("");
                    ansMomKitchen.setText("");
                    ansMango.setText("");


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

    // Move to sentence page
    private void Back() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(CreatingSentenceGame.this, SentencesActivity.class);
                startActivity(next);
            }
        });
    }

    private void Hint(){
        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(CreatingSentenceGame.this);

                builder.setTitle("HOW TO PLAY THE GAME");
                builder.setMessage("Arrange the words in white to form meaningful sentences.\n" +
                        "Hint: The image next to it is a clue");

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
}