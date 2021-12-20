package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CircleC extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_c);
        Button area,clear;
        EditText raduis;
        TextView answer;
        area=findViewById(R.id.Area);
        clear=findViewById(R.id.clear);
        raduis=findViewById(R.id.Base);
        answer=findViewById(R.id.Answer);
        clear.setOnClickListener(v -> {
            raduis.setText("");
            answer.setText("");
        });
        area.setOnClickListener(v -> {
            if((raduis.getText().toString().isEmpty()))
            {
                answer.setText("Please Enter Raduis!!!");
            }
            else
            {
                double r = Double.parseDouble(raduis.getText().toString());
                double ans=(22.0/7.0)*(r*r);
                answer.setText("Area >>>  "+ans);
            }

        });
    }
}