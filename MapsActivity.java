package com.example.realstate;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.realstate.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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

        // Add a marker in Sydney and move the camera
        LatLng p1 = new LatLng(28.54188859390532, 77.39807694648741);
        mMap.addMarker(new MarkerOptions().position(p1).title("Property One"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(p1));

        LatLng p2= new LatLng(28.816035477020723, 77.23894773017615);
        mMap.addMarker(new MarkerOptions().position(p2).title("Property Two"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(p2));

         LatLng p3= new LatLng(28.736066194007023, 77.58337710631409);
        mMap.addMarker(new MarkerOptions().position(p3).title("Property Three"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(p3));

        LatLng p4= new LatLng(27.181759294717978, 78.00017434401951);
        mMap.addMarker(new MarkerOptions().position(p4).title("Property Four"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(p4));

        LatLng p5= new LatLng(26.88327450863469, 80.91571402340682);
        mMap.addMarker(new MarkerOptions().position(p5).title("Property Five"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(p5));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(p3,12.0fx));
    }

}