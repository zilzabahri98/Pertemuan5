package com.zil.pertemuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //intent bundle (mengirim data dari tampilan A ke tampilan B)
        Button btnMoveWithDataActivity = findViewById(R.id.btn_move_with_data);
        btnMoveWithDataActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveWithDataIntent = new Intent(Main2Activity.this, MoveWithDataActivity.class);
                moveWithDataIntent.putExtra("EXTRA_CITY", "KOTA SEMARANG");
                moveWithDataIntent.putExtra("EXTRA_NAME", "Nama Wali Kota : Hendrar Prihadi, S.E, M.M.");
                moveWithDataIntent.putExtra("EXTRA_AGE", "Hari Jadi : 2 Mei 1547; 472 tahun lalu");
                startActivity(moveWithDataIntent);
            }
        });

        Button web = findViewById(R.id.web);
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://www.javatravel.net/tempat-wisata-semarang");
                Intent web = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(web);
            }
        });

        // intent ke aplikasi luar
        Button btnDialPhone = findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String phoneNumber = "089508800317";
                    Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                    startActivity(dialPhoneIntent);
                }
            });
    }
}
