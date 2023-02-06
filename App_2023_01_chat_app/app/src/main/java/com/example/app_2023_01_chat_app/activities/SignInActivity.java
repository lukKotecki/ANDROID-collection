package com.example.app_2023_01_chat_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.app_2023_01_chat_app.R;
import com.example.app_2023_01_chat_app.databinding.ActivitySignInBinding;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.HashSet;

public class SignInActivity extends AppCompatActivity {

    private ActivitySignInBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }

    private void setListeners() {
        binding.textCreateNewAccount.setOnClickListener(view ->
                startActivity(new Intent(getApplicationContext(),SignUpActivity.class)));
//        binding.buttonSignIn.setOnClickListener(view -> addDataToFirestore());

    }
//
//    private void addDataToFirestore(){
//        FirebaseFirestore database = FirebaseFirestore.getInstance();
//        HashMap<String, Object> data= new HashMap<>();
//        data.put("first_name", "Lukas");
//        data.put("last_name", "Kutas");
//        database.collection("users").add(data).addOnSuccessListener(documentReference -> {
//            Toast.makeText(getApplicationContext(), "Data inserted", Toast.LENGTH_SHORT).show();
//        })
//                .addOnFailureListener(exception -> {
//                    Toast.makeText(getApplicationContext(), exception.getMessage(), Toast.LENGTH_SHORT).show();
//                });
//
//    }

}