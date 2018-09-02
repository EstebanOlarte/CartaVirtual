package com.example.esteban.restauranteapp;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Postres extends Activity {


    private ListView lvItems;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postres);

        lvItems=(ListView) findViewById(R.id.lv_Postres);
        adaptador = new Adaptador(this,GetArrayItems());
        lvItems.setAdapter(adaptador);

    }

    private ArrayList<Entidad>GetArrayItems(){
        ArrayList<Entidad> listItems= new ArrayList<>();

        listItems.add(new Entidad(R.drawable.imagen, "Postre 1", "Descripción del postre 1"));
        listItems.add(new Entidad(R.drawable.imagen, "Postre 2", "Descripción del postre 2"));
        listItems.add(new Entidad(R.drawable.imagen, "Postre 3", "Descripción del postre 3"));
        listItems.add(new Entidad(R.drawable.imagen, "Postre 4", "Descripción del postre 4"));
        listItems.add(new Entidad(R.drawable.imagen, "Postre 5", "Descripción del postre 5"));
        listItems.add(new Entidad(R.drawable.imagen, "Postre 6", "Descripción del postre 6"));
        listItems.add(new Entidad(R.drawable.imagen, "Postre 7", "Descripción del postre 7"));

        return listItems;

    }

}
