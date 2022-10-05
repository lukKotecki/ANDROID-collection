package com.example.aplikacja_2022_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LeftActivity extends AppCompatActivity implements View.OnClickListener {

    private Button leftButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_left);

        leftButton = findViewById(R.id.leftButtonSend);
        leftButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()){
            case R.id.leftButtonSend:
            intent = new Intent(this,MainActivity.class);
            startActivity(intent);
                break;
            default:
                break;
        }

    }
}