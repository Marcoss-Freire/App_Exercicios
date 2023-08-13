package com.example.app_exercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_exe1 = findViewById(R.id.Home_img_exe1);
        img_exe6 = findViewById(R.id.Home_img_exe6);
        img_dados = findViewById(R.id.Home_icon_dados);
        txt_dados = findViewById(R.id.Home_txt_dados);

        img_exe1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent abrir_exercicio = new Intent(MainActivity.this, Exercicio_1.class);
                startActivity(abrir_exercicio);
            }
        });

        img_exe6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent abrir_exercicio = new Intent(MainActivity.this, Exercicio_6.class);
                startActivity(abrir_exercicio);
            }
        });

        img_dados.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent abrir_dados = new Intent(MainActivity.this, Dados.class);
                startActivity(abrir_dados);
            }
        });

        txt_dados.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent abrir_dados = new Intent(MainActivity.this, Dados.class);
                startActivity(abrir_dados);
            }
        });
    }

    ImageView img_exe1;
    ImageView img_exe6;
    ImageView img_dados;
    TextView txt_dados;
}