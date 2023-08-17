package com.example.app_exercicios;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Exercicio_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio3);

        // Instânciando os objetos

       txt_dados = findViewById(R.id.txt_dados_exe3);
       txt_home = findViewById(R.id.txt_home_exe3);
       img_dados = findViewById(R.id.img_dados);
       img_home = findViewById(R.id.exe3_icon_home);
       edit_extras = findViewById(R.id.extras);
       txt_extras = findViewById(R.id.horasE);
       edit_faltas = findViewById(R.id.faltas);
       txt_faltas = findViewById(R.id.horasF);
       text_result = findViewById(R.id.txtresult);
       btn_verificar = findViewById(R.id.verifica);

       // Programando o botão verificar
        btn_verificar.setOnClickListener(horas -> {
            // Criando variáveis para as EditTexts e convertendo os valores para double
            double horasE = Double.parseDouble(edit_extras.getText().toString());
            double horasF = Double.parseDouble(edit_faltas.getText().toString());

            // Converter horas em minutos, para isso criando outra variável sendo elas: minutos extras e minutos-faltas
            double minutosE = horasE * 60;
            double minutosF = horasF * 60;


            // Calculando as horas de acordo com a tabela
            double H = minutosE - (2.0 / 3.0) * minutosF;

            // Criando as condições de prêmios  da tabela, usando a estrutura if e else
            if (H > 2400){
                text_result.setText(R.string.premio_500);
            }
            else if (H >= 1801 && H <= 2400){
                text_result.setText(R.string.premio_400);
            }
            else if (H >= 1201 && H<=1800){
                text_result.setText(R.string.premio_300);
            }
            else if (H >=600 && H<= 1200){
                text_result.setText(R.string.premio_200);
            }
            else if (H <600){
                text_result.setText(R.string.premio_100);
            }
        });



        // Programação NavBar

        txt_dados.setOnClickListener(v -> {
            Intent abrir_dados = new Intent(Exercicio_3.this, Dados.class);
            startActivity(abrir_dados);
        });

        txt_home.setOnClickListener(v -> {
            Intent abrir_home = new Intent(Exercicio_3.this, MainActivity.class);
            startActivity(abrir_home);
        });

        img_home.setOnClickListener(v -> {
            Intent abrir_home = new Intent(Exercicio_3.this, MainActivity.class);
            startActivity(abrir_home);
        });


        img_dados.setOnClickListener(v -> {
            Intent abrir_dados = new Intent(Exercicio_3.this, Dados.class);
            startActivity(abrir_dados);
        });
    }

    TextView txt_dados;
    TextView txt_home;
    ImageView img_dados;
    ImageView img_home;
    EditText edit_extras;
    TextView txt_extras;
    EditText edit_faltas;
    TextView txt_faltas;
    TextView text_result;
    Button btn_verificar;
}