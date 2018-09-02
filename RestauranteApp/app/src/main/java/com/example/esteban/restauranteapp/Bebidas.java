package com.example.esteban.restauranteapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Bebidas extends Activity {

    private ListView lvItems;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);

        lvItems=(ListView) findViewById(R.id.lv_Bebidas);
        adaptador = new Adaptador(this,GetArrayItems());
        lvItems.setAdapter(adaptador);

    }

    private ArrayList<Entidad> GetArrayItems(){
        ArrayList<Entidad> listItems= new ArrayList<>();

        listItems.add(new Entidad(R.drawable.imagen, "Bebida 1", "Descripción del bebida 1"));
        listItems.add(new Entidad(R.drawable.imagen, "Bebida 2", "Descripción del bebida 2"));
        listItems.add(new Entidad(R.drawable.imagen, "Bebida 3", "Descripción del bebida 3"));
        listItems.add(new Entidad(R.drawable.imagen, "Bebida 4", "Descripción del bebida 4"));



        return listItems;

    }


}
