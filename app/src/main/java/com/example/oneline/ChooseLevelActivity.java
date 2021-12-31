package com.example.oneline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ChooseLevelActivity extends AppCompatActivity {
    ImageButton img;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_level);

        // main menu
        img = findViewById(R.id.backstart);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseLevelActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btn1 = findViewById(R.id.level01);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChooseLevelActivity.this, Level1Activity.class);
                startActivity(intent);
            }
        });



    }
}