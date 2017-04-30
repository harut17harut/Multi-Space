package com.space.multi.multispace;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class second_qusetion extends AppCompatActivity {

    EditText answer;
    Button check;

    String current_answer = "Mercury";
    String current_answer2 = "mercury";

    int attemps = 2;
    TextView attemtps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_qusetion);

        answer = (EditText) findViewById(R.id.answer);
        check = (Button) findViewById(R.id.check);

        attemtps = (TextView) findViewById(R.id.attempts1);

       check.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(answer.getText().toString().equals(current_answer) || answer.getText().toString().equals(current_answer2))
               {
                   Toast.makeText(getApplicationContext(), "You won", Toast.LENGTH_SHORT).show();
                   Intent startAgain = new Intent(getApplicationContext(),game_menu.class);
                   startActivity(startAgain);
               }
               else
               {
                   attemps--;

                   if(attemps == 0)
                   {
                       Intent startAgain1 = new Intent(getApplicationContext(),game_menu.class);
                       startActivity(startAgain1);
                       Toast.makeText(getApplicationContext(),"You lose!!!",Toast.LENGTH_LONG).show();
                   }
               }

               attemtps.setText("Attempts" + attemps);
           }
       });

    }

}
