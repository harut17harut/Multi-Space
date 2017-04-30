package com.space.multi.multispace;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class easy_game extends AppCompatActivity {

    Button mercury,saturn,earth,mars;

    int attempts = 2;

    TextView show_attempts;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_game);

        mercury = (Button) findViewById(R.id.mercury);
        saturn = (Button) findViewById(R.id.saturn);
        earth = (Button) findViewById(R.id.earth);
        mars = (Button) findViewById(R.id.mars);

        show_attempts = (TextView) findViewById(R.id.attempts1);
        show_attempts.setText("Attempts:" + attempts);



        mercury.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attempts--;
                show_attempts.setText("Attempts:" + attempts);
                if(attempts == 0)
                {
                    finish();
                    Toast.makeText(getApplicationContext(),"You lose",Toast.LENGTH_LONG).show();
                }
                mercury.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });

        saturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attempts--;
                show_attempts.setText("Attempts:" + attempts);

                if(attempts == 0)
                {
                    finish();
                    Toast.makeText(getApplicationContext(),"You lose",Toast.LENGTH_LONG).show();
                }
                saturn.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });

        earth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                attempts--;
                show_attempts.setText("Attempts:" + attempts);

                if(attempts == 0)
                {
                    Intent goBack = new Intent(getApplicationContext(), game_menu.class);
                    startActivity(goBack);
                    Toast.makeText(getApplicationContext(),"You lose",Toast.LENGTH_LONG).show();
                }
                earth.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });

        mars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mars.setBackgroundColor(getResources().getColor(R.color.Green));
                Toast.makeText(easy_game.this, "You won!!!", Toast.LENGTH_SHORT).show();
                Intent go_to_second_question = new Intent(getApplicationContext(),second_qusetion.class);
                startActivity(go_to_second_question);
            }
        });

    }
}
