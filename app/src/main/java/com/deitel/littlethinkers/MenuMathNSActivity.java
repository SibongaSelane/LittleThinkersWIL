package com.deitel.littlethinkers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuMathNSActivity extends AppCompatActivity {

    Button btnMath, btnMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_math_n_s);
        btnMath = findViewById(R.id.btnMath);
        btnMenu = findViewById(R.id.btnMenu);

        MainMenu();
        Maths();
    }

    // Move to maths page
    private void Maths() {
        btnMath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(MenuMathNSActivity.this, MathsActivity.class);
                startActivity(next);
            }
        });
    }


    // Move to student home page
    private void MainMenu() {
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // change MainActivity to studentHomeActivity
                Intent next = new Intent(MenuMathNSActivity.this, StudentHomeActivity.class);
                startActivity(next);
            }
        });
    }
}