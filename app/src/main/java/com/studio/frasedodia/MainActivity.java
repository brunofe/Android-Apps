package com.studio.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    //U para unisex, A para mulher , B para maculino,
    private String[] initWord = {
            "VocêU",
            "Sua mãeA",
            "Seu paiB"
    };

    private String[] midWordAsex = {
            "é ",
            "está sendo ",
            "sempre foi ",
            "continua ",
            "gosta de ser "
    };

    private String[] finalWordAsex = {
            "baba-ovo",
            "desagradável",
            "pobre",
            "uma reverendíssima besta",
            "anormal",
            "animal",
            "galinha",
            "baleia",
            "uma banana",
            "canalha",
            "comunista",
            "delinquente",
            "desleal",
            "Eegoísta",
            "farsante",
            "filho da puta",
            "fútil",
            "hipócrita",
            "idiota",
            "ignorante",
            "imbecil",
            "incapaz",
            "incompetente",
            "inconveniente",
            "indecente",
            "infeliz",
            "infiel",
            "insignificante",
            "inútil",
            "irritante",
            "miserável",
            "oportunista",
            "racista",
            "sacana",
            "sem vergonha",
            "tratante",
            "trouxa",
            "zero à esquerda"

    };

    private String[] finalWord = {
            "baiano",
            "nocivo",
            "analfabeto",
            "asqueroso",
            "bêbedo",
            "cachorro",
            "caloteiro",
            "chato",
            "chifrudo",
            "cigano",
            "corno",
            "cretino",
            "criminoso",
            "depravado",
            "desgraçado",
            "deshumano",
            "desonesto",
            "destrambelhado",
            "drogado",
            "falsário",
            "fodido",
            "frouxo",
            "gordo",
            "grosseiro",
            "histérico",
            "imaturo",
            "limitado",
            "louco",
            "lunático",
            "maníaco",
            "mentiroso",
            "mimado",
            "mórbido",
            "nojento",
            "ordinário",
            "otário",
            "paranóico",
            "porco",
            "retardado",
            "ridículo",
            "safado",
            "seboso",
            "sonso",
            "suíno",
            "tanso",
            "vadio",
            "vagabundo",
            "vândalo",
            "viciado",
            "xenófobo"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = findViewById(R.id.textoNovaFraseId);
        botaoNovaFrase = findViewById(R.id.botaoNovaFraseId);


        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomico = new Random();
                //initWord[init];
                int init = randomico.nextInt(initWord.length);
                if(init==initWord.length){
                    init--;
                }

                //midWordAsex[midAsex]
                int midAsex = randomico.nextInt(midWordAsex.length);
                if(midAsex==midWordAsex.length){
                    midAsex--;
                }

                char sex = initWord[init].charAt(initWord[init].length()-1);
                int loca =initWord[init].length()-1;

                String realInitWord = initWord[init].substring(0,loca)+" ";


                //finalWordAsex[finalAsex]
                int finalAsex = randomico.nextInt(finalWordAsex.length);
                if(finalAsex==finalWordAsex.length){
                    finalAsex--;
                }
                int type = randomico.nextInt(2);


                //feminino
                if(sex=='A') {
                    //finalWorldFeminino[finalF]
                    int finalGeral = randomico.nextInt(finalWord.length);

                    if(finalGeral==finalWord.length){
                        finalGeral--;
                    }

                    String finalWorldFeminino = finalWord[finalGeral].substring(0,finalWord[finalGeral].length()-1)+"a";

                    if(type==0){
                        textoNovaFrase.setText(realInitWord+midWordAsex[midAsex]+finalWorldFeminino);
                    }else{
                        textoNovaFrase.setText(realInitWord+midWordAsex[midAsex]+finalWordAsex[finalAsex]);
                    }
                } else

                //masculino
                if(sex=='B') {
                    //finalWordMasculino[finalM]
                    int finalGeral = randomico.nextInt(finalWord.length);

                    if(finalGeral==finalWord.length){
                        finalGeral--;
                    }

                    String finalWorldMasculino = finalWord[finalGeral];

                    if(type==0){
                        textoNovaFrase.setText(realInitWord+midWordAsex[midAsex]+finalWorldMasculino);
                    }else{
                        textoNovaFrase.setText(realInitWord+midWordAsex[midAsex]+finalWordAsex[finalAsex]);
                    }
                } else

                //unisex
                if(sex=='U') {
                    //finalWordAsex[finalAse
                    textoNovaFrase.setText(realInitWord+midWordAsex[midAsex]+finalWordAsex[finalAsex]);
                }






            }
        });
    }
}