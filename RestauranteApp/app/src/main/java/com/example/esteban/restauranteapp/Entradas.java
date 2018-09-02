package com.example.esteban.restauranteapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Entradas extends Activity {

    private ListView lvItems;
    private Adaptador adaptador;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entradas);


        lvItems=(ListView) findViewById(R.id.lv_Entradas);
        adaptador = new Adaptador(this,GetArrayItems());
        lvItems.setAdapter(adaptador);

    }

    private ArrayList<Entidad>GetArrayItems(){
        ArrayList<Entidad> listItems= new ArrayList<>();

        listItems.add(new Entidad(R.drawable.imagen, "Entrada 1", "Descripción del Entrada 1"));
        listItems.add(new Entidad(R.drawable.imagen, "Entrada 2", "Descripción del Entrada 2"));
        listItems.add(new Entidad(R.drawable.imagen, "Entrada 3", "Descripción del Entrada 3"));
        listItems.add(new Entidad(R.drawable.imagen, "Entrada 4", "Descripción del Entrada 4"));
        listItems.add(new Entidad(R.drawable.imagen, "Entrada 5", "Descripción del Entrada 5"));
        listItems.add(new Entidad(R.drawable.imagen, "Entrada 6", "Descripción del Entrada 6"));
        listItems.add(new Entidad(R.drawable.imagen, "Entrada 7", "Descripción del Entrada 7"));


        return listItems;

    }
}
