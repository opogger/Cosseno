package com.example.senocosseno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText LadoB, LadoC, AnguloA;
TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        AnguloA = findViewById(R.id.AnguloA);
        LadoB = findViewById(R.id.LadoB);
        LadoC = findViewById(R.id.LadoC);
        res = findViewById(R.id.resultado);
    }
    public void calcular(View v){
        int angA = Integer.parseInt(AnguloA.getText().toString());
        int B = Integer.parseInt(LadoB.getText().toString());
        int C = Integer.parseInt(LadoC.getText().toString());
           double A = Math.sqrt((B*B)+(C*C)-2*B*C*Math.cos(angA));
           String result = String.valueOf(A);

            res.setText(result);


        }
    }
