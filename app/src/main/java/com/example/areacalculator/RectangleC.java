package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RectangleC extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle_c);
        Button area,clear;
        EditText length;
        EditText height;
        TextView answer;
        area=findViewById(R.id.Area);
        clear=findViewById(R.id.clear);
        length=findViewById(R.id.Base);
        answer=findViewById(R.id.Answer);
        height=findViewById(R.id.Heigth);
        clear.setOnClickListener(v -> {
            length.setText("");
            height.setText("");
            answer.setText("");
        });
        area.setOnClickListener(v -> {
            if((length.getText().toString().isEmpty())||(height.getText().toString().isEmpty()))
            {
                answer.setText("Please Enter Values!!!");
            }
            else
            {
                double l = Double.parseDouble(length.getText().toString());
                double h = Double.parseDouble(height.getText().toString());
                double ans=l*h;
                answer.setText("Area >>>  "+ans);
            }

        });
    }
}