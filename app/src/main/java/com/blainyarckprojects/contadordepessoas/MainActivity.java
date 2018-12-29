package com.blainyarckprojects.contadordepessoas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_homens, btn_mulheres, btn_resetar;
    private TextView text_total;

    int numeros_homens = 0;
    int numeros_mulheres = 0;
    int numeros_totais = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_total = findViewById(R.id.text_total);
        btn_homens = findViewById(R.id.btn_homens);
        btn_mulheres = findViewById(R.id.btn_mulheres);
        btn_resetar = findViewById(R.id.btn_resetar);

        btn_homens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeros_homens++;
                numeros_totais++;

                String mensagem = Integer.toString(numeros_totais);
                text_total.setText("Quantidade de Pessoas: "+ mensagem);
                btn_homens.setText(Integer.toString(numeros_homens));
            }
        });

        btn_mulheres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeros_mulheres++;
                numeros_totais++;

                String mensagem = Integer.toString(numeros_totais);
                text_total.setText("Quantidade de Pessoas: "+ mensagem);
                btn_mulheres.setText(Integer.toString(numeros_mulheres));
            }
        });

        btn_resetar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeros_mulheres = 0;
                numeros_homens = 0;
                numeros_totais = 0;

                btn_homens.setText("Homens");
                btn_mulheres.setText("Mulheres");
                text_total.setText("Quantidade de Pessoas: 0");
            }
        });

    }
}
