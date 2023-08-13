package com.example.app_exercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Exercicio_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1);

        // Instânciando os objetos

        txt_dados = findViewById(R.id.txt_dados_exe1);
        txt_home = findViewById(R.id.txt_home_exe1);
        img_dados = findViewById(R.id.icon_dados_exe1);
        img_home = findViewById(R.id.exe1_icon_home);


        // Programação NavBar

        txt_dados.setOnClickListener(v -> {
            Intent abrir_dados = new Intent(Exercicio_1.this, Dados.class);
            startActivity(abrir_dados);
        });

        txt_home.setOnClickListener(v -> {
            Intent abrir_home = new Intent(Exercicio_1.this, MainActivity.class);
            startActivity(abrir_home);
        });

        img_home.setOnClickListener(v -> {
            Intent abrir_home = new Intent(Exercicio_1.this, MainActivity.class);
            startActivity(abrir_home);
        });


        img_dados.setOnClickListener(v -> {
            Intent abrir_dados = new Intent(Exercicio_1.this, Dados.class);
            startActivity(abrir_dados);
        });
    }

    TextView txt_dados;
    TextView txt_home;
    ImageView img_dados;
    ImageView img_home;
}