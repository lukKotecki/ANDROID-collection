package com.example.aplikacja_2022_09v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TaskThreeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_three);


        Button button = findViewById(R.id.helloButton2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView text = findViewById(R.id.helloText);
                text.setText("2. Hello from set on click listener");
            }
        });

        Button but = findViewById(R.id.helloButton3);
        but.setOnClickListener(this);

    }



    public void helloButtonClicked(View view){
        TextView text = findViewById(R.id.helloText);
        text.setText("1. Hello again!!");

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.helloButton3:
                TextView text = findViewById(R.id.helloText);
                text.setText("Hello from implementaton :)");
                break;


        }
    }
}