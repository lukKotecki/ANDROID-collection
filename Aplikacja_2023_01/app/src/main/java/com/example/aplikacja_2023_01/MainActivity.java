package com.example.aplikacja_2023_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Intent intent = null;
    private Button mainButtonFileManager, mainButtonMessenger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainButtonFileManager = findViewById(R.id.mainButtonFileManager);
        mainButtonFileManager.setOnClickListener(this);
        mainButtonMessenger = findViewById(R.id.mainButtonMessenger);
        mainButtonMessenger.setOnClickListener(this);

        ActivityCompat.requestPermissions(this,
                new String[] {Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE},
                PackageManager.PERMISSION_GRANTED);


    }


    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.mainButtonFileManager:
                intent = new Intent(this, FileManagerActivity.class);
                startActivity(intent);
                break;
            case R.id.mainButtonMessenger:
                intent = new Intent(this, MessengerActivity.class);
                startActivity(intent);
                break;

            default:
                break;
        }
    }
}