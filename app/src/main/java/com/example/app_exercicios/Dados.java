package com.example.app_exercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Dados extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);

        img_home = findViewById(R.id.Dado_icon_home);
        txt_home = findViewById(R.id.txt_home_dados);

        img_home.setOnClickListener(v -> {
            Intent abrir_home = new Intent(Dados.this, MainActivity.class);
            startActivity(abrir_home);
        });

        txt_home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent abrir_home = new Intent(Dados.this, MainActivity.class);
                startActivity(abrir_home);
            }
        });
    }
    ImageView img_home;
    TextView txt_home;
}