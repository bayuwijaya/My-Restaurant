package com.lombok_tourism.www.voyagetolombok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import android.support.v4.app.FragmentActivity;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class DetailListActivity extends AppCompatActivity implements OnMapReadyCallback  {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list);

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        ImageView detail_photo = (ImageView) findViewById(R.id.detail_photo);
        TextView detail_title = (TextView) findViewById(R.id.detail_title);
        TextView detail_subtitle = (TextView) findViewById(R.id.detail_subtitle);
        TextView detail_deskripsi = (TextView) findViewById(R.id.detail_deskripsi);
        TextView detail_jarak_tempuh = (TextView) findViewById(R.id.detail_jarak_tempuh);
        TextView detail_wktu_prjlnan = (TextView) findViewById(R.id.detail_wktu_prjlnan);
        TextView detail_tlpn = (TextView) findViewById(R.id.detail_tlpn);
        TextView detail_web = (TextView) findViewById(R.id.detail_web);

        detail_photo.setImageResource(getIntent().getIntExtra("put_item_photo",R.mipmap.ic_launcher));
        detail_title.setText(getIntent().getStringExtra("put_item_title"));
        detail_subtitle.setText(getIntent().getStringExtra("put_item_subtitle"));
        detail_deskripsi.setText(getIntent().getStringExtra("put_item_deskripsi"));
        detail_jarak_tempuh.setText(getIntent().getStringExtra("put_item_jarak_tempuh"));
        detail_wktu_prjlnan.setText(getIntent().getStringExtra("put_item_wktu_prjlnan"));
        detail_tlpn.setText(getIntent().getStringExtra("put_item_tlpn"));
        detail_web.setText(getIntent().getStringExtra("put_item_web"));
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

}

