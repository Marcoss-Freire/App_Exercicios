package com.example.app_exercicios;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Exercicio_6 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio_6);

        //  Instânciando os objetos

        group = findViewById(R.id.rdg_cod);
        cod_c = findViewById(R.id.rdb_cod_c);
        cod_r = findViewById(R.id.rdb_cod_r);
        cod_s = findViewById(R.id.rdb_cod_s);
        editxt_qtd = findViewById(R.id.editxt_qtd);
        btn_calcular = findViewById(R.id.btn_calcular);
        txt_dados = findViewById(R.id.txt_dados_exe6);
        txt_home = findViewById(R.id.txt_home_exe6);
        img_dados = findViewById(R.id.exe6_icon_dados);
        img_home= findViewById(R.id.exe6_icon_home);

        // Armazenando o text do Radio Button selecionado em uma variável

        group.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton get_cod = findViewById(checkedId);
            cod = (String) get_cod.getText();
        });

        // Programação do Botão Calcular

        btn_calcular.setOnClickListener(v -> { // O "->" é sugestão do Android Studio.
            qtd = Integer.parseInt(editxt_qtd.getText().toString()); // Convertendo texto em número inteiro.

            // Verificando o código selecionado

            switch (cod) {
                case "C":
                    total = 2.0 * qtd; // Calculando o valor a pagar.
                    Toast resultado_C = Toast.makeText(this, "O valor a pagar é: R$ ".concat(String.valueOf(total)), Toast.LENGTH_LONG);
                    resultado_C.show(); // Mostra uma mensagem rápida com o resultado.
                    break;
                case "R":
                    total = 2.5 * qtd;
                    Toast resultado_R = Toast.makeText(this, "O valor a pagar é: R$ ".concat(String.valueOf(total)), Toast.LENGTH_LONG);
                    resultado_R.show();
                    break;
                case "S":
                    total = 1.5 * qtd;
                    Toast resultado_S = Toast.makeText(this, "O valor a pagar é: R$ ".concat(String.valueOf(total)), Toast.LENGTH_LONG);
                    resultado_S.show();
                    break;
            }
        });

        // Programação NavBar

        txt_dados.setOnClickListener(v -> {
            Intent abrir_dados = new Intent(Exercicio_6.this, Dados.class);
            startActivity(abrir_dados);
        });

        txt_home.setOnClickListener(v -> {
            Intent abrir_home = new Intent(Exercicio_6.this, MainActivity.class);
            startActivity(abrir_home);
        });

        img_home.setOnClickListener(v -> {
            Intent abrir_home = new Intent(Exercicio_6.this, MainActivity.class);
            startActivity(abrir_home);
        });


        img_dados.setOnClickListener(v -> {
            Intent abrir_dados = new Intent(Exercicio_6.this, Dados.class);
            startActivity(abrir_dados);
        });


    }
    // Declarando as Variáveis
    RadioGroup group;
    RadioButton cod_c;
    RadioButton cod_r;
    RadioButton cod_s;
    EditText editxt_qtd;
    Button btn_calcular;
    String cod;
    Integer qtd;
    Double total;
    TextView txt_dados;
    TextView txt_home;
    ImageView img_dados;
    ImageView img_home;
}