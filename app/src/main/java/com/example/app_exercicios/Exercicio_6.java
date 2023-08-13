package com.example.app_exercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Exercicio_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio_6);

        group = findViewById(R.id.rdg_cod);
        cod_c = findViewById(R.id.rdb_cod_c);
        cod_r = findViewById(R.id.rdb_cod_r);
        cod_s = findViewById(R.id.rdb_cod_s);
        editxt_qtd = findViewById(R.id.editxt_qtd);
        btn_calcular = findViewById(R.id.btn_calcular);


        group.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton get_cod = findViewById(checkedId);
            cod = (String) get_cod.getText();
            editxt_qtd.setText(cod);
        });



    }

    RadioGroup group;
    RadioButton cod_c;
    RadioButton cod_r;
    RadioButton cod_s;
    EditText editxt_qtd;
    Button btn_calcular;
    String cod;
}