package com.example.ligadajustica;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button batman;
    Button superman;
    Button flash;
    Button lanterna;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        batman = (Button) findViewById(R.id.btnbatman);
        superman = (Button) findViewById(R.id.btnsuperman);
        flash = (Button) findViewById(R.id.btnflash);
        lanterna = (Button) findViewById(R.id.btnlanterna);
    }

    public void Irbat (View view) {

        Intent irbatman = new Intent(this, Batman.class);
        startActivity(irbatman);
    }

    public void Irsuper (View view) {

        Intent irsuperman = new Intent(this, Superman.class);
        startActivity(irsuperman);
    }
    public void Irflash (View view) {

        Intent irflash = new Intent(this, Flash.class);
        startActivity(irflash);
    }
    public void Irlanterna (View view) {

        Intent irlanterna = new Intent(this, Lanterna.class);
        startActivity(irlanterna);
    }

    public void Saibamais (View view) {

        Intent saiba = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ligadajustia.fandom.com/pt-br/wiki/Liga_da_Justi%C3%A7a".toString()));
        startActivity(saiba);
    }

    }
