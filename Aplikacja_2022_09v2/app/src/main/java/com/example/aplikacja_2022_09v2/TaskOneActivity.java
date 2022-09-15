package com.example.aplikacja_2022_09v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TaskOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_one);
    }



    public void sendCredentials(View view){

        EditText editTextName = findViewById(R.id.editTextName);
        TextView textView = findViewById(R.id.textViewName);
        textView.setText(editTextName.getText().toString());

        editTextName = findViewById(R.id.editTextSurname);
        textView = findViewById(R.id.textViewSurname);
        textView.setText(editTextName.getText().toString());

        editTextName = findViewById(R.id.editTextMail);
        textView = findViewById(R.id.textViewEmail);
        textView.setText(editTextName.getText().toString());


    }



}