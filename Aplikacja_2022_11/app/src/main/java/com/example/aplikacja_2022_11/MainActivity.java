package com.example.aplikacja_2022_11;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Intent intent;
    private Button buttonHistory, buttonBuild, buttonDiaphragm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonHistory = findViewById(R.id.buttonHistory);
        buttonHistory.setOnClickListener(this);
        buttonBuild = findViewById(R.id.buttonBuild);
        buttonBuild.setOnClickListener(this);
        buttonDiaphragm = findViewById(R.id.buttonDiaphragm);
        buttonDiaphragm.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.buttonHistory:
                intent = new Intent(this,HistoryActivity.class);
                break;
            case R.id.buttonBuild:
                intent = new Intent(this,BuildActivity.class);
                break;
            case R.id.buttonDiaphragm:
                intent = new Intent (this, DiaphragmBreathing.class);
                break;
            default:
                break;
        }
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        MenuPopulateClass menuPopulate = new MenuPopulateClass();
        menuPopulate.menuPopulate(item,this);

        return super.onOptionsItemSelected(item);
    }


}