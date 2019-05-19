package com.example.prakash.retro_test1;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {
    String city;
    Double lat, lon;
    GoogleMap map;
    TextView ipp, citty, country, state, isp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // CONNECT RESOURCE FILE ELEMENTS WITH JAVA

        ipp = (TextView) findViewById(R.id.ip);
        citty = (TextView) findViewById(R.id.city);
        country = (TextView) findViewById(R.id.country);
        state = (TextView) findViewById(R.id.state);
        isp = (TextView) findViewById(R.id.isp);

        // CALLING THE RETROFIT FUNCTION

        getdata();


    }

    private void getdata() {

        final Call<IpInfo> IpInfo = IpAPI.getService().getIpInfo();    //  CRATING A IPINFO ADAPTER

        IpInfo.enqueue(new Callback<com.example.prakash.retro_test1.IpInfo>() {
            @Override
            public void onResponse(Call<com.example.prakash.retro_test1.IpInfo> call, Response<com.example.prakash.retro_test1.IpInfo> response) {

                IpInfo list = response.body(); // CREATING A LIST FROM THE ELEMENTS RETURNED BY THE JSON

                Toast.makeText(MainActivity.this, "GOT IT !! " + list.getIp().toString(), Toast.LENGTH_SHORT).show();

                // USING THE LIST OBJ TO GET EACH ELEMENTS - ASSIGNING THEM TO A LOCAL VARIABLE

                city = list.getCity();
                lat = list.getLongitude();
                lon = list.getLatitude();

                // ASSIGNING FEW VALUES TO XML ELEMENTS (TO DISPLAY THEM ON SCREEN)

                ipp.setText(list.getIp().toString());
                state.setText(list.getRegion().toString());
                citty.setText(list.getCity().toString());
                country.setText(list.getCountry().toString());
                isp.setText(list.getOrg().toString());

                // ONCE AFTER GETTING AND ASSIGNING THE JSON ELEMENTS , LAT AND LON IS PASSED TO MAP - MAP IS INVOKED HERE

                SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                        .findFragmentById(R.id.map);

                mapFragment.getMapAsync(MainActivity.this);
            }

            @Override
            public void onFailure(Call<com.example.prakash.retro_test1.IpInfo> call, Throwable t) {

                Toast.makeText(MainActivity.this, "NOTHING  !!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // OVERRIDE FUNCTION THAT IS CALLED WHEN THE MAP IS READY

    @Override
    public void onMapReady(GoogleMap googleMap) {

        LatLng marker = new LatLng(lon, lat);                                           // CREATE A MARKER OBJECT
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(marker, 13));        //  SET THE MAP CAMERA VIEW WITH 13X ZOOMING
        googleMap.addMarker(new MarkerOptions().position(marker));                    //   ADD THE MARKET TO THE MAP

        Toast.makeText(MainActivity.this, "LAT / LON" + lat.toString() + " " + lon.toString(), Toast.LENGTH_LONG).show();
    }

}


