package com.space.multi.multispace;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

public class game_activity extends AppCompatActivity {

    ProgressBar game_load;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_activity);

        game_load = (ProgressBar) findViewById(R.id.game_load_bar);

         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 Intent run_game = new Intent(game_activity.this, game_menu.class);
                 startActivity(run_game);
             }
         },2000);

    }

}
