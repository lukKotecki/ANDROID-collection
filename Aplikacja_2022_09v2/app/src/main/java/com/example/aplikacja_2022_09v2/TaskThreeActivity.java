package com.example.aplikacja_2022_09v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TaskThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_three);
    }



    public void helloButtonClicked(View view){
        TextView text = findViewById(R.id.helloText);
        text.setText("Hello again!!");

    }


}