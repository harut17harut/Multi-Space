package com.space.multi.multispace;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class register extends AppCompatActivity {

    EditText username,surname,password,confirm_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = (EditText) findViewById(R.id.register_username);
        surname = (EditText) findViewById(R.id.register_surname);
        password = (EditText) findViewById(R.id.register_password);
        confirm_password = (EditText) findViewById(R.id.register_confirm_password);

        username.setHintTextColor(getResources().getColor(R.color.White));
        surname.setHintTextColor(getResources().getColor(R.color.White));
        password.setHintTextColor(getResources().getColor(R.color.White));
        confirm_password.setHintTextColor(getResources().getColor(R.color.White));

    }

}
