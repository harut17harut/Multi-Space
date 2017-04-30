package com.space.multi.multispace;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class difficulty extends AppCompatActivity {

    Button easy,medium,hard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);

        easy = (Button) findViewById(R.id.easy);
        medium = (Button) findViewById(R.id.medium);
        hard = (Button) findViewById(R.id.hard);

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start_easy_game = new Intent(getApplicationContext(),easy_game.class);
                startActivity(start_easy_game);
            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(difficulty.this, "Coming soon", Toast.LENGTH_SHORT).show();
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(difficulty.this, "Coming soon", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
