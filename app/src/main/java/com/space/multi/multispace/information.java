package com.space.multi.multispace;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class information extends AppCompatActivity {

    ListView info_list;

    String[] planets = {"Mars","Pluto","Venus"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        info_list = (ListView) findViewById(R.id.information_list);
        info_list.setAdapter(new ArrayAdapter<String>(getApplicationContext(),R.layout.list_view_info,R.id.info_name,planets));

        info_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {
                    case 0:
                        Intent mars_info = new Intent(information.this, com.space.multi.multispace.mars_info.class);
                        startActivity(mars_info);
                        break;
                    case 1:
                        Intent pluto_info = new Intent(information.this,info_pluto.class);
                        startActivity(pluto_info);
                        break;
                    case 2:
                        Intent venus_info = new Intent(information.this, com.space.multi.multispace.venus_info.class);
                        startActivity(venus_info);
                        break;
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add_info,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.add_info:
                AlertDialog.Builder add_info = new AlertDialog.Builder(new ContextThemeWrapper(this,R.style.info_add_dialog));
                add_info.setTitle("Add your own information");
                add_info.setView(R.layout.info_add_dialog);
                add_info.setPositiveButton("Add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(information.this, "Your information successfully added!", Toast.LENGTH_SHORT).show();
                    }
                });

                add_info.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });


                add_info.create();
                add_info.show();

                break;
        }

        return super.onOptionsItemSelected(item);

    }

}
