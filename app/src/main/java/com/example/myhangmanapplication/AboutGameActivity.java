package com.example.myhangmanapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutGameActivity extends AppCompatActivity {

    Button back_to_menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_game);
        back_to_menu = findViewById(R.id.button);
    }

    public void menu(View view) {
        Intent intent = new Intent(AboutGameActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
