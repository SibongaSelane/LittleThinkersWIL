package com.deitel.littlethinkers;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MathActivityGFour extends AppCompatActivity {


    Button btnDone, btnNext;
    EditText answer1, answer2, answer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_g_four);

        btnDone = findViewById(R.id.btnDone);
        btnNext = findViewById(R.id.btnNext);

        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);

        CheckAnswers();
    }

    public void CheckAnswers(){
        btnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String ans1, ans2, ans3;

                ans1 = answer1.getText().toString();
                ans2 = answer2.getText().toString();
                ans3 = answer3.getText().toString();

                AlertDialog.Builder builder = new AlertDialog.Builder(MathActivityGFour.this);
                if(ans1.equals("1") && ans2.equals("6") && ans3.equals("1")){
                    builder.setMessage("WELL DONE! You've completed the activity");

                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            btnDone.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent next = new Intent(MathActivityGFour.this, MathsActivity.class);
                                    startActivity(next);
                                }
                            });
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

}