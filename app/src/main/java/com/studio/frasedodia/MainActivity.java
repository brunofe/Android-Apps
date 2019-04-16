package com.studio.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textoNavaFrase;
    private Button botaoNovaFrase;

    private String[] frases = {"teste","teste2"};
    private Object textoNovaFrase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase;

    }
}
