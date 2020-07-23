package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Flash extends AppCompatActivity {

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
            setContentView(R.layout.activity_flash);

            nome = (TextView) findViewById(R.id.txtnome);
            codinome = (TextView) findViewById(R.id.txtcodinome);
            espe = (TextView) findViewById(R.id.txtespe);
            hab = (TextView) findViewById(R.id.txthab);
            vul = (TextView) findViewById(R.id.txtvul);
            n_equip = (TextView) findViewById(R.id.txtn_equip);
            fin_equip = (TextView) findViewById(R.id.txtfin_equip);
            desc_equip = (TextView) findViewById(R.id.txtdesc_equip);
            nivel_acesso = (TextView) findViewById(R.id.txtn_acesso);


            nome.setText("Barry Allen");
            codinome.setText("Flash");
            espe.setText("Humano");
            hab.setText("Super velocidade");
            vul.setText("Pode ficar preso em dimensões facilmente");
            n_equip.setText("Nenhum");
            fin_equip.setText("Nenhum");
            desc_equip.setText("Nenhum");
            nivel_acesso.setText("9");

        }
    }
