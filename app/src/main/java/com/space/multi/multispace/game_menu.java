package com.space.multi.multispace;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

public class game_menu extends AppCompatActivity {

    Button game,contact,about,information;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_menu);

        game = (Button) findViewById(R.id.game);
        contact = (Button) findViewById(R.id.contacts);
        about = (Button) findViewById(R.id.about);
        information = (Button) findViewById(R.id.information);

        game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder choose_game_style = new AlertDialog.Builder(new ContextThemeWrapper(game_menu.this,R.style.choose_game_dialog));
                View view = getLayoutInflater().inflate(R.layout.choose_game_dialog,null);

                Button space_game = (Button) view.findViewById(R.id.play_space_greecon);
                Button beach_game = (Button) view.findViewById(R.id.play_beach_greecon);
                choose_game_style.setView(view);

                choose_game_style.create();
                choose_game_style.show();

                space_game.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent play_space_game = new Intent(getApplicationContext(), com.space.multi.multispace.game.class);
                        startActivity(play_space_game);
                    }
                });
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(game_menu.this,contacts.class);
                startActivity(contact);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(game_menu.this, about.class);
                startActivity(about);
            }
        });

        information.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent information = new Intent(game_menu.this,information.class);
                startActivity(information);
            }
        });

    }
}
