package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SqaureC extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sqaure_c);
        Button area,clear;
        EditText length;
        TextView answer;
        area=findViewById(R.id.Area);
        clear=findViewById(R.id.clear);
        length=findViewById(R.id.Base);
        answer=findViewById(R.id.Answer);
        clear.setOnClickListener(v -> {
            length.setText("");
            answer.setText("");
        });
        area.setOnClickListener(v -> {
            if((length.getText().toString().isEmpty()))
            {
                answer.setText("Please Enter Length!!!");
            }
            else
            {
                double l = Double.parseDouble(length.getText().toString());
                double ans=l*l;
                answer.setText("Area >>>  "+ans);
            }

        });
    }
}