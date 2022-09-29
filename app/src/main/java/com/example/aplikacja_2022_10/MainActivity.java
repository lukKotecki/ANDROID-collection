package com.example.aplikacja_2022_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mainButton;
    private TextView mainText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainButton = findViewById(R.id.mainButton);
        mainText = findViewById(R.id.mainText);

        mainButton.setOnClickListener(this);
        mainButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                Toast.makeText(MainActivity.this, "Długo kliknięto ten klawisz", Toast.LENGTH_LONG).show();
                return false;
            }
        });

        mainButton.setOnHoverListener(new View.OnHoverListener() {
            @Override
            public boolean onHover(View view, MotionEvent motionEvent) {

                mainText.setText("BubaBuba");


                return false;
            }
        });




    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.mainButton:
                Toast.makeText(this, "Kliknięto krótko", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;


        }
    }


}