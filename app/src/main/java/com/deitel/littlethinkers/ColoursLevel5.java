package com.deitel.littlethinkers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ColoursLevel5 extends AppCompatActivity {

    private Button mButtonChoice1, mButtonChoice2, mButtonChoice3, mButtonChoice4, mButtonChoice5,mButtonChoice6, quit, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colours_level5);

        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        mButtonChoice5 = (Button)findViewById(R.id.choice5);
        mButtonChoice6 = (Button)findViewById(R.id.choice6);
        quit = (Button)findViewById(R.id.quit);
        next = (Button)findViewById(R.id.next);

        Choice1();
        Choice2();
        Choice3();
        Choice4();
        Choice5();
        Choice6();
        quit();
    }

    public void Choice1(){
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ColoursLevel5.this,"Incorrect!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void Choice2(){
     mButtonChoice2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Toast.makeText(ColoursLevel5.this,"Incorrect!",Toast.LENGTH_SHORT).show();
         }
     });
    }

    public void Choice3(){
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ColoursLevel5.this,"Incorrect!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void Choice4(){
        Toast.makeText(ColoursLevel5.this,"Incorrect!",Toast.LENGTH_SHORT).show();
    }

    public void Choice5(){
     mButtonChoice4.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Toast.makeText(ColoursLevel5.this,"Incorrect!",Toast.LENGTH_SHORT).show();
         }
     });
    }

    public void Choice6(){
    mButtonChoice6.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(ColoursLevel5.this,"Incorrect!",Toast.LENGTH_SHORT).show();
        }
    });
    }

    public void quit(){
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginInt = new Intent(ColoursLevel5.this, StudentHomeActivity.class);
                startActivity(loginInt);
            }
        });
    }

}