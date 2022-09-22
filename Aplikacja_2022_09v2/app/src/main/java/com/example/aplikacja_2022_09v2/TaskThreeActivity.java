package com.example.aplikacja_2022_09v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TaskThreeActivity extends AppCompatActivity implements View.OnClickListener {


    private Button button1, button2, button3;
    private TextView helloText;
    private EditText nameText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_three);

        helloText = findViewById(R.id.helloText);
        nameText = findViewById(R.id.nameText);
        button2 = findViewById(R.id.helloButton2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                helloText.setText("2. Hello from set on click listener");
            }
        });

        button3 = findViewById(R.id.helloButton3);
        button3.setOnClickListener(this);
        helloText.setOnClickListener(this);
        nameText.setOnClickListener(this);
    }



    public void helloButtonClicked(View view){
        helloText.setText("1. Hello again!!\n"+ nameText.getText().toString());

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.helloButton3:
                helloText.setText("Hello from implementaton :)");
                break;
            case R.id.helloText:
                Toast.makeText(this, "Klikasz na tekst", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nameText:
                Toast.makeText(this, "Chcesz Edytować tekst", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
    }
}