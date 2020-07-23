package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Lanterna extends AppCompatActivity {
    TextView nome;
    TextView codinome;
    TextView espe;
    TextView hab;
    TextView vul;
    TextView n_equip;
    TextView fin_equip;
    TextView desc_equip;
    TextView nivel_acesso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lanterna);

        nome = (TextView) findViewById(R.id.txtnome);
        codinome = (TextView) findViewById(R.id.txtcodinome);
        espe = (TextView) findViewById(R.id.txtespe);
        hab = (TextView) findViewById(R.id.txthab);
        vul = (TextView) findViewById(R.id.txtvul);
        n_equip = (TextView) findViewById(R.id.txtn_equip);
        fin_equip = (TextView) findViewById(R.id.txtfin_equip);
        desc_equip = (TextView) findViewById(R.id.txtdesc_equip);
        nivel_acesso = (TextView) findViewById(R.id.txtn_acesso);


        nome.setText("Hal Jordan");
        codinome.setText("Lanterna Verde");
        espe.setText("Humano");
        hab.setText("Vontade indomável");
        vul.setText("Fraqueza por amarelo");
        n_equip.setText("Anel do Poder");
        fin_equip.setText("Sua principal função é fazer construções de luz solida");
        desc_equip.setText("Uma das armas mais poderosas do universo, sua força é regulada pela vontade do usuário");
        nivel_acesso.setText("5");

    }
}

