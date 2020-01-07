package com.example.myhangmanapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameInstructionsActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_instructions);
        button = findViewById(R.id.button);
    }

    public void backToMenu(View view) {
        Intent intent = new Intent(GameInstructionsActivity.this,MainActivity.class);
        startActivity(intent);
    }

}
