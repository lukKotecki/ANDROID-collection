package com.example.aplikacja2023_01v2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {


    private DatabaseReference myDatabase;
    private EditText myEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        TextView myText = findViewById(R.id.textViewShowMessage);
        myEditText = findViewById(R.id.editTextMessageToSend);

        myDatabase = FirebaseDatabase.getInstance().getReference("Message");

        myDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                myText.setText(snapshot.getValue().toString());

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                myText.setText("CANCELED");
            }
        });
    }

    public void sendMessage(View view){
        myDatabase.push().setValue(myEditText.getText().toString());
        myEditText.setText("");
    }







}