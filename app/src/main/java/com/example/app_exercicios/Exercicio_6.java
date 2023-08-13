package com.example.app_exercicios;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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
        txt = findViewById(R.id.txt_qtd);

        group.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton get_cod = findViewById(checkedId);
            cod = (String) get_cod.getText();
        });

        btn_calcular.setOnClickListener(v -> {
            qtd = Integer.parseInt(editxt_qtd.getText().toString());

            switch (cod) {
                case "C":
                    total = 2.0 * qtd;
                    Toast resultado_C = Toast.makeText(this, "O valor a pagar é: R$ ".concat(String.valueOf(total)), Toast.LENGTH_LONG);
                    resultado_C.show();
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
    }

    RadioGroup group;
    RadioButton cod_c;
    RadioButton cod_r;
    RadioButton cod_s;
    EditText editxt_qtd;
    TextView txt;
    Button btn_calcular;
    String cod;
    Integer qtd;
    Double total;
}