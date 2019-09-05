package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText value1, value2;
    TextView Result;
    Button Add, Subtract, Multiply, Divide;

    int result_number;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value1 = findViewById(R.id.number_1);
        value2 = findViewById(R.id.number_2);

        Result = findViewById(R.id.result);

        Add  = findViewById(R.id.add);
        Subtract = findViewById(R.id.subtract);
        Multiply = findViewById(R.id.multiply);
        Divide = findViewById(R.id.divide);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(value1.getText().toString());
                num2 = Integer.parseInt(value2.getText().toString());

                result_number = num1 + num2;
                Result.setText(String.valueOf(result_number));

            }
        });

        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(value1.getText().toString());
                num2 = Integer.parseInt(value2.getText().toString());

                result_number = num1 - num2;
                Result.setText(String.valueOf(result_number));

            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(value1.getText().toString());
                num2 = Integer.parseInt(value2.getText().toString());

                result_number = num1 * num2;
                Result.setText(String.valueOf(result_number));

            }
        });

        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(value1.getText().toString());
                num2 = Integer.parseInt(value2.getText().toString());

                result_number = num1 / num2;
                Result.setText(String.valueOf(result_number));

            }
        });
    }

}
