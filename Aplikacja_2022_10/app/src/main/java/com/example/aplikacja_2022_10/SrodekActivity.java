package com.example.aplikacja_2022_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class SrodekActivity extends AppCompatActivity {

    private ListView citiesList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_srodek);

        citiesList = findViewById(R.id.citiesList);
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Warszawa");
        cities.add("Poznań");
        cities.add("Wrocław");
        cities.add("Oława");
        cities.add("Opole");
        cities.add("Kudowa Zdrój");

        ArrayAdapter<String> citiesAdapter =  new ArrayAdapter<>(
                this,
                android.R.layout.select_dialog_singlechoice,
                cities
        );

        citiesList.setAdapter(citiesAdapter);

        citiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(SrodekActivity.this, cities.get(i)+" selected", Toast.LENGTH_SHORT).show();
            }
        });

    }


}