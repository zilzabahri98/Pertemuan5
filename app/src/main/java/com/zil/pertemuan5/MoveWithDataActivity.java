package com.zil.pertemuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {
    private String namakota, namawalikota, harijadi;
    private TextView tvNamaKota, tvWaliKota, tvHariJadi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        tvNamaKota = findViewById(R.id.tv_nama_kota);
        tvWaliKota = findViewById(R.id.tv_nama_wali_kota);
        tvHariJadi = findViewById(R.id.tv_hari_jadi);

        namakota = getIntent().getStringExtra("EXTRA_CITY");
        namawalikota = getIntent().getStringExtra("EXTRA_NAME");
        harijadi = getIntent().getStringExtra("EXTRA_AGE");

        tvNamaKota.setText(namakota);
        tvWaliKota.setText(namawalikota);
        tvHariJadi.setText(harijadi);
    }
}

