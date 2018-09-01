package com.example.esteban.restauranteapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void But_Map(View v){
        Intent mapActivity = new Intent(this,MapsActivity.class);
        startActivity(mapActivity);
    }

    public void But_Menu(View view){
        Intent menuActivity = new Intent(this,Postres.class);
        startActivity(menuActivity);
    }

    public void But_Reserva(View v){
        String phone = "3107252863";
        String msg = "Necesito una mesa";


        Uri envio = Uri.parse("smsto:" + phone);
        Intent contacto = new Intent(Intent.ACTION_SENDTO, envio);
        contacto.setPackage("com.whatsapp");
        contacto.putExtra(Intent.EXTRA_TEXT, msg);

        startActivity(Intent.createChooser(contacto, "Contactar"));
    }



    public void But_Salir(View v){
        System.exit(0);
    }
}
