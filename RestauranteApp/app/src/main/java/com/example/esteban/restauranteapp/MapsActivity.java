package com.example.esteban.restauranteapp;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng sede_1 = new LatLng(6.2411502, -75.5900615);
        LatLng sede_2 = new LatLng(6.2418403, -75.5901127);
        LatLng centralPoint = new LatLng(((sede_1.latitude + sede_2.latitude )/2),((sede_1.longitude + sede_2.longitude )/2));
        mMap.addMarker(new MarkerOptions().position(sede_1).title("Toscana"));
        mMap.addMarker(new MarkerOptions().position(sede_2).title("Di Cafe"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(centralPoint, 17));
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }
}
