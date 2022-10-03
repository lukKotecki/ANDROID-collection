package com.example.aplikacja_2022_10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mainButton;
    private TextView mainText;
    private CheckBox checkboxHarry, checkboxMatrix, checkboxJoker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainButton = findViewById(R.id.mainButton);
        mainText = findViewById(R.id.mainText);
        checkboxHarry = findViewById(R.id.checkboxHarry);
        checkboxMatrix = findViewById(R.id.checkboxMatrix);
        checkboxJoker = findViewById(R.id.checkboxJoker);

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

        checkboxHarry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    Toast.makeText(MainActivity.this, "Spoko że oglądałeś", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "powinieneś obejrzeć", Toast.LENGTH_SHORT).show();
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