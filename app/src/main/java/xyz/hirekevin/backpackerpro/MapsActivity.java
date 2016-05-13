package xyz.hirekevin.backpackerpro;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

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
        Log.d("BackPackerPro", "loading MapFragment");

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

        // Add a marker in Spain and move the camera
        LatLng spain = new LatLng(41.3953845,2.1597727);
        mMap.addMarker(new MarkerOptions().position(spain).title("Waypoint A"));

        // More waypoints
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.4144988,2.1505058)).title("Waypoint B"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.38522,2.178704)).title("Waypoint C"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.380229,2.1730838)).title("Waypoint D"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.3838911,2.1798824)).title("Waypoint E"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.3916448,2.1626786)).title("Waypoint F"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.3817439,2.1693966)).title("Waypoint G"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(41.4036339,2.1721671)).title("Waypoint H"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(spain, 12));
    }
}
