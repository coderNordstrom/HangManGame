package com.example.myhangmanapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button game_button;
    Button about_button;
    Button instructionbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        game_button = findViewById(R.id.game_button);
        about_button = findViewById(R.id.about_button);
        instructionbutton = findViewById(R.id.instruction_button);
    }

    public void aboutApp(View view) {
        Intent about_intent = new Intent(MainActivity.this, AboutGameActivity.class);
        startActivity(about_intent);
    }

    public void gamePlay(View view) {
        Intent gameplay_intent = new Intent(MainActivity.this, GamePlayActivity.class);
        startActivity(gameplay_intent);
    }

    public void instructions(View view) {
        Intent intent = new Intent(MainActivity.this,GameInstructionsActivity.class);
        startActivity(intent);
    }
}
