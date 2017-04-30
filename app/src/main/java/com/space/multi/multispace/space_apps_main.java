package com.space.multi.multispace;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class space_apps_main extends AppCompatActivity {

    EditText username;
    EditText password;

    Button login, register;
    TextView click_here;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_apps_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        username.setHintTextColor(getResources().getColor(R.color.White));
        password.setHintTextColor(getResources().getColor(R.color.White));

        login = (Button) findViewById(R.id.login);
        register = (Button) findViewById(R.id.register);

        final String username_data = "M";
        final String password_data = "m";

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((username.getText().toString().equals(username_data)) && (password.getText().toString().equals(password_data)))
                {
                    Intent login = new Intent(space_apps_main.this, game_activity.class);
                    startActivity(login);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Login failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register = new Intent(space_apps_main.this, register.class);
                startActivity(register);
            }
        });
    }

}
