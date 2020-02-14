package com.example.ethicalapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnRoll = findViewById(R.id.rollBtn);
        btnRoll.setOnClickListener(new View.OnClickListener() {
                                       public void onClick(View v) {
                                           Random rand = new Random();
                                           int ran = rand.nextInt(100);
                                           TextView txtRoll=findViewById(R.id.rollTxt);
                                           txtRoll.setText(String.valueOf(ran));
                                       }
                                   }
        );
    }

}
