package com.example.aplikacja_2022_09v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class TaskFourActivity extends AppCompatActivity {


    private CheckBox checkBoxHarry, checkBoxMatrix, checkBoxJoker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_four);

        checkBoxHarry = findViewById(R.id.checkboxHarry);
        checkBoxMatrix = findViewById(R.id.checkboxMatrix);
        checkBoxJoker = findViewById(R.id.checkboxJoker);

        checkBoxHarry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(TaskFourActivity.this, "Brawo oglądałeś Harrego Pottera :)", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(TaskFourActivity.this, "Musisz obejrzeć Harrago Portiera", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}