package com.example.aplikacja_2022_09v2;

import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
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

        LinearLayout linearLayout = findViewById(R.id.linearLayout);

        TextView questionText = new TextView(linearLayout.getContext());
        questionText.setText("Wybierz opcję");
        linearLayout.addView(questionText);

        Button klawiszTak = new Button(linearLayout.getContext());
        klawiszTak.setText("TAK");
        linearLayout.addView(klawiszTak);

        Button klawiszNie = new Button(linearLayout.getContext());
        klawiszNie.setText("NIE");
        linearLayout.addView(klawiszNie);


        klawiszTak.setOnClickListener(this::startGame);
        klawiszNie.setOnClickListener(this::notStartGame);



    }



    public void startGame(View view){
        TextView welcomeMessage = findViewById(R.id.welcomeText);
        welcomeMessage.setText("Wybrałeś opcję TAK");
    }

    public void notStartGame(View view){
        TextView welcom = findViewById(R.id.welcomeText);
        welcom.setText("Szkoda że wybrałeś opcję NIE");
    }

}

