package com.example.aplikacja_2022_09v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TaskTwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_two);
    }


    public void welcomeUser(View view){
        EditText name = findViewById(R.id.nameField);
        TextView welcomeMessage = findViewById(R.id.welcomeText);
        welcomeMessage.setText("Witaj "+name.getText().toString()+"\n Czy chczesz zagrać w grę?");
        






    }



    public void startGame(View view){



    }




}