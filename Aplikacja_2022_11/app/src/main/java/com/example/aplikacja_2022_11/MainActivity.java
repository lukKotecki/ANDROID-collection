package com.example.aplikacja_2022_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

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
}