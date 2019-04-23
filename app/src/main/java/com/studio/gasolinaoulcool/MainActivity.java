package com.studio.gasolinaoulcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText preçoAlcool;
    private EditText preçoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preçoAlcool = findViewById(R.id.imput_alcool);
        preçoGasolina = findViewById(R.id.imput_gasolina);
        botaoVerificar = findViewById(R.id.botao_verificar);
        textoResultado = findViewById(R.id.texto_resposta);

        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoAlcool = preçoAlcool.getText().toString();
                String textoGasolina = preçoGasolina.getText().toString();

                Double valorAlcool = Double.parseDouble( textoAlcool );
                Double valorGasolina = Double.parseDouble( textoGasolina );

                double resultado = valorAlcool/valorGasolina;

                if( resultado >= 0.7 ) {
                    textoResultado.setText("É melhor utilizar Gasolina ");
                } else {
                    textoResultado.setText("É melhor utilizar Álcool");
                }
            }
        });
    }
}
