package com.studio.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caixaTexto = findViewById(R.id.recebeIdadeId);
        botaoIdade = findViewById(R.id.calcularIdadeId);
        resultadoIdade = findViewById(R.id.resultadoIdadeId);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoDigitado = caixaTexto.getText().toString();

                if(textoDigitado.isEmpty()){
                    resultadoIdade.setText("Digite um valor");
                } else {
                    int valorDigitado = Integer.parseInt(textoDigitado);
                    int ValoresultadoFinal = valorDigitado * 7;

                    resultadoIdade.setText("Idade:"+ValoresultadoFinal+ "anos");
                }
            }
        });
    }
}
