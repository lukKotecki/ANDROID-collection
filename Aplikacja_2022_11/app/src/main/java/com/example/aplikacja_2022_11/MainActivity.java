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
    private Button buttonHistory;
    private Button buttonBuild;
    private ListView citiesList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonHistory = findViewById(R.id.buttonHistory);
        buttonBuild = findViewById(R.id.buttonBuild);
        citiesList = findViewById(R.id.citiesList);

        buttonHistory.setOnClickListener(this);
        buttonBuild.setOnClickListener(this);


        ArrayList<String> cities = new ArrayList<>();

        cities.add("Kocław");
        cities.add("Bocław");
        cities.add("Zrocław");
        cities.add("Wroclaw");

        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cities);
        citiesList.setAdapter(citiesAdapter);
        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Klikinięto "+cities.get(i), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.buttonHistory:
                Toast.makeText(this, "Kliknięto Historie", Toast.LENGTH_SHORT).show();
                intent = new Intent(this,HistoryActivity.class);
                startActivity(intent);
                break;
            case R.id.buttonBuild:
                Toast.makeText(this, "Kliknięto Budowę", Toast.LENGTH_SHORT).show();
                intent = new Intent(this,BuildActivity.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.settings_menu:
                Toast.makeText(this, "settings selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.about_menu:
                Toast.makeText(this, "about clicked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}