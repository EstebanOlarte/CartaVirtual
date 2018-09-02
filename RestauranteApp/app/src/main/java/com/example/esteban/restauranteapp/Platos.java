package com.example.esteban.restauranteapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Platos extends Activity {

    private ListView lvItems;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_platos);


        lvItems=(ListView) findViewById(R.id.lv_Platos);
        adaptador = new Adaptador(this,GetArrayItems());
        lvItems.setAdapter(adaptador);

    }

    private ArrayList<Entidad> GetArrayItems(){
        ArrayList<Entidad> listItems= new ArrayList<>();

        listItems.add(new Entidad(R.drawable.imagen, "Plato fuerte 1", "Descripción del fuerte 1"));
        listItems.add(new Entidad(R.drawable.imagen, "Plato fuerte 2", "Descripción del fuerte 2"));
        listItems.add(new Entidad(R.drawable.imagen, "Plato fuerte 3", "Descripción del fuerte 3"));
        listItems.add(new Entidad(R.drawable.imagen, "Plato fuerte 4", "Descripción del fuerte 4"));
        listItems.add(new Entidad(R.drawable.imagen, "Plato fuerte 5", "Descripción del fuerte 5"));
        listItems.add(new Entidad(R.drawable.imagen, "Plato fuerte 6", "Descripción del fuerte 6"));
        listItems.add(new Entidad(R.drawable.imagen, "Plato fuerte 7", "Descripción del fuerte 7"));
        listItems.add(new Entidad(R.drawable.imagen, "Plato fuerte 8", "Descripción del fuerte 8"));
        listItems.add(new Entidad(R.drawable.imagen, "Plato fuerte 9", "Descripción del fuerte 9"));
        listItems.add(new Entidad(R.drawable.imagen, "Plato fuerte 10", "Descripción del fuerte 10"));
        listItems.add(new Entidad(R.drawable.imagen, "Plato fuerte 11", "Descripción del fuerte 11"));



        return listItems;

    }
}
