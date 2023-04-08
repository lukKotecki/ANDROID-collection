package com.example.aplikacja_2023_04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;

import com.example.aplikacja_2023_04.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();

    }

    public void setListeners(){
        binding.button0.setOnClickListener(v-> buttonPressed(v));
        binding.button1.setOnClickListener(v-> buttonPressed(v));
        binding.button2.setOnClickListener(v-> buttonPressed(v));
        binding.button3.setOnClickListener(v-> buttonPressed(v));
        binding.button4.setOnClickListener(v-> buttonPressed(v));
        binding.button5.setOnClickListener(v-> buttonPressed(v));
        binding.button6.setOnClickListener(v-> buttonPressed(v));
        binding.button7.setOnClickListener(v-> buttonPressed(v));
        binding.button8.setOnClickListener(v-> buttonPressed(v));
        binding.button9.setOnClickListener(v-> buttonPressed(v));
        binding.buttonAddition.setOnClickListener(v-> buttonPressed(v));
        binding.buttonSubtraction.setOnClickListener(v-> buttonPressed(v));
        binding.buttonEqual.setOnClickListener(v -> buttonEqualPressed(v));

    }

    public void buttonPressed(View view){
        String resultText = binding.textResult.getText().toString();
        String buttonText = ((AppCompatButton)view).getText().toString();

        binding.textResult.setText(resultText.concat(buttonText));

    }

    public void buttonEqualPressed(View view){


        String resultText = binding.textResult.getText().toString();
        String delims = "[+-]+";
        String specs = "[^+-]+";

        String[] Operands = resultText.split(delims);
        String[] Operations = resultText.split(specs);

        Integer result = Integer.parseInt(Operands[0]);

        for(int i =0;i<Operations.length -1; i++){

            if(Operations[i+1].equals("+")){
                result = result+Integer.parseInt(Operands[i+1]);
            }else{
                result = result-Integer.parseInt(Operands[i+1]);
            }

            binding.textResult.setText(result.toString());
        }




    }

}