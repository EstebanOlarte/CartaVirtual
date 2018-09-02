package com.example.esteban.restauranteapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }


    public void Butt_Entradas(View v){
        Intent entradasAct = new Intent(this,Entradas.class);
        startActivity(entradasAct);
    }

    public void Butt_Platos(View v){
        Intent platosAct = new Intent(this,Platos.class);
        startActivity(platosAct);
    }

    public void Butt_Postres(View v){
        Intent postresAct = new Intent(this,Postres.class);
        startActivity(postresAct);
    }

    public void Butt_Bebidas(View v){
        Intent bebidasAct = new Intent(this,Bebidas.class);
        startActivity(bebidasAct);
    }
}
