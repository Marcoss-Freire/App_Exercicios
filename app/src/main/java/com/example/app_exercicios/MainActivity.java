package com.example.app_exercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_exe6 = findViewById(R.id.Home_img_exe6);

        img_exe6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent abrir_exercicio = new Intent(MainActivity.this, Exercicio_6.class);
                startActivity(abrir_exercicio);
            }
        });
    }

    ImageView img_exe1;
    ImageView img_exe6;
}