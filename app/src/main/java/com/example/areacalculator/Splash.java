package com.example.areacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread ac=new Thread() {
            public void run()
            {
                try {
                    sleep(3000);
                }catch (Exception ex)
                {
                    ex.printStackTrace();
                }finally {
                    Intent intent=new Intent(Splash.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };ac.start();
    }
}