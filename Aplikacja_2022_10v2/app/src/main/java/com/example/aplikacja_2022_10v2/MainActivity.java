package com.example.aplikacja_2022_10v2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button btnShowSnackbar;
    private ConstraintLayout parent;
    private MaterialCardView cardView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowSnackbar = findViewById(R.id.button);
        parent = findViewById(R.id.parent);
        cardView = findViewById(R.id.cardView);

        btnShowSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnackar();
            }
        });
        
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Card clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void showSnackar(){
        Snackbar.make(parent, "This is snackbar", Snackbar.LENGTH_INDEFINITE).setAction("Retry", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Kliknięto Retry", Toast.LENGTH_SHORT).show();
            }
        }).setActionTextColor(getColor(R.color.white))
                .setTextColor(Color.RED)
                .show();
    }

}