package com.example.ligadajustica;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Batman extends AppCompatActivity {

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
        setContentView(R.layout.activity_batman);

        nome = (TextView) findViewById(R.id.txtnome);
        codinome = (TextView) findViewById(R.id.txtcodinome);
        espe = (TextView) findViewById(R.id.txtespe);
        hab = (TextView) findViewById(R.id.txthab);
        vul = (TextView) findViewById(R.id.txtvul);
        n_equip = (TextView) findViewById(R.id.txtn_equip);
        fin_equip = (TextView) findViewById(R.id.txtfin_equip);
        desc_equip = (TextView) findViewById(R.id.txtdesc_equip);
        nivel_acesso = (TextView) findViewById(R.id.txtn_acesso);

        nome.setText("Bruce Wayne");
        codinome.setText("Batman");
        espe.setText("Humano");
        hab.setText("Inteligência Avançada");
        vul.setText("Fraquezas humanas");
        n_equip.setText("Cinto de utilidades");
        fin_equip.setText("Carregar múltiplos equipamentos e gadgets");
        desc_equip.setText("O cinto de utilidades contém ampla gama de dispositivos tais como lasers, e batrangues");
        nivel_acesso.setText("10");
    }
}
